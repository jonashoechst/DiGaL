package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prog {

	private static Prog SINGLETON = new Prog();
	
	public static Prog getInstance() {
		return SINGLETON;
	}
	
	private Map<String, Integer> environment = new HashMap<String, Integer>();
	
	private Prog() { }
	
	private List<Expr> expressions = new ArrayList<Expr>();
	
	public void add(Expr expr) {
		expressions.add(expr);
	}
	
	public void printResults() {
		for (Expr expr : expressions) {
			System.out.println(expr.prettyPrint() + " --> " + expr.evaluate());
		}
	}

	public void assign(String id, int r) {
		environment.put(id, r);
	}
	
	public int read(String id) {
		return environment.get(id);
	}
}
