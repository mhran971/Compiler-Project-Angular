package SymbolTable;

import SymbolTable.Scope.BaseScope;
import SymbolTable.Scope.GlobalScope;
import SymbolTable.Scope.LocalScope;
import SymbolTable.Scope.Scope;
import SymbolTable.Symbol.Symbol;
import SymbolTable.Symbol.SymbolBase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class SymbolTable {

    private List<GlobalScope> globalScopes = new ArrayList<GlobalScope>();
    private List<LocalScope> localScopes = new ArrayList<LocalScope>();
    private List<SymbolBase> symbolBases=new ArrayList<>();
    private Map<String, SymbolBase> globalSymbols = new HashMap<>();


    public Scope getScopeByName(String name) {
        for (Scope scope : globalScopes) { // أو حسب بنية symbol table الخاصة بك
            if (scope.getName().equals(name)) {
                return scope;
            }
        }
        return null;
    }


    public List<SymbolBase> getSymbolBases() {
        return symbolBases;
    }

    public void setSymbolBases(List<SymbolBase> symbolBases) {
        this.symbolBases = symbolBases;
    }

    private static SymbolTable single_instance = null;

    public static SymbolTable getInstance() {
        if (single_instance == null)
            single_instance = new SymbolTable();
        return single_instance;
    }

    public boolean hasSyntaxError = false;
    public boolean hasSemanticError = false;

    // --------------------- Scopes Management ---------------------

    public List<GlobalScope> getGlobalScopes() {
        return globalScopes;
    }

    public void setGlobalScopes(List<GlobalScope> globalScopes) {
        this.globalScopes = globalScopes;
    }

    public List<LocalScope> getLocalScopes() {
        return localScopes;
    }

    public void setLocalScopes(List<LocalScope> scopeList) {
        this.localScopes = scopeList;
    }

    public void addGlobalScope(GlobalScope scope) {
        this.globalScopes.add(scope);
    }

    public void addLocalScope(LocalScope scope) {
        this.localScopes.add(scope);
    }
    public void removeGlobalScope(GlobalScope scope) {
        this.globalScopes.remove(scope);
    }

    public void removeLocalScope(LocalScope scope) {
        this.localScopes.remove(scope);
    }

    public List<Scope> getChildren(Scope scope) {
        return scope.getNestedScopes();
    }
    public SymbolBase lookup(String name) {
        return globalSymbols.get(name);
    }

    public void addSymbol(SymbolBase symbol) {
        globalSymbols.put(symbol.getName(), symbol);
    }

    // --------------------- Print Scope Tree ---------------------

    public void printTree(Scope scope, String indent, PrintStream out) {
        print(scope, indent, out);
        for (Scope child : getChildren(scope)) {
            printTree(child, indent + "  ", out);
        }
    }

    public void print(Scope scope, String indent, PrintStream out) {
        if (scope.getName() != null && !scope.getName().trim().isEmpty()) {
            out.println(indent + "Scope: " + scope.getName());
        }

        int maxNameLen = "Name".length();
        int maxTypeLen = "Type".length();
        int maxValueLen = "Value".length();

        for (Symbol sym : scope.getSymbols()) {
            if (sym instanceof SymbolBase) {
                SymbolBase s = (SymbolBase) sym;
                maxNameLen = Math.max(maxNameLen, s.getName() != null ? s.getName().length() : 0);
                maxTypeLen = Math.max(maxTypeLen, s.getType() != null ? s.getType().length() : 0);
                maxValueLen = Math.max(maxValueLen, s.getValue() != null ? s.getValue().length() : 0);
            }
        }

        for (Symbol sym : scope.getSymbols()) {
            if (sym instanceof SymbolBase) {
                SymbolBase s = (SymbolBase) sym;
                String name = s.getName() != null ? s.getName() : "N/A";
                String type = s.getType() != null ? s.getType() : "N/A";
                String value = s.getValue() != null ? s.getValue() : "N/A";

                out.println(indent + "  Symbol → Name:" + padRight(name, maxNameLen)
                        + "  , Type: " + padRight(type, maxTypeLen)
                        + "  , Value: " + padRight(value, maxValueLen));
            } else {
                String name = sym.getName() != null ? sym.getName() : "N/A";
                out.println(indent + "  Symbol → Name:" + padRight(name, maxNameLen)
                        + "  , Type: " + padRight("N/A", maxTypeLen)
                        + "  , Value: " + padRight("N/A", maxValueLen));
            }
        }
    }
    private String padRight(String text, int length) {
        if (text == null) text = "";
        if (text.length() >= length) return text;

        StringBuilder sb = new StringBuilder(text);
        while (sb.length() < length) {
            sb.append(' ');
        }
        return sb.toString();
    }


    public void write(String text) {
        try {
            FileWriter syntaxError = new FileWriter("Result\\Syntax.txt");
            syntaxError.append("Syntax Error : \n");
            syntaxError.write(text);
            syntaxError.flush();
            syntaxError.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
