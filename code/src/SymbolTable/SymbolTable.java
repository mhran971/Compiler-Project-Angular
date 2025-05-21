package SymbolTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SymbolTable {

    private Stack<List<Row>> scopes;

    public SymbolTable() {
        scopes = new Stack<>();
        // global scope
        scopes.push(new ArrayList<>());
    }


    public void enterScope() {
        scopes.push(new ArrayList<>());
    }


    public void exitScope() {
        if (!scopes.isEmpty()) {
            scopes.pop();
        }
    }


    public void addRow(Row row) {
        if (!scopes.isEmpty()) {
            scopes.peek().add(row);
        }
    }


    public List<Row> getAllRows() {
        List<Row> allRows = new ArrayList<>();
        for (List<Row> scope : scopes) {
            allRows.addAll(scope);
        }
        return allRows;
    }

    public void print() {
        int level = 0;
        for (List<Row> scope : scopes) {
            System.out.println("Scope Level " + level + ":");
            for (Row row : scope) {
                if (row != null) {
                    System.out.println("\t" + row.getType() + "\t\t\t\t" + row.getValue());
                }
            }
            level++;
            System.out.println();
        }
    }
}
