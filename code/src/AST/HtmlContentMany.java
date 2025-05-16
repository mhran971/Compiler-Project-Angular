package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlContentMany implements HtmlElementContent{
    // Less tagName contentHtml contentHtml contentHtml contentHtml Div Greater
    TagName tagName;
    List<ContentHtml>contentHtmls=new ArrayList<ContentHtml>();

    public HtmlContentMany(TagName tagName, List<ContentHtml> contentHtmls) {
        this.tagName = tagName;
        this.contentHtmls = contentHtmls;
    }

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    public List<ContentHtml> getContentHtmls() {
        return contentHtmls;
    }

    public void setContentHtmls(List<ContentHtml> contentHtmls) {
        this.contentHtmls = contentHtmls;
    }

    @Override
    public String toString() {
        return "htmlContentMany=" +
                '\n'+"contentHtmls=" + contentHtmls
                ;
    }
}

