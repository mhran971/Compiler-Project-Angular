package AST;

import java.util.ArrayList;
import java.util.List;

public class ExportStatement implements Statement {
    //Export keyword declarationName LeftBrace classBody* RightBrace
    Keyword keyword;
    DeclarationName declarationName;
    List<ClassBody> classBody=new ArrayList< ClassBody>();

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


    public List<ClassBody> getClassBody() {
        return classBody;
    }

    public void setClassBody(List<ClassBody> classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        return "exportStatement=" +
                '\n' + keyword + declarationName +
                '\n' +"classBody=" + classBody +'\n'
                ;
    }
}