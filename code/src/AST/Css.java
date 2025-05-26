package AST;
public class Css {
    //Display|Flex_Direction|Gap|Padding|Box_Size|Flex|Border|Text_Align|Max_With|Height|Cursor|Transition|Background_Color|Margin
    String Display; String Flex_Direction;
    String Gap;String Padding;
    String Box_Size;String Flex;
    String Border;String Text_Align;
    String Max_With;String Height;
    String Cursor; String Transition;
    String Background_Color;String Margin;

    public String getDisplay() {
        return Display;
    }

    public void setDisplay(String display) {
        Display = display;
    }

    public String getFlex_Direction() {
        return Flex_Direction;
    }

    public void setFlex_Direction(String flex_Direction) {
        Flex_Direction = flex_Direction;
    }

    public String getGap() {
        return Gap;
    }

    public void setGap(String gap) {
        Gap = gap;
    }

    public String getPadding() {
        return Padding;
    }

    public void setPadding(String padding) {
        Padding = padding;
    }

    public String getBox_Size() {
        return Box_Size;
    }

    public void setBox_Size(String box_Size) {
        Box_Size = box_Size;
    }

    public String getFlex() {
        return Flex;
    }

    public void setFlex(String flex) {
        Flex = flex;
    }

    public String getBorder() {
        return Border;
    }

    public void setBorder(String border) {
        Border = border;
    }

    public String getText_Align() {
        return Text_Align;
    }

    public void setText_Align(String text_Align) {
        Text_Align = text_Align;
    }

    public String getMax_With() {
        return Max_With;
    }

    public void setMax_With(String max_With) {
        Max_With = max_With;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getCursor() {
        return Cursor;
    }

    public void setCursor(String cursor) {
        Cursor = cursor;
    }

    public String getTransition() {
        return Transition;
    }

    public void setTransition(String transition) {
        Transition = transition;
    }

    public String getBackground_Color() {
        return Background_Color;
    }

    public void setBackground_Color(String background_Color) {
        Background_Color = background_Color;
    }

    public String getMargin() {
        return Margin;
    }

    public void setMargin(String margin) {
        Margin = margin;
    }

    @Override
    public String toString() {
        if(Display !=null){
            return  Display  ;
        }
        if(Flex_Direction!=null){
            return Flex_Direction  ;
        }
        if( Gap!=null){
            return Gap ;
        }
        if( Padding!=null){
            return Padding  ;
        }
        if(Box_Size !=null){
            return  Box_Size ;
        }
        if(Flex!=null){
            return Flex;
        }
        if(Border!=null){
            return Border ;
        }
        if(Text_Align !=null){
            return Text_Align ;
        }
        if(Max_With !=null){
            return  Max_With ;
        }
        if(Height !=null){
            return Height;
        }
        if(Cursor !=null){
            return Cursor ;
        }
        if(Transition !=null){
            return Transition ;
        }
        if(Background_Color !=null){
            return  Background_Color ;
        }
        return Margin   ;
    }
}