package app;
import AST.Program;
import Visitor.BaseVisitor;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import SymbolTable.*;
import SymbolTable.Scope.GlobalScope;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import static org.antlr.v4.runtime.CharStreams.fromFileName;


public class Main {
    public static void main(String[] args) throws IOException {
        //String source = "Files/test1.txt";
        String source = "Files/TestWithError.txt";
        CharStream cs = fromFileName(source);
        AngularLexer lexer = new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser = new AngularParser(token);
        parser.removeErrorListeners();
        lexer.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer,
             Object offendingSymbol,
             int line,
             int charPositionInLine,
             String msg, RecognitionException e) {}});
        ParseTree tree = parser.program();
        BaseVisitor visitor = new BaseVisitor();
        Program prog = (Program) visitor.visit(tree);

        SymbolTable symbolTable = visitor.getSymbolTable();
        System.out.println("🔶Abstract parse tree(AST):\n" + prog);
        System.out.println("\n🔶🔶Symbol table:");
        try {
            PrintStream fileOut = new PrintStream("Result\\SymbolTable.txt");
            for (GlobalScope global : symbolTable.getGlobalScopes()) {
                symbolTable.printTree(global, "", System.out);
                symbolTable.printTree(global, "", fileOut);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Number of Scope: " + symbolTable.getGlobalScopes().size());
        SemanticCheck semanticCheck = new SemanticCheck();
        semanticCheck.checkErrors();
    }
}

