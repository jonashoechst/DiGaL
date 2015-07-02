import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import digal.ExprLexer;
import digal.ExprParser;
import digal.ExprParser.ProgContext;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ANTLRInputStream in = new ANTLRInputStream(new FileReader("input"));
		Lexer lexer = new ExprLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ExprParser parser = new ExprParser(tokens);
		ProgContext parseTree = parser.prog();
		System.out.println(parseTree.accept(new LabD()));

	}
}
 