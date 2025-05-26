package AST;

import java.util.ArrayList;
import java.util.List;

public class HtmlImgAttribute  implements ContentHtml {
    //Star htmlKeyword Assign stringLiteral
    StringLiteral stringLiteral;
    HtmlKeyword  htmlKeyword;

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    public HtmlKeyword getHtmlKeyword() {
        return htmlKeyword;
    }

    public void setHtmlKeyword(HtmlKeyword htmlKeyword) {
        this.htmlKeyword = htmlKeyword;
    }

    @Override
    public String toString() {
        if (htmlKeyword!=null){
            return '\n'+"htmlImgAttribute=" +
                    '\n'+"htmlKeyword=" + htmlKeyword +
                    "stringLiteral=" + stringLiteral + '\n'
                    ;
        }
        return "";
    }
}