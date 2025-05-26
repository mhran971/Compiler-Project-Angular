package AST;

public class ComponentStatement implements Statement{
    //At Component LeftParen componentOptions RightParen


    String Component;
    ComponentOptions componentOptions;

    public String getComponent() {
        return Component;
    }

    public void setComponent(String component) {
        Component = component;
    }

    public ComponentOptions getComponentOptions() {
        return componentOptions;
    }

    public void setComponentOptions(ComponentOptions componentOptions) {
        this.componentOptions = componentOptions;
    }

    @Override
    public String toString() {
        return "componentStatement=" +
                '\n' +"component=" + Component +
                '\n' +"componentOptions=" + componentOptions +'\n'
                ;
    }
}