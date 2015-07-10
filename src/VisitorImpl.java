
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import digal.DiceGameBaseVisitor;
import digal.DiceGameParser;

public class VisitorImpl extends DiceGameBaseVisitor<String> {

	private static String indent(String in){
		String ret = "";
		for(String line : in.split("\\r?\\n")){
			ret += "    " + line + "\n";
		}
		return ret;
		
	}
	
	@Override
	public String visitGame(@NotNull DiceGameParser.GameContext ctx) {

		String imports = "import random\n\n";
		
		StringBuilder playerClass = new StringBuilder();
		playerClass.append("class Player:\n");
		playerClass.append(indent("def __str__(self): return str(self.__dict__)\n"));
		
		StringBuilder playerInit = new StringBuilder();
		playerInit.append("def __init__(self, name): ");
		playerInit.append("self.name = name; ");
		
		StringBuilder playerActive = new StringBuilder();
		playerActive.append("def isActive(self): ");
		
		for(ParseTree init : ctx.children) {
			if (init.getClass() == DiceGameParser.PlayerinitContext.class) {
				if (((DiceGameParser.PlayerinitContext) init).ASSN != null ){
					playerInit.append(init.accept(this)+"; ");
				} else if (((DiceGameParser.PlayerinitContext) init).PLAYERACTIVECOND != null ){
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
		gameClass.append(indent("def status(self): return 'Status: '+ self.name + ' '.join(map(str, self.players))"));
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
		gameSetupMethod.append(indent("for p in range(self.playerCount): name = raw_input('Enter name of player #'+str(p)+'': ''); self.players.append(Player(name))"));
		gameSetupMethod.append(indent("self.activePlayer = self.players[0]"));
		gameSetupMethod.append(indent("print('Game initialized '+self.status())"));
		gameSetupMethod.append(indent(""));
		
		gameClass.append(indent(gameSetupMethod.toString()));
		
		StringBuilder gameInitMethod = new StringBuilder();
		gameInitMethod.append("def __init__(self):\n");
		gameInitMethod.append(indent("self.players = []"));
		gameInitMethod.append(indent("self.name = '"+ctx.NAME.getText()+"'\n"));
		gameInitMethod.append(indent(""));
		
		for(ParseTree init : ctx.children) {
			if (init.getClass() == DiceGameParser.GameinitContext.class) {
				gameInitMethod.append(indent(init.accept(this)));
			}
		}
		
		gameClass.append(indent(gameInitMethod.toString()));

		
		String main = "";
		main += "if __name__ == '__main__':\n";
		main += indent("game = Game()\n");
		main += indent("playerCount = int(raw_input('Enter number of players: '))")+"\n";
		main += indent("if playerCount < game.min: print(game.name+' is made for more than '+str(game.min)+' players. Bring some friends ;-)'); exit()");
		main += indent("if playerCount > game.max: print(str(playerCount)+' players? Thats too much for '+game.name+'... Maximum: '+str(game.max)); exit()")+"\n";
		main += indent("for p in range(playerCount): name = raw_input('Enter name of player #'+str(p)+': '); game.players.append(Player(name))")+"\n";
		main += indent("print(str(game))")+"\n\n";
		
		String gameloop = "";
		gameloop += "while True:";
		
		
		return imports + playerClass.toString() + diceClass.toString() + gameClass.toString() + main;
	}

	@Override
	public String visitGameinit(@NotNull DiceGameParser.GameinitContext ctx) {
		
		if(ctx.ASSN != null) {
			return "self."+ctx.ASSN.accept(this)+"\n";
		}
		
		if(ctx.FROM != null && ctx.TO != null) {
			return "self.min = "+ctx.FROM.getText() + "\nself.max = " + ctx.TO.getText();
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
		
		return null;
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
		return visitChildren(ctx);
	}

	@Override
	public String visitPlayerinit(@NotNull DiceGameParser.PlayerinitContext ctx) {
		if (ctx.ASSN != null) {
			for(ParseTree var : ctx.children){
				if(var.getClass() == DiceGameParser.AssignmentContext.class){
					return "self."+var.accept(this);
				}
			}
		}
		if (ctx.PLAYERACTIVECOND != null){
			return "return self."+ctx.PLAYERACTIVECOND.accept(this);
		}
		return null;
	}

	@Override
	public String visitAssignment(@NotNull DiceGameParser.AssignmentContext ctx) {
		if (ctx.OP != null && ctx.E != null) {
			return ctx.V.accept(this) + " = " + ctx.E.accept(this);
		}
		if (ctx.OP != null && ctx.P != null) {
			return ctx.V.accept(this) + " = " + ctx.P.accept(this);
		}
		if (ctx.OPSUM != null) {
			return "sum([x for x in self.dices.value])";
		}
		return null;
	}

	@Override
	public String visitDiceobject(@NotNull DiceGameParser.DiceobjectContext ctx) {
		if (ctx.NAME != null) {
			return "[dice if dice.name == '"+ctx.NAME.getText()+"' for dice in self.dices][0]";
		} else if (ctx.POS != null) {
			return "self.dices[" + ctx.POS.getText() + "]";
		}
		return null;
	}

	@Override
	public String visitPlayerobjects(@NotNull DiceGameParser.PlayerobjectsContext ctx) {
//		if (ctx.ALL != null) {
//			return "[dice if dice.name == '"+ctx.NAME.getText()+"' for dice in self.dices][0]";
//		} else if (ctx.PO != null) {
//			return "self.dices[" + ctx.POS.getText() + "]";
//		}
		return null;
	}

	@Override
	public String visitCondition(@NotNull DiceGameParser.ConditionContext ctx) {
		if (ctx.EQ != null) {
			return ctx.A.accept(this) +" == "+ctx.B.accept(this);
		}
		if (ctx.LT != null) {
			return ctx.A.accept(this) +" < "+ctx.B.accept(this);
		}
		if (ctx.GT != null) {
			return ctx.A.accept(this) +" > "+ctx.B.accept(this);
		}
		if (ctx.LE != null) {
			return ctx.A.accept(this) +" <= "+ctx.B.accept(this);
		}
		if (ctx.GE != null) {
			return ctx.A.accept(this) +" >= "+ctx.B.accept(this);
		}
		if (ctx.AND != null) {
			return ctx.C.accept(this) +" and "+ctx.D.accept(this);
		}
		if (ctx.OR != null) {
			return ctx.C.accept(this) +" or "+ctx.D.accept(this);
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
		if (ctx.PLAYER != null) {
			return ctx.PLAYER.accept(this) + ".isActive()";
		}
		
		return null;
	}


	@Override
	public String visitLoop(@NotNull DiceGameParser.LoopContext ctx) {
		
		if (ctx.PLAYEROBJETS != null){
			String ret = "for player in "+ctx.PLAYEROBJETS.accept(this)+":\n";
		}
		return null;
	}

	@Override
	public String visitVariable(@NotNull DiceGameParser.VariableContext ctx) {
		if (ctx.IDENT != null){
			return ctx.IDENT.getText();
		}
		if (ctx.DO != null) {
			return ctx.DO.accept(this);
		}
		if (ctx.PO != null) {
			return ctx.PO.accept(this);
		}
		if (ctx.INST != null) {
			return ctx.INST.accept(this) + "." + ctx.VAR.accept(this);
		}
		return null;
	}

	@Override
	public String visitAction(@NotNull DiceGameParser.ActionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExpr(@NotNull DiceGameParser.ExprContext ctx) {
		if (ctx.OP != null) {
			return ctx.A.accept(this) + ctx.OP.getText() + ctx.B.accept(this);
		}
		if (ctx.INTEGER != null){
			return ctx.INTEGER.getText();
		}
		if (ctx.E != null) {
			return '(' + ctx.E.accept(this) + ')';
		}
		if (ctx.VAR != null){
			return ctx.VAR.accept(this);
		}
		return null;
	}

	@Override
	public String visitDiceobjects(@NotNull DiceGameParser.DiceobjectsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDicesaction(@NotNull DiceGameParser.DicesactionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitPlayerobject(@NotNull DiceGameParser.PlayerobjectContext ctx) {
		return visitChildren(ctx);
	}

}