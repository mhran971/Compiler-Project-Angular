package SymbolTable.Scope;


import SymbolTable.Symbol.Symbol;

import java.util.List;
import java.util.Set;

public interface Scope {
    //set name of scope
    void setName(String scopeName);

    //get name of scope
    String getName();

    //set Id of scope Used when we have two Scope with the same name.
    void setId(String id);

    //get Id of Scope
    String getId();

    //set parent scope
    void setEnclosingScope(Scope s);

    //get parent scope
    Scope getEnclosingScope();

    //define symbol in current scope
    void define(Symbol symbol)throws IllegalArgumentException;

    //look up symbol reference
    Symbol resolve(String name);

    //look up symbol reference for iterator in (parent for loops) only
    Symbol resolveIterator(String name);

    //get symbol if symbol is defined in current scope
    Symbol getSymbol(String name);

    //helper functions
    //add local scope to current scope
    void nest(Scope scope) throws IllegalArgumentException;

    //returns list of scopes enclosed in current scope
    List<Scope> getNestedScopes();

    //returns all enclosing scopes of current scope until root
    List<Scope> getEnclosingPathToRoot();

    //returns symbols in this scope
    List<? extends Symbol> getSymbols();

    //returns all symbols
    List<? extends Symbol> getAllSymbols();

    //returns set of names associated with all symbols in this scope
    Set<String> getSymbolNames();

    //returns number of symbols in specific scope
    int getNumberOfSymbols();

    /* Return scopes from to current with separator in between */
    public String toQualifierString(String separator);


}
