package AST;

import java.util.ArrayList;
import java.util.List;

public class PropertyList {
    //declarationName Colon STRING LeftBracket RightBracket
    //      Assign LeftBracket bodyList* RightBracket eos
    String STRING;
    DeclarationName declarationName;
    List<BodyList> bodyList=new ArrayList<BodyList>();

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    public List<BodyList> getBodyList() {
        return bodyList;
    }

    public void setBodyList(List<BodyList> bodyList) {
        this.bodyList = bodyList;
    }

    @Override
    public String toString() {
        return '\n' +""+ declarationName +
                '\n' +"type=" + STRING +
                '\n' +"bodyList=" + bodyList +'\n'
                ;
    }
}