package ast;

public abstract class BinaryExpr extends Expr {

	private Expr left, right;

	public BinaryExpr(Expr left, Expr right) {
		super();
		this.left = left;
		this.right = right;
	}

	public Expr getLeft() {
		return left;
	}

	public Expr getRight() {
		return right;
	}
	
	@Override
	public String prettyPrint() {
		return "(" + left.prettyPrint() + " " + printOperator() + " " + right.prettyPrint() + ")";
	}

	@Override
	public int evaluate() {
		return evaluate(left.evaluate(), right.evaluate());
	}
	
	public abstract String printOperator();

	public abstract int evaluate(int left, int right);
	
}
