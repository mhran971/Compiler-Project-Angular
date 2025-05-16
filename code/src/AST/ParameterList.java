package AST;

import java.util.ArrayList;
import java.util.List;

public class ParameterList {
    //parameter parameterComma*
    List<ParameterComma> parameterComma=new ArrayList<ParameterComma>();
    Parameter parameter;

    public List<ParameterComma> getParameterComma() {
        return parameterComma;
    }

    public void setParameterComma(List<ParameterComma> parameterComma) {
        this.parameterComma = parameterComma;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return '\n'+"parameter=" + parameter+
                '\n'+"parameterComma------------=" + parameterComma
                ;
       /* if(parameterComma!=null){
            return '\n'+"parameter=" + parameter+
                    '\n'+"parameterComma------------=" + parameterComma
                    ;
        }
        return '\n'+"parameter=" + parameter + '\n'
                ;*/
    }
}