package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportsProperties {
    //LeftBracket reservedWord reservedWordAndComma* RightBracket
    List<ReservedWordAndComma> reservedWordAndComma=new ArrayList<ReservedWordAndComma>();
    ReservedWord reservedWord;

    public List<ReservedWordAndComma> getReservedWordAndComma() {
        return reservedWordAndComma;
    }

    public void setReservedWordAndComma(List<ReservedWordAndComma> reservedWordAndComma) {
        this.reservedWordAndComma = reservedWordAndComma;
    }

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }


    @Override
    public String toString() {
        return  '\n'+"reservedWord=" + reservedWord +
                '\n'+"reservedWordAndComma=" + reservedWordAndComma

               ;
    }
}