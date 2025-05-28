package SymbolTable.Scope;


public class LocalScope extends BaseScope {

    public LocalScope(Scope enclosingScope) {
        super(enclosingScope);
    }

    public GlobalScope getGlobalScope(Scope scope) {
        if (scope.getEnclosingScope() == null) {
            return (GlobalScope) scope;
        }else
            return getGlobalScope(scope.getEnclosingScope());
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
