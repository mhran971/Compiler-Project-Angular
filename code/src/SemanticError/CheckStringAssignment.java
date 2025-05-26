package SemanticError;

import SymbolTable.Scope.BaseScope;
import SymbolTable.Symbol.SymbolBase;
import app.SemanticCheck;
import org.antlr.v4.runtime.ParserRuleContext;


public class CheckStringAssignment {

    public static void checkStringAssignment(BaseScope currentScope, ParserRuleContext ctx, String variableName, String assignedValue) {
        if (currentScope == null) {
            return;
        }
        SymbolBase symbol = (SymbolBase) currentScope.symbols.get(variableName);
        if (symbol == null) {
            return;
        }

        String type = symbol.getType();
        int currentLine = ctx.getStart().getLine();
        if ("string".equals(type)) {
            if (assignedValue == null) {
                String errorMsg = "❌Type error: variable '" + variableName + "' is string but assigned value is not string at line " + currentLine;
                if (!SemanticCheck.Errors.contains(errorMsg)) {
                    SemanticCheck.Errors.add(errorMsg);
                }
                return;
            }

            if (!(assignedValue.startsWith("'") && assignedValue.endsWith("'")) &&
                    !(assignedValue.startsWith("\"") && assignedValue.endsWith("\""))) {
                String errorMsg = "❌Type error: cannot assign non-string value to string variable '"
                        + variableName + "' at line " + currentLine;
                if (!SemanticCheck.Errors.contains(errorMsg)) {
                    SemanticCheck.Errors.add(errorMsg);
                }
            }
        }
    }
}