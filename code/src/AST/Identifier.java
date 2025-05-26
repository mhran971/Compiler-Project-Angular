package AST;
public class Identifier implements ComponentOption{
    //Identifier| As| From| At| True_| Or | Less | Greater
    String Identifier;
    String True_;
    String Or;

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getTrue_() {
        return True_;
    }

    public void setTrue_(String true_) {
        True_ = true_;
    }

    public String getOr() {
        return Or;
    }

    public void setOr(String or) {
        Or = or;
    }

    @Override
    public String toString() {
        if(Identifier!=null){
            return '\n'+"Identifier=" + Identifier + '\n'
                    ;
        }
        else if(True_!=null){
            return '\n'+"True_=" + True_ + '\n'
                    ;
        }
        return '\n'+"Or=" + Or + '\n'
                ;
    }
}