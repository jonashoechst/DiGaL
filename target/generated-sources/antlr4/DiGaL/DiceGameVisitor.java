// Generated from DiceGame.g4 by ANTLR 4.4
package digal;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DiceGameParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DiceGameVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#game}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGame(@NotNull DiceGameParser.GameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#diceinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiceinit(@NotNull DiceGameParser.DiceinitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#law}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLaw(@NotNull DiceGameParser.LawContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#playerinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerinit(@NotNull DiceGameParser.PlayerinitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull DiceGameParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull DiceGameParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#diceobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiceobject(@NotNull DiceGameParser.DiceobjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#playerobjects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerobjects(@NotNull DiceGameParser.PlayerobjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#face}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFace(@NotNull DiceGameParser.FaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull DiceGameParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#gameinit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGameinit(@NotNull DiceGameParser.GameinitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull DiceGameParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull DiceGameParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(@NotNull DiceGameParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull DiceGameParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#diceobjects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiceobjects(@NotNull DiceGameParser.DiceobjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#dicesaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDicesaction(@NotNull DiceGameParser.DicesactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiceGameParser#playerobject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlayerobject(@NotNull DiceGameParser.PlayerobjectContext ctx);
}