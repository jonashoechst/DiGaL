package ast;

public class BracketedExpr extends Expr {

	private Expr expr;

	public BracketedExpr(Expr expr) {
		super();
		this.expr = expr;
	}

	public Expr getExpr() {
		return expr;
	}

	@Override
	public String prettyPrint() {
		return "(" + expr.prettyPrint() + ")";
	}

	@Override
	public int evaluate() {
		return expr.evaluate();
	}
}
