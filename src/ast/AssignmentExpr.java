package ast;

public class AssignmentExpr extends Expr {

	private String id;
	private Expr expression;
	
	public AssignmentExpr(String id, Expr expression) {
		super();
		this.id = id;
		this.expression = expression;
	}

	public String getId() {
		return id;
	}

	public Expr getExpression() {
		return expression;
	}

	@Override
	public String prettyPrint() {
		return id + " = " + expression.prettyPrint() ;
	}

	@Override
	public int evaluate() {
		int r = expression.evaluate();
		Prog.getInstance().assign(id,r);
		return r;
	}

}
