package AST;
public class DecimalLiteral {
    //DecimalLiteral
    String DecimalLiteral;

    public String getDecimalLiteral() {
        return DecimalLiteral;
    }

    public void setDecimalLiteral(String decimalLiteral) {
        DecimalLiteral = decimalLiteral;
    }

    @Override
    public String toString() {
        return '\n'+"decimalLiteral=" + DecimalLiteral + '\n'
                ;
    }
}