package app;
import SymbolTable.SymbolTable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class SemanticCheck {

    SymbolTable symbolTable= SymbolTable.getInstance();
    public static Set<String> Errors = new LinkedHashSet<>();

    public void checkErrors() {
        try {
            FileWriter test = new FileWriter("Result\\Semantic.txt");
            if (!Errors.isEmpty()) {
                symbolTable.hasSemanticError = true;
            }
            test.append("Semantic Check : \n");

            for (String error : Errors) {
                test.append(error + "\n");
            }
            test.flush();
            test.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

