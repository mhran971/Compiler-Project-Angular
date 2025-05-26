package AST;
public class FullClassBody implements ClassBody{
    //propertyList propertyDeclarationCom? methodDeclaration
    PropertyList propertyList;
    PropertyDeclarationCom propertyDeclarationCom;
    MethodDeclaration methodDeclaration;

    public FullClassBody(PropertyList propertyList, PropertyDeclarationCom propertyDeclarationCom, MethodDeclaration methodDeclaration) {
        this.propertyList = propertyList;
        this.propertyDeclarationCom = propertyDeclarationCom;
        this.methodDeclaration = methodDeclaration;
    }

    public PropertyList getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(PropertyList propertyList) {
        this.propertyList = propertyList;
    }

    public PropertyDeclarationCom getPropertyDeclarationCom() {
        return propertyDeclarationCom;
    }

    public void setPropertyDeclarationCom(PropertyDeclarationCom propertyDeclarationCom) {
        this.propertyDeclarationCom = propertyDeclarationCom;
    }

    public MethodDeclaration getMethodDeclaration() {
        return methodDeclaration;
    }

    public void setMethodDeclaration(MethodDeclaration methodDeclaration) {
        this.methodDeclaration = methodDeclaration;
    }

    @Override
    public String toString() {
        return "fullClassBody=" +
                '\n'+"propertyList=" + propertyList +
                '\n'+"propertyDeclarationCom=" + propertyDeclarationCom +
                '\n'+"methodDeclaration=" + methodDeclaration;
    }
}