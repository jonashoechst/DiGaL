// Generated from DiceGame.g4 by ANTLR 4.4
package digal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiceGameParser}.
 */
public interface DiceGameListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(@NotNull DiceGameParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(@NotNull DiceGameParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#diceinit}.
	 * @param ctx the parse tree
	 */
	void enterDiceinit(@NotNull DiceGameParser.DiceinitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#diceinit}.
	 * @param ctx the parse tree
	 */
	void exitDiceinit(@NotNull DiceGameParser.DiceinitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#law}.
	 * @param ctx the parse tree
	 */
	void enterLaw(@NotNull DiceGameParser.LawContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#law}.
	 * @param ctx the parse tree
	 */
	void exitLaw(@NotNull DiceGameParser.LawContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#playerinit}.
	 * @param ctx the parse tree
	 */
	void enterPlayerinit(@NotNull DiceGameParser.PlayerinitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#playerinit}.
	 * @param ctx the parse tree
	 */
	void exitPlayerinit(@NotNull DiceGameParser.PlayerinitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull DiceGameParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull DiceGameParser.VarContext ctx);
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
	 * Enter a parse tree produced by {@link DiceGameParser#face}.
	 * @param ctx the parse tree
	 */
	void enterFace(@NotNull DiceGameParser.FaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#face}.
	 * @param ctx the parse tree
	 */
	void exitFace(@NotNull DiceGameParser.FaceContext ctx);
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
	 * Enter a parse tree produced by {@link DiceGameParser#gameinit}.
	 * @param ctx the parse tree
	 */
	void enterGameinit(@NotNull DiceGameParser.GameinitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#gameinit}.
	 * @param ctx the parse tree
	 */
	void exitGameinit(@NotNull DiceGameParser.GameinitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceGameParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull DiceGameParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull DiceGameParser.LoopContext ctx);
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
	 * Enter a parse tree produced by {@link DiceGameParser#playerobject}.
	 * @param ctx the parse tree
	 */
	void enterPlayerobject(@NotNull DiceGameParser.PlayerobjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceGameParser#playerobject}.
	 * @param ctx the parse tree
	 */
	void exitPlayerobject(@NotNull DiceGameParser.PlayerobjectContext ctx);
}