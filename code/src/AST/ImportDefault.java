package AST;
public class ImportDefault {
    //LeftBrace importNamespace RightBrace

    ImportNamespace importNamespace;
    public ImportNamespace getImportNamespace() {
        return importNamespace;
    }

    public void setImportNamespace(ImportNamespace importNamespace) {
        this.importNamespace = importNamespace;
    }

    @Override
    public String toString() {
        return '\n'+"importNamespace=" + importNamespace + '\n'
                ;
    }
}