package AST;
public class ParameterComma {
    //Comma parameter
    Parameter parameter;

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    @Override
    public String toString() {
        return "ParameterComma" +
                '\n'+"parameter=" + parameter +'\n'
                ;
    }
}