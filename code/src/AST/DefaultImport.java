package AST;
public class DefaultImport implements ImportFromBlock {
    //importDefault? importFrom
    ImportDefault importDefault;
    ImportFrom importFrom;

    public DefaultImport(ImportDefault importDefault, ImportFrom importFrom) {
        this.importDefault = importDefault;
        this.importFrom = importFrom;
    }

    public ImportDefault getImportDefault() {
        return importDefault;
    }

    public void setImportDefault(ImportDefault importDefault) {
        this.importDefault = importDefault;
    }

    public ImportFrom getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(ImportFrom importFrom) {
        this.importFrom = importFrom;
    }

    @Override
    public String toString() {
        return '\n'+"defaultImport=" +
                '\n'+"importDefault=" + importDefault +
                '\n'+"importFrom=" + importFrom+'\n' ;
    }
}