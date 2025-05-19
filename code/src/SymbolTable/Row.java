package SymbolTable;

public class Row {
    String type;
    String value;


    public Row(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public Row() {

    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

