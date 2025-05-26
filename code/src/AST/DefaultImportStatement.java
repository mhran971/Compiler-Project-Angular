package AST;
public class DefaultImportStatement implements ImportFromBlock {
    private ImportDefault importDefault;
    private ImportFrom importFrom;

    public DefaultImportStatement(ImportDefault importDefault, ImportFrom importFrom) {
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
        return "DefaultImportStatement{" +
                "importDefault=" + importDefault +
                ", importFrom=" + importFrom +
                '}';
    }
}
