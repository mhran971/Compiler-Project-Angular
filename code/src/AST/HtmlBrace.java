package AST;
public class HtmlBrace {
    //reservedWord Assign stringLiteral
    ReservedWord reservedWord;
    StringLiteral stringLiteral;

    public ReservedWord getReservedWord() {
        return reservedWord;
    }
    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }
    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return  '\n'+"reservedWord=" + reservedWord +
                '\n'+"stringLiteral=" + stringLiteral +'\n'
                ;
    }
}