package AST;

import java.util.ArrayList;
import java.util.List;

public class UnitNumberList implements DecimalLiteral_UNIT{
    //decimalLiteralUnit decimalLiteral*
    DecimalLiteralUnit decimalLiteralUnit;
    List<DecimalLiteral>decimalLiteral=new ArrayList<DecimalLiteral>();

    public UnitNumberList(DecimalLiteralUnit decimalLiteralUnit, List<DecimalLiteral> decimalLiteral) {
        this.decimalLiteralUnit = decimalLiteralUnit;
        this.decimalLiteral = decimalLiteral;
    }

    public DecimalLiteralUnit getDecimalLiteralUnit() {
        return decimalLiteralUnit;
    }

    public void setDecimalLiteralUnit(DecimalLiteralUnit decimalLiteralUnit) {
        this.decimalLiteralUnit = decimalLiteralUnit;
    }

    public List<DecimalLiteral> getDecimalLiteral() {
        return decimalLiteral;
    }

    public void setDecimalLiteral(List<DecimalLiteral> decimalLiteral) {
        this.decimalLiteral = decimalLiteral;
    }

    @Override
    public String toString() {
        if (decimalLiteralUnit!=null){
            return "unitNumberList=" +
                    '\n'+"decimalLiteralUnit=" + decimalLiteralUnit ;
        }

            return "unitNumberList=" +
                    '\n'+"decimalLiteral=" + decimalLiteral ;


    }
}