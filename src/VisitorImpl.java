
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import digal.DiceGameBaseVisitor;
import digal.DiceGameParser;

public class VisitorImpl extends DiceGameBaseVisitor<String> {

	private static String indent(String in){
		if(in == null) return "null";
		String ret = "";
		for(String line : in.split("\\r?\\n")){
			ret += "    " + line + "\n";
		}
		return ret;
	} 
	
	@Override
	public String visitGame(@NotNull DiceGameParser.GameContext ctx) {

		String imports = "#!/usr/bin/env python\n# -*- coding: utf-8 -*-\nimport random\n\n";
		
		StringBuilder playerClass = new StringBuilder();
		playerClass.append("class Player:\n");
		playerClass.append(indent("def __str__(self): return ', '.join(map(str, reversed(self.__dict__.values())))\n"));
		
		StringBuilder playerInit = new StringBuilder();
		playerInit.append("def __init__(self, name): ");
		playerInit.append("self.name = name; ");
		
		StringBuilder playerActive = new StringBuilder();
		
		for(ParseTree init : ctx.children) {
			if (init.getClass() == DiceGameParser.PlayerinitContext.class) {
				if (((DiceGameParser.PlayerinitContext) init).ASSN != null ){
					playerInit.append(init.accept(this)+"; ");
				} 
				
				else if (((DiceGameParser.PlayerinitContext) init).PLAYERACTIVECOND != null ){
					playerActive.append("def isActive(self): ");
					playerActive.append(init.accept(this)+"; ");
				}
			}
		}
		
		playerClass.append(indent(playerInit.toString())+"\n");
		playerClass.append(indent(playerActive.toString())+"\n");
		playerClass.append(indent("\n"));
		
		StringBuilder diceClass = new StringBuilder();
		diceClass.append("class Dice:\n");
		diceClass.append(indent("def __init__(self, name, faces): self.name = name; self.faces = faces; self.roll()"));
		diceClass.append(indent("def roll(self): self.value = random.choice(self.faces)"));
		diceClass.append(indent("def __str__(self): return self.name+': '+str(self.value)"));
		diceClass.append(indent("\n"));

		
		StringBuilder gameClass = new StringBuilder();
		gameClass.append("class Game:\n");
		gameClass.append(indent("# Static methods"));
		gameClass.append(indent("def status(self): return 'Status['+', '.join(reversed(self.players[0].__dict__.keys())).lower()+']: '+' - '.join(map(str, self.players))"));
		gameClass.append(indent("def rightPlayer(self): return self.players[ (self.players.index(self.activePlayer) - 1) % self.playerCount]"));
		gameClass.append(indent("def leftPlayer(self):  return self.players[ (self.players.index(self.activePlayer) + 1) % self.playerCount]"));
		gameClass.append(indent("def playerNum (self, num): return self.players[num]"));
		gameClass.append(indent("def rollDices(self): map(Dice.roll, self.dices)"));
		gameClass.append(indent("def sortDices(self, desc=False): self.dices = sorted(self.dices, key=lambda dice: dice.value, reverse=desc)"));
		
		StringBuilder gameSetupMethod = new StringBuilder();
		gameSetupMethod.append("def setup(self):\n");
		gameSetupMethod.append(indent("self.playerCount = int(raw_input('Enter number of players: '))"));
		gameSetupMethod.append(indent("if self.playerCount < self.min: print(self.name+' is made for more than '+str(self.min)+' players. Bring some friends ;-)'); exit()"));
		gameSetupMethod.append(indent("if self.playerCount > self.max: print(str(self.playerCount)+' players? Thats too much for '+self.name+'... Maximum: '+str(self.max)); exit()"));
		gameSetupMethod.append(indent(""));
		gameSetupMethod.append(indent("for p in range(self.playerCount): name = raw_input('Enter name of player #'+str(p)+': '); self.players.append(Player(name))"));
		gameSetupMethod.append(indent("self.activePlayer = self.players[0]"));
		gameSetupMethod.append(indent("print('Game initialized '+self.status())"));
		gameSetupMethod.append(indent(""));
		
		gameClass.append(indent(gameSetupMethod.toString()));
		
		StringBuilder gameInitMethod = new StringBuilder();
		gameInitMethod.append("def __init__(self):\n");
		gameInitMethod.append(indent("self.players = []"));
		gameInitMethod.append(indent("# Dynamic inits"));
		gameInitMethod.append(indent("self.name = '"+ctx.NAME.getText()+"'\n"));
		gameInitMethod.append(indent(""));
		
		boolean hasRunningCond = false;
		
		for(ParseTree init : ctx.children) {
			if (init.getClass() == DiceGameParser.GameinitContext.class) {
				DiceGameParser.GameinitContext initCtx = (DiceGameParser.GameinitContext) init;
				if (initCtx.COND != null){
					gameClass.append(indent(initCtx.accept(this)));
					hasRunningCond = true;
				} else {
					gameInitMethod.append(indent(init.accept(this)));
				}
			}
		}
		
		if (!hasRunningCond) {
			gameClass.append(indent("def isRunning(self): return True"));
		}
		
		gameClass.append(indent(gameInitMethod.toString()));

		StringBuilder gameLoop = new StringBuilder();
		gameLoop.append("while self.isRunning():\n");
		gameLoop.append(indent("\nprint(self.status())"));
		gameLoop.append(indent("print('\\n'+self.activePlayer.name+' ist dran.'),"));
		gameLoop.append(indent(""));
		
		for(ParseTree init : ctx.children) {
			if (init.getClass() == DiceGameParser.ActionContext.class) {
				DiceGameParser.ActionContext loopCtx = (DiceGameParser.ActionContext) init;
				gameLoop.append(indent(loopCtx.accept(this)));
			}
		}

		String gameLoopMethod = "def loop(self):\n"+indent(gameLoop.toString());
		gameClass.append(indent(gameLoopMethod));
		

		StringBuilder main = new StringBuilder();
		main.append("\nif __name__ == '__main__':\n");
		main.append(indent("game = Game()"));
		main.append(indent("game.setup()"));
		main.append(indent("game.loop()"));
		main.append(indent("print('\\nSpiel beendet: '+game.status())"));
		main.append(indent(ctx.GAMEEND.accept(this)));
		
		
		
		return imports + playerClass.toString() + diceClass.toString() + gameClass.toString() + main.toString();
	}

