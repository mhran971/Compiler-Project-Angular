package AST;

import java.util.ArrayList;
import java.util.List;

public class ComplexHtmlAttr implements ContentHtml{
    //keyword Assign stringLiteral Star htmlKeyword Assign stringLiteral
    Keyword keyword;
    List<StringLiteral>stringLiterals=new ArrayList<StringLiteral>();
    HtmlKeyword htmlKeyword;

    public ComplexHtmlAttr(Keyword keyword, List<StringLiteral> stringLiterals, HtmlKeyword htmlKeyword) {
        this.keyword = keyword;
        this.stringLiterals = stringLiterals;
        this.htmlKeyword = htmlKeyword;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public List<StringLiteral> getStringLiterals() {
        return stringLiterals;
    }

    public void setStringLiterals(List<StringLiteral> stringLiterals) {
        this.stringLiterals = stringLiterals;
    }

    public HtmlKeyword getHtmlKeyword() {
        return htmlKeyword;
    }

    public void setHtmlKeyword(HtmlKeyword htmlKeyword) {
        this.htmlKeyword = htmlKeyword;
    }

    @Override
    public String toString() {
        return '\n'+"complexHtmlAttr=" +
                '\n'+ keyword +
                "stringLiterals=" + stringLiterals +
                '\n'+"htmlKeyword=" + htmlKeyword
                ;
    }
}