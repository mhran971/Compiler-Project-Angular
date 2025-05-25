package SymbolTable.Symbol;

import SymbolTable.Scope.Scope;

public class SymbolBase implements Symbol{

    private String name;
    private String value;
    private String type;
    private Scope scope;

    private int insertionOrderNumber;

/*
    public SymbolBase(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public SymbolBase(String name, String type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
*/

    public void setValue(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Scope getScope() {
        return scope;
    }

    @Override
    public void setScope(Scope scope) {
        this.scope=scope;
    }

    @Override
    public int getInsertionOrderNumber() {
        return insertionOrderNumber;
        //return 0;
    }

    @Override
    public void setInsertionOrderNumber(int i) {
        this.insertionOrderNumber = i;

    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                (value == null ? "" : ", value='" + value + '\'') +
                " , type='" + type + '\'' +
                '}';
    }
/*         @Override
          public String toString() {
              return String.format("{name='%s'%s%s, type='%s'}",
               name,
               value != null ? ", value='" + value + "'" : "",
               scope != null ? ", scope='" + scope.getName() + "'" : "",
               type != null ? type : "unknown"
         );
     }*/
}
