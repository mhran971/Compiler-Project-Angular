package AST;

import java.util.ArrayList;
import java.util.List;

public class NestedHtml implements HtmlElementContent{
    //Less tagName elements tagName Greater
    List<TagName>tagName=new ArrayList<TagName>();
    Elements elements;

    public NestedHtml(List<TagName> tagName, Elements elements) {
        this.tagName = tagName;
        this.elements = elements;
    }

    public List<TagName> getTagName() {
        return tagName;
    }

    public void setTagName(List<TagName> tagName) {
        this.tagName = tagName;
    }

    public Elements getElements() {
        return elements;
    }

    public void setElements(Elements elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        if (elements!=null) {
            return '\n'+"nestedHtml=" +
                    '\n'+"elements=" + elements
                    ;
        }
        return "";
    }
}