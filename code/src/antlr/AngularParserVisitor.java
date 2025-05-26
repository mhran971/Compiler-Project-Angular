// Generated from E:/Fourth year/Semester2(2024-2025)/Compiler 2/ProjectCompiler2/code/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#sourceElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElements(AngularParser.SourceElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatementLabel(AngularParser.ImportStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceStatementLabel(AngularParser.InterfaceStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStatementLabel(AngularParser.ComponentStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatementLabel(AngularParser.ExportStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlStatementLabel(AngularParser.HtmlStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStatementLabel}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStatementLabel(AngularParser.CssStatementLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultImport(AngularParser.DefaultImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassImport(AngularParser.ClassImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamespaceImport}
	 * labeled alternative in {@link AngularParser#importFromBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceImport(AngularParser.NamespaceImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefault(AngularParser.ImportDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFrom(AngularParser.ImportFromContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importNamespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespace(AngularParser.ImportNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#commaReservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaReservedWord(AngularParser.CommaReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceStatement(AngularParser.InterfaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceAttributes(AngularParser.InterfaceAttributesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributesProperty}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributesProperty(AngularParser.AttributesPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodProperty}
	 * labeled alternative in {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodProperty(AngularParser.MethodPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentStatement(AngularParser.ComponentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentOptions(AngularParser.ComponentOptionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionSelectorLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionSelectorLabel(AngularParser.OptionSelectorLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionImportsLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionImportsLabel(AngularParser.OptionImportsLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionTemplateLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionTemplateLabel(AngularParser.OptionTemplateLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionStylesLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionStylesLabel(AngularParser.OptionStylesLabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionStandaloneLabel}
	 * labeled alternative in {@link AngularParser#componentOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionStandaloneLabel(AngularParser.OptionStandaloneLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#optionselector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionselector(AngularParser.OptionselectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#optionimports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionimports(AngularParser.OptionimportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importsProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsProperties(AngularParser.ImportsPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#reservedWordAndComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWordAndComma(AngularParser.ReservedWordAndCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#optiontemplateUrl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptiontemplateUrl(AngularParser.OptiontemplateUrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#urlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlStatement(AngularParser.UrlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#optionstyleUrls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionstyleUrls(AngularParser.OptionstyleUrlsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportStatement(AngularParser.ExportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FullClassBody}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullClassBody(AngularParser.FullClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyString}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyString(AngularParser.PropertyStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodOnly}
	 * labeled alternative in {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodOnly(AngularParser.MethodOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyList(AngularParser.PropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bodyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyList(AngularParser.BodyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bodyListinner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyListinner(AngularParser.BodyListinnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyDeclarationCom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclarationCom(AngularParser.PropertyDeclarationComContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterComma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterComma(AngularParser.ParameterCommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(AngularParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statementMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMethod(AngularParser.StatementMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterTyped}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTyped(AngularParser.ParameterTypedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(AngularParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralLabel}
	 * labeled alternative in {@link AngularParser#declarationString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralLabel(AngularParser.StringLiteralLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#declarationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationName(AngularParser.DeclarationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(AngularParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(AngularParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlTagNameStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagNameStart(AngularParser.HtmlTagNameStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlTagNameEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagNameEnd(AngularParser.HtmlTagNameEndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedHtml}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedHtml(AngularParser.NestedHtmlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentMany}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentMany(AngularParser.HtmlContentManyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlContentBrace}
	 * labeled alternative in {@link AngularParser#htmlElementContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContentBrace(AngularParser.HtmlContentBraceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlImgAttribute1}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlImgAttribute1(AngularParser.HtmlImgAttribute1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlImgAttribute2}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlImgAttribute2(AngularParser.HtmlImgAttribute2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlImgAttribute3}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlImgAttribute3(AngularParser.HtmlImgAttribute3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlImgAttribute4}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlImgAttribute4(AngularParser.HtmlImgAttribute4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexHtmlAttr}
	 * labeled alternative in {@link AngularParser#contentHtml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexHtmlAttr(AngularParser.ComplexHtmlAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlImgAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlImgAttribute(AngularParser.HtmlImgAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttrSet}
	 * labeled alternative in {@link AngularParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttrSet(AngularParser.HtmlAttrSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReservedBlock}
	 * labeled alternative in {@link AngularParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedBlock(AngularParser.ReservedBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlBrace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlBrace(AngularParser.HtmlBraceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttributes(AngularParser.HtmlAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssElement(AngularParser.CssElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(AngularParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selectorInternal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorInternal(AngularParser.SelectorInternalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssProperty(AngularParser.CssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#css}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss(AngularParser.CssContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(AngularParser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitNumberList}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitNumberList(AngularParser.UnitNumberListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnitSolidColor}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitSolidColor(AngularParser.UnitSolidColorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BackgroundColorUnit}
	 * labeled alternative in {@link AngularParser#decimalLiteral_UNIT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundColorUnit(AngularParser.BackgroundColorUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decimalLiteralUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteralUnit(AngularParser.DecimalLiteralUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(AngularParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(AngularParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlKeyword(AngularParser.HtmlKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(AngularParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#reservedWord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReservedWord(AngularParser.ReservedWordContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(AngularParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(AngularParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(AngularParser.EosContext ctx);
}