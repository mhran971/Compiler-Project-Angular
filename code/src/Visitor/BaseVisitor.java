package Visitor;
import AST.*;
import SymbolTable.Scope.BaseScope;
import SymbolTable.Scope.GlobalScope;
import SymbolTable.Scope.LocalScope;
import SymbolTable.Symbol.Symbol;
import SymbolTable.Symbol.SymbolBase;
import SymbolTable.SymbolTable;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import app.SemanticCheck;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class BaseVisitor extends AngularParserBaseVisitor {
    SymbolTable symbolTable;
    SymbolBase symbolBase;
    private final Stack<GlobalScope> globalStack;
    private final Stack<LocalScope> localStack;
    private final Map<String, Integer> functionNameToFirstLine = new HashMap<>();
    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
    public BaseVisitor() {
        this.symbolTable = new SymbolTable();
        this.symbolBase = new SymbolBase();
        this.globalStack = new Stack<>();
        this.localStack = new Stack<>();
    }

    public void isFunctionDuplicate(String functionName, ParserRuleContext ctx) {
        GlobalScope currentScope = globalStack.peek();
        int currentLine = ctx.getStart().getLine();
        if (currentScope.symbols.containsKey(functionName)) {
            if (!functionNameToFirstLine.containsKey(functionName)) {
                functionNameToFirstLine.put(functionName, currentLine);
            } else {
                String errorMsg = "❌"+functionName + " duplicate in this scope in line " + currentLine;
                if (!SemanticCheck.Errors.contains(errorMsg)) {
                    SemanticCheck.Errors.add(errorMsg);
                }
            }
        }
    }

    public void checkStringAssignment(BaseScope currentScope, ParserRuleContext ctx, String variableName, String assignedValue) {
        if (currentScope == null) {
            return;
        }
        SymbolBase symbol = (SymbolBase) currentScope.symbols.get(variableName);
        if (symbol == null) {
            return;
        }

        String type = symbol.getType();
        int currentLine = ctx.getStart().getLine();
        if ("string".equals(type)) {
            if (assignedValue == null) {
                String errorMsg = "❌Type error: variable '" + variableName + "' is string but assigned value is not string at line " + currentLine;
                if (!SemanticCheck.Errors.contains(errorMsg)) {
                    SemanticCheck.Errors.add(errorMsg);
                }
                return;
            }

            if (!(assignedValue.startsWith("'") && assignedValue.endsWith("'")) &&
                    !(assignedValue.startsWith("\"") && assignedValue.endsWith("\""))) {
                String errorMsg = "❌Type error: cannot assign non-string value to string variable '"
                        + variableName + "' at line " + currentLine;
                if (!SemanticCheck.Errors.contains(errorMsg)) {
                    SemanticCheck.Errors.add(errorMsg);
                }
            }
        }
    }

    public void checkBinding(String value, ParserRuleContext ctx, SymbolTable symbolTable) {
        if (value == null) return;

        // إزالة علامات الاقتباس الخارجية إن وجدت
        value = value.trim();
        if ((value.startsWith("\"") && value.endsWith("\"")) ||
                (value.startsWith("'") && value.endsWith("'"))) {
            value = value.substring(1, value.length() - 1).trim();
        }

        // تجاهل العبارات التي لا تحتوي نقطة (object.property)
        if (!value.contains(".")) return;

        // تجاهل العبارات المعقدة مثل: product?.image أو product?.image || 'default'
        // يمكنك دعمها لاحقًا
        if (value.contains("?") || value.contains(":") || value.contains("||")) return;

        // تحليل القيمة: product.image
        String[] parts = value.split("\\.");
        if (parts.length == 2) {
            String objectName = parts[0].trim();
            String propertyName = parts[1].trim();

            if (!symbolTableContainsSymbol(symbolTable, objectName)) {
                int line = ctx.getStart().getLine();
                String error = "❌Object '" + objectName + "' is not defined in any scope at line " + line;
                if (!SemanticCheck.Errors.contains(error)) {
                    SemanticCheck.Errors.add(error);
                }
                return;
            }

            if (!symbolTableContainsProperty(symbolTable, objectName, propertyName)) {
                int line = ctx.getStart().getLine();
                String error = "❌Property '" + propertyName + "' is not defined in object '" + objectName + "' at line " + line;
                if (!SemanticCheck.Errors.contains(error)) {
                    SemanticCheck.Errors.add(error);
                }
            }
        }
    }


    // دوال مساعدة للبحث في SymbolTable
    private boolean symbolTableContainsSymbol(SymbolTable symbolTable, String symbolName) {
        for (GlobalScope scope : symbolTable.getGlobalScopes()) {
            if (scope.symbols.containsKey(symbolName)) {
                return true;
            }
        }
        return false;
    }

    private boolean symbolTableContainsProperty(SymbolTable symbolTable, String objectName, String propertyName) {
        for (GlobalScope scope : symbolTable.getGlobalScopes()) {
            Symbol symbol = scope.symbols.get(objectName);
            if (symbol != null) {
                // هنا منطق تحقق وجود الخاصية، يعتمد على كيف تخزن الخاصيات
                if (scope.symbols.containsKey(propertyName)) {
                    return true;
                }
            }
        }
        return false;
    }







    @Override
  public Program visitProgram(AngularParser.ProgramContext ctx) {
      Program program = new Program();
      GlobalScope globalScope = new GlobalScope(null);
      globalScope.setName("global-program:");
      this.globalStack.push(globalScope);
      this.symbolTable.addGlobalScope(globalScope);
      if (ctx.sourceElements() != null){
          program.setSourceElements((SourceElements) visit(ctx.sourceElements()));
      }
       // checkHtmlBindingsFromSymbolTable(this.symbolTable,ctx);
      return program;
  }

    @Override
    public SourceElements visitSourceElements(AngularParser.SourceElementsContext ctx) {
        SourceElements sourceElements=new SourceElements();
        for(int i=0;i<ctx.statement().size();i++){
            if(ctx.statement(i)!=null){
                sourceElements.getStatement().add((Statement) visit(ctx.statement(i)));
            }
        }
        return sourceElements;
    }

    @Override
    public ImportStatement visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        importStatement.setImportFromBlock((ImportFromBlock) visit(ctx.importFromBlock()));
        return importStatement;
    }

    @Override
    public DefaultImport visitDefaultImport(AngularParser.DefaultImportContext ctx) {
        ImportDefault importDefault=null;
        if(ctx.importDefault()!=null){
            importDefault =(ImportDefault) visit(ctx.importDefault());
        }
        ImportFrom importFrom=(ImportFrom) visit(ctx.importFrom());
        return new DefaultImport(importDefault,importFrom);
    }


    @Override
    public NamespaceImport visitNamespaceImport(AngularParser.NamespaceImportContext ctx) {
        ReservedWord reservedWord= (ReservedWord) visit(ctx.reservedWord());
        ImportFrom importFrom=(ImportFrom) visit(ctx.importFrom());
        return new NamespaceImport(reservedWord, importFrom);
    }

    @Override
    public ImportFrom visitImportFrom(AngularParser.ImportFromContext ctx) {
        ImportFrom importFrom=new ImportFrom();
        importFrom.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        return importFrom;
    }

    @Override
    public ImportDefault visitImportDefault(AngularParser.ImportDefaultContext ctx) {
        ImportDefault importDefault=new ImportDefault();
        importDefault.setImportNamespace((ImportNamespace) visit(ctx.importNamespace()));
        return  importDefault;
    }

    @Override
    public ImportNamespace visitImportNamespace(AngularParser.ImportNamespaceContext ctx) {
        ImportNamespace importNamespace=new ImportNamespace();
        importNamespace.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        for(int i=0;i<ctx.commaReservedWord().size();i++){
            if(ctx.commaReservedWord(i)!=null){
                importNamespace.getCommaReservedWord().add((CommaReservedWord) visit(ctx.commaReservedWord(i)));
            }
        }
        return importNamespace;
    }

    @Override
    public  CommaReservedWord visitCommaReservedWord(AngularParser.CommaReservedWordContext ctx) {
        CommaReservedWord commaReservedWord=new CommaReservedWord();
        commaReservedWord.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        return  commaReservedWord;
    }
    @Override
    public InterfaceStatement visitInterfaceStatement(AngularParser.InterfaceStatementContext ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        GlobalScope globalScope = new GlobalScope(null);
        globalScope.setName("Interface Scope:");
        this.globalStack.push(globalScope);
        this.symbolTable.addGlobalScope(globalScope);
        SymbolBase symbolBase = new SymbolBase();
        DeclarationName declarationName = (DeclarationName) visit(ctx.declarationName(0));
        symbolBase.setName(declarationName.getSTRING());
        symbolBase.setValue("InterfaceAttributes");
        symbolBase.setType("interface");
        globalScope.symbols.put(ctx.Interface().getText(),symbolBase);


    /*    try {
            scope.define(symbolBase);
        } catch (IllegalArgumentException e) {
            System.err.println("Error defining symbol: " + e.getMessage());
        }*/

        InterfaceStatement interfaceStatement = new InterfaceStatement();
        if (ctx.Interface() != null) {
            interfaceStatement.setInterface(ctx.Interface().getText());
        }

        for (int i = 0; i < ctx.declarationName().size(); i++) {
            interfaceStatement.getDeclarationName().add((DeclarationName) visit(ctx.declarationName(i)));
        }

        if (ctx.keyword() != null) {
            interfaceStatement.setKeyword((Keyword) visit(ctx.keyword()));
        }

        interfaceStatement.setInterfaceAttributes((InterfaceAttributes) visit(ctx.interfaceAttributes()));

        return interfaceStatement;
    }

    @Override
    public InterfaceAttributes visitInterfaceAttributes(AngularParser.InterfaceAttributesContext ctx) {

        InterfaceAttributes interfaceAttributes=new InterfaceAttributes();
        for(int i=0;i<ctx.propertyDeclaration().size();i++){
            interfaceAttributes.getPropertyDeclaration().add((PropertyDeclaration) visit(ctx.propertyDeclaration(i)));
        }

        return interfaceAttributes;
    }

    @Override
    public AttributesProperty visitAttributesProperty(AngularParser.AttributesPropertyContext ctx) {
        Type type=(Type) visit(ctx.type());
        DeclarationName declarationName=(DeclarationName) visit(ctx.declarationName());
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
/*        GlobalScope globalScope = new GlobalScope(null);
        this.globalStack.push(globalScope);
        this.symbolTable.addGlobalScope(globalScope);
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(declarationName.getSTRING());
        symbolBase.setType(ctx.type().getText());
        globalScope.symbols.put(ctx.declarationName().getText(),symbolBase);
        globalScope.symbols.put(ctx.type().getText(),symbolBase);*/

        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(declarationName.getSTRING());
        symbolBase.setType(ctx.type().getText());
        scope.symbols.put(symbolBase.getName(), symbolBase);

        return new AttributesProperty(declarationName,type);
    }

    @Override
    public AttributesProperty visitMethodProperty(AngularParser.MethodPropertyContext ctx) {
        Type type=(Type) visit(ctx.type());
        DeclarationName declarationName=(DeclarationName) visit(ctx.declarationName());
        return new AttributesProperty(declarationName,type);
    }

   /* @Override
    public ComponentStatement visitComponentStatement(AngularParser.ComponentStatementContext ctx) {
        ComponentStatement componentStatement=new ComponentStatement();
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        GlobalScope globalScope = new GlobalScope(null);
        globalScope.setName("Component Scope:");
        this.globalStack.push(globalScope);
        this.symbolTable.addGlobalScope(globalScope);
        SymbolBase symbolBase = new SymbolBase();
         symbolBase.setName(ctx.reservedWord().getText());
        symbolBase.setValue("ComponentOptions:");
         symbolBase.setType(ctx.reservedWord().getText());
         globalScope.symbols.put(ctx.reservedWord().getText(),symbolBase);

        componentStatement.setComponent(ctx.reservedWord().getText());
        componentStatement.setComponentOptions((ComponentOptions) visit(ctx.componentOptions()));
        return componentStatement;
    }*/
   @Override
   public ComponentStatement visitComponentStatement(AngularParser.ComponentStatementContext ctx) {
       ComponentStatement componentStatement = new ComponentStatement();
       GlobalScope globalScope = new GlobalScope(null);
       globalScope.setName("Component Scope:");
       this.globalStack.push(globalScope);
       this.symbolTable.addGlobalScope(globalScope);
       SymbolBase symbolBase = new SymbolBase();
       symbolBase.setName(ctx.reservedWord().getText());
       symbolBase.setValue("ComponentOptions:");
       symbolBase.setType(ctx.reservedWord().getText());
       globalScope.symbols.put(ctx.reservedWord().getText(), symbolBase);
       componentStatement.setComponent(ctx.reservedWord().getText());
       componentStatement.setComponentOptions((ComponentOptions) visit(ctx.componentOptions()));

       boolean hasSelector = false;
       for (String key : globalScope.symbols.keySet()) {
           if (key.equals("selector")) {
               hasSelector = true;
               break;
           }
       }
       if (!hasSelector) {
           int line = ctx.getStart().getLine();
           String errorMsg = "❌Component is missing selector at line " + line;
           if (!SemanticCheck.Errors.contains(errorMsg)) {
               SemanticCheck.Errors.add(errorMsg);
              // System.out.println(errorMsg);
           }
       }
       return componentStatement;
   }


    @Override
    public ComponentOptions visitComponentOptions(AngularParser.ComponentOptionsContext ctx) {
        ComponentOptions componentOptions=new ComponentOptions();

        for(int i=0;i<ctx.componentOption().size();i++){
            if(ctx.componentOption(i)!=null){
                componentOptions.getComponentOption().add((ComponentOption) visit(ctx.componentOption(i)));
            }
        }
        return componentOptions;
    }

    @Override
    public OptionSelector visitOptionselector(AngularParser.OptionselectorContext ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        OptionSelector optionselector=new OptionSelector();
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(ctx.Selector().getText());
        symbolBase.setValue(ctx.stringLiteral().getText());
        symbolBase.setType("stringLiteral");
        scope.symbols.put(symbolBase.getName(), symbolBase);
        optionselector.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        if (ctx.Selector()!=null){
            optionselector.setSelector(ctx.Selector().getText());
        }
        return optionselector;
    }


    @Override
    public OptionImports visitOptionimports(AngularParser.OptionimportsContext ctx) {
        OptionImports optionimports=new OptionImports();
        optionimports.setImportsProperties((ImportsProperties) visit(ctx.importsProperties()));
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(ctx.Imports().getText());
        symbolBase.setValue(ctx.importsProperties().getText());
        symbolBase.setType("ReservedWord:");
        scope.symbols.put(symbolBase.getName(), symbolBase);
        if (ctx.Imports()!=null){
            optionimports.setImports(ctx.Imports().getText());
        }
        return optionimports;
    }

    @Override
    public ImportsProperties visitImportsProperties(AngularParser.ImportsPropertiesContext ctx) {
        ImportsProperties importsProperties=new ImportsProperties();
        importsProperties.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        for(int i=0;i<ctx.reservedWordAndComma().size();i++){
            if(ctx.reservedWordAndComma(i)!=null){
                importsProperties.getReservedWordAndComma().add((ReservedWordAndComma) visit(ctx.reservedWordAndComma(i)));
            }
        }
        return importsProperties;
    }

    @Override
    public ReservedWordAndComma visitReservedWordAndComma(AngularParser.ReservedWordAndCommaContext ctx) {
        ReservedWordAndComma reservedWordAndComma=new ReservedWordAndComma();
        reservedWordAndComma.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        SymbolBase symbolBase = new SymbolBase();

        return reservedWordAndComma;
    }
    @Override
    public OptionTemplateUrl visitOptiontemplateUrl(AngularParser.OptiontemplateUrlContext ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        OptionTemplateUrl optiontemplateUrl=new OptionTemplateUrl();
        optiontemplateUrl.setUrlStatement((UrlStatement) visit(ctx.urlStatement()));
        optiontemplateUrl.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(ctx.urlStatement().getText());
        symbolBase.setValue(ctx.stringLiteral().getText());
        symbolBase.setType("stringLiteral");
        scope.symbols.put(symbolBase.getName(), symbolBase);
        return optiontemplateUrl;
    }

    @Override
    public UrlStatement visitUrlStatement(AngularParser.UrlStatementContext ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        UrlStatement urlStatement=new UrlStatement();
        SymbolBase symbolBase = new SymbolBase();


        if (ctx.TemplateUrl()!=null){
            urlStatement.setTemplateUrl(ctx.TemplateUrl().getText());
            symbolBase.setName(ctx.TemplateUrl().getText());
            symbolBase.setValue(ctx.TemplateUrl().getText());
            symbolBase.setType("stringLiteral");
        }
        if (ctx.StyleUrl()!=null){
            urlStatement.setStyleUrl(ctx.StyleUrl().getText());
            symbolBase.setName(ctx.StyleUrl().getText());
            symbolBase.setValue(ctx.StyleUrl().getText());
            symbolBase.setType("stringLiteral");
        }
        scope.symbols.put(symbolBase.getName(), symbolBase);


        return urlStatement;
    }

    @Override
    public  OptionStyleUrls visitOptionstyleUrls(AngularParser.OptionstyleUrlsContext ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        OptionStyleUrls optionStyleUrls=new OptionStyleUrls();
        optionStyleUrls.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        SymbolBase symbolBase = new SymbolBase();
        if (ctx.StyleUrls()!=null)
        {
         optionStyleUrls.setStyleUrls(ctx.StyleUrls().getText());
            symbolBase.setName(ctx.StyleUrls().getText());
            symbolBase.setValue(ctx.StyleUrls().getText());
            symbolBase.setType("stringLiteral");
        }
        scope.symbols.put(symbolBase.getName(), symbolBase);

        return optionStyleUrls;
    }



    @Override
    public ExportStatement visitExportStatement(AngularParser.ExportStatementContext ctx) {
        ExportStatement exportStatement=new ExportStatement();
        exportStatement.setKeyword((Keyword) visit(ctx.keyword()));
        exportStatement.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        GlobalScope globalScope = new GlobalScope(null);
        globalScope.setName("Export Scope:");
        this.globalStack.push(globalScope);
        this.symbolTable.addGlobalScope(globalScope);
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(exportStatement.getDeclarationName().getSTRING());
        symbolBase.setValue("ClassBody:");
        symbolBase.setType(exportStatement.getKeyword().getClas());
        globalScope.symbols.put(ctx.keyword().getText(),symbolBase);
        for(int i=0;i<ctx.classBody().size();i++){
            if(ctx.classBody(i)!=null){
                exportStatement.getClassBody().add((ClassBody) visit(ctx.classBody(i)));

            }
        }
        return exportStatement;
    }

    @Override
    public FullClassBody visitFullClassBody(AngularParser.FullClassBodyContext ctx) {
        PropertyList propertyList=(PropertyList) visit(ctx.propertyList());
        PropertyDeclarationCom propertyDeclarationCom=null;
        if(ctx.propertyDeclarationCom()!=null){
            propertyDeclarationCom=(PropertyDeclarationCom) visit(ctx.propertyDeclarationCom());
        }
        MethodDeclaration methodDeclaration=(MethodDeclaration) visit(ctx.methodDeclaration());

        return new FullClassBody(propertyList,propertyDeclarationCom,methodDeclaration);
    }

    @Override
    public PropertyString visitPropertyString(AngularParser.PropertyStringContext ctx) {
        DeclarationName declarationName=(DeclarationName) visit(ctx.declarationName());
        Type type=(Type) visit(ctx.type());
         StringLiteral stringLiteral=(StringLiteral) visit(ctx.stringLiteral());
        return new  PropertyString(declarationName,type,stringLiteral);
    }

    @Override
    public PropertyList visitPropertyList(AngularParser.PropertyListContext ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        PropertyList propertyList=new PropertyList();
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(ctx.declarationName().getText());
        symbolBase.setValue("Products:");
        symbolBase.setType(ctx.STRING().getText());

        if (ctx.STRING()!=null){
            propertyList.setSTRING(ctx.STRING().getText());
        }
        propertyList.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        for(int i=0;i<ctx.bodyList().size();i++){
            if(ctx.bodyList(i)!=null){
                propertyList.getBodyList().add((BodyList) visit(ctx.bodyList(i)));
            }
        }
        scope.symbols.put(symbolBase.getName(), symbolBase);
        return propertyList;
    }


    @Override
    public BodyList visitBodyList(AngularParser.BodyListContext ctx) {
        BodyList bodyList = new BodyList();
        GlobalScope productScope = new GlobalScope(null);
        productScope.setName("Product:");
        this.globalStack.push(productScope);
        this.symbolTable.addGlobalScope(productScope);
        for (AngularParser.BodyListinnerContext innerCtx : ctx.bodyListinner()) {
            BodyListInner bodyListInner = (BodyListInner) visit(innerCtx);
            bodyList.getBodyListInner().add(bodyListInner);
        }
        this.globalStack.pop();
        return bodyList;
    }



   @Override
    public BodyListInner visitBodyListinner(AngularParser.BodyListinnerContext ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        BodyListInner bodyListinner = new BodyListInner();
        DeclarationName declName = (DeclarationName) visit(ctx.declarationName());
        StringLiteral strLiteral = (StringLiteral) visit(ctx.stringLiteral());
        bodyListinner.setDeclarationName(declName);
        bodyListinner.setStringLiteral(strLiteral);
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(declName.getSTRING());
        symbolBase.setValue(strLiteral.getStringLiteral());
        symbolBase.setType("string");
        scope.symbols.put(symbolBase.getName(), symbolBase);
       checkStringAssignment(scope, ctx, symbolBase.getName(), symbolBase.getValue());

       return bodyListinner;
    }



    @Override
    public PropertyDeclarationCom visitPropertyDeclarationCom(AngularParser.PropertyDeclarationComContext ctx) {
        PropertyDeclarationCom propertyDeclarationCom=new PropertyDeclarationCom();
        for(int i=0;i<ctx.declarationName().size();i++){
        propertyDeclarationCom.getDeclarationName().add((DeclarationName) visit(ctx.declarationName(i)));
        }
        propertyDeclarationCom.setIdentifier((Identifier) visit(ctx.identifier()));
        for(int i=0;i<ctx.keyword().size();i++){
            propertyDeclarationCom.getKeyword().add((Keyword) visit(ctx.keyword(i)));
        }
        return propertyDeclarationCom;
    }
    @Override
    public MethodDeclaration visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        MethodDeclaration  methodDeclaration=new MethodDeclaration();

        GlobalScope globalScope = new GlobalScope(null);
        globalScope.setName("Method Scope:");
        this.globalStack.push(globalScope);
        this.symbolTable.addGlobalScope(globalScope);
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(ctx.declarationName().getText());
        if(ctx.parameterList()!=null){
            symbolBase.setValue(ctx.parameterList().getText());
        }
        symbolBase.setType("Function");
        globalScope.symbols.put(symbolBase.getName(),symbolBase);
        methodDeclaration.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        if(ctx.parameterList()!=null){
            methodDeclaration.setParameterList((ParameterList) visit(ctx.parameterList()));
        }
        methodDeclaration.setMethodBody((MethodBody) visit(ctx.methodBody()));
        if (ctx.declarationName() != null) {
            isFunctionDuplicate(methodDeclaration.getDeclarationName().getSTRING(), ctx);
        }

        return methodDeclaration;
    }

    @Override
    public ParameterList visitParameterList(AngularParser.ParameterListContext ctx) {
        ParameterList parameterList=new ParameterList();
        parameterList.setParameter((Parameter) visit(ctx.parameter()));
        for(int i=0;i<ctx.parameterComma().size();i++){
            if(ctx.parameterComma(i)!=null) {
                parameterList.getParameterComma().add((ParameterComma) visit(ctx.parameterComma(i)));
            }
        }
        return parameterList;
    }

    @Override
    public ParameterComma visitParameterComma(AngularParser.ParameterCommaContext ctx) {
        ParameterComma parameterComma=new ParameterComma();
        parameterComma.setParameter((Parameter) visit(ctx.parameter()));
        return parameterComma;
    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Parameter parameter=new Parameter();
        parameter.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        parameter.setDeclarationString((DeclarationString) visit(ctx.declarationString()));
        return parameter;
    }

    @Override
    public  MethodBody visitMethodBody(AngularParser.MethodBodyContext ctx) {
        MethodBody methodBody=new MethodBody();
        for(int i=0;i<ctx.statementMethod().size();i++){
            if(ctx.statementMethod(i)!=null){
                methodBody.getStatementMethod().add((StatementMethod) visit(ctx.statementMethod(i)));
            }
        }
        return methodBody;
    }

    @Override
    public StatementMethod visitStatementMethod(AngularParser.StatementMethodContext ctx) {
        StatementMethod statementMethod=new StatementMethod();
        statementMethod.setKeyword((Keyword) visit(ctx.keyword()));
        statementMethod.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        statementMethod.setDeclarationString((DeclarationString) visit(ctx.declarationString()));
        return statementMethod ;
    }

    @Override
    public DeclarationName visitDeclarationName(AngularParser.DeclarationNameContext ctx) {
        DeclarationName declarationName=new DeclarationName();
        declarationName.setSTRING(ctx.STRING().getText());
        return declarationName;
    }
