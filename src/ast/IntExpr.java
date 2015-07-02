package ast;

public class IntExpr extends Expr {

	private int v;

	public IntExpr(int v) {
		super();
		this.v = v;
	}

	public int getV() {
		return v;
	}

	@Override
	public String prettyPrint() {
		return Integer.toString(v);
	}

	@Override
	public int evaluate() {
		return v;
	}
}
