package AST;


public class TagName {
    //H1| H2| H3| H4| IMG_| P| QuestionDot| RBRACE_RBRACE| LBRACE_LBRACE| Div_| Dot| Button
    String H1;
    String H2;
    String H3;
    String H4;
    String IMG_;
    String P;
    String QuestionDot;
    String RBRACE_RBRACE;
    String LBRACE_LBRACE;
    String Div_;
    String Dot;
    String Button;

    public String getH1() {
        return H1;
    }

    public void setH1(String h1) {
        H1 = h1;
    }

    public String getH2() {
        return H2;
    }

    public void setH2(String h2) {
        H2 = h2;
    }

    public String getH3() {
        return H3;
    }

    public void setH3(String h3) {
        H3 = h3;
    }

    public String getH4() {
        return H4;
    }

    public void setH4(String h4) {
        H4 = h4;
    }

    public String getIMG_() {
        return IMG_;
    }

    public void setIMG_(String IMG_) {
        this.IMG_ = IMG_;
    }

    public String getP() {
        return P;
    }

    public void setP(String p) {
        P = p;
    }

    public String getQuestionDot() {
        return QuestionDot;
    }

    public void setQuestionDot(String questionDot) {
        QuestionDot = questionDot;
    }

    public String getRBRACE_RBRACE() {
        return RBRACE_RBRACE;
    }

    public void setRBRACE_RBRACE(String RBRACE_RBRACE) {
        this.RBRACE_RBRACE = RBRACE_RBRACE;
    }

    public String getLBRACE_LBRACE() {
        return LBRACE_LBRACE;
    }

    public void setLBRACE_LBRACE(String LBRACE_LBRACE) {
        this.LBRACE_LBRACE = LBRACE_LBRACE;
    }

    public String getDiv_() {
        return Div_;
    }

    public void setDiv_(String div_) {
        Div_ = div_;
    }

    public String getDot() {
        return Dot;
    }

    public void setDot(String dot) {
        Dot = dot;
    }

    public String getButton() {
        return Button;
    }

    public void setButton(String button) {
        Button = button;
    }

    @Override
    public String toString() {
        if (H1!=null){
            return  H1 ;
        }
        if (H2!=null){
            return  H2 ;
        }
        if (H3!=null){
            return  H3 ;
        }
        if (H4!=null){
            return  H4 ;
        }
        if (IMG_!=null){
            return  IMG_ ;
        }
        if (P!=null){
            return  P ;
        }
        if (QuestionDot!=null){
            return  QuestionDot ;
        }
        if (RBRACE_RBRACE!=null){
            return RBRACE_RBRACE ;
        }
        if (LBRACE_LBRACE!=null){
            return LBRACE_LBRACE ;
        }
        if (Div_!=null){
            return Div_ ;
        }
        if (Dot!=null){
            return Dot ;
        }
        if ( Button!=null){
            return  Button ;
        }
        return "";
    }
}
