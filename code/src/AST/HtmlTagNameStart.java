package AST;
public class HtmlTagNameStart {
    // Less tagName (keyword Assign stringLiteral)? Greater
    TagName tagName;
    Keyword keyword;
    StringLiteral stringLiteral;

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
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
        if(keyword!=null){
            return '\n'+""+keyword +
                    "stringLiteral=" + stringLiteral +'\n'
                    ;
        }
        return ""
                ;
    }
}