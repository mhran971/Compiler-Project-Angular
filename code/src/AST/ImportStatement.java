package AST;

public class ImportStatement implements Statement {
    //Import importFromBlock
    ImportFromBlock importFromBlock;

    public ImportFromBlock getImportFromBlock() {
        return importFromBlock;
    }

    public void setImportFromBlock(ImportFromBlock importFromBlock) {
        this.importFromBlock = importFromBlock;
    }

    @Override
    public String toString() {
        return "importStatement=" +
               '\n'+"importFromBlock=" + importFromBlock +'\n'
               ;
    }


}