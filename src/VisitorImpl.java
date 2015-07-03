import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;

import digal.DiceGameBaseVisitor;
import digal.DiceGameParser;
import digal.DiceGameParser.*;

public class VisitorImpl extends DiceGameBaseVisitor<String> {

	private Set<String> variables = new HashSet<String>();

	@Override
	public String visitGame(@NotNull DiceGameParser.GameContext ctx) {

		StringBuilder result = new StringBuilder();

		result.append("class Dice:\n");
		result.append("    def __init__(self, faces):\n");
		result.append("        self.faces = faces\n");
		result.append("        self.roll()\n");
		result.append("    def roll(self):\n");
		result.append("        self.value = random.choice(self.faces)\n");
		result.append("\n");

		result.append("class Game:\n");
		result.append("    def __init__(self):\n");
		for(ParseTree init : ctx.children ) {
			if (init.getClass() == DiceGameParser.GameinitContext.class) {
				result.append(init.accept(this));
			}
		}
		
		return result.toString();
	}

	@Override
	public String visitGameinit(@NotNull DiceGameParser.GameinitContext ctx) {
		
		if(ctx.VAR != null) {
			return "self."+ctx.VAR.getText()+" = None";
		}
		
		if(ctx.FROM != null) {
			return ""; //"self."+ctx.VAR.getText()+" = None";
		}
		
		if(ctx.DICEINIT != null) {
			
			StringBuilder result = new StringBuilder();
			result.append("self.dices = {");
			for(ParseTree diceInit : ctx.children ){
				if (diceInit.getClass() == DiceGameParser.DiceinitContext.class) {
					result.append(diceInit.accept(this)+", ");
				}
			}
			result.append("}");
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
		return visitChildren(ctx);
	}

	@Override
	public String visitAssignment(@NotNull DiceGameParser.AssignmentContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDiceobject(@NotNull DiceGameParser.DiceobjectContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitPlayerobjects(@NotNull DiceGameParser.PlayerobjectsContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitCondition(@NotNull DiceGameParser.ConditionContext ctx) {
		return visitChildren(ctx);
	}


	@Override
	public String visitLoop(@NotNull DiceGameParser.LoopContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitVariable(@NotNull DiceGameParser.VariableContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitAction(@NotNull DiceGameParser.ActionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExpr(@NotNull DiceGameParser.ExprContext ctx) {
		return visitChildren(ctx);
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