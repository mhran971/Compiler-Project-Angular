package Visitor;

import AST.*;
import SymbolTable.Row;
import SymbolTable.SymbolTable;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.RecognitionException;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends AngularParserBaseVisitor<Object> {

    SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    @Override
    public Object visitProgram(AngularParser.ProgramContext ctx) {
        symbolTable.enterScope(); // enter global scope
        Program program = new Program();
        if (ctx.sourceElements() != null) {
            program.setSourceElements((SourceElements) visit(ctx.sourceElements()));
        }
        symbolTable.print(); // print symbol table at the end
        symbolTable.exitScope(); // exit global scope
        return program;
    }

    @Override
    public Object visitSourceElements(AngularParser.SourceElementsContext ctx) {
        SourceElements sourceElements = new SourceElements();

        for (AngularParser.StatementContext stmtCtx : ctx.statement()) {
            if (stmtCtx != null) {
                sourceElements.getStatement().add((Statement) visit(stmtCtx));
            }
        }

        Row row = new Row();
        row.setType("SourceElements");
        row.setValue(sourceElements.getStatement().toString());
        symbolTable.addRow(row);

        return sourceElements;
    }

    @Override
    public Object visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();
        importStatement.setImportFromBlock((ImportFromBlock) visit(ctx.importFromBlock()));
        return importStatement;
    }

    @Override
    public Object visitDefaultImport(AngularParser.DefaultImportContext ctx) {
        ImportDefault importDefault = null;
        if (ctx.importDefault() != null) {
            importDefault = (ImportDefault) visit(ctx.importDefault());
        }
        ImportFrom importFrom = (ImportFrom) visit(ctx.importFrom());
        return new DefaultImport(importDefault, importFrom);
    }

    @Override
    public Object visitNamespaceImport(AngularParser.NamespaceImportContext ctx) {
        ReservedWord reservedWord = (ReservedWord) visit(ctx.reservedWord());
        ImportFrom importFrom = (ImportFrom) visit(ctx.importFrom());
        return new NamespaceImport(reservedWord, importFrom);
    }

    @Override
    public Object visitImportFrom(AngularParser.ImportFromContext ctx) {
        ImportFrom importFrom = new ImportFrom();
        importFrom.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        return importFrom;
    }

    @Override
    public Object visitImportDefault(AngularParser.ImportDefaultContext ctx) {
        ImportDefault importDefault = new ImportDefault();
        importDefault.setImportNamespace((ImportNamespace) visit(ctx.importNamespace()));
        return importDefault;
    }

    @Override
    public Object visitImportNamespace(AngularParser.ImportNamespaceContext ctx) {
        ImportNamespace importNamespace = new ImportNamespace();
        importNamespace.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        for (AngularParser.CommaReservedWordContext crc : ctx.commaReservedWord()) {
            if (crc != null) {
                importNamespace.getCommaReservedWord().add((CommaReservedWord) visit(crc));
            }
        }
        return importNamespace;
    }

    @Override
    public Object visitCommaReservedWord(AngularParser.CommaReservedWordContext ctx) {
        CommaReservedWord commaReservedWord = new CommaReservedWord();
        commaReservedWord.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        return commaReservedWord;
    }

    @Override
    public Object visitInterfaceStatement(AngularParser.InterfaceStatementContext ctx) {
        InterfaceStatement interfaceStatement = new InterfaceStatement();
        if (ctx.Interface() != null) {
            interfaceStatement.setInterface(ctx.Interface().getText());
        }
        for (AngularParser.DeclarationNameContext dnc : ctx.declarationName()) {
            interfaceStatement.getDeclarationName().add((DeclarationName) visit(dnc));
        }
        if (ctx.keyword() != null) {
            interfaceStatement.setKeyword((Keyword) visit(ctx.keyword()));
        }
        interfaceStatement.setInterfaceAttributes((InterfaceAttributes) visit(ctx.interfaceAttributes()));
        return interfaceStatement;
    }

    @Override
    public Object visitInterfaceAttributes(AngularParser.InterfaceAttributesContext ctx) {
        InterfaceAttributes interfaceAttributes = new InterfaceAttributes();
        for (AngularParser.PropertyDeclarationContext pdc : ctx.propertyDeclaration()) {
            interfaceAttributes.getPropertyDeclaration().add((PropertyDeclaration) visit(pdc));
        }
        return interfaceAttributes;
    }

    @Override
    public Object visitAttributesProperty(AngularParser.AttributesPropertyContext ctx) {
        Type type = (Type) visit(ctx.type());
        DeclarationName declarationName = (DeclarationName) visit(ctx.declarationName());
        return new AttributesProperty(declarationName, type);
    }

    @Override
    public Object visitMethodProperty(AngularParser.MethodPropertyContext ctx) {
        Type type = (Type) visit(ctx.type());
        DeclarationName declarationName = (DeclarationName) visit(ctx.declarationName());
        return new AttributesProperty(declarationName, type);
    }

    @Override
    public Object visitComponentStatement(AngularParser.ComponentStatementContext ctx) {
        ComponentStatement componentStatement = new ComponentStatement();
        componentStatement.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        componentStatement.setComponentOptions((ComponentOptions) visit(ctx.componentOptions()));
        return componentStatement;
    }

    @Override
    public Object visitComponentOptions(AngularParser.ComponentOptionsContext ctx) {
        ComponentOptions componentOptions = new ComponentOptions();
        for (AngularParser.ComponentOptionContext coc : ctx.componentOption()) {
            if (coc != null) {
                componentOptions.getComponentOption().add((ComponentOption) visit(coc));
            }
        }
        return componentOptions;
    }

    @Override
    public Object visitOptionselector(AngularParser.OptionselectorContext ctx) {
        OptionSelector optionSelector = new OptionSelector();
        optionSelector.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        if (ctx.Selector() != null) {
            optionSelector.setSelector(ctx.Selector().getText());
        }
        return optionSelector;
    }

    @Override
    public Object visitOptionimports(AngularParser.OptionimportsContext ctx) {
        OptionImports optionImports = new OptionImports();
        optionImports.setImportsProperties((ImportsProperties) visit(ctx.importsProperties()));
        if (ctx.Imports() != null) {
            optionImports.setImports(ctx.Imports().getText());
        }
        return optionImports;
    }

    @Override
    public Object visitImportsProperties(AngularParser.ImportsPropertiesContext ctx) {
        ImportsProperties importsProperties = new ImportsProperties();
        importsProperties.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        for (AngularParser.ReservedWordAndCommaContext rwac : ctx.reservedWordAndComma()) {
            if (rwac != null) {
                importsProperties.getReservedWordAndComma().add((ReservedWordAndComma) visit(rwac));
            }
        }
        return importsProperties;
    }

    @Override
    public Object visitReservedWordAndComma(AngularParser.ReservedWordAndCommaContext ctx) {
        ReservedWordAndComma reservedWordAndComma = new ReservedWordAndComma();
        reservedWordAndComma.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        return reservedWordAndComma;
    }

    @Override
    public Object visitOptiontemplateUrl(AngularParser.OptiontemplateUrlContext ctx) {
        OptionTemplateUrl optionTemplateUrl = new OptionTemplateUrl();
        optionTemplateUrl.setUrlStatement((UrlStatement) visit(ctx.urlStatement()));
        optionTemplateUrl.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        return optionTemplateUrl;
    }

    @Override
    public Object visitUrlStatement(AngularParser.UrlStatementContext ctx) {
        UrlStatement urlStatement = new UrlStatement();
        if (ctx.TemplateUrl() != null) {
            urlStatement.setTemplateUrl(ctx.TemplateUrl().getText());
        }
        if (ctx.StyleUrl() != null) {
            urlStatement.setStyleUrl(ctx.StyleUrl().getText());
        }
        return urlStatement;
    }

    @Override
    public Object visitOptionstyleUrls(AngularParser.OptionstyleUrlsContext ctx) {
        OptionStyleUrls optionStyleUrls = new OptionStyleUrls();
        optionStyleUrls.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        if (ctx.StyleUrls() != null) {
            optionStyleUrls.setStyleUrls(ctx.StyleUrls().getText());
        }
        return optionStyleUrls;
    }

    @Override
    public Object visitExportStatement(AngularParser.ExportStatementContext ctx) {
        ExportStatement exportStatement = new ExportStatement();
        exportStatement.setKeyword((Keyword) visit(ctx.keyword()));
        exportStatement.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        for (AngularParser.ClassBodyContext cbc : ctx.classBody()) {
            if (cbc != null) {
                exportStatement.getClassBody().add((ClassBody) visit(cbc));
            }
        }
        return exportStatement;
    }

    @Override
    public Object visitFullClassBody(AngularParser.FullClassBodyContext ctx) {
        symbolTable.enterScope(); // enter class body scope
        PropertyList propertyList = (PropertyList) visit(ctx.propertyList());
        PropertyDeclarationCom propertyDeclarationCom = null;
        if (ctx.propertyDeclarationCom() != null) {
            propertyDeclarationCom = (PropertyDeclarationCom) visit(ctx.propertyDeclarationCom());
        }
        MethodDeclaration methodDeclaration = (MethodDeclaration) visit(ctx.methodDeclaration());
        symbolTable.exitScope(); // exit class body scope
        return new FullClassBody(propertyList, propertyDeclarationCom, methodDeclaration);
    }

    @Override
    public Object visitPropertyString(AngularParser.PropertyStringContext ctx) {
        DeclarationName declarationName = (DeclarationName) visit(ctx.declarationName());
        Type type = (Type) visit(ctx.type());
        StringLiteral stringLiteral = (StringLiteral) visit(ctx.stringLiteral());
        return new PropertyString(declarationName, type, stringLiteral);
    }

    @Override
    public Object visitPropertyList(AngularParser.PropertyListContext ctx) {
        PropertyList propertyList = new PropertyList();
        if (ctx.STRING() != null) {
            propertyList.setSTRING(ctx.STRING().getText());
        }
        propertyList.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        for (AngularParser.BodyListContext blc : ctx.bodyList()) {
            if (blc != null) {
                propertyList.getBodyList().add((BodyList) visit(blc));
            }
        }
        return propertyList;
    }

    @Override
    public Object visitBodyList(AngularParser.BodyListContext ctx) {
        BodyList bodyList = new BodyList();
        for (AngularParser.BodyListinnerContext bli : ctx.bodyListinner()) {
            if (bli != null) {
                bodyList.getBodyListInner().add((BodyListInner) visit(bli));
            }
        }
        return bodyList;
    }

    @Override
    public Object visitBodyListinner(AngularParser.BodyListinnerContext ctx) {
        BodyListInner bodyListInner = new BodyListInner();
        bodyListInner.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        bodyListInner.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        return bodyListInner;
    }

    @Override
    public Object visitPropertyDeclarationCom(AngularParser.PropertyDeclarationComContext ctx) {
        PropertyDeclarationCom propertyDeclarationCom = new PropertyDeclarationCom();
        for (AngularParser.DeclarationNameContext dnc : ctx.declarationName()) {
            propertyDeclarationCom.getDeclarationName().add((DeclarationName) visit(dnc));
        }
        propertyDeclarationCom.setIdentifier((Identifier) visit(ctx.identifier()));
        for (AngularParser.KeywordContext kwc : ctx.keyword()) {
            propertyDeclarationCom.getKeyword().add((Keyword) visit(kwc));
        }

        // Add property declaration to symbol table
        Row row = new Row();
        row.setType("PropertyDeclarationCom");
        row.setValue(propertyDeclarationCom.getDeclarationName().toString());
        symbolTable.addRow(row);

        return propertyDeclarationCom;
    }

    @Override
    public Object visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        symbolTable.enterScope(); // enter method scope
        MethodDeclaration methodDeclaration = new MethodDeclaration();
        methodDeclaration.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        if (ctx.parameterList() != null) {
            methodDeclaration.setParameterList((ParameterList) visit(ctx.parameterList()));
        }
        methodDeclaration.setMethodBody((MethodBody) visit(ctx.methodBody()));
        symbolTable.exitScope(); // exit method scope

        // Add method declaration to symbol table
        Row row = new Row();
        row.setType("MethodDeclaration");
        row.setValue(methodDeclaration.getDeclarationName().toString());
        symbolTable.addRow(row);

        return methodDeclaration;
    }

    @Override
    public Object visitParameterList(AngularParser.ParameterListContext ctx) {
        ParameterList parameterList = new ParameterList();
        parameterList.setParameter((Parameter) visit(ctx.parameter()));
        for (AngularParser.ParameterCommaContext pcc : ctx.parameterComma()) {
            if (pcc != null) {
                parameterList.getParameterComma().add((ParameterComma) visit(pcc));
            }
        }
        return parameterList;
    }

    @Override
    public Object visitParameterComma(AngularParser.ParameterCommaContext ctx) {
        ParameterComma parameterComma = new ParameterComma();
        parameterComma.setParameter((Parameter) visit(ctx.parameter()));
        return parameterComma;
    }

    @Override
    public Object visitParameter(AngularParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        parameter.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        parameter.setDeclarationString((DeclarationString) visit(ctx.declarationString()));
        return parameter;
    }

    @Override
    public Object visitMethodBody(AngularParser.MethodBodyContext ctx) {
        MethodBody methodBody = new MethodBody();
        for (AngularParser.StatementMethodContext smc : ctx.statementMethod()) {
            if (smc != null) {
                methodBody.getStatementMethod().add((StatementMethod) visit(smc));
            }
        }
        return methodBody;
    }

    @Override
    public Object visitStatementMethod(AngularParser.StatementMethodContext ctx) {
        StatementMethod statementMethod = new StatementMethod();
        statementMethod.setKeyword((Keyword) visit(ctx.keyword()));
        statementMethod.setDeclarationName((DeclarationName) visit(ctx.declarationName()));
        statementMethod.setDeclarationString((DeclarationString) visit(ctx.declarationString()));
        return statementMethod;
    }

    @Override
    public Object visitDeclarationName(AngularParser.DeclarationNameContext ctx) {
        DeclarationName declarationName = new DeclarationName();
        if (ctx.STRING() != null) {
            declarationName.setSTRING(ctx.STRING().getText());
        }
        return declarationName;
    }

    @Override
    public Object visitHtmlElements(AngularParser.HtmlElementsContext ctx) {
        HtmlElements htmlElements = new HtmlElements();
        htmlElements.setHtmlElement((HtmlElement) visit(ctx.htmlElement()));
        return htmlElements;
    }

    @Override
    public Object visitHtmlElement(AngularParser.HtmlElementContext ctx) {
        HtmlElement htmlElement = new HtmlElement();
        for (AngularParser.HtmlTagNameStartContext htnsc : ctx.htmlTagNameStart()) {
            htmlElement.getHtmlTagNameStart().add((HtmlTagNameStart) visit(htnsc));
        }
        for (AngularParser.HtmlElementContentContext hecc : ctx.htmlElementContent()) {
            if (hecc != null) {
                htmlElement.getHtmlElementContent().add((HtmlElementContent) visit(hecc));
            }
        }
        for (AngularParser.HtmlTagNameEndContext htnec : ctx.htmlTagNameEnd()) {
            htmlElement.getHtmlTagNameEnd().add((HtmlTagNameEnd) visit(htnec));
        }
        return htmlElement;
    }

    @Override
    public Object visitHtmlTagNameStart(AngularParser.HtmlTagNameStartContext ctx) {
        HtmlTagNameStart htmlTagNameStart = new HtmlTagNameStart();
        htmlTagNameStart.setTagName((TagName) visit(ctx.tagName()));
        if (ctx.keyword() != null) {
            htmlTagNameStart.setKeyword((Keyword) visit(ctx.keyword()));
        }
        if (ctx.stringLiteral() != null) {
            htmlTagNameStart.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        }
        return htmlTagNameStart;
    }

    @Override
    public Object visitHtmlTagNameEnd(AngularParser.HtmlTagNameEndContext ctx) {
        HtmlTagNameEnd htmlTagNameEnd = new HtmlTagNameEnd();
        htmlTagNameEnd.setTagName((TagName) visit(ctx.tagName()));
        return htmlTagNameEnd;
    }

    @Override
    public Object visitNestedHtml(AngularParser.NestedHtmlContext ctx) {
        Elements elements = (Elements) visit(ctx.elements());
        List<TagName> tagNames = new ArrayList<>();
        for (AngularParser.TagNameContext tnc : ctx.tagName()) {
            if (tnc != null) {
                tagNames.add((TagName) visit(tnc));
            }
        }
        return new NestedHtml(tagNames, elements);
    }

    @Override
    public Object visitHtmlContentMany(AngularParser.HtmlContentManyContext ctx) {
        TagName tagName = (TagName) visit(ctx.tagName());
        List<ContentHtml> contentHtmls = new ArrayList<>();
        for (AngularParser.ContentHtmlContext chc : ctx.contentHtml()) {
            if (chc != null) {
                contentHtmls.add((ContentHtml) visit(chc));
            }
        }
        return new HtmlContentMany(tagName, contentHtmls);
    }

    @Override
    public Object visitHtmlContentBrace(AngularParser.HtmlContentBraceContext ctx) {
        TagName tagName = (TagName) visit(ctx.tagName());
        ContentHtml contentHtml = (ContentHtml) visit(ctx.contentHtml());
        HtmlBrace htmlBrace = (HtmlBrace) visit(ctx.htmlBrace());
        return new HtmlContentBrace(tagName, contentHtml, htmlBrace);
    }

    @Override
    public Object visitHtmlImgAttribute(AngularParser.HtmlImgAttributeContext ctx) {
        HtmlImgAttribute htmlImgAttribute = new HtmlImgAttribute();
        htmlImgAttribute.setHtmlKeyword((HtmlKeyword) visit(ctx.htmlKeyword()));
        htmlImgAttribute.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        return htmlImgAttribute;
    }

    @Override
    public Object visitHtmlImgAttribute2(AngularParser.HtmlImgAttribute2Context ctx) {
        HtmlKeyword htmlKeyword = (HtmlKeyword) visit(ctx.htmlKeyword());
        StringLiteral stringLiteral = (StringLiteral) visit(ctx.stringLiteral());
        return new HtmlImgAttribute2(htmlKeyword, stringLiteral);
    }

    @Override
    public Object visitHtmlImgAttribute3(AngularParser.HtmlImgAttribute3Context ctx) {
        HtmlKeyword htmlKeyword = (HtmlKeyword) visit(ctx.htmlKeyword());
        StringLiteral stringLiteral = (StringLiteral) visit(ctx.stringLiteral());
        return new HtmlImgAttribute3(htmlKeyword, stringLiteral);
    }

    @Override
    public Object visitHtmlImgAttribute4(AngularParser.HtmlImgAttribute4Context ctx) {
        Keyword keyword = (Keyword) visit(ctx.keyword());
        StringLiteral stringLiteral = (StringLiteral) visit(ctx.stringLiteral());
        return new HtmlImgAttribute4(keyword, stringLiteral);
    }

    @Override
    public Object visitComplexHtmlAttr(AngularParser.ComplexHtmlAttrContext ctx) {
        Keyword keyword = (Keyword) visit(ctx.keyword());
        HtmlKeyword htmlKeyword = (HtmlKeyword) visit(ctx.htmlKeyword());
        List<StringLiteral> stringLiterals = new ArrayList<>();
        for (AngularParser.StringLiteralContext slc : ctx.stringLiteral()) {
            if (slc != null) {
                stringLiterals.add((StringLiteral) visit(slc));
            }
        }
        return new ComplexHtmlAttr(keyword, stringLiterals, htmlKeyword);
    }

    @Override
    public Object visitReservedBlock(AngularParser.ReservedBlockContext ctx) {
        ReservedWord reservedWord = (ReservedWord) visit(ctx.reservedWord());
        StringLiteral stringLiteral = (StringLiteral) visit(ctx.stringLiteral());
        List<Identifier> identifiers = new ArrayList<>();
        for (AngularParser.IdentifierContext ic : ctx.identifier()) {
            identifiers.add((Identifier) visit(ic));
        }
        return new ReservedBlock(reservedWord, stringLiteral, identifiers);
    }

    @Override
    public Object visitHtmlBrace(AngularParser.HtmlBraceContext ctx) {
        HtmlBrace htmlBrace = new HtmlBrace();
        htmlBrace.setReservedWord((ReservedWord) visit(ctx.reservedWord()));
        htmlBrace.setStringLiteral((StringLiteral) visit(ctx.stringLiteral()));
        return htmlBrace;
    }

    @Override
    public Object visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx) {
        HtmlAttributes htmlAttributes = new HtmlAttributes();
        for (TerminalNode tn : ctx.STRING()) {
            htmlAttributes.getSTRING().add(tn.getText());
        }
        for (AngularParser.TagNameContext tnc : ctx.tagName()) {
            htmlAttributes.getTagName().add((TagName) visit(tnc));
        }
        return htmlAttributes;
    }

    @Override
    public Object visitCssElement(AngularParser.CssElementContext ctx) {
        CssElement cssElement = new CssElement();
        if (ctx.tagName() != null) {
            cssElement.setTagName((TagName) visit(ctx.tagName()));
        }
        for (AngularParser.SelectorContext sc : ctx.selector()) {
            if (sc != null) {
                cssElement.getSelector().add((Selector) visit(sc));
            }
        }
        for (AngularParser.CssPropertyContext cpc : ctx.cssProperty()) {
            if (cpc != null) {
                cssElement.getCssProperty().add((CssProperty) visit(cpc));
            }
        }
        return cssElement;
    }

    @Override
    public Object visitSelector(AngularParser.SelectorContext ctx) {
        Selector selector = new Selector();
        if (ctx.STRING() != null) {
            selector.setSTRING(ctx.STRING().getText());
        }
        for (AngularParser.SelectorInternalContext sic : ctx.selectorInternal()) {
            if (sic != null) {
                selector.getSelectorInternal().add((SelectorInternal) visit(sic));
            }
        }
        return selector;
    }

    @Override
    public Object visitSelectorInternal(AngularParser.SelectorInternalContext ctx) {
        SelectorInternal selectorInternal = new SelectorInternal();
        if (ctx.STRING() != null) {
            selectorInternal.setSTRING(ctx.STRING().getText());
        }
        return selectorInternal;
    }

    @Override
    public Object visitCssProperty(AngularParser.CssPropertyContext ctx) {
        CssProperty cssProperty = new CssProperty();
        cssProperty.setCss((Css) visit(ctx.css()));
        cssProperty.setCssValue((CssValue) visit(ctx.cssValue()));
        return cssProperty;
    }

    @Override
    public Object visitCss(AngularParser.CssContext ctx) {
        Css css = new Css();
        if (ctx.Display() != null) {
            css.setDisplay(ctx.Display().getText());
        } else if (ctx.Flex_Direction() != null) {
            css.setFlex_Direction(ctx.Flex_Direction().getText());
        } else if (ctx.Gap() != null) {
            css.setGap(ctx.Gap().getText());
        } else if (ctx.Padding() != null) {
            css.setPadding(ctx.Padding().getText());
        } else if (ctx.Box_Size() != null) {
            css.setBox_Size(ctx.Box_Size().getText());
        } else if (ctx.Flex() != null) {
            css.setFlex(ctx.Flex().getText());
        } else if (ctx.Border() != null) {
            css.setBorder(ctx.Border().getText());
        } else if (ctx.Text_Align() != null) {
            css.setText_Align(ctx.Text_Align().getText());
        } else if (ctx.Max_With() != null) {
            css.setMax_With(ctx.Max_With().getText());
        } else if (ctx.Height() != null) {
            css.setHeight(ctx.Height().getText());
        } else if (ctx.Cursor() != null) {
            css.setCursor(ctx.Cursor().getText());
        } else if (ctx.Transition() != null) {
            css.setTransition(ctx.Transition().getText());
        } else if (ctx.Background_Color() != null) {
            css.setBackground_Color(ctx.Background_Color().getText());
        } else if (ctx.Margin() != null) {
            css.setMargin(ctx.Margin().getText());
        }
        return css;
    }

    @Override
    public Object visitCssValue(AngularParser.CssValueContext ctx) {
        CssValue cssValue = new CssValue();
        if (ctx.decimalLiteral_UNIT() != null) {
            cssValue.setDecimalLiteral_UNIT((DecimalLiteral_UNIT) visit(ctx.decimalLiteral_UNIT()));
        }
        if (ctx.Flex() != null) {
            cssValue.setFlex(ctx.Flex().getText());
        }
        if (ctx.Row() != null) {
            cssValue.setRow(ctx.Row().getText());
        }
        if (ctx.Border_Box() != null) {
            cssValue.setBorder_Box(ctx.Border_Box().getText());
        }
        if (ctx.Center() != null) {
            cssValue.setCenter(ctx.Center().getText());
        }
        if (ctx.Column() != null) {
            cssValue.setColumn(ctx.Column().getText());
        }
        if (ctx.Auto() != null) {
            cssValue.setAuto(ctx.Auto().getText());
        }
        if (ctx.Pointer() != null) {
            cssValue.setPointer(ctx.Pointer().getText());
        }
        if (ctx.HEXCHAR() != null) {
            cssValue.setHEXCHAR(ctx.HEXCHAR().getText());
        }
        if (ctx.STRING() != null) {
            cssValue.setSTRING(ctx.STRING().getText());
        }
        return cssValue;
    }

    @Override
    public Object visitUnitNumberList(AngularParser.UnitNumberListContext ctx) {
        DecimalLiteralUnit decimalLiteralUnit = (DecimalLiteralUnit) visit(ctx.decimalLiteralUnit());
        List<DecimalLiteral> decimalLiterals = new ArrayList<>();
        for (AngularParser.DecimalLiteralContext dlc : ctx.decimalLiteral()) {
            decimalLiterals.add((DecimalLiteral) visit(dlc));
        }
        return new UnitNumberList(decimalLiteralUnit, decimalLiterals);
    }

    @Override
    public Object visitBackgroundColorUnit(AngularParser.BackgroundColorUnitContext ctx) {
        DecimalLiteralUnit decimalLiteralUnit = (DecimalLiteralUnit) visit(ctx.decimalLiteralUnit());
        Css css = (Css) visit(ctx.css());
        return new BackgroundColorUnit(decimalLiteralUnit, css);
    }

    @Override
    public Object visitDecimalLiteralUnit(AngularParser.DecimalLiteralUnitContext ctx) {
        DecimalLiteralUnit decimalLiteralUnit = new DecimalLiteralUnit();
        if (ctx.DecimalLiteral_UNIT() != null) {
            decimalLiteralUnit.setDecimalLiteral_UNIT(ctx.DecimalLiteral_UNIT().getText());
        }
        return decimalLiteralUnit;
    }

    @Override
    public Object visitDecimalLiteral(AngularParser.DecimalLiteralContext ctx) {
        DecimalLiteral decimalLiteral = new DecimalLiteral();
        if (ctx.DecimalLiteral() != null) {
            decimalLiteral.setDecimalLiteral(ctx.DecimalLiteral().getText());
        }
        return decimalLiteral;
    }

    @Override
    public Object visitTagName(AngularParser.TagNameContext ctx) {
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
    public Object visitHtmlKeyword(AngularParser.HtmlKeywordContext ctx) {
        HtmlKeyword htmlKeyword = new HtmlKeyword();
        if (ctx.NGFOR() != null) {
            htmlKeyword.setNGFOR(ctx.NGFOR().getText());
        }
        if (ctx.ALT() != null) {
            htmlKeyword.setALT(ctx.ALT().getText());
        }
        if (ctx.NGIF() != null) {
            htmlKeyword.setNGIF(ctx.NGIF().getText());
        }
        if (ctx.SRC() != null) {
            htmlKeyword.setSRC(ctx.SRC().getText());
        }
        return htmlKeyword;
    }

    @Override
    public Object visitIdentifier(AngularParser.IdentifierContext ctx) {
        Identifier identifier = new Identifier();
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
    public Object visitType(AngularParser.TypeContext ctx) {
        Type type = new Type();
        if (ctx.String() != null) {
            type.setString(ctx.String().getText());
        }
        if (ctx.Int() != null) {
            type.setInt(ctx.Int().getText());
        }
        if (ctx.Float() != null) {
            type.setFloat(ctx.Float().getText());
        }
        if (ctx.Double() != null) {
            type.setDouble(ctx.Double().getText());
        }
        if (ctx.Bool() != null) {
            type.setBool(ctx.Bool().getText());
        }
        if (ctx.Var() != null) {
            type.setVar(ctx.Var().getText());
        }
        if (ctx.Array() != null) {
            type.setArray(ctx.Array().getText());
        }
        if (ctx.Number() != null) {
            type.setNumber(ctx.Number().getText());
        }
        return type;
    }

    @Override
    public Object visitReservedWord(AngularParser.ReservedWordContext ctx) {
        ReservedWord reservedWord = new ReservedWord();
        if (ctx.Angular() != null) {
            reservedWord.setAngular(ctx.Angular().getText());
        }
        if (ctx.AngularCore() != null) {
            reservedWord.setAngularCore(ctx.AngularCore().getText());
        }
        if (ctx.Component() != null) {
            reservedWord.setComponent(ctx.Component().getText());
        }
        if (ctx.RouterOutlet() != null) {
            reservedWord.setRouterOutlet(ctx.RouterOutlet().getText());
        }
        if (ctx.CommonModule() != null) {
            reservedWord.setCommonModule(ctx.CommonModule().getText());
        }
        if (ctx.Input() != null) {
            reservedWord.setInput(ctx.Input().getText());
        }
        if (ctx.OnInit() != null) {
            reservedWord.setOnInit(ctx.OnInit().getText());
        }
        if (ctx.Click() != null) {
            reservedWord.setClick(ctx.Click().getText());
        }
        return reservedWord;
    }

    @Override
    public Object visitStringLiteral(AngularParser.StringLiteralContext ctx) {
        StringLiteral stringLiteral = new StringLiteral();
        if (ctx.StringLiteral() != null) {
            stringLiteral.setStringLiteral(ctx.StringLiteral().getText());
        }
        return stringLiteral;
    }

    @Override
    public Object visitKeyword(AngularParser.KeywordContext ctx) {
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
        // Removed Function_ because it does not exist in KeywordContext
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
