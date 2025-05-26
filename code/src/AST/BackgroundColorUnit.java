package AST;
public class BackgroundColorUnit implements DecimalLiteral_UNIT{
    //css decimalLiteralUnit
    DecimalLiteralUnit decimalLiteralUnit;
    Css css;

    public BackgroundColorUnit(DecimalLiteralUnit decimalLiteralUnit, Css css) {
        this.decimalLiteralUnit = decimalLiteralUnit;
        this.css = css;
    }

    public DecimalLiteralUnit getDecimalLiteralUnit() {
        return decimalLiteralUnit;
    }

    public void setDecimalLiteralUnit(DecimalLiteralUnit decimalLiteralUnit) {
        this.decimalLiteralUnit = decimalLiteralUnit;
    }

    public Css getCss() {
        return css;
    }

    public void setCss(Css css) {
        this.css = css;
    }

    @Override
    public String toString() {
        return "BackgroundColorUnit{" +
                "decimalLiteralUnit=" + decimalLiteralUnit +
                ", css=" + css +
                '}';
    }
}