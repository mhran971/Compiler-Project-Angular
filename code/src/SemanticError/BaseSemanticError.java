
package SemanticError;
import SymbolTable.Symbol.SymbolBase;
import SymbolTable.SymbolTable;

import java.util.List;

public class BaseSemanticError {
   SymbolTable symbolTable;

   public SymbolTable getSymbolTable() {
       return symbolTable;
    }
    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    boolean checkDuplication() {
        List<SymbolBase> symbols = symbolTable.getSymbolBases();
        for (int i = 0; i < symbols.size(); i++) {
            SymbolBase s1 = symbols.get(i);
            for (int j = i + 1; j < symbols.size(); j++) {
                SymbolBase s2 = symbols.get(j);
                if (s1.getName().equals(s2.getName())) {
                    return false;
                }
            }
        }
        return true;
    }
    /*boolean checkDuplication() {
    Set<String> names = new HashSet<>();
    for (SymbolBase symbol : symbolTable.getSymbolBases()) {
        if (!names.add(symbol.getName())) {
            return false;
        }
    }
    return true;
}
*/


   public void check(){
       if (!checkDuplication())
       {
            //System.out.println("Error: the variable is dublication");
           String error = "Error: the variable is duplicated";
           System.out.println(error);
           app.SemanticCheck.Errors.add(error);
        }
    }
}
 /*   boolean checkDublication(){
        for (int i = 0; i < SymbolTable.rows.size(); i++){
            if (SymbolTable.rows.get(i)!=null){
                for (int j = SymbolTable.rows.size()-1; j > i; j--){
                    if (SymbolTable.rows.get(j).getKey().equals(SymbolTable.rows.get(i).getKey())){
                       return false;
                   }
               }
            }
        }
           return true;
   }
*/
