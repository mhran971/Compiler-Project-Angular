package app;
import SymbolTable.SymbolTable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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


  /*  public void checkErrors() {
        try {
            FileWriter test =  new FileWriter("Result\\Semantic.txt");
            if (!Errors.isEmpty()){
                symbolTable.hasSemanticError=true;
            }
            test.append("Semantic Check : \n");

            for (int i=0;i<Errors.size();i++){
                test.append(Errors.get(i)+"\n");
            }
            test.flush();
            test.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

}

