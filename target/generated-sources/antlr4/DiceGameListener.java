// Generated from DiceGame.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiceGameParser}.
 */
public interface DiceGameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(@NotNull DiceGameParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(@NotNull DiceGameParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull DiceGameParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull DiceGameParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#dice}.
	 * @param ctx the parse tree
	 */
	void enterDice(@NotNull DiceGameParser.DiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#dice}.
	 * @param ctx the parse tree
	 */
	void exitDice(@NotNull DiceGameParser.DiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#diceobject}.
	 * @param ctx the parse tree
	 */
	void enterDiceobject(@NotNull DiceGameParser.DiceobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#diceobject}.
	 * @param ctx the parse tree
	 */
	void exitDiceobject(@NotNull DiceGameParser.DiceobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#regel}.
	 * @param ctx the parse tree
	 */
	void enterRegel(@NotNull DiceGameParser.RegelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#regel}.
	 * @param ctx the parse tree
	 */
	void exitRegel(@NotNull DiceGameParser.RegelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#playerobjects}.
	 * @param ctx the parse tree
	 */
	void enterPlayerobjects(@NotNull DiceGameParser.PlayerobjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#playerobjects}.
	 * @param ctx the parse tree
	 */
	void exitPlayerobjects(@NotNull DiceGameParser.PlayerobjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull DiceGameParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull DiceGameParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull DiceGameParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull DiceGameParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull DiceGameParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull DiceGameParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull DiceGameParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull DiceGameParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull DiceGameParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull DiceGameParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#diceobjects}.
	 * @param ctx the parse tree
	 */
	void enterDiceobjects(@NotNull DiceGameParser.DiceobjectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#diceobjects}.
	 * @param ctx the parse tree
	 */
	void exitDiceobjects(@NotNull DiceGameParser.DiceobjectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#faces}.
	 * @param ctx the parse tree
	 */
	void enterFaces(@NotNull DiceGameParser.FacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#faces}.
	 * @param ctx the parse tree
	 */
	void exitFaces(@NotNull DiceGameParser.FacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#dicesaction}.
	 * @param ctx the parse tree
	 */
	void enterDicesaction(@NotNull DiceGameParser.DicesactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#dicesaction}.
	 * @param ctx the parse tree
	 */
	void exitDicesaction(@NotNull DiceGameParser.DicesactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull DiceGameParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull DiceGameParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#playerobject}.
	 * @param ctx the parse tree
	 */
	void enterPlayerobject(@NotNull DiceGameParser.PlayerobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#playerobject}.
	 * @param ctx the parse tree
	 */
	void exitPlayerobject(@NotNull DiceGameParser.PlayerobjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#player}.
	 * @param ctx the parse tree
	 */
	void enterPlayer(@NotNull DiceGameParser.PlayerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#player}.
	 * @param ctx the parse tree
	 */
	void exitPlayer(@NotNull DiceGameParser.PlayerContext ctx);
}