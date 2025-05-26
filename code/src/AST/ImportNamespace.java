package AST;

import java.util.ArrayList;
import java.util.List;

public class ImportNamespace {
    //reservedWord commaReservedWord*
    ReservedWord reservedWord;
    List<CommaReservedWord> commaReservedWord=new ArrayList<CommaReservedWord>();

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
    }

    public List<CommaReservedWord> getCommaReservedWord() {
        return commaReservedWord;
    }

    public void setCommaReservedWord(List<CommaReservedWord> commaReservedWord) {
        this.commaReservedWord = commaReservedWord;
    }

    @Override
    public String toString() {
        if(reservedWord!=null){
            return  '\n'+"reservedWord=" + reservedWord ;
        }
        if(commaReservedWord!=null){
            return '\n'+"commaReservedWord=" + commaReservedWord;
        }
        return "";
    }
}