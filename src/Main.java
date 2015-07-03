import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import digal.DiceGameLexer;
import digal.DiceGameParser;
import digal.DiceGameParser.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ANTLRInputStream in = new ANTLRInputStream(new FileReader("input"));
		Lexer lexer = new DiceGameLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DiceGameParser parser = new DiceGameParser(tokens);
		GameContext parseTree = parser.game();
		System.out.println(parseTree.accept(new VisitorImpl()));

	}
}
 