	@Override
	public String visitGameinit(@NotNull DiceGameParser.GameinitContext ctx) {
		
		if(ctx.ASSN != null) {
			return ctx.ASSN.accept(this)+"\n";
		}

		if(ctx.FROM != null && ctx.TO != null) {
			return "self.min = "+ctx.FROM.getText() + "\nself.max = " + ctx.TO.getText();
		}
		
		if(ctx.FROM != null) {
			return "self.min = "+ctx.FROM.getText() + "\nself.max = " + ctx.FROM.getText();
		}
		
		if(ctx.DICEINIT != null) {
			
			StringBuilder result = new StringBuilder();
			result.append("self.dices = [");
			for(ParseTree diceInit : ctx.children){
				if (diceInit.getClass() == DiceGameParser.DiceinitContext.class) {
					result.append(diceInit.accept(this)+", ");
				}
			}
			result.append("]\n");
			return result.toString();
		}
		if (ctx.COND != null) {
			return "def isRunning(self): return ("+ctx.COND.accept(this)+")";
		}
		
		return "visitGameinit";
	}

	@Override
	public String visitDiceinit(@NotNull DiceGameParser.DiceinitContext ctx) {
		
		StringBuilder result = new StringBuilder();
		
		result.append("Dice('"+ctx.NAME.getText()+"',[");
		
		for(ParseTree val : ctx.children){
			if(val.getClass() == DiceGameParser.FaceContext.class){
				result.append(val.getText()+", ");
			}
		}
		
		result.append("])");
		
		return result.toString();
	}

//	@Override
//	public String visitFace(@NotNull DiceGameParser.FaceContext ctx) {
//		return ctx.getText();
//	}
	
	@Override
	public String visitLaw(@NotNull DiceGameParser.LawContext ctx) {
		StringBuilder ifelse = new StringBuilder();
		
		String condStr = ctx.COND.accept(this); // visitChildren(ctx.COND);
		String thenStr = ctx.THEN.accept(this); //visitChildren(ctx.THEN);
		
		ifelse.append("if "+condStr+":\n");
		ifelse.append(indent(thenStr));
		
		if (ctx.ELSE != null) ifelse.append("else:\n"+indent(ctx.ELSE.accept(this)));
		
		return ifelse.toString();
	}

