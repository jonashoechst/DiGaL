import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;

import digal.DiceGameLexer;
import digal.DiceGameParser;
import digal.DiceGameParser.*;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
//		ANTLRInputStream in = new ANTLRInputStream(new FileReader("Examples/src/Own.dg"));
		ANTLRInputStream in = new ANTLRInputStream(new FileReader(args[0]));
		Lexer lexer = new DiceGameLexer(in);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		DiceGameParser parser = new DiceGameParser(tokens);
		GameContext parseTree = parser.game();
		
		String finalGame = parseTree.accept(new VisitorImpl());
		String gameName = in.toString().substring(0, in.toString().indexOf(" "));
		
		PrintWriter writer = new PrintWriter("./" + gameName + ".py", "UTF-8");
		writer.println(finalGame);
		writer.close();
	}
}
