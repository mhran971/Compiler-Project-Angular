package AST;
public class BodyListInner {
    //declarationName Colon stringLiteral Comma
    DeclarationName declarationName;
    StringLiteral stringLiteral;


    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }



    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        if(stringLiteral!=null){
            return '\n'+"" + declarationName +
                    '\n'+"stringLiteral=" + stringLiteral +'\n'
                    ;
        }
        return '\n'+"" + declarationName
                ;
    }
}