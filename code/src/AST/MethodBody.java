package AST;

import java.util.ArrayList;
import java.util.List;

public class MethodBody {
    //LeftBrace statementMethod* RightBrace
    List<StatementMethod> statementMethod=new ArrayList<StatementMethod>();

    public List<StatementMethod> getStatementMethod() {
        return statementMethod;
    }

    public void setStatementMethod(List<StatementMethod> statementMethod) {
        this.statementMethod = statementMethod;
    }

    @Override
    public String toString() {
        return '\n'+"statementMethod=" + statementMethod + '\n'
               ;
    }
}