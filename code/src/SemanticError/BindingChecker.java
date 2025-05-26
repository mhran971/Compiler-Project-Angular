
package SemanticError;
import SymbolTable.Scope.GlobalScope;
import SymbolTable.Symbol.Symbol;
import app.SemanticCheck;
import org.antlr.v4.runtime.ParserRuleContext;
import SymbolTable.SymbolTable;


public class BindingChecker {

    public static void checkBinding(String value, ParserRuleContext ctx, SymbolTable symbolTable) {
        if (value == null) return;
        value = value.trim();

        if ((value.startsWith("\"") && value.endsWith("\"")) ||
                (value.startsWith("'") && value.endsWith("'"))) {
            value = value.substring(1, value.length() - 1).trim();
        }

        if (value.startsWith("{{") && value.endsWith("}}")) {
            value = value.substring(2, value.length() - 2).trim();
        }

        if (!value.contains(".")) return;
        if (value.contains("?") || value.contains(":") || value.contains("||")) return;

        String[] parts = value.split("\\.");
        if (parts.length == 2) {
            String objectName = parts[0].trim();
            String propertyName = parts[1].trim();

            if (!symbolTableContainsSymbol(symbolTable, objectName)) {
                int line = ctx.getStart().getLine();
                String error = "❌Object '" + objectName + "' is not defined in any scope at line " + line;
                if (!SemanticCheck.Errors.contains(error)) {
                    SemanticCheck.Errors.add(error);
                }
                return;
            }

            if (!symbolTableContainsProperty(symbolTable, objectName, propertyName)) {
                int line = ctx.getStart().getLine();
                String error = "❌Property '" + propertyName + "' is not defined in object '" + objectName + "' at line " + line;
                if (!SemanticCheck.Errors.contains(error)) {
                    SemanticCheck.Errors.add(error);
                }
            }
        }
    }

    private static boolean symbolTableContainsSymbol(SymbolTable symbolTable, String symbolName) {
        for (GlobalScope scope : symbolTable.getGlobalScopes()) {
            if (scope.symbols.containsKey(symbolName)) {
                return true;
            }
        }
        return false;
    }

    private static boolean symbolTableContainsProperty(SymbolTable symbolTable, String objectName, String propertyName) {
        for (GlobalScope scope : symbolTable.getGlobalScopes()) {
            Symbol symbol = scope.symbols.get(objectName);
            if (symbol != null) {
                if (scope.symbols.containsKey(propertyName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
