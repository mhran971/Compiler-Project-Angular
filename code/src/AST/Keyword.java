package AST;
public class Keyword {
    // Break| Do |Case| Else| New| Return| Void| Continue| For| Switch| While| Function_| This
    //| Default| If| In| Const| Export| Import| Let| Interface| Extends| Class| NullLiteral
    String Break;
    String Do;
    String Case;
    String Else;
    String New;
    String Return;
    String Void;
    String Continue;
    String For;
    String Switch;
    String While;
    String Function_;
    String This;
    String Default;
    String If;
    String In;
    String Const;
    String Export;
    String Import;
    String Let;
    String Interface;
    String Extends;
    String Clas;
    String NullLiteral;



    public String getBreak() {
        return Break;
    }

    public void setBreak(String aBreak) {
        Break = aBreak;
    }

    public String getDo() {
        return Do;
    }

    public void setDo(String aDo) {
        Do = aDo;
    }

    public String getCase() {
        return Case;
    }

    public void setCase(String aCase) {
        Case = aCase;
    }

    public String getElse() {
        return Else;
    }

    public void setElse(String anElse) {
        Else = anElse;
    }

    public String getNew() {
        return New;
    }

    public void setNew(String aNew) {
        New = aNew;
    }

    public String getReturn() {
        return Return;
    }

    public void setReturn(String aReturn) {
        Return = aReturn;
    }

    public String getVoid() {
        return Void;
    }

    public void setVoid(String aVoid) {
        Void = aVoid;
    }

    public String getContinue() {
        return Continue;
    }

    public void setContinue(String aContinue) {
        Continue = aContinue;
    }

    public String getFor() {
        return For;
    }

    public void setFor(String aFor) {
        For = aFor;
    }

    public String getSwitch() {
        return Switch;
    }

    public void setSwitch(String aSwitch) {
        Switch = aSwitch;
    }

    public String getWhile() {
        return While;
    }

    public void setWhile(String aWhile) {
        While = aWhile;
    }

    public String getFunction_() {
        return Function_;
    }

    public void setFunction_(String function_) {
        Function_ = function_;
    }

    public String getThis() {
        return This;
    }

    public void setThis(String aThis) {
        This = aThis;
    }

    public String getDefault() {
        return Default;
    }

    public void setDefault(String aDefault) {
        Default = aDefault;
    }

    public String getIf() {
        return If;
    }

    public void setIf(String anIf) {
        If = anIf;
    }

    public String getIn() {
        return In;
    }

    public void setIn(String in) {
        In = in;
    }

    public String getConst() {
        return Const;
    }

    public void setConst(String aConst) {
        Const = aConst;
    }

    public String getExport() {
        return Export;
    }

    public void setExport(String export) {
        Export = export;
    }

    public String getImport() {
        return Import;
    }

    public void setImport(String anImport) {
        Import = anImport;
    }

    public String getLet() {
        return Let;
    }

    public void setLet(String let) {
        Let = let;
    }

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String anInterface) {
        Interface = anInterface;
    }

    public String getExtends() {
        return Extends;
    }

    public void setExtends(String anExtends) {
        Extends = anExtends;
    }

    public String getClas() {
        return Clas;
    }

    public void setClas(String clas) {
        Clas = clas;
    }

    public String getNullLiteral() {
        return NullLiteral;
    }

    public void setNullLiteral(String nullLiteral) {
        NullLiteral = nullLiteral;
    }



    @Override
    public String toString() {
        if (Break != null) {
            return "keyword=" + Break + "\n";
        } else if (Do != null) {
            return "keyword=" + Do + "\n";
        } else if (Case != null) {
            return "keyword=" + Case + "\n";
        } else if (Else != null) {
            return "keyword=" +Else + "\n";
        } else if (New != null) {
            return "keyword=" + New + "\n";
        } else if (Return != null) {
            return "keyword=" + Return + "\n";
        } else if (Void != null) {
            return "keyword=" + Void + "\n";
        } else if (Continue != null) {
            return "keyword=" + Continue + "\n";
        } else if (For != null) {
            return "keyword=" + For + "\n";
        } else if (Switch != null) {
            return "keyword=" + Switch + "\n";
        } else if (While != null) {
            return "keyword=" + While + "\n";
        } else if (Function_ != null) {
            return "keyword=" + Function_ + "\n";
        } else if (This != null) {
            return "keyword=" +This + "\n";
        } else if (Default != null) {
            return "keyword=" + Default + "\n";
        } else if (If != null) {
            return "keyword=" + If + "\n";
        } else if (In != null) {
            return "keyword=" + In + "\n";
        } else if (Const != null) {
            return "keyword=" + Const + "\n";
        } else if (Export != null) {
            return "keyword=" + Export + "\n";
        } else if (Import != null) {
            return "keyword=" + Import + "\n";
        } else if (Let != null) {
            return "keyword=" + Let + "\n";
        } else if (Interface != null) {
            return "keyword=" + Interface + "\n";
        } else if (Extends != null) {
            return "keyword=" + Extends + "\n";
        } else if (Clas != null) {
            return "keyword=" + Clas + "\n";
        } else {
            return "keyword=" + NullLiteral + "\n";
        }
    }

}