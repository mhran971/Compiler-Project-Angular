package AST;
public class OptionStyleUrls implements ComponentOption {
    //StyleUrls Colon LeftBracket stringLiteral RightBracket
    String StyleUrls;
    StringLiteral stringLiteral;


    public String getStyleUrls() {
        return StyleUrls;
    }
    public void setStyleUrls(String styleUrls) {
        StyleUrls = styleUrls;
    }
    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }
    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }


    @Override
    public String toString() {
        return "optionStyleUrls=" +
                '\n'+"styleUrls=" + StyleUrls +
                '\n'+"stringLiteral=" + stringLiteral+ '\n'
               ;
    }
}