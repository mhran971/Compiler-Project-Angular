// Generated from C:/Users/Sham/C-Project-A/code/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void enterSourceElements(AngularParser.SourceElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#sourceElements}.
	 * @param ctx the parse tree
	 */
	void exitSourceElements(AngularParser.SourceElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatementLabel(AngularParser.ImportStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatementLabel(AngularParser.ImportStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceStatementLabel(AngularParser.InterfaceStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceStatementLabel(AngularParser.InterfaceStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterComponentStatementLabel(AngularParser.ComponentStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitComponentStatementLabel(AngularParser.ComponentStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatementLabel(AngularParser.ExportStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatementLabel(AngularParser.ExportStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlStatementLabel(AngularParser.HtmlStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlStatementLabel(AngularParser.HtmlStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCssStatementLabel(AngularParser.CssStatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCssStatementLabel(AngularParser.CssStatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultImport(AngularParser.DefaultImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultImport(AngularParser.DefaultImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassImport(AngularParser.ClassImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassImport(AngularParser.ClassImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamespaceImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceImport(AngularParser.NamespaceImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamespaceImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceImport(AngularParser.NamespaceImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void enterImportDefault(AngularParser.ImportDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importDefault}.
	 * @param ctx the parse tree
	 */
	void exitImportDefault(AngularParser.ImportDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFrom(AngularParser.ImportFromContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFrom(AngularParser.ImportFromContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespace(AngularParser.ImportNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importNamespace}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespace(AngularParser.ImportNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#commaReservedWord}.
	 * @param ctx the parse tree
	 */
	void enterCommaReservedWord(AngularParser.CommaReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#commaReservedWord}.
	 * @param ctx the parse tree
	 */
	void exitCommaReservedWord(AngularParser.CommaReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceStatement(AngularParser.InterfaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceStatement(AngularParser.InterfaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceAttributes}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceAttributes(AngularParser.InterfaceAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceAttributes}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceAttributes(AngularParser.InterfaceAttributesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributesProperty}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributesProperty(AngularParser.AttributesPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributesProperty}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributesProperty(AngularParser.AttributesPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodProperty}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodProperty(AngularParser.MethodPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodProperty}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodProperty(AngularParser.MethodPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentStatement}.
	 * @param ctx the parse tree
	 */
	void enterComponentStatement(AngularParser.ComponentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentStatement}.
	 * @param ctx the parse tree
	 */
	void exitComponentStatement(AngularParser.ComponentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentOptions}.
	 * @param ctx the parse tree
	 */
	void enterComponentOptions(AngularParser.ComponentOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentOptions}.
	 * @param ctx the parse tree
	 */
	void exitComponentOptions(AngularParser.ComponentOptionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionSelectorLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionSelectorLabel(AngularParser.OptionSelectorLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionSelectorLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionSelectorLabel(AngularParser.OptionSelectorLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionImportsLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionImportsLabel(AngularParser.OptionImportsLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionImportsLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionImportsLabel(AngularParser.OptionImportsLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionTemplateLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionTemplateLabel(AngularParser.OptionTemplateLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionTemplateLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionTemplateLabel(AngularParser.OptionTemplateLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionStylesLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionStylesLabel(AngularParser.OptionStylesLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionStylesLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionStylesLabel(AngularParser.OptionStylesLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OptionStandaloneLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionStandaloneLabel(AngularParser.OptionStandaloneLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OptionStandaloneLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionStandaloneLabel(AngularParser.OptionStandaloneLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#optionselector}.
	 * @param ctx the parse tree
	 */
	void enterOptionselector(AngularParser.OptionselectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#optionselector}.
	 * @param ctx the parse tree
	 */
	void exitOptionselector(AngularParser.OptionselectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#optionimports}.
	 * @param ctx the parse tree
	 */
	void enterOptionimports(AngularParser.OptionimportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#optionimports}.
	 * @param ctx the parse tree
	 */
	void exitOptionimports(AngularParser.OptionimportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importsProperties}.
	 * @param ctx the parse tree
	 */
	void enterImportsProperties(AngularParser.ImportsPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importsProperties}.
	 * @param ctx the parse tree
	 */
	void exitImportsProperties(AngularParser.ImportsPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#reservedWordAndComma}.
	 * @param ctx the parse tree
	 */
	void enterReservedWordAndComma(AngularParser.ReservedWordAndCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#reservedWordAndComma}.
	 * @param ctx the parse tree
	 */
	void exitReservedWordAndComma(AngularParser.ReservedWordAndCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#optiontemplateUrl}.
	 * @param ctx the parse tree
	 */
	void enterOptiontemplateUrl(AngularParser.OptiontemplateUrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#optiontemplateUrl}.
	 * @param ctx the parse tree
	 */
	void exitOptiontemplateUrl(AngularParser.OptiontemplateUrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#urlStatement}.
	 * @param ctx the parse tree
	 */
	void enterUrlStatement(AngularParser.UrlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#urlStatement}.
	 * @param ctx the parse tree
	 */
	void exitUrlStatement(AngularParser.UrlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#optionstyleUrls}.
	 * @param ctx the parse tree
	 */
	void enterOptionstyleUrls(AngularParser.OptionstyleUrlsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#optionstyleUrls}.
	 * @param ctx the parse tree
	 */
	void exitOptionstyleUrls(AngularParser.OptionstyleUrlsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void enterExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 */
	void exitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FullClassBody}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterFullClassBody(AngularParser.FullClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FullClassBody}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitFullClassBody(AngularParser.FullClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyString}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterPropertyString(AngularParser.PropertyStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyString}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitPropertyString(AngularParser.PropertyStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MethodOnly}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodOnly(AngularParser.MethodOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MethodOnly}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodOnly(AngularParser.MethodOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void enterPropertyList(AngularParser.PropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyList}.
	 * @param ctx the parse tree
	 */
	void exitPropertyList(AngularParser.PropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bodyList}.
	 * @param ctx the parse tree
	 */
	void enterBodyList(AngularParser.BodyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bodyList}.
	 * @param ctx the parse tree
	 */
	void exitBodyList(AngularParser.BodyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bodyListinner}.
	 * @param ctx the parse tree
	 */
	void enterBodyListinner(AngularParser.BodyListinnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bodyListinner}.
	 * @param ctx the parse tree
	 */
	void exitBodyListinner(AngularParser.BodyListinnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyDeclarationCom}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclarationCom(AngularParser.PropertyDeclarationComContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyDeclarationCom}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclarationCom(AngularParser.PropertyDeclarationComContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterComma}.
	 * @param ctx the parse tree
	 */
	void enterParameterComma(AngularParser.ParameterCommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterComma}.
	 * @param ctx the parse tree
	 */
	void exitParameterComma(AngularParser.ParameterCommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statementMethod}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethod(AngularParser.StatementMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statementMethod}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethod(AngularParser.StatementMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterTyped}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 */
	void enterParameterTyped(AngularParser.ParameterTypedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterTyped}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 */
	void exitParameterTyped(AngularParser.ParameterTypedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralLabel}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralLabel(AngularParser.StringLiteralLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralLabel}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralLabel(AngularParser.StringLiteralLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#declarationName}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationName(AngularParser.DeclarationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#declarationName}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationName(AngularParser.DeclarationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTagNameStart}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagNameStart(AngularParser.HtmlTagNameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTagNameStart}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagNameStart(AngularParser.HtmlTagNameStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTagNameEnd}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagNameEnd(AngularParser.HtmlTagNameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTagNameEnd}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagNameEnd(AngularParser.HtmlTagNameEndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedHtml}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 */
	void enterNestedHtml(AngularParser.NestedHtmlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedHtml}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 */
	void exitNestedHtml(AngularParser.NestedHtmlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentMany}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentMany(AngularParser.HtmlContentManyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentMany}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentMany(AngularParser.HtmlContentManyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlContentBrace}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContentBrace(AngularParser.HtmlContentBraceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlContentBrace}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContentBrace(AngularParser.HtmlContentBraceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlImgAttribute1}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void enterHtmlImgAttribute1(AngularParser.HtmlImgAttribute1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlImgAttribute1}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void exitHtmlImgAttribute1(AngularParser.HtmlImgAttribute1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlImgAttribute2}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void enterHtmlImgAttribute2(AngularParser.HtmlImgAttribute2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlImgAttribute2}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void exitHtmlImgAttribute2(AngularParser.HtmlImgAttribute2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlImgAttribute3}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void enterHtmlImgAttribute3(AngularParser.HtmlImgAttribute3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlImgAttribute3}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void exitHtmlImgAttribute3(AngularParser.HtmlImgAttribute3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlImgAttribute4}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void enterHtmlImgAttribute4(AngularParser.HtmlImgAttribute4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlImgAttribute4}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void exitHtmlImgAttribute4(AngularParser.HtmlImgAttribute4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexHtmlAttr}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void enterComplexHtmlAttr(AngularParser.ComplexHtmlAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexHtmlAttr}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 */
	void exitComplexHtmlAttr(AngularParser.ComplexHtmlAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlImgAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlImgAttribute(AngularParser.HtmlImgAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlImgAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlImgAttribute(AngularParser.HtmlImgAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttrSet}
	 * labeled alternative in {@link AngularParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttrSet(AngularParser.HtmlAttrSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttrSet}
	 * labeled alternative in {@link AngularParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttrSet(AngularParser.HtmlAttrSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReservedBlock}
	 * labeled alternative in {@link AngularParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterReservedBlock(AngularParser.ReservedBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReservedBlock}
	 * labeled alternative in {@link AngularParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitReservedBlock(AngularParser.ReservedBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlBrace}.
	 * @param ctx the parse tree
	 */
	void enterHtmlBrace(AngularParser.HtmlBraceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlBrace}.
	 * @param ctx the parse tree
	 */
	void exitHtmlBrace(AngularParser.HtmlBraceContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssElement}.
	 * @param ctx the parse tree
	 */
	void enterCssElement(AngularParser.CssElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssElement}.
	 * @param ctx the parse tree
	 */
	void exitCssElement(AngularParser.CssElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(AngularParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selectorInternal}.
	 * @param ctx the parse tree
	 */
	void enterSelectorInternal(AngularParser.SelectorInternalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selectorInternal}.
	 * @param ctx the parse tree
	 */
	void exitSelectorInternal(AngularParser.SelectorInternalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterCssProperty(AngularParser.CssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitCssProperty(AngularParser.CssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#css}.
	 * @param ctx the parse tree
	 */
	void enterCss(AngularParser.CssContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#css}.
	 * @param ctx the parse tree
	 */
	void exitCss(AngularParser.CssContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(AngularParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(AngularParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitNumberList}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void enterUnitNumberList(AngularParser.UnitNumberListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitNumberList}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void exitUnitNumberList(AngularParser.UnitNumberListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnitSolidColor}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void enterUnitSolidColor(AngularParser.UnitSolidColorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnitSolidColor}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void exitUnitSolidColor(AngularParser.UnitSolidColorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BackgroundColorUnit}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void enterBackgroundColorUnit(AngularParser.BackgroundColorUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BackgroundColorUnit}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 */
	void exitBackgroundColorUnit(AngularParser.BackgroundColorUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decimalLiteralUnit}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteralUnit(AngularParser.DecimalLiteralUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decimalLiteralUnit}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteralUnit(AngularParser.DecimalLiteralUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(AngularParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(AngularParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(AngularParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(AngularParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlKeyword}.
	 * @param ctx the parse tree
	 */
	void enterHtmlKeyword(AngularParser.HtmlKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlKeyword}.
	 * @param ctx the parse tree
	 */
	void exitHtmlKeyword(AngularParser.HtmlKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(AngularParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(AngularParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void enterReservedWord(AngularParser.ReservedWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#reservedWord}.
	 * @param ctx the parse tree
	 */
	void exitReservedWord(AngularParser.ReservedWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(AngularParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(AngularParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(AngularParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(AngularParser.EosContext ctx);
}