	@Override
	public String visitPlayerinit(@NotNull DiceGameParser.PlayerinitContext ctx) {
		if (ctx.ASSN != null) {
			return ctx.ASSN.accept(this);
		}
		if (ctx.PLAYERACTIVECOND != null){
			return "return "+ctx.PLAYERACTIVECOND.accept(this);
		}
		return "visitPlayerinit";
	}

	@Override
	public String visitAssignment(@NotNull DiceGameParser.AssignmentContext ctx) {
		if (ctx.V != null && ctx.E != null) {
			return ctx.V.accept(this) + " = " + ctx.E.accept(this);
		}
		return "visitAssignment";
	}

	@Override
	public String visitDiceobject(@NotNull DiceGameParser.DiceobjectContext ctx) {
		if (ctx.NAME != null) {
			return "[dice if dice.name == '"+ctx.NAME.getText()+"' for dice in self.dices][0]";
		} else if (ctx.POS != null) {
			return "self.dices[" + ctx.POS.getText() + "]";
		}
		return "visitDiceobject";
	}

	@Override
	public String visitPlayerobjects(@NotNull DiceGameParser.PlayerobjectsContext ctx) {
		if (ctx.ALL != null) {
			return "self.players";
		}
		if (ctx.ACTIVE != null){
			return "[player for player in self.players if player.isActive()]";
		}
		if (ctx.LAST != null){
			String ret = "[";
			for(ParseTree val : ctx.children){
				if(val.getClass() == DiceGameParser.PlayerobjectContext.class){
					ret += (val.getText()+", ");
				}
			}
			ret += ctx.LAST.getText()+"]";
			return ret;
		}
		return "visitPlayerobjects";
	}

	@Override
	public String visitCondition(@NotNull DiceGameParser.ConditionContext ctx) {
		if (ctx.EQ != null) {
			return (ctx.A.accept(this) +" == "+ctx.B.accept(this));
		}
		if (ctx.LT != null) {
			return (ctx.A.accept(this) +" < "+ctx.B.accept(this));
		}
		if (ctx.GT != null) {
			return (ctx.A.accept(this) +" > "+ctx.B.accept(this));
		}
		if (ctx.LE != null) {
			return (ctx.A.accept(this) +" <= "+ctx.B.accept(this));
		}
		if (ctx.GE != null) {
			return (ctx.A.accept(this) +" >= "+ctx.B.accept(this));
		}
		if (ctx.AND != null) {
			return (ctx.C.accept(this) +" and "+ctx.D.accept(this));
		}
		if (ctx.OR != null) {
			return (ctx.C.accept(this) +" or "+ctx.D.accept(this));
		}
		if (ctx.NOT != null) {
			return "not "+ctx.C.accept(this);
		}
		if (ctx.TRUE != null) {
			return "true";
		}
		if (ctx.FALSE != null) {
			return "false";
		}
//		if (ctx.PLAYER != null) {
//			return ctx.PLAYER.accept(this) + ".isActive()";
//		}
		
		return "visitCondition";
	}

	@Override
	public String visitLoop(@NotNull DiceGameParser.LoopContext ctx) {
		
		if (ctx.FORLOOP != null){
			StringBuilder forLoop = new StringBuilder();
			if (ctx.POs != null) {
				forLoop.append("for self."+ctx.VAR.getText()+" in "+ctx.POs.accept(this)+":\n");
			}
			if (ctx.DOs != null) {
				forLoop.append("for self."+ctx.VAR.getText()+" in "+ctx.DOs.accept(this)+":\n");
			}
			forLoop.append(indent(ctx.ACTION.accept(this)));
			return forLoop.toString();
		}
		if (ctx.NLOOP != null){
			StringBuilder loop = new StringBuilder();
			loop.append("for i in range("+ctx.VALUE.getText()+"):\n");
			loop.append(indent(ctx.ACTION.accept(this)));
			return loop.toString();
		}
		return "visitLoop";
	}

	@Override
	public String visitVariable(@NotNull DiceGameParser.VariableContext ctx) {
		if (ctx.VAR != null){
			return "self."+ctx.VAR.getText();
		}
		if (ctx.DO != null){
			return ctx.DO.accept(this)+".value";
		}
		if (ctx.PO != null){
			return ctx.PO.accept(this);
		}
		if (ctx.INST != null){
			return ctx.INST.accept(this) + "." + ctx.IVAR.getText();
		}
		
		return "visitVariable";
	}

