package AST;
public class PropertyString implements ClassBody{
    //declarationName Colon type Assign stringLiteral eos
    DeclarationName declarationName;
    Type type;
    StringLiteral stringLiteral;

    public PropertyString(DeclarationName declarationName, Type type, StringLiteral stringLiteral) {
        this.declarationName = declarationName;
        this.type = type;
        this.stringLiteral = stringLiteral;
    }

    public DeclarationName getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(DeclarationName declarationName) {
        this.declarationName = declarationName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public StringLiteral getStringLiteral() {
        return stringLiteral;
    }

    public void setStringLiteral(StringLiteral stringLiteral) {
        this.stringLiteral = stringLiteral;
    }

    @Override
    public String toString() {
        return '\n'+"propertyString=" +
                '\n' + declarationName +
                '\n'+ type +
                "stringLiteral=" + stringLiteral
                ;
    }
}