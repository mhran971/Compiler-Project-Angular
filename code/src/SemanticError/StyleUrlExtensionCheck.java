package SemanticError;

import SymbolTable.Scope.GlobalScope;
import SymbolTable.Symbol.Symbol;
import SymbolTable.Symbol.SymbolBase;
import SymbolTable.SymbolTable;
import app.SemanticCheck;
import org.antlr.v4.runtime.ParserRuleContext;

public class StyleUrlExtensionCheck {
    public static void check(SymbolTable symbolTable, ParserRuleContext ctx) {
        int currentLine = ctx.getStart().getLine();
        for (GlobalScope globalScope : symbolTable.getGlobalScopes()) {
            for (Symbol symbol : globalScope.getSymbols()) {
                if ("styleUrls".equals(symbol.getName()) && "ReservedWord:".equals(symbol.getType())) {
                    if (symbol instanceof SymbolBase) {
                        SymbolBase sb = (SymbolBase) symbol;
                        String value = sb.getValue().replaceAll("[\\[\\]'\" ]", "");
                        if (!(value.endsWith(".css"))) {
                            String errorMsg = "❌ styleUrls value must end with a valid stylesheet extension like .css in line "+currentLine;
                            if (!SemanticCheck.Errors.contains(errorMsg)) {
                                SemanticCheck.Errors.add(errorMsg);
                            }
                        }
                    }
                }
            }
        }
    }
}
