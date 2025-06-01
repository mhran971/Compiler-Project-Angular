package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {
    //htmlTagNameStart+ htmlElementContent* htmlTagNameEnd+
    List<HtmlTagNameStart>htmlTagNameStart=new ArrayList<HtmlTagNameStart>();
    List<HtmlElementContent>htmlElementContent=new ArrayList< HtmlElementContent>();
    List<HtmlTagNameEnd>htmlTagNameEnd=new ArrayList<HtmlTagNameEnd>();

    public List<HtmlTagNameStart> getHtmlTagNameStart() {
        return htmlTagNameStart;
    }

    public void setHtmlTagNameStart(List<HtmlTagNameStart> htmlTagNameStart) {
        this.htmlTagNameStart = htmlTagNameStart;
    }

    public List<HtmlElementContent> getHtmlElementContent() {
        return htmlElementContent;
    }

    public void setHtmlElementContent(List<HtmlElementContent> htmlElementContent) {
        this.htmlElementContent = htmlElementContent;
    }

    public List<HtmlTagNameEnd> getHtmlTagNameEnd() {
        return htmlTagNameEnd;
    }

    public void setHtmlTagNameEnd(List<HtmlTagNameEnd> htmlTagNameEnd) {
        this.htmlTagNameEnd = htmlTagNameEnd;
    }

    @Override
    public String toString() {
        if(htmlElementContent!=null){
            return '\n'+"htmlTagNameStart=" + htmlTagNameStart +
                    '\n'+"htmlElementContent=" + htmlElementContent+'\n'
                    ;
        }
        return '\n'+"htmlTagNameStart=" + htmlTagNameStart+'\n'
                ;
    }
}