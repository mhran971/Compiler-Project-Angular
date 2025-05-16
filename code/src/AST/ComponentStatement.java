package AST;

public class ComponentStatement implements Statement{
    //At reservedWord LeftParen componentOptions RightParen

    ReservedWord reservedWord;
    ComponentOptions componentOptions;

    public ReservedWord getReservedWord() {
        return reservedWord;
    }

    public void setReservedWord(ReservedWord reservedWord) {
        this.reservedWord = reservedWord;
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
                '\n' +"reservedWord=" + reservedWord +
                '\n' +"componentOptions=" + componentOptions +'\n'
                ;
    }
}