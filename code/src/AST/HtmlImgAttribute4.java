package AST;
public class HtmlImgAttribute4 implements ContentHtml{
    // keyword Assign stringLiteral
    Keyword keyword;
    StringLiteral stringLiteral;

    public HtmlImgAttribute4(Keyword keyword, StringLiteral stringLiteral) {
        this.keyword = keyword;
        this.stringLiteral = stringLiteral;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return "htmlImgAttribute4=" +
                '\n'+"keyword=" + keyword +
                "stringLiteral=" + stringLiteral+ '\n'
                ;
    }
}