package AST;

import java.util.ArrayList;
import java.util.List;

public class ComponentOptions {
    //LeftBrace componentOption* RightBrace
    List<ComponentOption> componentOption=new ArrayList<ComponentOption>();

    public List<ComponentOption> getComponentOption() {
        return componentOption;
    }

    public void setComponentOption(List<ComponentOption> componentOption) {
        this.componentOption = componentOption;
    }

    @Override
    public String toString() {
        return '\n'+"componentOption=" + componentOption +'\n'
                ;
    }
}