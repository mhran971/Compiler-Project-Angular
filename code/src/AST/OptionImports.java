package AST;
public class OptionImports implements ComponentOption {
    //Imports Colon importsProperties  Comma
    String Imports;
    ImportsProperties importsProperties;

    public String getImports() {
        return Imports;
    }

    public void setImports(String imports) {
        Imports = imports;
    }

    public ImportsProperties getImportsProperties() {
        return importsProperties;
    }

    public void setImportsProperties(ImportsProperties importsProperties) {
        this.importsProperties = importsProperties;
    }

    @Override
    public String toString() {
        return "optionImports=" +
                '\n' +"imports=" + Imports +
                '\n' +"importsProperties=" + importsProperties +'\n'
                ;
    }
}