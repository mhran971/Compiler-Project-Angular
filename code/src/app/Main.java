package app;

//import AST.Program;
//import Visitro.BaseVisitor;
import AST.Program;
import Visitor.BaseVisitor;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
//import SymbolTable.*;
import java.io.IOException;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
public class Main {
    public static void main(String[] args) throws IOException {

        String source = "Files/test2.txt";
        CharStream cs = fromFileName(source);
        AngularLexer lexer=new AngularLexer(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        AngularParser parser=new AngularParser(token);
        ParseTree tree = parser.program();
        BaseVisitor visitor=new  BaseVisitor();
        Program prog=(Program) visitor.visit(tree);
       // SymbolTable table=visitor.getSymbolTable();
        System.out.println("Abstract parse tree(AST)"+"\n"+prog);

    }

}