package AST;

import java.util.ArrayList;
import java.util.List;

public class ReservedBlock implements Elements{
    //reservedWord Assign stringLiteral identifier STRING* identifier Div
    ReservedWord reservedWord;
    StringLiteral stringLiteral;
    List<Identifier>identifier =new ArrayList<Identifier>();

    public ReservedBlock(ReservedWord reservedWord, StringLiteral stringLiteral, List<Identifier> identifier) {
        this.reservedWord = reservedWord;
        this.stringLiteral = stringLiteral;
        this.identifier = identifier;
    }

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

    public List<Identifier> getIdentifier() {
        return identifier;
    }

    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return '\n'+"reservedBlock=" +
                '\n'+"reservedWord=" + reservedWord +
                '\n'+"stringLiteral=" + stringLiteral+'\n'
                ;
    }
}