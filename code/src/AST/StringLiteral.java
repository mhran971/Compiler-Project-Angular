package AST;
public class StringLiteral  implements DeclarationString{
    //StringLiteral
    String StringLiteral;

    public String getStringLiteral() {
        return StringLiteral;
    }

    public void setStringLiteral(String stringLiteral) {
        StringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return StringLiteral
                ;
    }
}