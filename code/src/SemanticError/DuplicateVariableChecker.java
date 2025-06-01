package SemanticError;

import SymbolTable.Scope.BaseScope;
import SymbolTable.Symbol.SymbolBase;
import app.SemanticCheck;
import org.antlr.v4.runtime.ParserRuleContext;

public class DuplicateVariableChecker {

    public static void check(SymbolBase symbol, BaseScope scope, ParserRuleContext ctx) {
        if (scope.symbols.containsKey(symbol.getName())) {
            int line = ctx.getStart().getLine();
            String errorMsg = "❌ Variable <" + symbol.getName() + "> is already declared at line " + line;
            if (!SemanticCheck.Errors.contains(errorMsg)) {
                SemanticCheck.Errors.add(errorMsg);
            }
        }
    }
}
