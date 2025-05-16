package AST;
public class HtmlImgAttribute2 implements ContentHtml{
    // LeftBracket htmlKeyword RightBracket Assign stringLiteral
    HtmlKeyword htmlKeyword;
    StringLiteral stringLiteral;

    public HtmlImgAttribute2(HtmlKeyword htmlKeyword, StringLiteral stringLiteral) {
        this.htmlKeyword = htmlKeyword;
        this.stringLiteral = stringLiteral;
    }

    public HtmlKeyword getHtmlKeyword() {
        return htmlKeyword;
    }

    public void setHtmlKeyword(HtmlKeyword htmlKeyword) {
        this.htmlKeyword = htmlKeyword;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return "htmlImgAttribute2=" +
                '\n'+"htmlKeyword=" + htmlKeyword +
                "stringLiteral=" + stringLiteral+ '\n'
                ;
    }
}