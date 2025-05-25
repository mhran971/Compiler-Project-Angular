package SymbolTable.Scope;


public class GlobalScope extends BaseScope {

     // A scope associated with globals.

    private String globalVar;

    public String getGlobalVar() {
        return globalVar;
    }

    public void setGlobalVar(String globalVar) {
        this.globalVar = globalVar;
    }

    public GlobalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    @Override
    public void setId(String id) {

    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String toQualifierString(String separator) {
        return null;
    }

}
