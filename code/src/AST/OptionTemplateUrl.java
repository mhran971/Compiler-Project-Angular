package AST;
public class OptionTemplateUrl implements ComponentOption {
    // urlStatement Colon stringLiteral Comma?

    UrlStatement urlStatement;
    StringLiteral stringLiteral;

    public UrlStatement getUrlStatement() {
        return urlStatement;
    }

    public void setUrlStatement(UrlStatement urlStatement) {
        this.urlStatement = urlStatement;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return "optionTemplateUrl=" +
                '\n' +"urlStatement=" + urlStatement +
                '\n' +"stringLiteral=" + stringLiteral +'\n'
                ;
    }
}