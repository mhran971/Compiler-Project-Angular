package AST;
public class DecimalLiteralUnit implements DecimalLiteral_UNIT {
    //DecimalLiteral_UNIT
    String DecimalLiteral_UNIT;

    public String getDecimalLiteral_UNIT() {
        return DecimalLiteral_UNIT;
    }

    public void setDecimalLiteral_UNIT(String decimalLiteral_UNIT) {
        DecimalLiteral_UNIT = decimalLiteral_UNIT;
    }

    @Override
    public String toString() {
        return '\n'+"decimalLiteral_UNIT=" + DecimalLiteral_UNIT
                ;
    }
}