
package AST;
public class MethodProperty implements PropertyDeclaration{
    // declarationName LeftParen RightParen Colon type eos
    DeclarationName declarationName;
    Type type;

    public MethodProperty(DeclarationName declarationName, Type type) {
        this.declarationName = declarationName;
        this.type = type;
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

    @Override
    public String toString() {
        return "MethodProperty=" +
                '\n'+ declarationName +
                '\n'+ type ;
    }
}
