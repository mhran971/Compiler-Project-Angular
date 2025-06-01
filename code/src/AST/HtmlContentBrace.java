package AST;
public class HtmlContentBrace implements HtmlElementContent{
    // Less tagName contentHtml htmlBrace Greater
    TagName tagName;
    ContentHtml contentHtml;
    HtmlBrace htmlBrace;

    public HtmlContentBrace(TagName tagName, ContentHtml contentHtml, HtmlBrace htmlBrace) {
        this.tagName = tagName;
        this.contentHtml = contentHtml;
        this.htmlBrace = htmlBrace;
    }

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    public ContentHtml getContentHtml() {
        return contentHtml;
    }

    public void setContentHtml(ContentHtml contentHtml) {
        this.contentHtml = contentHtml;
    }

    public HtmlBrace getHtmlBrace() {
        return htmlBrace;
    }

    public void setHtmlBrace(HtmlBrace htmlBrace) {
        this.htmlBrace = htmlBrace;
    }

    @Override
    public String toString() {
        return  '\n'+"htmlContentBrace=" +
                '\n'+"contentHtml=" + contentHtml +
                '\n'+"htmlBrace=" + htmlBrace
                ;
    }
}