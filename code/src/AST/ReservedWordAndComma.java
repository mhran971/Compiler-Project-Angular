package AST;
public class ReservedWordAndComma {
    //Comma reservedWord

    ReservedWord reservedWord;

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }

    @Override
    public String toString() {
        return '\n'+"reservedWord=" + reservedWord +'\n'
                ;
    }
}