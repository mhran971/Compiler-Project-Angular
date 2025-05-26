package AST;
public class HtmlTagNameEnd {
    //Less Div tagName Greater
    TagName tagName;


    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        return ""
                //'\n'+"tagName=" + tagName
                ;
    }
}