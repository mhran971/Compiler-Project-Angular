package AST;

import java.util.ArrayList;
import java.util.List;

public class Selector {
    //STRING IMG_? selectorInternal*
    String STRING;
    List<SelectorInternal> selectorInternal=new ArrayList< SelectorInternal>();

    public List<SelectorInternal> getSelectorInternal() {
        return selectorInternal;
    }

    public void setSelectorInternal(List<SelectorInternal> selectorInternal) {
        this.selectorInternal = selectorInternal;
    }

    public String getSTRING() {
        return STRING;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    @Override
    public String toString() {
        if (selectorInternal!=null&&!selectorInternal.isEmpty()){
          return  '\n'+"selectorName="+STRING+
          '\n'+"selectorInternal=" + selectorInternal +'\n'
          ;
        }
        return  '\n'+"selectorName="+STRING+'\n'

                ;
    }
}