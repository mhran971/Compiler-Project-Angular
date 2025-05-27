// Generated from C:/Users/Sham/C-Project-A/code/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineComment=1, SingleLineComment=2, WS=3, NEWLINE=4, Import=5, Export=6, 
		From=7, Out=8, Property=9, Ensure=10, EnsureAlways=11, Check=12, Mixin=13, 
		Extends=14, Super=15, Implements=16, Let=17, Component=18, CommonModule=19, 
		RouterOutlet=20, OnInit=21, Input=22, Interface=23, NGIF=24, NGFOR=25, 
		SRC=26, ALT=27, Selector=28, Imports=29, TemplateUrl=30, StyleUrls=31, 
		Standalone=32, FormsModule=33, StyleUrl=34, Int=35, Float=36, Double=37, 
		Bool=38, New=39, Var=40, String=41, Array=42, Auto=43, Break=44, Case=45, 
		Catch=46, Char=47, Class=48, Const=49, Continue=50, Default=51, Do=52, 
		Else=53, Enum=54, False_=55, Final=56, For=57, Goto=58, If=59, Namespace=60, 
		Nullptr=61, Operator=62, Override=63, Private=64, Protected=65, Public=66, 
		Static=67, Package=68, Return=69, Short=70, Struct=71, Switch=72, This=73, 
		True_=74, Virtual=75, Void=76, While=77, Function_=78, With=79, Throw=80, 
		Any=81, In=82, Try=83, As=84, Number=85, Unique=86, Symbol=87, Undefined=88, 
		Object=89, Constructor=90, Abstract=91, Require=92, Module=93, Declare=94, 
		Angular=95, Common=96, Core=97, Router=98, SomeClass=99, AngularCore=100, 
		LeftParen=101, RightParen=102, LeftBracket=103, RightBracket=104, LeftBrace=105, 
		RightBrace=106, Plus=107, Minus=108, Star=109, Div=110, Mod=111, Xor=112, 
		And=113, Or=114, Tilde=115, Not=116, Assign=117, Less=118, Greater=119, 
		PlusAssign=120, MinusAssign=121, StarAssign=122, DivAssign=123, ModAssign=124, 
		XorAssign=125, AndAssign=126, OrAssign=127, LeftShiftAssign=128, RightShiftAssign=129, 
		Equal=130, NotEqual=131, LessEqual=132, GreaterEqual=133, AndAnd=134, 
		OrOr=135, PlusPlus=136, MinusMinus=137, Comma=138, Question=139, Colon=140, 
		Doublecolon=141, Semi=142, Dot=143, Ellipsis=144, Underscore=145, Power=146, 
		Hashtag=147, Arrow=148, NullLiteral=149, Quotation=150, Div_=151, LBRACE_LBRACE=152, 
		RBRACE_RBRACE=153, QuestionDot=154, H1=155, H2=156, H3=157, H4=158, IMG_=159, 
		P=160, Click=161, Button=162, Display=163, Flex_Direction=164, Gap=165, 
		Padding=166, Box_Size=167, Flex=168, Border=169, Text_Align=170, Max_With=171, 
		Height=172, Cursor=173, Transition=174, Pointer=175, Center=176, Solid=177, 
		Background_Color=178, Margin=179, Row=180, Column=181, Border_Box=182, 
		DecimalLiteral_UNIT=183, STRING=184, QUOTED_STRING=185, HEXCHAR=186, String_DecimalLiteral=187, 
		DecimalLiteral=188, HexIntegerLiteral=189, At=190, Identifier=191, EVENT_BINDING=192, 
		StringLiteral=193, HTML_COMMENT=194, HTML_CONDITIONAL_COMMENT=195, XML=196, 
		DTD=197, SCRIPT_OPEN=198, STYLE_OPEN=199, TAG_OPEN_1=200, TAG_SLASH=201, 
		TAG_EQUALS=202, TAG_NAME=203, TEXT=204, TAG_WHITESPACE=205, SCRIPT_BODY=206, 
		SCRIPT_SHORT_BODY=207, STYLE_BODY=208, STYLE_SHORT_BODY=209, ATTRIBUT=210, 
		CLASS_SELECTOR=211, ID_SELECTOR=212, UNIT=213;
	public static final int
		RULE_program = 0, RULE_sourceElements = 1, RULE_statement = 2, RULE_importStatement = 3, 
		RULE_importFromBlock = 4, RULE_importDefault = 5, RULE_importFrom = 6, 
		RULE_importNamespace = 7, RULE_commaReservedWord = 8, RULE_interfaceStatement = 9, 
		RULE_interfaceAttributes = 10, RULE_propertyDeclaration = 11, RULE_componentStatement = 12, 
		RULE_componentOptions = 13, RULE_componentOption = 14, RULE_optionselector = 15, 
		RULE_optionimports = 16, RULE_importsProperties = 17, RULE_reservedWordAndComma = 18, 
		RULE_optiontemplateUrl = 19, RULE_urlStatement = 20, RULE_optionstyleUrls = 21, 
		RULE_exportStatement = 22, RULE_classBody = 23, RULE_propertyList = 24, 
		RULE_bodyList = 25, RULE_bodyListinner = 26, RULE_propertyDeclarationCom = 27, 
		RULE_methodDeclaration = 28, RULE_parameterList = 29, RULE_parameterComma = 30, 
		RULE_parameter = 31, RULE_methodBody = 32, RULE_statementMethod = 33, 
		RULE_declarationString = 34, RULE_declarationName = 35, RULE_htmlElements = 36, 
		RULE_htmlElement = 37, RULE_htmlTagNameStart = 38, RULE_htmlTagNameEnd = 39, 
		RULE_htmlElementContent = 40, RULE_contentHtml = 41, RULE_htmlImgAttribute = 42, 
		RULE_elements = 43, RULE_htmlBrace = 44, RULE_htmlAttributes = 45, RULE_cssElement = 46, 
		RULE_selector = 47, RULE_selectorInternal = 48, RULE_cssProperty = 49, 
		RULE_css = 50, RULE_cssValue = 51, RULE_decimalLiteral_UNIT = 52, RULE_decimalLiteralUnit = 53, 
		RULE_decimalLiteral = 54, RULE_tagName = 55, RULE_htmlKeyword = 56, RULE_identifier = 57, 
		RULE_type = 58, RULE_reservedWord = 59, RULE_stringLiteral = 60, RULE_keyword = 61, 
		RULE_eos = 62;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElements", "statement", "importStatement", "importFromBlock", 
			"importDefault", "importFrom", "importNamespace", "commaReservedWord", 
			"interfaceStatement", "interfaceAttributes", "propertyDeclaration", "componentStatement", 
			"componentOptions", "componentOption", "optionselector", "optionimports", 
			"importsProperties", "reservedWordAndComma", "optiontemplateUrl", "urlStatement", 
			"optionstyleUrls", "exportStatement", "classBody", "propertyList", "bodyList", 
			"bodyListinner", "propertyDeclarationCom", "methodDeclaration", "parameterList", 
			"parameterComma", "parameter", "methodBody", "statementMethod", "declarationString", 
			"declarationName", "htmlElements", "htmlElement", "htmlTagNameStart", 
			"htmlTagNameEnd", "htmlElementContent", "contentHtml", "htmlImgAttribute", 
			"elements", "htmlBrace", "htmlAttributes", "cssElement", "selector", 
			"selectorInternal", "cssProperty", "css", "cssValue", "decimalLiteral_UNIT", 
			"decimalLiteralUnit", "decimalLiteral", "tagName", "htmlKeyword", "identifier", 
			"type", "reservedWord", "stringLiteral", "keyword", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'import'", "'export'", "'from'", "'out'", 
			"'property'", "'ensure'", "'ensureAlways'", "'check'", "'mixin'", "'extends'", 
			"'super'", "'implements'", "'let'", "'Component'", "'CommonModule'", 
			"'RouterOutlet'", "'OnInit'", "'Input'", "'interface'", "'ngIf'", "'ngFor'", 
			"'src'", "'alt'", "'selector'", "'imports'", "'templateUrl'", "'styleUrls'", 
			"'standalone'", "'FormsModule'", "'styleUrl'", "'int'", "'float'", "'double'", 
			"'bool'", "'new'", "'var'", "'string'", "'Array'", "'auto'", "'break'", 
			"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'else'", "'enum'", "'false'", "'final'", "'for'", "'goto'", 
			"'if'", "'namespace'", "'nullptr'", "'operator'", "'override'", "'private'", 
			"'protected'", "'public'", "'static'", "'package'", "'return'", "'short'", 
			"'struct'", "'switch'", "'this'", "'true'", "'virtual'", "'void'", "'while'", 
			"'function'", "'with'", "'throw'", "'any'", "'in'", "'try'", "'as'", 
			"'number'", "'unique'", "'symbol'", "'undefined'", "'object'", "'constructor'", 
			"'abstract'", "'require'", "'module'", "'declare'", "'angular'", "'common'", 
			"'core'", "'router'", "'SomeClass'", "'angularCore'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'+'", "'-'", "'*'", null, "'%'", null, "'&'", "'|'", 
			"'~'", "'!'", null, "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'^='", "'&='", "'|='", "'<<='", "'>>='", "'=='", "'!='", "'<='", "'>='", 
			"'&&'", "'||'", "'++'", "'--'", "','", "'?'", "':'", "'::'", "';'", "'.'", 
			"'...'", "'_'", "'**'", "'#'", "'=>'", "'null'", "'''", "'div'", "'{{'", 
			"'}}'", "'?.'", "'h1'", "'h2'", "'h3'", "'h4'", "'img'", "'p'", "'(click)'", 
			"'button'", "'display'", "'flex-direction'", "'gap'", "'padding'", "'box-sizing'", 
			"'flex'", "'border'", "'text-align'", "'max-width'", "'height'", "'cursor'", 
			"'transition'", "'pointer'", "'center'", "'solid'", "'background-color'", 
			"'margin'", "'row'", "'column'", "'border-box'", null, null, null, null, 
			null, null, null, "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MultiLineComment", "SingleLineComment", "WS", "NEWLINE", "Import", 
			"Export", "From", "Out", "Property", "Ensure", "EnsureAlways", "Check", 
			"Mixin", "Extends", "Super", "Implements", "Let", "Component", "CommonModule", 
			"RouterOutlet", "OnInit", "Input", "Interface", "NGIF", "NGFOR", "SRC", 
			"ALT", "Selector", "Imports", "TemplateUrl", "StyleUrls", "Standalone", 
			"FormsModule", "StyleUrl", "Int", "Float", "Double", "Bool", "New", "Var", 
			"String", "Array", "Auto", "Break", "Case", "Catch", "Char", "Class", 
			"Const", "Continue", "Default", "Do", "Else", "Enum", "False_", "Final", 
			"For", "Goto", "If", "Namespace", "Nullptr", "Operator", "Override", 
			"Private", "Protected", "Public", "Static", "Package", "Return", "Short", 
			"Struct", "Switch", "This", "True_", "Virtual", "Void", "While", "Function_", 
			"With", "Throw", "Any", "In", "Try", "As", "Number", "Unique", "Symbol", 
			"Undefined", "Object", "Constructor", "Abstract", "Require", "Module", 
			"Declare", "Angular", "Common", "Core", "Router", "SomeClass", "AngularCore", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Xor", "And", "Or", 
			"Tilde", "Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", 
			"StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", 
			"LeftShiftAssign", "RightShiftAssign", "Equal", "NotEqual", "LessEqual", 
			"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", 
			"Question", "Colon", "Doublecolon", "Semi", "Dot", "Ellipsis", "Underscore", 
			"Power", "Hashtag", "Arrow", "NullLiteral", "Quotation", "Div_", "LBRACE_LBRACE", 
			"RBRACE_RBRACE", "QuestionDot", "H1", "H2", "H3", "H4", "IMG_", "P", 
			"Click", "Button", "Display", "Flex_Direction", "Gap", "Padding", "Box_Size", 
			"Flex", "Border", "Text_Align", "Max_With", "Height", "Cursor", "Transition", 
			"Pointer", "Center", "Solid", "Background_Color", "Margin", "Row", "Column", 
			"Border_Box", "DecimalLiteral_UNIT", "STRING", "QUOTED_STRING", "HEXCHAR", 
			"String_DecimalLiteral", "DecimalLiteral", "HexIntegerLiteral", "At", 
			"Identifier", "EVENT_BINDING", "StringLiteral", "HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", 
			"XML", "DTD", "SCRIPT_OPEN", "STYLE_OPEN", "TAG_OPEN_1", "TAG_SLASH", 
			"TAG_EQUALS", "TAG_NAME", "TEXT", "TAG_WHITESPACE", "SCRIPT_BODY", "SCRIPT_SHORT_BODY", 
			"STYLE_BODY", "STYLE_SHORT_BODY", "ATTRIBUT", "CLASS_SELECTOR", "ID_SELECTOR", 
			"UNIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8388704L) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 216102696837455873L) != 0) || _la==STRING || _la==At) {
				{
				setState(126);
				sourceElements();
				}
			}

			setState(129);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SourceElementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSourceElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSourceElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSourceElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				statement();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8388704L) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 216102696837455873L) != 0) || _la==STRING || _la==At );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlStatementLabelContext extends StatementContext {
		public HtmlElementsContext htmlElements() {
			return getRuleContext(HtmlElementsContext.class,0);
		}
		public HtmlStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementLabelContext extends StatementContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ExportStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStatementLabelContext extends StatementContext {
		public ComponentStatementContext componentStatement() {
			return getRuleContext(ComponentStatementContext.class,0);
		}
		public ComponentStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStatementLabelContext extends StatementContext {
		public CssElementContext cssElement() {
			return getRuleContext(CssElementContext.class,0);
		}
		public CssStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementLabelContext extends StatementContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ImportStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceStatementLabelContext extends StatementContext {
		public InterfaceStatementContext interfaceStatement() {
			return getRuleContext(InterfaceStatementContext.class,0);
		}
		public InterfaceStatementLabelContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceStatementLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceStatementLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				importStatement();
				}
				break;
			case Interface:
				_localctx = new InterfaceStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				interfaceStatement();
				}
				break;
			case At:
				_localctx = new ComponentStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				componentStatement();
				}
				break;
			case Export:
				_localctx = new ExportStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				exportStatement();
				}
				break;
			case Less:
				_localctx = new HtmlStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				htmlElements();
				}
				break;
			case LeftBrace:
			case Comma:
			case Dot:
			case Div_:
			case LBRACE_LBRACE:
			case RBRACE_RBRACE:
			case QuestionDot:
			case H1:
			case H2:
			case H3:
			case H4:
			case IMG_:
			case P:
			case Button:
			case STRING:
				_localctx = new CssStatementLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				cssElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public ImportFromBlockContext importFromBlock() {
			return getRuleContext(ImportFromBlockContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Import);
			setState(145);
			importFromBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromBlockContext extends ParserRuleContext {
		public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromBlock; }
	 
		public ImportFromBlockContext() { }
		public void copyFrom(ImportFromBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultImportContext extends ImportFromBlockContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportDefaultContext importDefault() {
			return getRuleContext(ImportDefaultContext.class,0);
		}
		public DefaultImportContext(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDefaultImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDefaultImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDefaultImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassImportContext extends ImportFromBlockContext {
		public TerminalNode SomeClass() { return getToken(AngularParser.SomeClass, 0); }
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public ClassImportContext(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceImportContext extends ImportFromBlockContext {
		public TerminalNode Star() { return getToken(AngularParser.Star, 0); }
		public TerminalNode As() { return getToken(AngularParser.As, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public NamespaceImportContext(ImportFromBlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNamespaceImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNamespaceImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNamespaceImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromBlockContext importFromBlock() throws RecognitionException {
		ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importFromBlock);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case From:
			case LeftBrace:
			case StringLiteral:
				_localctx = new DefaultImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBrace) {
					{
					setState(147);
					importDefault();
					}
				}

				setState(150);
				importFrom();
				setState(151);
				eos();
				}
				break;
			case SomeClass:
				_localctx = new ClassImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(SomeClass);
				setState(154);
				importFrom();
				}
				break;
			case Star:
				_localctx = new NamespaceImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(Star);
				setState(156);
				match(As);
				setState(157);
				reservedWord();
				setState(158);
				importFrom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultContext importDefault() throws RecognitionException {
		ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LeftBrace);
			setState(163);
			importNamespace();
			setState(164);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importFrom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==From) {
				{
				setState(166);
				match(From);
				}
			}

			setState(169);
			stringLiteral();
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(170);
				eos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamespaceContext extends ParserRuleContext {
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public List<CommaReservedWordContext> commaReservedWord() {
			return getRuleContexts(CommaReservedWordContext.class);
		}
		public CommaReservedWordContext commaReservedWord(int i) {
			return getRuleContext(CommaReservedWordContext.class,i);
		}
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			reservedWord();
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(174);
				commaReservedWord();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommaReservedWordContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public CommaReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commaReservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCommaReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCommaReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCommaReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaReservedWordContext commaReservedWord() throws RecognitionException {
		CommaReservedWordContext _localctx = new CommaReservedWordContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commaReservedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Comma);
			setState(181);
			reservedWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceStatementContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public InterfaceAttributesContext interfaceAttributes() {
			return getRuleContext(InterfaceAttributesContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public InterfaceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceStatementContext interfaceStatement() throws RecognitionException {
		InterfaceStatementContext _localctx = new InterfaceStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interfaceStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(Interface);
			setState(184);
			declarationName();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 738362190234533984L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9113L) != 0) || _la==NullLiteral) {
				{
				setState(185);
				keyword();
				setState(186);
				declarationName();
				}
			}

			setState(190);
			interfaceAttributes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceAttributesContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public InterfaceAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceAttributesContext interfaceAttributes() throws RecognitionException {
		InterfaceAttributesContext _localctx = new InterfaceAttributesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(LeftBrace);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(193);
				propertyDeclaration();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
	 
		public PropertyDeclarationContext() { }
		public void copyFrom(PropertyDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodPropertyContext extends PropertyDeclarationContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public MethodPropertyContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributesPropertyContext extends PropertyDeclarationContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public AttributesPropertyContext(PropertyDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributesProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributesProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributesProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_propertyDeclaration);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new AttributesPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				declarationName();
				setState(202);
				match(Colon);
				setState(203);
				type();
				setState(204);
				eos();
				}
				break;
			case 2:
				_localctx = new MethodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				declarationName();
				setState(207);
				match(LeftParen);
				setState(208);
				match(RightParen);
				setState(209);
				match(Colon);
				setState(210);
				type();
				setState(211);
				eos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStatementContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(AngularParser.At, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public ComponentOptionsContext componentOptions() {
			return getRuleContext(ComponentOptionsContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public ComponentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentStatementContext componentStatement() throws RecognitionException {
		ComponentStatementContext _localctx = new ComponentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_componentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(At);
			setState(216);
			reservedWord();
			setState(217);
			match(LeftParen);
			setState(218);
			componentOptions();
			setState(219);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentOptionsContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<ComponentOptionContext> componentOption() {
			return getRuleContexts(ComponentOptionContext.class);
		}
		public ComponentOptionContext componentOption(int i) {
			return getRuleContext(ComponentOptionContext.class,i);
		}
		public ComponentOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentOptionsContext componentOptions() throws RecognitionException {
		ComponentOptionsContext _localctx = new ComponentOptionsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_componentOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LeftBrace);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25501368320L) != 0)) {
				{
				{
				setState(222);
				componentOption();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentOptionContext extends ParserRuleContext {
		public ComponentOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentOption; }
	 
		public ComponentOptionContext() { }
		public void copyFrom(ComponentOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionSelectorLabelContext extends ComponentOptionContext {
		public OptionselectorContext optionselector() {
			return getRuleContext(OptionselectorContext.class,0);
		}
		public OptionSelectorLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionSelectorLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionSelectorLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionSelectorLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionStandaloneLabelContext extends ComponentOptionContext {
		public TerminalNode Standalone() { return getToken(AngularParser.Standalone, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public OptionStandaloneLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionStandaloneLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionStandaloneLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionStandaloneLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionStylesLabelContext extends ComponentOptionContext {
		public OptionstyleUrlsContext optionstyleUrls() {
			return getRuleContext(OptionstyleUrlsContext.class,0);
		}
		public OptionStylesLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionStylesLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionStylesLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionStylesLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionTemplateLabelContext extends ComponentOptionContext {
		public OptiontemplateUrlContext optiontemplateUrl() {
			return getRuleContext(OptiontemplateUrlContext.class,0);
		}
		public OptionTemplateLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionTemplateLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionTemplateLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionTemplateLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OptionImportsLabelContext extends ComponentOptionContext {
		public OptionimportsContext optionimports() {
			return getRuleContext(OptionimportsContext.class,0);
		}
		public OptionImportsLabelContext(ComponentOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionImportsLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionImportsLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionImportsLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentOptionContext componentOption() throws RecognitionException {
		ComponentOptionContext _localctx = new ComponentOptionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_componentOption);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Selector:
				_localctx = new OptionSelectorLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				optionselector();
				}
				break;
			case Imports:
				_localctx = new OptionImportsLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				optionimports();
				}
				break;
			case TemplateUrl:
			case StyleUrl:
				_localctx = new OptionTemplateLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				optiontemplateUrl();
				}
				break;
			case StyleUrls:
				_localctx = new OptionStylesLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				optionstyleUrls();
				}
				break;
			case Standalone:
				_localctx = new OptionStandaloneLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				match(Standalone);
				setState(235);
				match(Colon);
				setState(236);
				identifier();
				setState(237);
				match(Comma);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionselectorContext extends ParserRuleContext {
		public TerminalNode Selector() { return getToken(AngularParser.Selector, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public OptionselectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionselector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionselector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionselector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionselector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionselectorContext optionselector() throws RecognitionException {
		OptionselectorContext _localctx = new OptionselectorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_optionselector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(Selector);
			setState(242);
			match(Colon);
			setState(243);
			stringLiteral();
			setState(244);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionimportsContext extends ParserRuleContext {
		public TerminalNode Imports() { return getToken(AngularParser.Imports, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public ImportsPropertiesContext importsProperties() {
			return getRuleContext(ImportsPropertiesContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public OptionimportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionimports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionimports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionimports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionimports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionimportsContext optionimports() throws RecognitionException {
		OptionimportsContext _localctx = new OptionimportsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_optionimports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(Imports);
			setState(247);
			match(Colon);
			setState(248);
			importsProperties();
			setState(249);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportsPropertiesContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public List<ReservedWordAndCommaContext> reservedWordAndComma() {
			return getRuleContexts(ReservedWordAndCommaContext.class);
		}
		public ReservedWordAndCommaContext reservedWordAndComma(int i) {
			return getRuleContext(ReservedWordAndCommaContext.class,i);
		}
		public ImportsPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportsPropertiesContext importsProperties() throws RecognitionException {
		ImportsPropertiesContext _localctx = new ImportsPropertiesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_importsProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LeftBracket);
			setState(252);
			reservedWord();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(253);
				reservedWordAndComma();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedWordAndCommaContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public ReservedWordAndCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWordAndComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReservedWordAndComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReservedWordAndComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReservedWordAndComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordAndCommaContext reservedWordAndComma() throws RecognitionException {
		ReservedWordAndCommaContext _localctx = new ReservedWordAndCommaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_reservedWordAndComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(Comma);
			setState(262);
			reservedWord();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptiontemplateUrlContext extends ParserRuleContext {
		public UrlStatementContext urlStatement() {
			return getRuleContext(UrlStatementContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public OptiontemplateUrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optiontemplateUrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptiontemplateUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptiontemplateUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptiontemplateUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptiontemplateUrlContext optiontemplateUrl() throws RecognitionException {
		OptiontemplateUrlContext _localctx = new OptiontemplateUrlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_optiontemplateUrl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			urlStatement();
			setState(265);
			match(Colon);
			setState(266);
			stringLiteral();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(267);
				match(Comma);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UrlStatementContext extends ParserRuleContext {
		public TerminalNode TemplateUrl() { return getToken(AngularParser.TemplateUrl, 0); }
		public TerminalNode StyleUrl() { return getToken(AngularParser.StyleUrl, 0); }
		public UrlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUrlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUrlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUrlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlStatementContext urlStatement() throws RecognitionException {
		UrlStatementContext _localctx = new UrlStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_urlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==TemplateUrl || _la==StyleUrl) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionstyleUrlsContext extends ParserRuleContext {
		public TerminalNode StyleUrls() { return getToken(AngularParser.StyleUrls, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public OptionstyleUrlsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionstyleUrls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOptionstyleUrls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOptionstyleUrls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOptionstyleUrls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionstyleUrlsContext optionstyleUrls() throws RecognitionException {
		OptionstyleUrlsContext _localctx = new OptionstyleUrlsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_optionstyleUrls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(StyleUrls);
			setState(273);
			match(Colon);
			setState(274);
			match(LeftBracket);
			setState(275);
			stringLiteral();
			setState(276);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<ClassBodyContext> classBody() {
			return getRuleContexts(ClassBodyContext.class);
		}
		public ClassBodyContext classBody(int i) {
			return getRuleContext(ClassBodyContext.class,i);
		}
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(Export);
			setState(279);
			keyword();
			setState(280);
			declarationName();
			setState(281);
			match(LeftBrace);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(282);
				classBody();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
	 
		public ClassBodyContext() { }
		public void copyFrom(ClassBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyStringContext extends ClassBodyContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public PropertyStringContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullClassBodyContext extends ClassBodyContext {
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public PropertyDeclarationComContext propertyDeclarationCom() {
			return getRuleContext(PropertyDeclarationComContext.class,0);
		}
		public FullClassBodyContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFullClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFullClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFullClassBody(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodOnlyContext extends ClassBodyContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public MethodOnlyContext(ClassBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_classBody);
		try {
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new FullClassBodyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				propertyList();
				setState(292);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(291);
					propertyDeclarationCom();
					}
					break;
				}
				setState(294);
				methodDeclaration();
				}
				break;
			case 2:
				_localctx = new PropertyStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				declarationName();
				setState(297);
				match(Colon);
				setState(298);
				type();
				setState(299);
				match(Assign);
				setState(300);
				stringLiteral();
				setState(301);
				eos();
				}
				break;
			case 3:
				_localctx = new MethodOnlyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				methodDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyListContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public List<TerminalNode> LeftBracket() { return getTokens(AngularParser.LeftBracket); }
		public TerminalNode LeftBracket(int i) {
			return getToken(AngularParser.LeftBracket, i);
		}
		public List<TerminalNode> RightBracket() { return getTokens(AngularParser.RightBracket); }
		public TerminalNode RightBracket(int i) {
			return getToken(AngularParser.RightBracket, i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<BodyListContext> bodyList() {
			return getRuleContexts(BodyListContext.class);
		}
		public BodyListContext bodyList(int i) {
			return getRuleContext(BodyListContext.class,i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			declarationName();
			setState(307);
			match(Colon);
			setState(308);
			match(STRING);
			setState(309);
			match(LeftBracket);
			setState(310);
			match(RightBracket);
			setState(311);
			match(Assign);
			setState(312);
			match(LeftBracket);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftBrace) {
				{
				{
				setState(313);
				bodyList();
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			match(RightBracket);
			setState(320);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyListContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public List<BodyListinnerContext> bodyListinner() {
			return getRuleContexts(BodyListinnerContext.class);
		}
		public BodyListinnerContext bodyListinner(int i) {
			return getRuleContext(BodyListinnerContext.class,i);
		}
		public BodyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBodyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBodyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBodyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyListContext bodyList() throws RecognitionException {
		BodyListContext _localctx = new BodyListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bodyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(LeftBrace);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(323);
				bodyListinner();
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(RightBrace);
			setState(330);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyListinnerContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public BodyListinnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyListinner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBodyListinner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBodyListinner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBodyListinner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyListinnerContext bodyListinner() throws RecognitionException {
		BodyListinnerContext _localctx = new BodyListinnerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bodyListinner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			declarationName();
			setState(333);
			match(Colon);
			setState(334);
			stringLiteral();
			setState(335);
			match(Comma);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationComContext extends ParserRuleContext {
		public List<DeclarationNameContext> declarationName() {
			return getRuleContexts(DeclarationNameContext.class);
		}
		public DeclarationNameContext declarationName(int i) {
			return getRuleContext(DeclarationNameContext.class,i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public PropertyDeclarationComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclarationCom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyDeclarationCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyDeclarationCom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyDeclarationCom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationComContext propertyDeclarationCom() throws RecognitionException {
		PropertyDeclarationComContext _localctx = new PropertyDeclarationComContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_propertyDeclarationCom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			declarationName();
			setState(338);
			match(Colon);
			setState(339);
			declarationName();
			setState(340);
			identifier();
			setState(341);
			keyword();
			setState(342);
			match(Assign);
			setState(343);
			keyword();
			setState(344);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(AngularParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(AngularParser.RightParen, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			declarationName();
			setState(347);
			match(LeftParen);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(348);
				parameterList();
				}
			}

			setState(351);
			match(RightParen);
			setState(352);
			methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<ParameterCommaContext> parameterComma() {
			return getRuleContexts(ParameterCommaContext.class);
		}
		public ParameterCommaContext parameterComma(int i) {
			return getRuleContext(ParameterCommaContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			parameter();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(355);
				parameterComma();
				}
				}
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterCommaContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ParameterCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterCommaContext parameterComma() throws RecognitionException {
		ParameterCommaContext _localctx = new ParameterCommaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameterComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(Comma);
			setState(362);
			parameter();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public DeclarationStringContext declarationString() {
			return getRuleContext(DeclarationStringContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			declarationName();
			setState(365);
			match(Colon);
			setState(366);
			declarationString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodBodyContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<StatementMethodContext> statementMethod() {
			return getRuleContexts(StatementMethodContext.class);
		}
		public StatementMethodContext statementMethod(int i) {
			return getRuleContext(StatementMethodContext.class,i);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_methodBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(LeftBrace);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 738362190234533984L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9113L) != 0) || _la==NullLiteral) {
				{
				{
				setState(369);
				statementMethod();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementMethodContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public DeclarationStringContext declarationString() {
			return getRuleContext(DeclarationStringContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public StatementMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatementMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatementMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatementMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodContext statementMethod() throws RecognitionException {
		StatementMethodContext _localctx = new StatementMethodContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statementMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			keyword();
			setState(378);
			match(Dot);
			setState(379);
			declarationName();
			setState(380);
			match(Assign);
			setState(381);
			declarationString();
			setState(382);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationStringContext extends ParserRuleContext {
		public DeclarationStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationString; }
	 
		public DeclarationStringContext() { }
		public void copyFrom(DeclarationStringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterTypedContext extends DeclarationStringContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterTypedContext(DeclarationStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterTyped(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterTyped(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterTyped(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends DeclarationStringContext {
		public DeclarationNameContext declarationName() {
			return getRuleContext(DeclarationNameContext.class,0);
		}
		public DeclarationContext(DeclarationStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralLabelContext extends DeclarationStringContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public StringLiteralLabelContext(DeclarationStringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteralLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteralLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteralLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStringContext declarationString() throws RecognitionException {
		DeclarationStringContext _localctx = new DeclarationStringContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declarationString);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Float:
			case Double:
			case Bool:
			case Var:
			case String:
			case Array:
			case Number:
				_localctx = new ParameterTypedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				type();
				}
				break;
			case STRING:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				declarationName();
				}
				break;
			case StringLiteral:
				_localctx = new StringLiteralLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public DeclarationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclarationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclarationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclarationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationNameContext declarationName() throws RecognitionException {
		DeclarationNameContext _localctx = new DeclarationNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_declarationName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_htmlElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			htmlElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public List<HtmlTagNameStartContext> htmlTagNameStart() {
			return getRuleContexts(HtmlTagNameStartContext.class);
		}
		public HtmlTagNameStartContext htmlTagNameStart(int i) {
			return getRuleContext(HtmlTagNameStartContext.class,i);
		}
		public List<HtmlElementContentContext> htmlElementContent() {
			return getRuleContexts(HtmlElementContentContext.class);
		}
		public HtmlElementContentContext htmlElementContent(int i) {
			return getRuleContext(HtmlElementContentContext.class,i);
		}
		public List<HtmlTagNameEndContext> htmlTagNameEnd() {
			return getRuleContexts(HtmlTagNameEndContext.class);
		}
		public HtmlTagNameEndContext htmlTagNameEnd(int i) {
			return getRuleContext(HtmlTagNameEndContext.class,i);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_htmlElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(394); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(393);
					htmlTagNameStart();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(396); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					htmlElementContent();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(405); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(404);
					htmlTagNameEnd();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(407); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagNameStartContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlTagNameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagNameStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTagNameStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTagNameStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTagNameStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameStartContext htmlTagNameStart() throws RecognitionException {
		HtmlTagNameStartContext _localctx = new HtmlTagNameStartContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_htmlTagNameStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(Less);
			setState(410);
			tagName();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 738362190234533984L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9113L) != 0) || _la==NullLiteral) {
				{
				setState(411);
				keyword();
				setState(412);
				match(Assign);
				setState(413);
				stringLiteral();
				}
			}

			setState(417);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagNameEndContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlTagNameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagNameEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTagNameEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTagNameEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTagNameEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagNameEndContext htmlTagNameEnd() throws RecognitionException {
		HtmlTagNameEndContext _localctx = new HtmlTagNameEndContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_htmlTagNameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(Less);
			setState(420);
			match(Div);
			setState(421);
			tagName();
			setState(422);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContentContext extends ParserRuleContext {
		public HtmlElementContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElementContent; }
	 
		public HtmlElementContentContext() { }
		public void copyFrom(HtmlElementContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedHtmlContext extends HtmlElementContentContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public NestedHtmlContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNestedHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNestedHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNestedHtml(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentManyContext extends HtmlElementContentContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public List<ContentHtmlContext> contentHtml() {
			return getRuleContexts(ContentHtmlContext.class);
		}
		public ContentHtmlContext contentHtml(int i) {
			return getRuleContext(ContentHtmlContext.class,i);
		}
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlContentManyContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContentMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContentMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContentMany(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentBraceContext extends HtmlElementContentContext {
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public ContentHtmlContext contentHtml() {
			return getRuleContext(ContentHtmlContext.class,0);
		}
		public HtmlBraceContext htmlBrace() {
			return getRuleContext(HtmlBraceContext.class,0);
		}
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlContentBraceContext(HtmlElementContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlContentBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlContentBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlContentBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContentContext htmlElementContent() throws RecognitionException {
		HtmlElementContentContext _localctx = new HtmlElementContentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_htmlElementContent);
		try {
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new NestedHtmlContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(Less);
				setState(425);
				tagName();
				setState(426);
				elements();
				setState(427);
				tagName();
				setState(428);
				match(Greater);
				}
				break;
			case 2:
				_localctx = new HtmlContentManyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(Less);
				setState(431);
				tagName();
				setState(432);
				contentHtml();
				setState(433);
				contentHtml();
				setState(434);
				contentHtml();
				setState(435);
				contentHtml();
				setState(436);
				match(Div);
				setState(437);
				match(Greater);
				}
				break;
			case 3:
				_localctx = new HtmlContentBraceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				match(Less);
				setState(440);
				tagName();
				setState(441);
				contentHtml();
				setState(442);
				htmlBrace();
				setState(443);
				match(Greater);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentHtmlContext extends ParserRuleContext {
		public ContentHtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentHtml; }
	 
		public ContentHtmlContext() { }
		public void copyFrom(ContentHtmlContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttribute3Context extends ContentHtmlContext {
		public HtmlKeywordContext htmlKeyword() {
			return getRuleContext(HtmlKeywordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlImgAttribute3Context(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute3(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttribute2Context extends ContentHtmlContext {
		public TerminalNode LeftBracket() { return getToken(AngularParser.LeftBracket, 0); }
		public HtmlKeywordContext htmlKeyword() {
			return getRuleContext(HtmlKeywordContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(AngularParser.RightBracket, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlImgAttribute2Context(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute2(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttribute1Context extends ContentHtmlContext {
		public List<HtmlImgAttributeContext> htmlImgAttribute() {
			return getRuleContexts(HtmlImgAttributeContext.class);
		}
		public HtmlImgAttributeContext htmlImgAttribute(int i) {
			return getRuleContext(HtmlImgAttributeContext.class,i);
		}
		public HtmlImgAttribute1Context(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute1(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexHtmlAttrContext extends ContentHtmlContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public List<TerminalNode> Assign() { return getTokens(AngularParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(AngularParser.Assign, i);
		}
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode Star() { return getToken(AngularParser.Star, 0); }
		public HtmlKeywordContext htmlKeyword() {
			return getRuleContext(HtmlKeywordContext.class,0);
		}
		public ComplexHtmlAttrContext(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComplexHtmlAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComplexHtmlAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComplexHtmlAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttribute4Context extends ContentHtmlContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlImgAttribute4Context(ContentHtmlContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentHtmlContext contentHtml() throws RecognitionException {
		ContentHtmlContext _localctx = new ContentHtmlContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_contentHtml);
		try {
			int _alt;
			setState(475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new HtmlImgAttribute1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(447);
						htmlImgAttribute();
						}
						} 
					}
					setState(452);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new HtmlImgAttribute2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(453);
				match(LeftBracket);
				setState(454);
				htmlKeyword();
				setState(455);
				match(RightBracket);
				setState(456);
				match(Assign);
				setState(457);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new HtmlImgAttribute3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(459);
				htmlKeyword();
				setState(460);
				match(Assign);
				setState(461);
				stringLiteral();
				}
				break;
			case 4:
				_localctx = new HtmlImgAttribute4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				keyword();
				setState(464);
				match(Assign);
				setState(465);
				stringLiteral();
				}
				break;
			case 5:
				_localctx = new ComplexHtmlAttrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				keyword();
				setState(468);
				match(Assign);
				setState(469);
				stringLiteral();
				setState(470);
				match(Star);
				setState(471);
				htmlKeyword();
				setState(472);
				match(Assign);
				setState(473);
				stringLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlImgAttributeContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(AngularParser.Star, 0); }
		public HtmlKeywordContext htmlKeyword() {
			return getRuleContext(HtmlKeywordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlImgAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlImgAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlImgAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlImgAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlImgAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlImgAttributeContext htmlImgAttribute() throws RecognitionException {
		HtmlImgAttributeContext _localctx = new HtmlImgAttributeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_htmlImgAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(Star);
			setState(478);
			htmlKeyword();
			setState(479);
			match(Assign);
			setState(480);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementsContext extends ParserRuleContext {
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
	 
		public ElementsContext() { }
		public void copyFrom(ElementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReservedBlockContext extends ElementsContext {
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public ReservedBlockContext(ElementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReservedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReservedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReservedBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttrSetContext extends ElementsContext {
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public HtmlAttributesContext htmlAttributes() {
			return getRuleContext(HtmlAttributesContext.class,0);
		}
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TerminalNode Div() { return getToken(AngularParser.Div, 0); }
		public HtmlAttrSetContext(ElementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttrSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttrSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttrSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_elements);
		int _la;
		try {
			setState(500);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Greater:
				_localctx = new HtmlAttrSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				match(Greater);
				setState(483);
				htmlAttributes();
				setState(484);
				match(Less);
				setState(485);
				match(Div);
				}
				break;
			case Component:
			case CommonModule:
			case RouterOutlet:
			case OnInit:
			case Input:
			case Angular:
			case AngularCore:
			case Click:
				_localctx = new ReservedBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				reservedWord();
				setState(488);
				match(Assign);
				setState(489);
				stringLiteral();
				setState(490);
				identifier();
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(491);
					match(STRING);
					}
					}
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(497);
				identifier();
				setState(498);
				match(Div);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlBraceContext extends ParserRuleContext {
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public HtmlBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlBraceContext htmlBrace() throws RecognitionException {
		HtmlBraceContext _localctx = new HtmlBraceContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_htmlBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			reservedWord();
			setState(503);
			match(Assign);
			setState(504);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributesContext extends ParserRuleContext {
		public List<TagNameContext> tagName() {
			return getRuleContexts(TagNameContext.class);
		}
		public TagNameContext tagName(int i) {
			return getRuleContext(TagNameContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(AngularParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AngularParser.STRING, i);
		}
		public HtmlAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributesContext htmlAttributes() throws RecognitionException {
		HtmlAttributesContext _localctx = new HtmlAttributesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_htmlAttributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			tagName();
			setState(507);
			match(STRING);
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(508);
				tagName();
				setState(509);
				match(STRING);
				}
				break;
			}
			setState(513);
			tagName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssElementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(AngularParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(AngularParser.RightBrace, 0); }
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode Comma() { return getToken(AngularParser.Comma, 0); }
		public TerminalNode H4() { return getToken(AngularParser.H4, 0); }
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<CssPropertyContext> cssProperty() {
			return getRuleContexts(CssPropertyContext.class);
		}
		public CssPropertyContext cssProperty(int i) {
			return getRuleContext(CssPropertyContext.class,i);
		}
		public CssElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssElementContext cssElement() throws RecognitionException {
		CssElementContext _localctx = new CssElementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_cssElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					match(Dot);
					}
					} 
				}
				setState(520);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(521);
				tagName();
				}
				break;
			}
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(524);
				match(Comma);
				}
			}

			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==H4) {
				{
				setState(527);
				match(H4);
				}
			}

			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(530);
				selector();
				}
				}
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(536);
			match(LeftBrace);
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 102399L) != 0)) {
				{
				{
				setState(537);
				cssProperty();
				}
				}
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(543);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode IMG_() { return getToken(AngularParser.IMG_, 0); }
		public List<SelectorInternalContext> selectorInternal() {
			return getRuleContexts(SelectorInternalContext.class);
		}
		public SelectorInternalContext selectorInternal(int i) {
			return getRuleContext(SelectorInternalContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selector);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(STRING);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMG_) {
				{
				setState(546);
				match(IMG_);
				}
			}

			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					selectorInternal();
					}
					} 
				}
				setState(554);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorInternalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public SelectorInternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorInternal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorInternal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorInternal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorInternal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorInternalContext selectorInternal() throws RecognitionException {
		SelectorInternalContext _localctx = new SelectorInternalContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_selectorInternal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(555);
				match(Colon);
				}
			}

			setState(558);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssPropertyContext extends ParserRuleContext {
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cssProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			css();
			setState(561);
			match(Colon);
			setState(562);
			cssValue();
			setState(563);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssContext extends ParserRuleContext {
		public TerminalNode Display() { return getToken(AngularParser.Display, 0); }
		public TerminalNode Flex_Direction() { return getToken(AngularParser.Flex_Direction, 0); }
		public TerminalNode Gap() { return getToken(AngularParser.Gap, 0); }
		public TerminalNode Padding() { return getToken(AngularParser.Padding, 0); }
		public TerminalNode Box_Size() { return getToken(AngularParser.Box_Size, 0); }
		public TerminalNode Flex() { return getToken(AngularParser.Flex, 0); }
		public TerminalNode Border() { return getToken(AngularParser.Border, 0); }
		public TerminalNode Text_Align() { return getToken(AngularParser.Text_Align, 0); }
		public TerminalNode Max_With() { return getToken(AngularParser.Max_With, 0); }
		public TerminalNode Height() { return getToken(AngularParser.Height, 0); }
		public TerminalNode Cursor() { return getToken(AngularParser.Cursor, 0); }
		public TerminalNode Transition() { return getToken(AngularParser.Transition, 0); }
		public TerminalNode Background_Color() { return getToken(AngularParser.Background_Color, 0); }
		public TerminalNode Margin() { return getToken(AngularParser.Margin, 0); }
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			_la = _input.LA(1);
			if ( !(((((_la - 163)) & ~0x3f) == 0 && ((1L << (_la - 163)) & 102399L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssValueContext extends ParserRuleContext {
		public DecimalLiteral_UNITContext decimalLiteral_UNIT() {
			return getRuleContext(DecimalLiteral_UNITContext.class,0);
		}
		public TerminalNode Row() { return getToken(AngularParser.Row, 0); }
		public TerminalNode Flex() { return getToken(AngularParser.Flex, 0); }
		public TerminalNode Border_Box() { return getToken(AngularParser.Border_Box, 0); }
		public TerminalNode Center() { return getToken(AngularParser.Center, 0); }
		public TerminalNode Column() { return getToken(AngularParser.Column, 0); }
		public TerminalNode Auto() { return getToken(AngularParser.Auto, 0); }
		public TerminalNode Pointer() { return getToken(AngularParser.Pointer, 0); }
		public TerminalNode HEXCHAR() { return getToken(AngularParser.HEXCHAR, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cssValue);
		try {
			setState(577);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				decimalLiteral_UNIT();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(Row);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
				match(Flex);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				match(Border_Box);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(571);
				match(Center);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(572);
				match(Column);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(573);
				match(Auto);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(574);
				match(Pointer);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(575);
				match(HEXCHAR);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(576);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteral_UNITContext extends ParserRuleContext {
		public DecimalLiteral_UNITContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral_UNIT; }
	 
		public DecimalLiteral_UNITContext() { }
		public void copyFrom(DecimalLiteral_UNITContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitNumberListContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public List<DecimalLiteralContext> decimalLiteral() {
			return getRuleContexts(DecimalLiteralContext.class);
		}
		public DecimalLiteralContext decimalLiteral(int i) {
			return getRuleContext(DecimalLiteralContext.class,i);
		}
		public UnitNumberListContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnitNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnitNumberList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnitNumberList(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BackgroundColorUnitContext extends DecimalLiteral_UNITContext {
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public BackgroundColorUnitContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBackgroundColorUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBackgroundColorUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBackgroundColorUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnitSolidColorContext extends DecimalLiteral_UNITContext {
		public DecimalLiteralUnitContext decimalLiteralUnit() {
			return getRuleContext(DecimalLiteralUnitContext.class,0);
		}
		public TerminalNode Solid() { return getToken(AngularParser.Solid, 0); }
		public TerminalNode HEXCHAR() { return getToken(AngularParser.HEXCHAR, 0); }
		public UnitSolidColorContext(DecimalLiteral_UNITContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterUnitSolidColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitUnitSolidColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitUnitSolidColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteral_UNITContext decimalLiteral_UNIT() throws RecognitionException {
		DecimalLiteral_UNITContext _localctx = new DecimalLiteral_UNITContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_decimalLiteral_UNIT);
		int _la;
		try {
			setState(593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new UnitNumberListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				decimalLiteralUnit();
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DecimalLiteral) {
					{
					{
					setState(580);
					decimalLiteral();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new UnitSolidColorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				decimalLiteralUnit();
				setState(587);
				match(Solid);
				setState(588);
				match(HEXCHAR);
				}
				break;
			case 3:
				_localctx = new BackgroundColorUnitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(590);
				css();
				setState(591);
				decimalLiteralUnit();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralUnitContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral_UNIT() { return getToken(AngularParser.DecimalLiteral_UNIT, 0); }
		public DecimalLiteralUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteralUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecimalLiteralUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecimalLiteralUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecimalLiteralUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralUnitContext decimalLiteralUnit() throws RecognitionException {
		DecimalLiteralUnitContext _localctx = new DecimalLiteralUnitContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_decimalLiteralUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(DecimalLiteral_UNIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(AngularParser.DecimalLiteral, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(DecimalLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode H1() { return getToken(AngularParser.H1, 0); }
		public TerminalNode H2() { return getToken(AngularParser.H2, 0); }
		public TerminalNode H3() { return getToken(AngularParser.H3, 0); }
		public TerminalNode H4() { return getToken(AngularParser.H4, 0); }
		public TerminalNode IMG_() { return getToken(AngularParser.IMG_, 0); }
		public TerminalNode P() { return getToken(AngularParser.P, 0); }
		public TerminalNode QuestionDot() { return getToken(AngularParser.QuestionDot, 0); }
		public TerminalNode RBRACE_RBRACE() { return getToken(AngularParser.RBRACE_RBRACE, 0); }
		public TerminalNode LBRACE_LBRACE() { return getToken(AngularParser.LBRACE_LBRACE, 0); }
		public TerminalNode Div_() { return getToken(AngularParser.Div_, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Button() { return getToken(AngularParser.Button, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tagName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			_la = _input.LA(1);
			if ( !(((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 786177L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlKeywordContext extends ParserRuleContext {
		public TerminalNode NGFOR() { return getToken(AngularParser.NGFOR, 0); }
		public TerminalNode NGIF() { return getToken(AngularParser.NGIF, 0); }
		public TerminalNode ALT() { return getToken(AngularParser.ALT, 0); }
		public TerminalNode SRC() { return getToken(AngularParser.SRC, 0); }
		public HtmlKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlKeywordContext htmlKeyword() throws RecognitionException {
		HtmlKeywordContext _localctx = new HtmlKeywordContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_htmlKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Or() { return getToken(AngularParser.Or, 0); }
		public TerminalNode Less() { return getToken(AngularParser.Less, 0); }
		public TerminalNode Greater() { return getToken(AngularParser.Greater, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_la = _input.LA(1);
			if ( !(((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 49L) != 0) || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(AngularParser.String, 0); }
		public TerminalNode Int() { return getToken(AngularParser.Int, 0); }
		public TerminalNode Float() { return getToken(AngularParser.Float, 0); }
		public TerminalNode Double() { return getToken(AngularParser.Double, 0); }
		public TerminalNode Bool() { return getToken(AngularParser.Bool, 0); }
		public TerminalNode Var() { return getToken(AngularParser.Var, 0); }
		public TerminalNode Array() { return getToken(AngularParser.Array, 0); }
		public TerminalNode Number() { return getToken(AngularParser.Number, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_la = _input.LA(1);
			if ( !(((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 1125899906842863L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReservedWordContext extends ParserRuleContext {
		public TerminalNode AngularCore() { return getToken(AngularParser.AngularCore, 0); }
		public TerminalNode Angular() { return getToken(AngularParser.Angular, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode RouterOutlet() { return getToken(AngularParser.RouterOutlet, 0); }
		public TerminalNode CommonModule() { return getToken(AngularParser.CommonModule, 0); }
		public TerminalNode Input() { return getToken(AngularParser.Input, 0); }
		public TerminalNode OnInit() { return getToken(AngularParser.OnInit, 0); }
		public TerminalNode Click() { return getToken(AngularParser.Click, 0); }
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_reservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0) || _la==Angular || _la==AngularCore || _la==Click) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(AngularParser.Break, 0); }
		public TerminalNode Do() { return getToken(AngularParser.Do, 0); }
		public TerminalNode Case() { return getToken(AngularParser.Case, 0); }
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public TerminalNode New() { return getToken(AngularParser.New, 0); }
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public TerminalNode Void() { return getToken(AngularParser.Void, 0); }
		public TerminalNode Continue() { return getToken(AngularParser.Continue, 0); }
		public TerminalNode For() { return getToken(AngularParser.For, 0); }
		public TerminalNode Switch() { return getToken(AngularParser.Switch, 0); }
		public TerminalNode While() { return getToken(AngularParser.While, 0); }
		public TerminalNode Function_() { return getToken(AngularParser.Function_, 0); }
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Default() { return getToken(AngularParser.Default, 0); }
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode In() { return getToken(AngularParser.In, 0); }
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public TerminalNode Let() { return getToken(AngularParser.Let, 0); }
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public TerminalNode Extends() { return getToken(AngularParser.Extends, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 738362190234533984L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 9113L) != 0) || _la==NullLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(AngularParser.Semi, 0); }
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==Semi) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00d5\u0268\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0001\u0000\u0003\u0000\u0080"+
		"\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u0085\b\u0001"+
		"\u000b\u0001\f\u0001\u0086\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u008f\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0003\u0004\u0095\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00a1\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006\u00a8\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u00ac\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u00b0\b\u0007\n\u0007\f\u0007\u00b3\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bd\b\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0005\n\u00c3\b\n\n\n\f\n\u00c6\t\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00d6\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0005\r\u00e0\b\r\n\r\f\r\u00e3\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00f0\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00ff\b\u0011\n\u0011\f\u0011\u0102\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u010d\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u011c\b\u0016\n"+
		"\u0016\f\u0016\u011f\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0125\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0131\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u013b"+
		"\b\u0018\n\u0018\f\u0018\u013e\t\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0145\b\u0019\n\u0019\f\u0019\u0148"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u015e\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0005\u001d\u0165\b\u001d\n"+
		"\u001d\f\u001d\u0168\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0005 \u0173"+
		"\b \n \f \u0176\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0003\"\u0184\b\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0004%\u018b\b%\u000b%\f%\u018c\u0001%\u0005%\u0190\b"+
		"%\n%\f%\u0193\t%\u0001%\u0004%\u0196\b%\u000b%\f%\u0197\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0001&\u0003&\u01a0\b&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u01be\b(\u0001)\u0005)\u01c1\b)\n"+
		")\f)\u01c4\t)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01dc\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u01ed\b+\n+\f+\u01f0\t+\u0001+\u0001+\u0001+\u0003+\u01f5"+
		"\b+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u0200\b-\u0001-\u0001-\u0001.\u0005.\u0205\b.\n.\f.\u0208\t.\u0001."+
		"\u0003.\u020b\b.\u0001.\u0003.\u020e\b.\u0001.\u0003.\u0211\b.\u0001."+
		"\u0005.\u0214\b.\n.\f.\u0217\t.\u0001.\u0001.\u0005.\u021b\b.\n.\f.\u021e"+
		"\t.\u0001.\u0001.\u0001/\u0001/\u0003/\u0224\b/\u0001/\u0005/\u0227\b"+
		"/\n/\f/\u022a\t/\u00010\u00030\u022d\b0\u00010\u00010\u00011\u00011\u0001"+
		"1\u00011\u00011\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00033\u0242\b3\u00014\u00014\u00054\u0246"+
		"\b4\n4\f4\u0249\t4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0003"+
		"4\u0252\b4\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u0001"+
		"9\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0000\u0000?\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|\u0000\t\u0002\u0000\u001e\u001e\"\"\u0002\u0000"+
		"\u00a3\u00ae\u00b2\u00b3\u0003\u0000\u008f\u008f\u0097\u00a0\u00a2\u00a2"+
		"\u0001\u0000\u0018\u001b\u0003\u0000rrvw\u00bf\u00bf\u0003\u0000#&(*U"+
		"U\u0004\u0000\u0012\u0016__dd\u00a1\u00a1\u000e\u0000\u0005\u0006\u000e"+
		"\u000e\u0011\u0011\u0017\u0017\'\',-0599;;EEHILNRR\u0095\u0095\u0001\u0001"+
		"\u008e\u008e\u026d\u0000\u007f\u0001\u0000\u0000\u0000\u0002\u0084\u0001"+
		"\u0000\u0000\u0000\u0004\u008e\u0001\u0000\u0000\u0000\u0006\u0090\u0001"+
		"\u0000\u0000\u0000\b\u00a0\u0001\u0000\u0000\u0000\n\u00a2\u0001\u0000"+
		"\u0000\u0000\f\u00a7\u0001\u0000\u0000\u0000\u000e\u00ad\u0001\u0000\u0000"+
		"\u0000\u0010\u00b4\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000"+
		"\u0000\u0014\u00c0\u0001\u0000\u0000\u0000\u0016\u00d5\u0001\u0000\u0000"+
		"\u0000\u0018\u00d7\u0001\u0000\u0000\u0000\u001a\u00dd\u0001\u0000\u0000"+
		"\u0000\u001c\u00ef\u0001\u0000\u0000\u0000\u001e\u00f1\u0001\u0000\u0000"+
		"\u0000 \u00f6\u0001\u0000\u0000\u0000\"\u00fb\u0001\u0000\u0000\u0000"+
		"$\u0105\u0001\u0000\u0000\u0000&\u0108\u0001\u0000\u0000\u0000(\u010e"+
		"\u0001\u0000\u0000\u0000*\u0110\u0001\u0000\u0000\u0000,\u0116\u0001\u0000"+
		"\u0000\u0000.\u0130\u0001\u0000\u0000\u00000\u0132\u0001\u0000\u0000\u0000"+
		"2\u0142\u0001\u0000\u0000\u00004\u014c\u0001\u0000\u0000\u00006\u0151"+
		"\u0001\u0000\u0000\u00008\u015a\u0001\u0000\u0000\u0000:\u0162\u0001\u0000"+
		"\u0000\u0000<\u0169\u0001\u0000\u0000\u0000>\u016c\u0001\u0000\u0000\u0000"+
		"@\u0170\u0001\u0000\u0000\u0000B\u0179\u0001\u0000\u0000\u0000D\u0183"+
		"\u0001\u0000\u0000\u0000F\u0185\u0001\u0000\u0000\u0000H\u0187\u0001\u0000"+
		"\u0000\u0000J\u018a\u0001\u0000\u0000\u0000L\u0199\u0001\u0000\u0000\u0000"+
		"N\u01a3\u0001\u0000\u0000\u0000P\u01bd\u0001\u0000\u0000\u0000R\u01db"+
		"\u0001\u0000\u0000\u0000T\u01dd\u0001\u0000\u0000\u0000V\u01f4\u0001\u0000"+
		"\u0000\u0000X\u01f6\u0001\u0000\u0000\u0000Z\u01fa\u0001\u0000\u0000\u0000"+
		"\\\u0206\u0001\u0000\u0000\u0000^\u0221\u0001\u0000\u0000\u0000`\u022c"+
		"\u0001\u0000\u0000\u0000b\u0230\u0001\u0000\u0000\u0000d\u0235\u0001\u0000"+
		"\u0000\u0000f\u0241\u0001\u0000\u0000\u0000h\u0251\u0001\u0000\u0000\u0000"+
		"j\u0253\u0001\u0000\u0000\u0000l\u0255\u0001\u0000\u0000\u0000n\u0257"+
		"\u0001\u0000\u0000\u0000p\u0259\u0001\u0000\u0000\u0000r\u025b\u0001\u0000"+
		"\u0000\u0000t\u025d\u0001\u0000\u0000\u0000v\u025f\u0001\u0000\u0000\u0000"+
		"x\u0261\u0001\u0000\u0000\u0000z\u0263\u0001\u0000\u0000\u0000|\u0265"+
		"\u0001\u0000\u0000\u0000~\u0080\u0003\u0002\u0001\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005\u0000\u0000\u0001\u0082\u0001\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0003\u0004\u0002\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0003\u0001\u0000"+
		"\u0000\u0000\u0088\u008f\u0003\u0006\u0003\u0000\u0089\u008f\u0003\u0012"+
		"\t\u0000\u008a\u008f\u0003\u0018\f\u0000\u008b\u008f\u0003,\u0016\u0000"+
		"\u008c\u008f\u0003H$\u0000\u008d\u008f\u0003\\.\u0000\u008e\u0088\u0001"+
		"\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000\u008e\u008a\u0001"+
		"\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0005\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005\u0005\u0000\u0000\u0091\u0092\u0003"+
		"\b\u0004\u0000\u0092\u0007\u0001\u0000\u0000\u0000\u0093\u0095\u0003\n"+
		"\u0005\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0097\u0003\f\u0006"+
		"\u0000\u0097\u0098\u0003|>\u0000\u0098\u00a1\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005c\u0000\u0000\u009a\u00a1\u0003\f\u0006\u0000\u009b\u009c"+
		"\u0005m\u0000\u0000\u009c\u009d\u0005T\u0000\u0000\u009d\u009e\u0003v"+
		";\u0000\u009e\u009f\u0003\f\u0006\u0000\u009f\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a0\u0094\u0001\u0000\u0000\u0000\u00a0\u0099\u0001\u0000\u0000"+
		"\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a1\t\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005i\u0000\u0000\u00a3\u00a4\u0003\u000e\u0007\u0000\u00a4"+
		"\u00a5\u0005j\u0000\u0000\u00a5\u000b\u0001\u0000\u0000\u0000\u00a6\u00a8"+
		"\u0005\u0007\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab"+
		"\u0003x<\u0000\u00aa\u00ac\u0003|>\u0000\u00ab\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\r\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b1\u0003v;\u0000\u00ae\u00b0\u0003\u0010\b\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u000f"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u008a\u0000\u0000\u00b5\u00b6\u0003v;\u0000\u00b6\u0011\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0017\u0000\u0000\u00b8\u00bc\u0003F#\u0000"+
		"\u00b9\u00ba\u0003z=\u0000\u00ba\u00bb\u0003F#\u0000\u00bb\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0003"+
		"\u0014\n\u0000\u00bf\u0013\u0001\u0000\u0000\u0000\u00c0\u00c4\u0005i"+
		"\u0000\u0000\u00c1\u00c3\u0003\u0016\u000b\u0000\u00c2\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005j\u0000"+
		"\u0000\u00c8\u0015\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003F#\u0000\u00ca"+
		"\u00cb\u0005\u008c\u0000\u0000\u00cb\u00cc\u0003t:\u0000\u00cc\u00cd\u0003"+
		"|>\u0000\u00cd\u00d6\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003F#\u0000"+
		"\u00cf\u00d0\u0005e\u0000\u0000\u00d0\u00d1\u0005f\u0000\u0000\u00d1\u00d2"+
		"\u0005\u008c\u0000\u0000\u00d2\u00d3\u0003t:\u0000\u00d3\u00d4\u0003|"+
		">\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00c9\u0001\u0000\u0000"+
		"\u0000\u00d5\u00ce\u0001\u0000\u0000\u0000\u00d6\u0017\u0001\u0000\u0000"+
		"\u0000\u00d7\u00d8\u0005\u00be\u0000\u0000\u00d8\u00d9\u0003v;\u0000\u00d9"+
		"\u00da\u0005e\u0000\u0000\u00da\u00db\u0003\u001a\r\u0000\u00db\u00dc"+
		"\u0005f\u0000\u0000\u00dc\u0019\u0001\u0000\u0000\u0000\u00dd\u00e1\u0005"+
		"i\u0000\u0000\u00de\u00e0\u0003\u001c\u000e\u0000\u00df\u00de\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005j\u0000"+
		"\u0000\u00e5\u001b\u0001\u0000\u0000\u0000\u00e6\u00f0\u0003\u001e\u000f"+
		"\u0000\u00e7\u00f0\u0003 \u0010\u0000\u00e8\u00f0\u0003&\u0013\u0000\u00e9"+
		"\u00f0\u0003*\u0015\u0000\u00ea\u00eb\u0005 \u0000\u0000\u00eb\u00ec\u0005"+
		"\u008c\u0000\u0000\u00ec\u00ed\u0003r9\u0000\u00ed\u00ee\u0005\u008a\u0000"+
		"\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e7\u0001\u0000\u0000\u0000\u00ef\u00e8\u0001\u0000\u0000"+
		"\u0000\u00ef\u00e9\u0001\u0000\u0000\u0000\u00ef\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f0\u001d\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u001c\u0000"+
		"\u0000\u00f2\u00f3\u0005\u008c\u0000\u0000\u00f3\u00f4\u0003x<\u0000\u00f4"+
		"\u00f5\u0005\u008a\u0000\u0000\u00f5\u001f\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0005\u001d\u0000\u0000\u00f7\u00f8\u0005\u008c\u0000\u0000\u00f8"+
		"\u00f9\u0003\"\u0011\u0000\u00f9\u00fa\u0005\u008a\u0000\u0000\u00fa!"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005g\u0000\u0000\u00fc\u0100\u0003"+
		"v;\u0000\u00fd\u00ff\u0003$\u0012\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005h\u0000\u0000"+
		"\u0104#\u0001\u0000\u0000\u0000\u0105\u0106\u0005\u008a\u0000\u0000\u0106"+
		"\u0107\u0003v;\u0000\u0107%\u0001\u0000\u0000\u0000\u0108\u0109\u0003"+
		"(\u0014\u0000\u0109\u010a\u0005\u008c\u0000\u0000\u010a\u010c\u0003x<"+
		"\u0000\u010b\u010d\u0005\u008a\u0000\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\'\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\u0007\u0000\u0000\u0000\u010f)\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0005\u001f\u0000\u0000\u0111\u0112\u0005\u008c\u0000\u0000\u0112"+
		"\u0113\u0005g\u0000\u0000\u0113\u0114\u0003x<\u0000\u0114\u0115\u0005"+
		"h\u0000\u0000\u0115+\u0001\u0000\u0000\u0000\u0116\u0117\u0005\u0006\u0000"+
		"\u0000\u0117\u0118\u0003z=\u0000\u0118\u0119\u0003F#\u0000\u0119\u011d"+
		"\u0005i\u0000\u0000\u011a\u011c\u0003.\u0017\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121\u0005j\u0000"+
		"\u0000\u0121-\u0001\u0000\u0000\u0000\u0122\u0124\u00030\u0018\u0000\u0123"+
		"\u0125\u00036\u001b\u0000\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127"+
		"\u00038\u001c\u0000\u0127\u0131\u0001\u0000\u0000\u0000\u0128\u0129\u0003"+
		"F#\u0000\u0129\u012a\u0005\u008c\u0000\u0000\u012a\u012b\u0003t:\u0000"+
		"\u012b\u012c\u0005u\u0000\u0000\u012c\u012d\u0003x<\u0000\u012d\u012e"+
		"\u0003|>\u0000\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u0131\u00038"+
		"\u001c\u0000\u0130\u0122\u0001\u0000\u0000\u0000\u0130\u0128\u0001\u0000"+
		"\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131/\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0003F#\u0000\u0133\u0134\u0005\u008c\u0000\u0000\u0134"+
		"\u0135\u0005\u00b8\u0000\u0000\u0135\u0136\u0005g\u0000\u0000\u0136\u0137"+
		"\u0005h\u0000\u0000\u0137\u0138\u0005u\u0000\u0000\u0138\u013c\u0005g"+
		"\u0000\u0000\u0139\u013b\u00032\u0019\u0000\u013a\u0139\u0001\u0000\u0000"+
		"\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013f\u0001\u0000\u0000"+
		"\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0005h\u0000\u0000"+
		"\u0140\u0141\u0003|>\u0000\u01411\u0001\u0000\u0000\u0000\u0142\u0146"+
		"\u0005i\u0000\u0000\u0143\u0145\u00034\u001a\u0000\u0144\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0149\u0001\u0000"+
		"\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0149\u014a\u0005j\u0000"+
		"\u0000\u014a\u014b\u0005\u008a\u0000\u0000\u014b3\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0003F#\u0000\u014d\u014e\u0005\u008c\u0000\u0000\u014e\u014f"+
		"\u0003x<\u0000\u014f\u0150\u0005\u008a\u0000\u0000\u01505\u0001\u0000"+
		"\u0000\u0000\u0151\u0152\u0003F#\u0000\u0152\u0153\u0005\u008c\u0000\u0000"+
		"\u0153\u0154\u0003F#\u0000\u0154\u0155\u0003r9\u0000\u0155\u0156\u0003"+
		"z=\u0000\u0156\u0157\u0005u\u0000\u0000\u0157\u0158\u0003z=\u0000\u0158"+
		"\u0159\u0003|>\u0000\u01597\u0001\u0000\u0000\u0000\u015a\u015b\u0003"+
		"F#\u0000\u015b\u015d\u0005e\u0000\u0000\u015c\u015e\u0003:\u001d\u0000"+
		"\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0005f\u0000\u0000\u0160"+
		"\u0161\u0003@ \u0000\u01619\u0001\u0000\u0000\u0000\u0162\u0166\u0003"+
		">\u001f\u0000\u0163\u0165\u0003<\u001e\u0000\u0164\u0163\u0001\u0000\u0000"+
		"\u0000\u0165\u0168\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167;\u0001\u0000\u0000\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016a\u0005\u008a\u0000\u0000"+
		"\u016a\u016b\u0003>\u001f\u0000\u016b=\u0001\u0000\u0000\u0000\u016c\u016d"+
		"\u0003F#\u0000\u016d\u016e\u0005\u008c\u0000\u0000\u016e\u016f\u0003D"+
		"\"\u0000\u016f?\u0001\u0000\u0000\u0000\u0170\u0174\u0005i\u0000\u0000"+
		"\u0171\u0173\u0003B!\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u0176"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0177\u0001\u0000\u0000\u0000\u0176\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005j\u0000\u0000\u0178A\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0003z=\u0000\u017a\u017b\u0005\u008f\u0000\u0000"+
		"\u017b\u017c\u0003F#\u0000\u017c\u017d\u0005u\u0000\u0000\u017d\u017e"+
		"\u0003D\"\u0000\u017e\u017f\u0003|>\u0000\u017fC\u0001\u0000\u0000\u0000"+
		"\u0180\u0184\u0003t:\u0000\u0181\u0184\u0003F#\u0000\u0182\u0184\u0003"+
		"x<\u0000\u0183\u0180\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0184E\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0005\u00b8\u0000\u0000\u0186G\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0003J%\u0000\u0188I\u0001\u0000\u0000\u0000\u0189\u018b\u0003"+
		"L&\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d\u0191\u0001\u0000\u0000\u0000\u018e\u0190\u0003P(\u0000\u018f"+
		"\u018e\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194"+
		"\u0196\u0003N\'\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0001\u0000\u0000\u0000\u0198K\u0001\u0000\u0000\u0000\u0199\u019a\u0005"+
		"v\u0000\u0000\u019a\u019f\u0003n7\u0000\u019b\u019c\u0003z=\u0000\u019c"+
		"\u019d\u0005u\u0000\u0000\u019d\u019e\u0003x<\u0000\u019e\u01a0\u0001"+
		"\u0000\u0000\u0000\u019f\u019b\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"w\u0000\u0000\u01a2M\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005v\u0000"+
		"\u0000\u01a4\u01a5\u0005n\u0000\u0000\u01a5\u01a6\u0003n7\u0000\u01a6"+
		"\u01a7\u0005w\u0000\u0000\u01a7O\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005"+
		"v\u0000\u0000\u01a9\u01aa\u0003n7\u0000\u01aa\u01ab\u0003V+\u0000\u01ab"+
		"\u01ac\u0003n7\u0000\u01ac\u01ad\u0005w\u0000\u0000\u01ad\u01be\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0005v\u0000\u0000\u01af\u01b0\u0003n7"+
		"\u0000\u01b0\u01b1\u0003R)\u0000\u01b1\u01b2\u0003R)\u0000\u01b2\u01b3"+
		"\u0003R)\u0000\u01b3\u01b4\u0003R)\u0000\u01b4\u01b5\u0005n\u0000\u0000"+
		"\u01b5\u01b6\u0005w\u0000\u0000\u01b6\u01be\u0001\u0000\u0000\u0000\u01b7"+
		"\u01b8\u0005v\u0000\u0000\u01b8\u01b9\u0003n7\u0000\u01b9\u01ba\u0003"+
		"R)\u0000\u01ba\u01bb\u0003X,\u0000\u01bb\u01bc\u0005w\u0000\u0000\u01bc"+
		"\u01be\u0001\u0000\u0000\u0000\u01bd\u01a8\u0001\u0000\u0000\u0000\u01bd"+
		"\u01ae\u0001\u0000\u0000\u0000\u01bd\u01b7\u0001\u0000\u0000\u0000\u01be"+
		"Q\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003T*\u0000\u01c0\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3\u01dc\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005"+
		"g\u0000\u0000\u01c6\u01c7\u0003p8\u0000\u01c7\u01c8\u0005h\u0000\u0000"+
		"\u01c8\u01c9\u0005u\u0000\u0000\u01c9\u01ca\u0003x<\u0000\u01ca\u01dc"+
		"\u0001\u0000\u0000\u0000\u01cb\u01cc\u0003p8\u0000\u01cc\u01cd\u0005u"+
		"\u0000\u0000\u01cd\u01ce\u0003x<\u0000\u01ce\u01dc\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0003z=\u0000\u01d0\u01d1\u0005u\u0000\u0000\u01d1\u01d2"+
		"\u0003x<\u0000\u01d2\u01dc\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003z"+
		"=\u0000\u01d4\u01d5\u0005u\u0000\u0000\u01d5\u01d6\u0003x<\u0000\u01d6"+
		"\u01d7\u0005m\u0000\u0000\u01d7\u01d8\u0003p8\u0000\u01d8\u01d9\u0005"+
		"u\u0000\u0000\u01d9\u01da\u0003x<\u0000\u01da\u01dc\u0001\u0000\u0000"+
		"\u0000\u01db\u01c2\u0001\u0000\u0000\u0000\u01db\u01c5\u0001\u0000\u0000"+
		"\u0000\u01db\u01cb\u0001\u0000\u0000\u0000\u01db\u01cf\u0001\u0000\u0000"+
		"\u0000\u01db\u01d3\u0001\u0000\u0000\u0000\u01dcS\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0005m\u0000\u0000\u01de\u01df\u0003p8\u0000\u01df\u01e0"+
		"\u0005u\u0000\u0000\u01e0\u01e1\u0003x<\u0000\u01e1U\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e3\u0005w\u0000\u0000\u01e3\u01e4\u0003Z-\u0000\u01e4"+
		"\u01e5\u0005v\u0000\u0000\u01e5\u01e6\u0005n\u0000\u0000\u01e6\u01f5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e8\u0003v;\u0000\u01e8\u01e9\u0005u\u0000"+
		"\u0000\u01e9\u01ea\u0003x<\u0000\u01ea\u01ee\u0003r9\u0000\u01eb\u01ed"+
		"\u0005\u00b8\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000\u01ed\u01f0"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001\u0000\u0000\u0000\u01f0\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003r9\u0000\u01f2\u01f3\u0005n"+
		"\u0000\u0000\u01f3\u01f5\u0001\u0000\u0000\u0000\u01f4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01f4\u01e7\u0001\u0000\u0000\u0000\u01f5W\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u0003v;\u0000\u01f7\u01f8\u0005u\u0000\u0000\u01f8"+
		"\u01f9\u0003x<\u0000\u01f9Y\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003"+
		"n7\u0000\u01fb\u01ff\u0005\u00b8\u0000\u0000\u01fc\u01fd\u0003n7\u0000"+
		"\u01fd\u01fe\u0005\u00b8\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000"+
		"\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0003n7\u0000\u0202["+
		"\u0001\u0000\u0000\u0000\u0203\u0205\u0005\u008f\u0000\u0000\u0204\u0203"+
		"\u0001\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u020a"+
		"\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020b"+
		"\u0003n7\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000"+
		"\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u020e\u0005\u008a"+
		"\u0000\u0000\u020d\u020c\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000"+
		"\u0000\u0000\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u0211\u0005\u009e"+
		"\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000"+
		"\u0000\u0000\u0211\u0215\u0001\u0000\u0000\u0000\u0212\u0214\u0003^/\u0000"+
		"\u0213\u0212\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000"+
		"\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000"+
		"\u0216\u0218\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000"+
		"\u0218\u021c\u0005i\u0000\u0000\u0219\u021b\u0003b1\u0000\u021a\u0219"+
		"\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a"+
		"\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021f"+
		"\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0220"+
		"\u0005j\u0000\u0000\u0220]\u0001\u0000\u0000\u0000\u0221\u0223\u0005\u00b8"+
		"\u0000\u0000\u0222\u0224\u0005\u009f\u0000\u0000\u0223\u0222\u0001\u0000"+
		"\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0228\u0001\u0000"+
		"\u0000\u0000\u0225\u0227\u0003`0\u0000\u0226\u0225\u0001\u0000\u0000\u0000"+
		"\u0227\u022a\u0001\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000"+
		"\u0228\u0229\u0001\u0000\u0000\u0000\u0229_\u0001\u0000\u0000\u0000\u022a"+
		"\u0228\u0001\u0000\u0000\u0000\u022b\u022d\u0005\u008c\u0000\u0000\u022c"+
		"\u022b\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0005\u00b8\u0000\u0000\u022f"+
		"a\u0001\u0000\u0000\u0000\u0230\u0231\u0003d2\u0000\u0231\u0232\u0005"+
		"\u008c\u0000\u0000\u0232\u0233\u0003f3\u0000\u0233\u0234\u0003|>\u0000"+
		"\u0234c\u0001\u0000\u0000\u0000\u0235\u0236\u0007\u0001\u0000\u0000\u0236"+
		"e\u0001\u0000\u0000\u0000\u0237\u0242\u0003h4\u0000\u0238\u0242\u0005"+
		"\u00b4\u0000\u0000\u0239\u0242\u0005\u00a8\u0000\u0000\u023a\u0242\u0005"+
		"\u00b6\u0000\u0000\u023b\u0242\u0005\u00b0\u0000\u0000\u023c\u0242\u0005"+
		"\u00b5\u0000\u0000\u023d\u0242\u0005+\u0000\u0000\u023e\u0242\u0005\u00af"+
		"\u0000\u0000\u023f\u0242\u0005\u00ba\u0000\u0000\u0240\u0242\u0005\u00b8"+
		"\u0000\u0000\u0241\u0237\u0001\u0000\u0000\u0000\u0241\u0238\u0001\u0000"+
		"\u0000\u0000\u0241\u0239\u0001\u0000\u0000\u0000\u0241\u023a\u0001\u0000"+
		"\u0000\u0000\u0241\u023b\u0001\u0000\u0000\u0000\u0241\u023c\u0001\u0000"+
		"\u0000\u0000\u0241\u023d\u0001\u0000\u0000\u0000\u0241\u023e\u0001\u0000"+
		"\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0240\u0001\u0000"+
		"\u0000\u0000\u0242g\u0001\u0000\u0000\u0000\u0243\u0247\u0003j5\u0000"+
		"\u0244\u0246\u0003l6\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0249"+
		"\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248"+
		"\u0001\u0000\u0000\u0000\u0248\u0252\u0001\u0000\u0000\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0003j5\u0000\u024b\u024c\u0005\u00b1"+
		"\u0000\u0000\u024c\u024d\u0005\u00ba\u0000\u0000\u024d\u0252\u0001\u0000"+
		"\u0000\u0000\u024e\u024f\u0003d2\u0000\u024f\u0250\u0003j5\u0000\u0250"+
		"\u0252\u0001\u0000\u0000\u0000\u0251\u0243\u0001\u0000\u0000\u0000\u0251"+
		"\u024a\u0001\u0000\u0000\u0000\u0251\u024e\u0001\u0000\u0000\u0000\u0252"+
		"i\u0001\u0000\u0000\u0000\u0253\u0254\u0005\u00b7\u0000\u0000\u0254k\u0001"+
		"\u0000\u0000\u0000\u0255\u0256\u0005\u00bc\u0000\u0000\u0256m\u0001\u0000"+
		"\u0000\u0000\u0257\u0258\u0007\u0002\u0000\u0000\u0258o\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0007\u0003\u0000\u0000\u025aq\u0001\u0000\u0000\u0000"+
		"\u025b\u025c\u0007\u0004\u0000\u0000\u025cs\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0007\u0005\u0000\u0000\u025eu\u0001\u0000\u0000\u0000\u025f\u0260"+
		"\u0007\u0006\u0000\u0000\u0260w\u0001\u0000\u0000\u0000\u0261\u0262\u0005"+
		"\u00c1\u0000\u0000\u0262y\u0001\u0000\u0000\u0000\u0263\u0264\u0007\u0007"+
		"\u0000\u0000\u0264{\u0001\u0000\u0000\u0000\u0265\u0266\u0007\b\u0000"+
		"\u0000\u0266}\u0001\u0000\u0000\u0000.\u007f\u0086\u008e\u0094\u00a0\u00a7"+
		"\u00ab\u00b1\u00bc\u00c4\u00d5\u00e1\u00ef\u0100\u010c\u011d\u0124\u0130"+
		"\u013c\u0146\u015d\u0166\u0174\u0183\u018c\u0191\u0197\u019f\u01bd\u01c2"+
		"\u01db\u01ee\u01f4\u01ff\u0206\u020a\u020d\u0210\u0215\u021c\u0223\u0228"+
		"\u022c\u0241\u0247\u0251";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}