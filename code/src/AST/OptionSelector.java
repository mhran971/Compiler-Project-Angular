package AST;
public class OptionSelector implements ComponentOption{
    //Selector Colon stringLiteral Comma
    String Selector;
    StringLiteral stringLiteral;


    public String getSelector() {
        return Selector;
    }

    public void setSelector(String selector) {
        Selector = selector;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }


    @Override
    public String toString() {
        return '\n'+"optionSelector=" +
                '\n'+"selector=" + Selector +
                '\n'+"stringLiteral=" + stringLiteral+'\n'
                ;
    }
}