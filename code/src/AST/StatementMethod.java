package AST;

public class StatementMethod {
    //keyword Dot declarationName Assign declarationString eos
    Keyword keyword;
    DeclarationName declarationName;
    DeclarationString declarationString;

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

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
        return '\n' +"" + keyword + declarationName +
                '\n' + "declarationString=" + declarationString + '\n'
                ;
    }
}