////////////////HTML//////////////
    @Override
    public HtmlElements visitHtmlElements(AngularParser.HtmlElementsContext ctx) {
        HtmlElements htmlElements=new HtmlElements();
        htmlElements.setHtmlElement((HtmlElement) visit(ctx.htmlElement()));
        return htmlElements ;
    }

    @Override
    public HtmlElement visitHtmlElement(AngularParser.HtmlElementContext ctx) {
        HtmlElement htmlElement=new HtmlElement();
        for(int i=0;i<ctx.htmlTagNameStart().size();i++){
        htmlElement.getHtmlTagNameStart().add((HtmlTagNameStart) visit(ctx.htmlTagNameStart(i)));
        }
        for(int i=0;i<ctx.htmlElementContent().size();i++){
            if(ctx.htmlElementContent(i)!=null){
               htmlElement.getHtmlElementContent().add((HtmlElementContent) visit(ctx.htmlElementContent(i)));
            }
        }
        for(int i=0;i<ctx.htmlTagNameEnd().size();i++){
            htmlElement.getHtmlTagNameEnd().add((HtmlTagNameEnd) visit(ctx.htmlTagNameEnd(i)));
        }
        return htmlElement;
    }

    @Override
    public HtmlTagNameStart visitHtmlTagNameStart(AngularParser.HtmlTagNameStartContext ctx) {
        HtmlTagNameStart htmlTagNameStart=new HtmlTagNameStart();
        GlobalScope globalScope = new GlobalScope(null);
        globalScope.setName("HTML div:");
        this.globalStack.push(globalScope);
        this.symbolTable.addGlobalScope(globalScope);
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName("div");
        symbolBase.setValue(ctx.stringLiteral().getText());
        symbolBase.setType(ctx.keyword().getText());
        globalScope.symbols.put(symbolBase.getName(),symbolBase);
        htmlTagNameStart.setTagName((TagName) visit(ctx.tagName()));
        if(ctx.keyword()!=null){
            htmlTagNameStart.setKeyword((Keyword) visit(ctx.keyword()));
        }
        if(ctx.stringLiteral()!=null){
            htmlTagNameStart.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        }
        return htmlTagNameStart;
    }

    @Override
    public HtmlTagNameEnd visitHtmlTagNameEnd(AngularParser.HtmlTagNameEndContext ctx) {
        HtmlTagNameEnd htmlTagNameEnd=new HtmlTagNameEnd();
        htmlTagNameEnd.setTagName((TagName) visit(ctx.tagName()));
        return htmlTagNameEnd;
    }

    @Override
    public NestedHtml visitNestedHtml(AngularParser.NestedHtmlContext ctx) {

         Elements elements=(Elements) visit(ctx.elements());
        List<TagName> tagNames = new ArrayList<TagName>();
        for (int i = 0; i < ctx.tagName().size(); i++) {
            if (ctx.tagName(i) != null) {
                TagName tagName = (TagName) visit(ctx.tagName(i));
                tagNames.add(tagName);
            }
        }
        return new NestedHtml(tagNames,elements) ;
    }

    @Override
    public HtmlContentMany visitHtmlContentMany(AngularParser.HtmlContentManyContext ctx) {
        TagName tagName = (TagName) visit(ctx.tagName());
        List<ContentHtml> contentHtmls = new ArrayList<ContentHtml>();
        for (int i = 0; i < ctx.contentHtml().size(); i++) {
            if (ctx.contentHtml(i) != null) {
                ContentHtml contentHtml = (ContentHtml) visit(ctx.contentHtml(i));
                contentHtmls.add(contentHtml);
            }
        }
        return new HtmlContentMany(tagName, contentHtmls);
    }

    @Override
    public HtmlContentBrace visitHtmlContentBrace(AngularParser.HtmlContentBraceContext ctx) {
        //BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        TagName tagName=(TagName) visit(ctx.tagName());
        ContentHtml contentHtml=(ContentHtml) visit(ctx.contentHtml());
        GlobalScope globalScope = new GlobalScope(null);
        globalScope.setName("div Img:");
        this.globalStack.push(globalScope);
        this.symbolTable.addGlobalScope(globalScope);
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName("Img");
        symbolBase.setType("div");
        //symbolBase.setValue(ctx.contentHtml().getText()+" "+ctx.htmlBrace().getText());
        globalScope.symbols.put(symbolBase.getName(),symbolBase);
        HtmlBrace htmlBrace=(HtmlBrace) visit(ctx.htmlBrace());
        checkStringAssignment(globalStack.peek(), ctx, symbolBase.getName(), symbolBase.getValue());
        return new HtmlContentBrace(tagName,contentHtml,htmlBrace);
    }

    @Override
    public HtmlImgAttribute visitHtmlImgAttribute(AngularParser.HtmlImgAttributeContext ctx) {
        HtmlImgAttribute htmlImgAttribute=new HtmlImgAttribute();
        htmlImgAttribute.setHtmlKeyword((HtmlKeyword) visit(ctx.htmlKeyword()));
        htmlImgAttribute.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        return htmlImgAttribute;
    }

    @Override
    public HtmlImgAttribute2 visitHtmlImgAttribute2(AngularParser.HtmlImgAttribute2Context ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        HtmlKeyword htmlKeyword=(HtmlKeyword) visit(ctx.htmlKeyword());
        StringLiteral stringLiteral=(StringLiteral) visit(ctx.stringLiteral());
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(ctx.htmlKeyword().getText());
        symbolBase.setValue(ctx.stringLiteral().getText());
        //symbolBase.setType(ctx.STRING().getText());
        scope.symbols.put(symbolBase.getName(), symbolBase);
        return new HtmlImgAttribute2(htmlKeyword,stringLiteral);
    }

    @Override
    public  HtmlImgAttribute3 visitHtmlImgAttribute3(AngularParser.HtmlImgAttribute3Context ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        HtmlKeyword htmlKeyword=(HtmlKeyword) visit(ctx.htmlKeyword());
        StringLiteral stringLiteral=(StringLiteral) visit(ctx.stringLiteral());
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(ctx.htmlKeyword().getText());
        symbolBase.setValue(ctx.stringLiteral().getText());
        //symbolBase.setType(ctx.STRING().getText());
        scope.symbols.put(symbolBase.getName(), symbolBase);

        return new HtmlImgAttribute3(htmlKeyword,stringLiteral);
    }

    @Override
    public  HtmlImgAttribute4 visitHtmlImgAttribute4(AngularParser.HtmlImgAttribute4Context ctx) {
        BaseScope scope = !localStack.isEmpty() ? localStack.peek() : globalStack.peek();
        Keyword keyword=(Keyword) visit(ctx.keyword());
        StringLiteral stringLiteral=(StringLiteral) visit(ctx.stringLiteral());
        SymbolBase symbolBase = new SymbolBase();
        symbolBase.setName(ctx.keyword().getText());
        symbolBase.setValue(ctx.stringLiteral().getText());
        //symbolBase.setType(ctx.keyword().getText());
        scope.symbols.put(symbolBase.getName(), symbolBase);
        return new HtmlImgAttribute4(keyword,stringLiteral);
    }

    @Override
    public ComplexHtmlAttr visitComplexHtmlAttr(AngularParser.ComplexHtmlAttrContext ctx) {
        //keyword Assign stringLiteral Star htmlKeyword Assign stringLiteral
        Keyword keyword=(Keyword) visit(ctx.keyword());
        HtmlKeyword htmlKeyword=(HtmlKeyword) visit(ctx.htmlKeyword());
        List<StringLiteral>stringLiterals=new ArrayList<StringLiteral>();
        for (int i = 0; i < ctx.stringLiteral().size(); i++) {
            if (ctx.stringLiteral(i) != null) {
                StringLiteral stringLiteral = (StringLiteral) visit(ctx.stringLiteral(i));
                stringLiterals.add(stringLiteral);
            }
        }
        return new ComplexHtmlAttr(keyword,stringLiterals,htmlKeyword);
    }

    @Override
    public ReservedBlock visitReservedBlock(AngularParser.ReservedBlockContext ctx) {

        ReservedWord reservedWord=(ReservedWord) visit(ctx.reservedWord());
        StringLiteral stringLiteral=(StringLiteral) visit(ctx.stringLiteral());


        List<Identifier> identifiers = new ArrayList<Identifier>();
        for (int i = 0; i < ctx.identifier().size(); i++) {
            Identifier identifier = (Identifier) visit(ctx.identifier(i));
            identifiers.add(identifier);
        }
        return new ReservedBlock(reservedWord,stringLiteral,identifiers);
    }

    @Override
    public  HtmlBrace visitHtmlBrace(AngularParser.HtmlBraceContext ctx) {
        HtmlBrace htmlBrace=new HtmlBrace();
        htmlBrace.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        htmlBrace.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        return htmlBrace;
    }

    @Override
    public HtmlAttributes visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx) {
        HtmlAttributes htmlAttributes=new HtmlAttributes();
        for(int i=0;i<ctx.STRING().size();i++){
            htmlAttributes.getSTRING().add((String) visit(ctx.STRING(i)));
        }
        for(int i=0;i<ctx.tagName().size();i++){
            htmlAttributes.getTagName().add((TagName) visit(ctx.tagName(i)));
        }
        String value = ctx.getText(); // أو طريقة جلب قيمة binding داخل الـ attribute
        checkBinding(value, ctx, symbolTable);
        return htmlAttributes;
    }

    @Override
    public CssElement visitCssElement(AngularParser.CssElementContext ctx) {
        CssElement cssElement=new CssElement();
         if (ctx.tagName()!=null){
             cssElement.setTagName((TagName) visit(ctx.tagName()));
         }
        for(int i=0;i<ctx.selector().size();i++){
            if (ctx.selector(i)!=null){
                cssElement.getSelector().add((Selector) visit(ctx.selector(i)));
            }
        }
        for(int i=0;i<ctx.cssProperty().size();i++){
            if (ctx.cssProperty(i)!=null){
                cssElement.getCssProperty().add((CssProperty) visit(ctx.cssProperty(i)));
            }
        }
        return cssElement;
    }

    @Override
    public Selector visitSelector(AngularParser.SelectorContext ctx) {
        Selector selector=new Selector();
        if(ctx.STRING()!=null){
            selector.setSTRING(ctx.STRING().getText());
        }
        for(int i=0;i<ctx.selectorInternal().size();i++){
            if (ctx.selectorInternal()!=null){
                selector.getSelectorInternal().add((SelectorInternal) visit(ctx.selectorInternal(i)));
            }
        }
        return selector;
    }

    @Override
    public SelectorInternal visitSelectorInternal(AngularParser.SelectorInternalContext ctx) {
        SelectorInternal selectorInternal=new SelectorInternal();
        if (ctx.STRING()!=null){
            selectorInternal.setSTRING(ctx.STRING().getText());
        }
        return  selectorInternal;
    }

    @Override
    public  CssProperty visitCssProperty(AngularParser.CssPropertyContext ctx) {
        CssProperty cssProperty=new CssProperty();
        cssProperty.setCss((Css) visit(ctx.css()));
        cssProperty.setCssValue((CssValue) visit(ctx.cssValue()));
        return cssProperty;
    }

    @Override
    public Css visitCss(AngularParser.CssContext ctx) {
        Css css=new Css();
        if(ctx.Display()!=null){
            css.setDisplay(ctx.Display().getText());
        }
        else if(ctx.Flex_Direction()!=null){
            css.setFlex_Direction(ctx.Flex_Direction().getText());
        }
        else if(ctx.Gap()!=null){
            css.setGap(ctx.Gap().getText());
        }
        else if(ctx.Padding()!=null){
            css.setPadding(ctx.Padding().getText());
        }
        else if(ctx.Box_Size()!=null){
            css.setBox_Size(ctx.Box_Size().getText());
        }
        else if(ctx.Flex()!=null){
            css.setFlex(ctx.Flex().getText());
        }
        else if(ctx.Border()!=null){
            css.setBorder(ctx.Border().getText());
        }
        else if(ctx.Text_Align()!=null){
            css.setText_Align(ctx.Text_Align().getText());
        }
        else if(ctx.Max_With()!=null){
            css.setMax_With(ctx.Max_With().getText());
        }
        else if(ctx.Height()!=null){
            css.setHeight(ctx.Height().getText());
        }
        else  if(ctx.Cursor()!=null){
            css.setCursor(ctx.Cursor().getText());
        }
        else if(ctx.Transition()!=null){
            css.setTransition(ctx.Transition().getText());
        }
        else if(ctx.Background_Color()!=null){
            css.setBackground_Color(ctx.Background_Color().getText());
        }
        else if(ctx.Margin()!=null){
            css.setMargin(ctx.Margin().getText());
        }
        return css;
    }

    @Override
    public CssValue visitCssValue(AngularParser.CssValueContext ctx) {
        CssValue cssValue=new CssValue();
      /*  cssValue.setDecimalLiteral_UNIT((DecimalLiteral_UNIT) visit(ctx.decimalLiteral_UNIT()));
        cssValue.setRow(ctx.Row().getText());
        cssValue.setFlex(ctx.Flex().getText());
        cssValue.setBorder_Box(ctx.Border_Box().getText());
        cssValue.setCenter(ctx.Center().getText());
        cssValue.setColumn(ctx.Column().getText());
        cssValue.setAuto(ctx.Auto().getText());
        cssValue.setPointer(ctx.Pointer().getText());
        cssValue.setHEXCHAR(ctx.HEXCHAR().getText());
        cssValue.setSTRING(ctx.STRING().getText());*/
       if(ctx.decimalLiteral_UNIT()!=null){
            cssValue.setDecimalLiteral_UNIT((DecimalLiteral_UNIT) visit(ctx.decimalLiteral_UNIT()));
        }
        if(ctx.Flex()!=null){
            cssValue.setFlex(ctx.Flex().getText());
        }
        if(ctx.Row()!=null){
            cssValue.setRow(ctx.Row().getText());
        }

        if(ctx.Border_Box()!=null){
            cssValue.setBorder_Box(ctx.Border_Box().getText());
        }
        if(ctx.Center()!=null){
            cssValue.setCenter(ctx.Center().getText());
        }
        if(ctx.Column()!=null){
            cssValue.setColumn(ctx.Column().getText());
        }
        if(ctx.Auto()!=null){
            cssValue.setAuto(ctx.Auto().getText());

        }
        if(ctx.Pointer()!=null){
            cssValue.setPointer(ctx.Pointer().getText());
        }
        if(ctx.HEXCHAR()!=null){
            cssValue.setHEXCHAR(ctx.HEXCHAR().getText());
        }

        return  cssValue;
    }

    @Override
    public UnitNumberList visitUnitNumberList(AngularParser.UnitNumberListContext ctx) {
        //decimalLiteralUnit decimalLiteral*
        DecimalLiteralUnit decimalLiteralUnit=(DecimalLiteralUnit) visit(ctx.decimalLiteralUnit());
        List<DecimalLiteral> decimalLiterals = new ArrayList<DecimalLiteral>();
        for (int i = 0; i < ctx.decimalLiteral().size(); i++) {
            DecimalLiteral decimalLiteral = (DecimalLiteral) visit(ctx.decimalLiteral(i));
            decimalLiterals.add(decimalLiteral);
        }
        return new UnitNumberList(decimalLiteralUnit,decimalLiterals);
    }
    @Override
    public BackgroundColorUnit visitBackgroundColorUnit(AngularParser.BackgroundColorUnitContext ctx) {
        DecimalLiteralUnit decimalLiteralUnit=(DecimalLiteralUnit)visit(ctx.decimalLiteralUnit());
        Css css=(Css) visit(ctx.css());
        return new BackgroundColorUnit(decimalLiteralUnit,css);
    }
    @Override
    public  DecimalLiteralUnit visitDecimalLiteralUnit(AngularParser.DecimalLiteralUnitContext ctx) {
        DecimalLiteralUnit decimalLiteralUnit=new DecimalLiteralUnit();
        decimalLiteralUnit.setDecimalLiteral_UNIT(ctx.DecimalLiteral_UNIT().getText());
        return  decimalLiteralUnit;
    }

    @Override
    public DecimalLiteral visitDecimalLiteral(AngularParser.DecimalLiteralContext ctx) {
        DecimalLiteral decimalLiteral=new DecimalLiteral();
        if(ctx.DecimalLiteral()!=null){
            decimalLiteral.setDecimalLiteral(ctx.DecimalLiteral().getText());
        }
        return decimalLiteral;
    }
    @Override
    public TagName visitTagName(AngularParser.TagNameContext ctx) {
        TagName tagName = new TagName();

        if (ctx.H1() != null) {
            tagName.setH1(ctx.H1().getText());
        }
        if (ctx.H2() != null) {
            tagName.setH2(ctx.H2().getText());
        }
        if (ctx.H3() != null) {
            tagName.setH3(ctx.H3().getText());
        }
        if (ctx.H4() != null) {
            tagName.setH4(ctx.H4().getText());
        }
        if (ctx.IMG_() != null) {
            tagName.setIMG_(ctx.IMG_().getText());
        }
        if (ctx.P() != null) {
            tagName.setP(ctx.P().getText());
        }
        if (ctx.QuestionDot() != null) {
            tagName.setQuestionDot(ctx.QuestionDot().getText());
        }
        if (ctx.RBRACE_RBRACE() != null) {
            tagName.setRBRACE_RBRACE(ctx.RBRACE_RBRACE().getText());
        }
        if (ctx.LBRACE_LBRACE() != null) {
            tagName.setLBRACE_LBRACE(ctx.LBRACE_LBRACE().getText());
        }
        if (ctx.Div_() != null) {
            tagName.setDiv_(ctx.Div_().getText());
        }
        if (ctx.Dot() != null) {
            tagName.setDot(ctx.Dot().getText());
        }
        if (ctx.Button() != null) {
            tagName.setButton(ctx.Button().getText());
        }

        return tagName;
    }


    @Override
    public HtmlKeyword visitHtmlKeyword(AngularParser.HtmlKeywordContext ctx) {
        HtmlKeyword htmlKeyword=new HtmlKeyword();
        if (ctx.NGFOR()!=null){
            htmlKeyword.setNGFOR(ctx.NGFOR().getText());
        }
        if (ctx.ALT()!=null){
            htmlKeyword.setALT(ctx.ALT().getText());
        }
        if (ctx.NGIF()!=null){
            htmlKeyword.setNGIF(ctx.NGIF().getText());
        }
        if (ctx.SRC()!=null){
            htmlKeyword.setSRC(ctx.SRC().getText());

        }




        return htmlKeyword;
    }
    @Override
    public Identifier visitIdentifier(AngularParser.IdentifierContext ctx) {
        Identifier identifier=new Identifier();
        if (ctx.Identifier() != null) {
            identifier.setIdentifier(ctx.Identifier().getText());
        } else if (ctx.Or() != null) {
            identifier.setOr(ctx.Or().getText());
        } else if (ctx.Less() != null) {
            identifier.setIdentifier(ctx.Less().getText());
        } else if (ctx.Greater() != null) {
            identifier.setIdentifier(ctx.Greater().getText());
        }
        return identifier;
    }
    @Override
    public Type visitType(AngularParser.TypeContext ctx) {
        Type type=new Type();
        if (ctx.String()!=null){
            type.setString(ctx.String().getText());
        }
        if (ctx.Int()!=null){
            type.setInt(ctx.Int().getText());
        } if (ctx.Float()!=null){
            type.setFloat(ctx.Float().getText());
        }
        if (ctx.Double()!=null){
            type.setDouble(ctx.Double().getText());
        }
        if (ctx.Bool()!=null){
            type.setBool(ctx.Bool().getText());
        }
        if (ctx.Var()!=null){
            type.setVar(ctx.Var().getText());
        }
        if (ctx.Array()!=null){
            type.setArray(ctx.Array().getText());
        }
        if (ctx.Number()!=null){
            type.setNumber(ctx.Number().getText());
        }
        return type;
    }

    @Override
    public ReservedWord visitReservedWord(AngularParser.ReservedWordContext ctx) {

        //DeclarationName declarationName = (DeclarationName) visit(ctx.declarationName(0));
       // symbolBase.setName(declarationName.getSTRING());

       // globalScope.symbols.put(ctx.Interface().getText(),symbolBase);
        ReservedWord reservedWord=new ReservedWord();

        if (ctx.Angular()!=null){
            reservedWord.setAngular(ctx.Angular().getText());
            /*symbolBase.setName(ctx.Angular().getText());
            globalScope.symbols.put(ctx.Angular().getText(),symbolBase);*/
        }
        if (ctx.AngularCore()!=null){
            reservedWord.setAngularCore(ctx.AngularCore().getText());
           /* symbolBase.setName(ctx.AngularCore().getText());
            globalScope.symbols.put(ctx.AngularCore().getText(),symbolBase);*/
        }
        if (ctx.Component()!=null){
            reservedWord.setComponent(ctx.Component().getText());
          /*  symbolBase.setName(ctx.Component().getText());
            globalScope.symbols.put(ctx.Component().getText(),symbolBase);*/
        }
        if (ctx.RouterOutlet()!=null){
            reservedWord.setRouterOutlet(ctx.RouterOutlet().getText());
         /*   symbolBase.setName(ctx.RouterOutlet().getText());
            globalScope.symbols.put(ctx.RouterOutlet().getText(),symbolBase);*/
        }
        if (ctx.CommonModule()!=null){
            reservedWord.setCommonModule(ctx.CommonModule().getText());
   /*            GlobalScope globalScope = new GlobalScope(null);
            globalScope.setName("Import Scope:");
            this.globalStack.push(globalScope);
            this.symbolTable.addGlobalScope(globalScope);
            SymbolBase symbolBase = new SymbolBase();
            symbolBase.setValue("ReservedWord:");
            symbolBase.setType("String");
            symbolBase.setName(ctx.CommonModule().getText());
            globalScope.symbols.put(ctx.CommonModule().getText(),symbolBase);*/
        }
        if (ctx.Input()!=null){
            reservedWord.setInput(ctx.Input().getText());
            /*symbolBase.setName(ctx.Input().getText());
            globalScope.symbols.put(ctx.Input().getText(),symbolBase);*/
        }
        if (ctx.OnInit()!=null){
            reservedWord.setOnInit(ctx.OnInit().getText());
         /*   symbolBase.setName(ctx.OnInit().getText());
            globalScope.symbols.put(ctx.OnInit().getText(),symbolBase);*/
        }
        if (ctx.Click()!=null){
            reservedWord.setClick(ctx.Click().getText());
            /*symbolBase.setName(ctx.Click().getText());
            globalScope.symbols.put(ctx.Click().getText(),symbolBase);*/
        }
        return reservedWord;
    }

    @Override
    public StringLiteral visitStringLiteral(AngularParser.StringLiteralContext ctx) {
        StringLiteral stringLiteral=new StringLiteral();
        if(ctx.StringLiteral()!=null){
            stringLiteral.setStringLiteral(ctx.StringLiteral().getText());
        }

        return stringLiteral;
    }
    @Override
    public Keyword visitKeyword(AngularParser.KeywordContext ctx) {
        Keyword keyword = new Keyword();
        if (ctx.Break() != null) {
            keyword.setBreak(ctx.Break().getText());
        }
        if (ctx.Do() != null) {
            keyword.setDo(ctx.Do().getText());
        }
        if (ctx.New() != null) {
            keyword.setNew(ctx.New().getText());
        }
        if (ctx.Else() != null) {
            keyword.setElse(ctx.Else().getText());
        }
        if (ctx.Case() != null) {
            keyword.setCase(ctx.Case().getText());
        }
        if (ctx.Return() != null) {
            keyword.setReturn(ctx.Return().getText());
        }
        if (ctx.Void() != null) {
            keyword.setVoid(ctx.Void().getText());
        }
        if (ctx.Default() != null) {
            keyword.setDefault(ctx.Default().getText());
        }
        if (ctx.Continue() != null) {
            keyword.setContinue(ctx.Continue().getText());
        }
        if (ctx.While() != null) {
            keyword.setWhile(ctx.While().getText());
        }
        if (ctx.Export() != null) {
            keyword.setExport(ctx.Export().getText());
        }
        if (ctx.Import() != null) {
            keyword.setImport(ctx.Import().getText());
        }
        if (ctx.In() != null) {
            keyword.setIn(ctx.In().getText());
        }
        if (ctx.Let() != null) {
            keyword.setLet(ctx.Let().getText());
        }
        if (ctx.Switch() != null) {
            keyword.setSwitch(ctx.Switch().getText());
        }
        if (ctx.Function_() != null) {
            keyword.setFunction_(ctx.Function_().getText());
        }
        if (ctx.Const() != null) {
            keyword.setConst(ctx.Const().getText());
        }
        if (ctx.This() != null) {
            keyword.setThis(ctx.This().getText());
        }
        if (ctx.If() != null) {
            keyword.setIf(ctx.If().getText());
        }
        if (ctx.For() != null) {
            keyword.setFor(ctx.For().getText());
        }
        if (ctx.Interface() != null) {
            keyword.setInterface(ctx.Interface().getText());
        }
        if (ctx.Extends() != null) {
            keyword.setExtends(ctx.Extends().getText());
        }
        if (ctx.Class() != null) {
            keyword.setClas(ctx.Class().getText());
        }
        if (ctx.NullLiteral() != null) {
            keyword.setNullLiteral(ctx.NullLiteral().getText());
        }
        return keyword;
    }

}
