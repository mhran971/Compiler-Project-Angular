package AST;
public class UrlStatement {
    //   TemplateUrl | StyleUrl
    String TemplateUrl;
    String StyleUrl;

    public String getTemplateUrl() {
        return TemplateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        TemplateUrl = templateUrl;
    }

    public String getStyleUrl() {
        return StyleUrl;
    }

    public void setStyleUrl(String styleUrl) {
        StyleUrl = styleUrl;
    }

    @Override
    public String toString() {
        if (TemplateUrl!=null){
            return '\n' +"TemplateUrl=" + TemplateUrl
                    ;
        }
        if (StyleUrl!=null){
            return '\n' + "StyleUrl=" + StyleUrl + '\n'
                    ;
        }
        return ""
                ;
    }
}