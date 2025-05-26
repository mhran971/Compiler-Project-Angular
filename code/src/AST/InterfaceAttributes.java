package AST;

import java.util.ArrayList;
import java.util.List;

public class InterfaceAttributes {
    //LeftBrace propertyDeclaration* RightBrace
    List<PropertyDeclaration> propertyDeclaration=new ArrayList<PropertyDeclaration>();

    public List<PropertyDeclaration> getPropertyDeclaration() {
        return propertyDeclaration;
    }
    public void setPropertyDeclaration(List<PropertyDeclaration> propertyDeclaration) {
        this.propertyDeclaration = propertyDeclaration;
    }

    @Override
    public String toString() {
        return '\n'+"propertyDeclaration=" + propertyDeclaration +'\n'
                ;
    }
}