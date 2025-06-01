package AST;
public class Type implements PropertyDeclaration,DeclarationString {
   //String Int| Float | Double | Bool| Var | Array| Number
    String string ;
    String Int ;
    String Float;
    String Double ;
    String Bool;
    String Var;
    String Array;
    String Number;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getInt() {
        return Int;
    }

    public void setInt(String anInt) {
        Int = anInt;
    }

    public String getFloat() {
        return Float;
    }

    public void setFloat(String aFloat) {
        Float = aFloat;
    }

    public String getDouble() {
        return Double;
    }

    public void setDouble(String aDouble) {
        Double = aDouble;
    }

    public String getBool() {
        return Bool;
    }

    public void setBool(String bool) {
        Bool = bool;
    }

    public String getVar() {
        return Var;
    }

    public void setVar(String var) {
        Var = var;
    }

    public String getArray() {
        return Array;
    }

    public void setArray(String array) {
        Array = array;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    @Override
    public String toString() {
        if(string!=null){
            return "type=" + string + '\n' ;
        }
        else if(Int!=null){
            return "type=" + Int + '\n' ;
        }
        else if(Float!=null){
            return  "type=" +Float + '\n' ;
        }
        else if(Double!=null){
            return "type=" + Double + '\n' ;
        }
        else if(Bool!=null){
            return "type=" + Bool + '\n' ;
        }
        else if(Var!=null){
            return "type=" + Var + '\n' ;
        }
        else if(Array!=null){
            return "type=" + Array + '\n' ;
        }
        return "type=" +Number + '\n' ;


    }
}