	@Override
	public String visitGameend(@NotNull DiceGameParser.GameendContext ctx) {
		if (ctx.MULTI != null){
			return "print('Die Spieler '+','.join([self.name for self in game.players if "+ctx.COND.accept(this)+"])+' haben gewonnen!')";
		}
		
		if (ctx.SINGLE != null){
			return "print([self.name for self in game.players if "+ctx.COND.accept(this)+"][0]+' hat gewonnen!')";
		}
		
		
		return "visitGameend";
	}

	@Override
	public String visitAction(@NotNull DiceGameParser.ActionContext ctx) {

		if (ctx.ACTION1 != null && ctx.ACTION2 != null){
			return ctx.ACTION1.accept(this)+"\n"+ctx.ACTION2.accept(this);
		}
		if (ctx.NEXT != null){
			return "self.activePlayer = "+ctx.PLAYER.accept(this)+"; "+"continue";
		}
		if (ctx.AS != null){
			return ctx.AS.accept(this);
		}
		if (ctx.DA != null){
			return ctx.DA.accept(this);
		}
		if (ctx.LOOP != null){
			return ctx.LOOP.accept(this);
		}
		if (ctx.LAW != null){
			return ctx.LAW.accept(this);
		}
		if (ctx.ENDLOOP != null){
			return "break";
		}
		
		return "visitAction"; 
	}

	@Override
	public String visitExpr(@NotNull DiceGameParser.ExprContext ctx) {
		if (ctx.OP != null) {
			return ctx.A.accept(this) + ctx.OP.getText() + ctx.B.accept(this);
		}
		if (ctx.INTEGER != null){
			return ctx.INTEGER.getText();
		}
		if (ctx.VAR != null){
			return ctx.VAR.accept(this);
		}
		if (ctx.E != null) {
			return '(' + ctx.E.accept(this) + ')';
		}
		if (ctx.SUM != null) {
			return "sum([dice.value for dice in "+ctx.DOs.accept(this)+"])";
		}
		if (ctx.COUNT != null) {
			if (ctx.DOs != null) {
				return "len("+ctx.DOs.accept(this)+")";
			}
			if (ctx.POs != null) {
				return "len("+ctx.POs.accept(this)+")";
			}
		}
		return "visitExpr";
	}

	@Override
	public String visitDiceobjects(@NotNull DiceGameParser.DiceobjectsContext ctx) {
		if (ctx.ALL != null) {
			return "self.dices";
		}
		if (ctx.LAST != null){
			String ret = "[";
			for(ParseTree val : ctx.children){
				if(val.getClass() == DiceGameParser.DiceobjectContext.class){
					ret += (val.getText()+", ");
				}
			}
			ret += ctx.LAST.getText()+"]";
			return ret;
		}
		return "visitDiceobjects";
	}

	@Override
	public String visitDicesaction(@NotNull DiceGameParser.DicesactionContext ctx) {
		if (ctx.THROW != null){
			return "raw_input('Enter drücken zum Würfeln...'); map(Dice.roll, "+ctx.DOs.accept(this)+"); print('Du hast '+', '.join(map(str, [dice.value for dice in self.dices]))+' gewürfelt!')";
		}
		if (ctx.SORT != null){
			String reverse = "";
			if (ctx.REVERSE != null){
				reverse = "desc=True";
			}
			return "self.sortDices("+reverse+")";
		}
		return "visitDicesaction";
	}

	@Override
	public String visitPlayerobject(@NotNull DiceGameParser.PlayerobjectContext ctx) {
		if (ctx.CUR != null){
			return "self.activePlayer";
		}
		if (ctx.NAME != null){
			return "[p if p.name == '"+ctx.NAME.getText()+"' for p in self.players][0]";
		}
		if (ctx.POS != null){
			return "self.players["+ctx.POS.getText()+"]";
		}
		if (ctx.CUR != null){
			return "self.activePlayer";
		}
		if (ctx.RIGHT != null){
			return "self.rightPlayer()";
		}
		if (ctx.LEFT != null){
			return "self.leftPlayer()";
		}
		return "visitPlayerobject";
	}

}