package SemanticError;
import SymbolTable.Scope.GlobalScope;
import app.SemanticCheck;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class FunctionDuplicate {
    private static final Map<String, Integer> functionNameToFirstLine = new HashMap<>();

    public static void isFunctionDuplicate(String functionName, ParserRuleContext ctx, Stack<GlobalScope> globalStack) {
        if (globalStack.isEmpty()) return; // تجنب الخطأ

        GlobalScope currentScope = globalStack.peek();
        int currentLine = ctx.getStart().getLine();

        if (currentScope.symbols.containsKey(functionName)) {
            if (!functionNameToFirstLine.containsKey(functionName)) {
                functionNameToFirstLine.put(functionName, currentLine);
            } else {
                String errorMsg = "❌" + functionName + " duplicate in this scope in line " + currentLine;
                if (!SemanticCheck.Errors.contains(errorMsg)) {
                    SemanticCheck.Errors.add(errorMsg);
                }
            }
        }
    }
}
