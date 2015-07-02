package ast;

public class AddExpr extends BinaryExpr {

	public AddExpr(Expr left, Expr right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String printOperator() {
		return "+";
	}

	@Override
	public int evaluate(int left, int right) {
		return left + right;
	}

}
