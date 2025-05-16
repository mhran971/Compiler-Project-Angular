package AST;
public class Program {
    //sourceElements? EOF
    SourceElements sourceElements;

    public SourceElements getSourceElements() {
        return sourceElements;
    }

    public void setSourceElements(SourceElements sourceElements) {
        this.sourceElements = sourceElements;
    }

    @Override
    public String toString() {
            return "program{" +
                    '\n' + "sourceElements=" + sourceElements +'\n' +
                    '}' ;

    }
}


