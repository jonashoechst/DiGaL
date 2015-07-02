package ast;

public class DivExpr extends BinaryExpr {

	public DivExpr(Expr left, Expr right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String printOperator() {
		return "/";
	}

	@Override
	public int evaluate(int left, int right) {
		return left / right;
	}

}
