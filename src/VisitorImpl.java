import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import digal.DiceGameBaseVisitor;
import digal.DiceGameParser;

public class VisitorImpl extends DiceGameBaseVisitor<String> {
	
	StringBuilder game = new StringBuilder();
	StringBuilder player = new StringBuilder();
	StringBuilder dice = new StringBuilder();

	@Override
	public String visitGame(@NotNull DiceGameParser.GameContext ctx) {

		dice.append("class Dice:\n");
		dice.append("    def __init__(self, faces):\n");
		dice.append("        self.faces = faces\n");
		dice.append("        self.roll()\n");
		dice.append("    def roll(self):\n");
		dice.append("        self.value = random.choice(self.faces)\n");
		dice.append("\n");

		game.append("class Game:\n");
		game.append("    def __init__(self):");
		for(ParseTree init : ctx.children) {
			if (init.getClass() == DiceGameParser.GameinitContext.class) {
				game.append("\n    "+init.accept(this));
			}
			
			if (init.getClass() == DiceGameParser.PlayerinitContext.class) {
				init.accept(this);
			}
		}
		
		return dice.toString() + player.toString() + game.toString();
	}

	@Override
	public String visitGameinit(@NotNull DiceGameParser.GameinitContext ctx) {
		
		if(ctx.VAR != null) {
			return "self."+ctx.VAR.getText()+" = None";
		}
		
		if(ctx.FROM != null && ctx.TO != null) {
			return "self.from_players = "+ctx.FROM.getText() + "\n    self.to_players = " + ctx.TO.getText();
		}
		
		if(ctx.DICEINIT != null) {
			
			StringBuilder result = new StringBuilder();
			result.append("self.dices = {");
			for(ParseTree diceInit : ctx.children){
				if (diceInit.getClass() == DiceGameParser.DiceinitContext.class) {
					result.append(diceInit.accept(this)+", ");
				}
			}
			result.append("}");
			result.append("self.sorted = None");
			return result.toString();
		}
		
		return null;
	}

	@Override
	public String visitDiceinit(@NotNull DiceGameParser.DiceinitContext ctx) {
		
		StringBuilder result = new StringBuilder();
		
		result.append("\""+ctx.NAME.getText()+"\": Dice([");
		
		for(ParseTree val : ctx.children){
			if(val.getClass() == DiceGameParser.FaceContext.class){
				result.append(val.getText()+", ");
			}
		}
		
		result.append("])");
		
		return result.toString();
	}

	@Override
	public String visitFace(@NotNull DiceGameParser.FaceContext ctx) {
		return ctx.getText();
	}
	
	@Override
	public String visitLaw(@NotNull DiceGameParser.LawContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitPlayerinit(@NotNull DiceGameParser.PlayerinitContext ctx) {
		if (ctx.VAR != null) {
			player.append("class Player:\n");
			player.append("    def __init__(self):\n");
			for(ParseTree var : ctx.children){
				if(var.getClass() == DiceGameParser.VarContext.class){
					player.append("        self."+var.getText()+" = None");
				}
			}
		}

		if (ctx.PLAYERCOND != null){
			player.append("    def isActive(self):\n");
			//System.out.println(ctx.PLAYERCOND.getText());
			player.append("        "+ctx.PLAYERCOND.accept(this));
		}
		player.append("\n");
		return "";
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
			return "self.dices[" + ctx.NAME.getText() + "]";
		}
		return null;
	}

	@Override
	public String visitPlayerobjects(@NotNull DiceGameParser.PlayerobjectsContext ctx) {
		return visitChildren(ctx);
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
		return visitChildren(ctx);
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