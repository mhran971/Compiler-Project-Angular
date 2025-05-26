package SymbolTable.Scope;

import SymbolTable.Symbol.Symbol;
import SymbolTable.Symbol.SymbolBase;

import java.util.*;

public abstract class BaseScope implements Scope {
    /**/
    protected String name;//scope name EX:global or function for
    protected String value;
    protected String type;

    // protected String id;//scope id
    /**
     * point to parent scope
     * it can be {@code null} if there is no parent
     */
    protected Scope enclosingScope;// Parent Scope
    /**
     * scope symbols
     */
   /* Map<String, List<SymbolBase>> symbol = new LinkedHashMap<>();
    symbols.computeIfAbsent(symbolBase.getName(), k -> new ArrayList<>()).add(symbolBase);*/

    public Map<String, Symbol> symbols = new LinkedHashMap<>();// Symbol in this scope only Name:Value
    //all nested scopes, does not include scoped symbols Ex:while,blocks,if
    protected List<Scope> nestedScopesNotSymbols = new ArrayList<>();



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BaseScope(Scope enclosingScope) {
        setEnclosingScope(enclosingScope);
    }//The outer scope is defined directly when an object is created.


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String getId() {
//        return this.id;
//    }
//
//    @Override
//    public void setId(String id) {
//        this.id = id;
//    }

    @Override
    public Symbol getSymbol(String name) {
        return symbols.get(name);
    }

    @Override
    public void setEnclosingScope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }

    @Override
    public List<Scope> getNestedScopes() {
        ArrayList<Scope> all = new ArrayList<>();
        all.addAll(nestedScopesNotSymbols);
        return all;
    }

    /**
     * Add a nested scope to this scope; could also be a FunctionSymbol
     * if your language allows nested functions.
     */
    @Override
    public void nest(Scope scope) throws IllegalArgumentException {
        nestedScopesNotSymbols.add(scope);
    }

    @Override
    public Symbol resolve(String name) {
        Symbol s = symbols.get(name);
        if (s != null) {
            return s;
        }
        // if not here, check any enclosing scope
        Scope parent = getEnclosingScope();
        if (parent != null) return parent.resolve(name);
        return null; // not found
    }

    @Override
    public Symbol resolveIterator(String name) {
        Symbol s = symbols.get(name);
        if (s != null) {
            return s;
        }
        // if not here, check any enclosing scope
        Scope parent = getEnclosingScope();
        if (parent != null && parent.getName().equals("cp-for scope")) return parent.resolve(name);
        return null; // not found
    }

    public void define(Symbol sym) throws IllegalArgumentException {

        sym.setScope(this);
        sym.setInsertionOrderNumber(symbols.size()); // set to insertion position from 0
        symbols.put(sym.getName(), sym);
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }
    /**
     * Walk up enclosingScope until we find topmost. Note this is
     * enclosing scope not necessarily parent. This will usually be
     * a global scope or something, depending on your scope tree.
     */
    public Scope getOuterMostEnclosingScope() {
        Scope s = this;
        while (s.getEnclosingScope() != null) {
            s = s.getEnclosingScope();
        }
        return s;
    }//Return Global Scope

    @Override
    public List<Scope> getEnclosingPathToRoot() {
        List<Scope> scopes = new ArrayList<>();
        Scope s = this;
        while (s != null) {
            scopes.add(s);
            s = s.getEnclosingScope();
        }
        return scopes;
    }//Return List of Scope

    @Override
    public List<? extends Symbol> getSymbols() {
        Collection<Symbol> values = symbols.values();
        if (values instanceof List) {
            return (List<Symbol>) values;
        }
        return new ArrayList<>(values);
    }


    public List<? extends Symbol> getAllSymbols() {
        List<Symbol> syms = new ArrayList<>();
        syms.addAll(getSymbols());
        for (Symbol s : symbols.values()) { //to add scoped symbols as well
            if (s instanceof Scope) {
                Scope scope = (Scope) s;
                syms.addAll(scope.getAllSymbols());
            }
        }
        return syms;
    }

    @Override
    public int getNumberOfSymbols() {
        return symbols.size();
    }

    @Override
    public Set<String> getSymbolNames() {
        return symbols.keySet();
    }

    public String toString() {
        return symbols.keySet().toString();
    }
}
