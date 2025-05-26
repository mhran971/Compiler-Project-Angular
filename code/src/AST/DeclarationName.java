package AST;
public class DeclarationName implements DeclarationString{
    //STRING
    String STRING;

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    @Override
    public String toString() {
        if (STRING!=null){
            return "declarationName=" + STRING
                    ;
        }
        return "";

    }
}