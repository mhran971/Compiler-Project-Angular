package AST;
public class CssValue {
    //decimalLiteral_UNIT|Row|Flex|Border_Box|Center|Column|Auto|Pointer|HEXCHAR|STRING
    DecimalLiteral_UNIT decimalLiteral_UNIT;
    String Row;String Flex;
    String Border_Box;String Center;
    String Column;String Auto;
    String Pointer;String HEXCHAR;
    String STRING;

    public DecimalLiteral_UNIT getDecimalLiteral_UNIT() {
        return decimalLiteral_UNIT;
    }

    public void setDecimalLiteral_UNIT(DecimalLiteral_UNIT decimalLiteral_UNIT) {
        this.decimalLiteral_UNIT = decimalLiteral_UNIT;
    }

    public String getRow() {
        return Row;
    }

    public void setRow(String row) {
        Row = row;
    }

    public String getFlex() {
        return Flex;
    }

    public void setFlex(String flex) {
        Flex = flex;
    }

    public String getBorder_Box() {
        return Border_Box;
    }

    public void setBorder_Box(String border_Box) {
        Border_Box = border_Box;
    }

    public String getCenter() {
        return Center;
    }

    public void setCenter(String center) {
        Center = center;
    }

    public String getColumn() {
        return Column;
    }

    public void setColumn(String column) {
        Column = column;
    }

    public String getAuto() {
        return Auto;
    }

    public void setAuto(String auto) {
        Auto = auto;
    }

    public String getPointer() {
        return Pointer;
    }

    public void setPointer(String pointer) {
        Pointer = pointer;
    }

    public String getHEXCHAR() {
        return HEXCHAR;
    }

    public void setHEXCHAR(String HEXCHAR) {
        this.HEXCHAR = HEXCHAR;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    @Override
    public String toString() {
        if(decimalLiteral_UNIT !=null){
            return  '\n'+"decimalLiteral_UNIT="+decimalLiteral_UNIT+'\n'  ;
        }
        if(Row !=null){
            return  Row  ;
        }
        if( Flex !=null){
            return   Flex  ;
        }
        if(Border_Box !=null){
            return  Border_Box   ;
        }
        if(Center  !=null){
            return  Center  ;
        }
        if( Column !=null){
            return  Column ;
        }
        if(Auto!=null){
            return Auto;
        }
        if(Pointer !=null){
            return Pointer ;
        }
        if(HEXCHAR!=null){
            return HEXCHAR;
        }
        if(STRING!=null){
            return STRING;
        }
        return "CssValue" +
                '\n' +"decimalLiteral_UNIT=" + decimalLiteral_UNIT +
                '\n' +"Row=" + Row +
                '\n' +"Flex=" + Flex +
                '\n' +"Border_Box=" + Border_Box +
                '\n' +"Center=" + Center +
                '\n' +"Column=" + Column +
                '\n' +"Auto=" + Auto +
                '\n' +"Pointer=" + Pointer +
                '\n' +"HEXCHAR=" + HEXCHAR +
                '\n' +"STRING=" + STRING + '\n'
                ;
    }
}