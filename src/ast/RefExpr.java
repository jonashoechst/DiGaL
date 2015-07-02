package ast;

public class RefExpr extends Expr {

	private Expr expression;
	private String id;
	
	public RefExpr(Expr expression, String id) {
		super();
		this.expression = expression;
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public Expr getExpression() {
		return expression;
	}

	@Override
	public String prettyPrint() {
		return id;
	}

	@Override
	public int evaluate() {
		return expression.evaluate();
	}

}
