
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
		
		StringBuilder game = new StringBuilder();
		
		StringBuilder dice = new StringBuilder();
		dice.append("class Dice:\n");
		
		StringBuilder diceInit = new StringBuilder();
		diceInit.append("def __init__(self, name, faces):\n");
		diceInit.append(indent("self.faces = faces\n"));
		diceInit.append(indent("self.name = name\n"));
		diceInit.append(indent("self.roll()\n"));
		dice.append(indent(diceInit.toString()));
		
		StringBuilder diceRoll = new StringBuilder();
		diceRoll.append("def roll(self):\n");
		diceRoll.append(indent("self.value = random.choice(self.faces)\n"));
		dice.append(indent(diceRoll.toString()));
		dice.append("\n");

		String gameInit = "def __init__(self):\n";
		gameInit += indent("self.name = '"+ctx.NAME.getText()+"'\n");
		gameInit += indent("self.players = []");
		for(ParseTree init : ctx.children) {
			if (init.getClass() == DiceGameParser.GameinitContext.class) {
				gameInit += (indent(init.accept(this)));
			}
		}
		
		String gameInfo = "def __str__(self):\n";
		gameInfo += indent("return self.name+' with players '+', '.join(map(str, self.players))");
		
		game.append("class Game:\n");
		game.append(indent(gameInit)+"\n");
		game.append(indent(gameInfo)+"\n");

		StringBuilder player = new StringBuilder();
		player.append("class Player:\n");
		String playerInit = "def __init__(self, name):\n";
		String playerString = "def __str__(self):\n";
		playerString += indent("return self.name+str(self.__dict__)");
		playerInit += indent("self.name = name");
		String playerActive = "def isActive(self):\n";
		for(ParseTree init : ctx.children) {
			if (init.getClass() == DiceGameParser.PlayerinitContext.class) {
				if (((DiceGameParser.PlayerinitContext) init).ASSN != null ){
					playerInit += (indent(init.accept(this)));
				} else if (((DiceGameParser.PlayerinitContext) init).PLAYERACTIVECOND != null ){
					playerActive += (indent(init.accept(this)));
				}
			}
		}
		player.append(indent(playerInit)+"\n");
		player.append(indent(playerActive)+"\n");
		player.append(indent(playerString)+"\n");
		
		String setup = "";
		setup += "if __name__ == '__main__':\n";
		setup += indent("game = Game()\n");
		setup += indent("playerCount = int(raw_input('Enter number of players: '))")+"\n";
		setup += indent("if playerCount < game.min: print(game.name+' is made for more than '+str(game.min)+' players. Bring some friends ;-)'); exit()");
		setup += indent("if playerCount > game.max: print(str(playerCount)+' players? Thats too much for '+game.name+'... Maximum: '+str(game.max)); exit()")+"\n";
		setup += indent("for p in range(playerCount): name = raw_input('Enter name of player #'+str(p)+': '); game.players.append(Player(name))")+"\n";
		setup += indent("print(str(game))");
		
		
		return imports + dice.toString() + game.toString() + player.toString() + setup;
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
					return "self."+var.accept(this)+"\n";
				}
			}
		}
		if (ctx.PLAYERACTIVECOND != null){
			return "return self."+ctx.PLAYERACTIVECOND.accept(this)+"\n\n";
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