package AST;
public class CommaReservedWord {
    // Comma reservedWord
    ReservedWord reservedWord;

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }

    @Override
    public String toString() {
        return "reservedWord=" + reservedWord +'\n'
                ;
    }
}