package AST;
public class CssProperty {
    //css Colon cssValue operators
    Css css;
    CssValue cssValue;

    public Css getCss() {
        return css;
    }

    public void setCss(Css css) {
        this.css = css;
    }

    public CssValue getCssValue() {
        return cssValue;
    }

    public void setCssValue(CssValue cssValue) {
        this.cssValue = cssValue;
    }

    @Override
    public String toString() {
        return  '\n'+"property=" + css
                ;
    }
}