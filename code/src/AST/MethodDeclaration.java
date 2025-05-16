package AST;
public class MethodDeclaration implements ClassBody {
    //declarationName LeftParen parameterList? RightParen methodBody
    DeclarationName declarationName;
    ParameterList parameterList;
    MethodBody  methodBody;

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }



    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }



    public MethodBody getMethodBody() {
        return methodBody;
    }

    public void setMethodBody(MethodBody methodBody) {
        this.methodBody = methodBody;
    }

    @Override
    public String toString() {
        if(parameterList!=null){
            return '\n'+"" + declarationName +
                    '\n'+"parameterList=" + parameterList +
                    '\n'+"methodBody=" + methodBody + '\n'
                    ;
        }
        return '\n'+"" + declarationName +
                '\n'+"methodBody=" + methodBody + '\n'
                ;
    }
}