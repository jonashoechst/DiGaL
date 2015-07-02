package ast;

public class SubExpr extends BinaryExpr {

	public SubExpr(Expr left, Expr right) {
		super(left, right);
	}

	@Override
	public String printOperator() {
		return "-";
	}

	@Override
	public int evaluate(int left, int right) {
		return left - right;
	}

}
