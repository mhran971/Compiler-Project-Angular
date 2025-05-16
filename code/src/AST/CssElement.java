package AST;

import java.util.ArrayList;
import java.util.List;

public class CssElement implements Statement{
    // Dot* tagName? Comma? H4? selector* LeftBrace cssProperty* RightBrace

    TagName tagName;
    List<Selector> selector=new ArrayList<Selector>();
    List<CssProperty> cssProperty=new ArrayList<CssProperty>();

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    public List<Selector> getSelector() {
        return selector;
    }

    public void setSelector(List<Selector> selector) {
        this.selector = selector;
    }

    public List<CssProperty> getCssProperty() {
        return cssProperty;
    }

    public void setCssProperty(List<CssProperty> cssProperty) {
        this.cssProperty = cssProperty;
    }

    @Override
    public String toString() {
        if (tagName!=null){
            return "cssElement=" +
                    '\n'+"selectorName=" + tagName +
                    '\n'+"Properties=" + cssProperty + '\n'
                    ;
        }
        if (selector!=null){
            return "cssElement=" +
                    '\n'+"selector=" + selector +
                    '\n'+"Properties=" + cssProperty + '\n'
                    ;
        }
        return "cssElement=" +
                '\n'+"Properties=" + cssProperty + '\n'
                ;
    }
}