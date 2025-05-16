package AST;

import java.util.ArrayList;
import java.util.List;

public class PropertyDeclarationCom {
    //declarationName Colon declarationName identifier keyword Assign keyword eos
    List<DeclarationName> declarationName=new ArrayList<DeclarationName>();
    List<Keyword> keyword=new ArrayList<Keyword>();
    Identifier identifier;

    public List<DeclarationName> getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(List<DeclarationName> declarationName) {
        this.declarationName = declarationName;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public List<Keyword> getKeyword() {
        return keyword;
    }

    public void setKeyword(List<Keyword> keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return '\n'+"propertyDeclaration=" +
                '\n' + declarationName
                ;
    }
}