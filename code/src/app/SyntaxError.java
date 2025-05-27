package app;
import SymbolTable.SymbolTable;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SyntaxError extends BaseErrorListener {
    private final SymbolTable symbolTable = SymbolTable.getInstance();

    public static final SyntaxError INSTANCE = new SyntaxError();
    public List<String> errors = new ArrayList<>();
    public boolean hasError = false;

    public static boolean REPORT_SYNTAX_ERRORS = true;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        if (!REPORT_SYNTAX_ERRORS) return;

        hasError = true;
        symbolTable.hasSyntaxError = true;

        String error = "❌Error in line " + line + ":" + charPositionInLine + " " + msg;

        if (!errors.contains(error)) {
            errors.add(error);
            writeToFile("Result\\syntaxErrors.txt", String.join("\n", errors));
        }
    }

    private void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {

        }
    }
}
