package AST;

import java.util.ArrayList;
import java.util.List;

public class BodyList {
    //LeftBrace bodyListInner* RightBrace Comma
    List<BodyListInner> bodyListInner=new ArrayList<BodyListInner>();

    public List<BodyListInner> getBodyListInner() {
        return bodyListInner;
    }

    public void setBodyListInner(List<BodyListInner> bodyListInner) {
        this.bodyListInner = bodyListInner;
    }

    @Override
    public String toString() {
        return '\n'+"bodyListInner=" + bodyListInner +'\n'
                ;
    }
}