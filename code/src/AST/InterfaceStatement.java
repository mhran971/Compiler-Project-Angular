package AST;

import java.util.ArrayList;
import java.util.List;

public class InterfaceStatement implements Statement {
    //Interface declarationName (keyword declarationName)? interfaceAttributes
    String Interface;
    List<DeclarationName> declarationName=new ArrayList<DeclarationName>();
    Keyword keyword;
    InterfaceAttributes interfaceAttributes;

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String anInterface) {
        Interface = anInterface;
    }

    public List<DeclarationName> getDeclarationName() {
        return declarationName;
    }

    public void setDeclarationName(List<DeclarationName> declarationName) {
        this.declarationName = declarationName;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public InterfaceAttributes getInterfaceAttributes() {
        return interfaceAttributes;
    }

    public void setInterfaceAttributes(InterfaceAttributes interfaceAttributes) {
        this.interfaceAttributes = interfaceAttributes;
    }

  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("interfaceStatement=\n");
      if (!declarationName.isEmpty()) {
          for (int i = 0; i < declarationName.size(); i++) {
              sb.append(declarationName.get(i)).append("\n");
          }
      }
      if (keyword != null) {
          sb.append(keyword).append("\n");
      }
      if (interfaceAttributes != null) {
          sb.append("interfaceAttributes=").append(interfaceAttributes).append("\n");
      }
      return sb.toString();
  }

}