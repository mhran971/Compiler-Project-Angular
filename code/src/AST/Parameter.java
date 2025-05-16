package AST;

import java.util.ArrayList;
import java.util.List;

public class Parameter {

    //declarationName Colon declarationString
    DeclarationName declarationName;
    DeclarationString declarationString;

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    public DeclarationString getDeclarationString() {
        return declarationString;
    }

    public void setDeclarationString(DeclarationString declarationString) {
        this.declarationString = declarationString;
    }

    @Override
    public String toString() {
        return '\n' +"" + declarationName +
                '\n' +"declarationString=" + declarationString
                ;
    }
}