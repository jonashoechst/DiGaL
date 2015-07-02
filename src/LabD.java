import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.tree.ParseTree;

import digal.ExprBaseVisitor;
import digal.ExprParser;
import digal.ExprParser.ExprContext;
import digal.ExprParser.ProgContext;


public class LabD extends ExprBaseVisitor<String> {
	
	private Set<String> variables = new HashSet<String>();
	
	@Override
	public String visitProg(ProgContext ctx) {
		
		StringBuilder result = new StringBuilder();
		result.append("public class Calc {\n");
		result.append("  public static void main(String[] args) {\n");

		
		
		StringBuilder expressions = new StringBuilder();
		for ( ParseTree expr : ctx.expr()) {
			expressions.append("    System.out.println(" + expr.accept(this)).append(");\n");
		}
	
		for ( String var : variables){
			result.append("    int "+var+";\n");
		}
		
		result.append(expressions).append("\n");
		result.append("  }\n");
		result.append("}");
		return result.toString();
	}
	
	@Override
	public String visitExpr(ExprContext ctx) {
		if (ctx.op != null && ctx.op.getType() == ExprParser.ASSIGN) {
			variables.add(ctx.id.getText());
			return ctx.id.getText() + " = " + ctx.e.accept(this);
		}
		else if (ctx.op != null &&(ctx.op.getType() == ExprParser.ADD ||
				ctx.op.getType() == ExprParser.SUB ||
				ctx.op.getType() == ExprParser.MUL ||
				ctx.op.getType() == ExprParser.DIV)) {
			return ctx.a.accept(this) +" "+ ctx.op.getText() +" "+ ctx.b.accept(this);
		}
		else if (ctx.v != null) {
			return ctx.v.getText();
		}
		else if (ctx.id != null) {
			return ctx.id.getText();
		}
		else { // must be bracketed expression
			return "( " + ctx.e.accept(this) + " )";
		}
	}
	
}