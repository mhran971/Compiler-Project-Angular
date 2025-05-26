package AST;
public class ImportFrom implements ImportFromBlock{
    //From? stringLiteral eos?
    StringLiteral stringLiteral;

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return "stringLiteral=" + stringLiteral
        ;
    }
}