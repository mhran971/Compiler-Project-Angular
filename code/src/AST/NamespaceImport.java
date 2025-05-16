package AST;
public class NamespaceImport implements ImportFromBlock {
    //reservedWord importFrom
    ReservedWord  reservedWord;
    ImportFrom   importFrom;

    public NamespaceImport(ReservedWord reservedWord, ImportFrom importFrom) {
        this.reservedWord = reservedWord;
        this.importFrom = importFrom;
    }

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }

    public ImportFrom getImportFrom() {
        return importFrom;
    }

    public void setImportFrom(ImportFrom importFrom) {
        this.importFrom = importFrom;
    }

    @Override
    public String toString() {
        return '\n'+"namespaceImport=" +
               '\n'+"reservedWord=" + reservedWord +
                '\n'+"importFrom=" + importFrom
               ;
    }
}