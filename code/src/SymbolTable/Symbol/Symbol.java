package SymbolTable.Symbol;

import SymbolTable.Scope.Scope;

public interface Symbol {

    String getName();
    Scope getScope();
    String getType();

    void setScope(Scope scope); // set scope (not enclosing) for this symbol; who contains it?
    int getInsertionOrderNumber();
    void setInsertionOrderNumber(int i);


}
