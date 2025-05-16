lexer grammar AngularLexer;


// Comments
MultiLineComment: '/*' .*? '*/'             -> skip;
SingleLineComment: '//' ~[\r\n\u2028\u2029]* -> skip;
WS:[ \t]+ ->skip;
NEWLINE:[\n\r]+ ->skip;



Import:          'import';
Export:          'export';
From:            'from';
Out:             'out';
Property:        'property';
Ensure:          'ensure';
EnsureAlways:    'ensureAlways';
Check:           'check';
Mixin:           'mixin';
Extends:         'extends';
Super:           'super';
Implements:      'implements';
Let:             'let';
Component:       'Component';
CommonModule:    'CommonModule';
RouterOutlet:    'RouterOutlet';
OnInit:          'OnInit';
Input:           'Input';
Interface:       'interface';
NGIF:            'ngIf' ;
NGFOR:           'ngFor' ;
SRC:             'src';
ALT:             'alt';
Selector:        'selector';
Imports:         'imports';
TemplateUrl:     'templateUrl';
StyleUrls:       'styleUrls';
Standalone:       'standalone';
FormsModule:      'FormsModule';
StyleUrl:         'styleUrl';

Int:             'int';
Float:           'float';
Double:          'double';
Bool:            'bool';
New:             'new';
Var:             'var';
String:          'string';
Array:           'Array';



/*Keywords*/

Auto:            'auto';
Break:           'break';
Case:            'case';
Catch:           'catch';
Char:            'char';
Class:           'class';
Const:           'const';
Continue:        'continue';
Default:         'default';
Do:              'do';
Else:            'else';
Enum:            'enum';

False_:          'false';
Final:           'final';
For:             'for';
Goto:            'goto';
If:              'if';
Namespace:       'namespace';
Nullptr:         'nullptr';
Operator:        'operator';
Override:        'override';
Private:         'private';
Protected:       'protected';
Public:          'public';
Static:          'static';
Package:         'package';
Return:          'return';
Short:           'short';
Struct:          'struct';
Switch:          'switch';
This:            'this';
True_:           'true';
Virtual:         'virtual';
Void:            'void';
While:           'while';
Function_:       'function';
With:            'with';
Throw:           'throw';
Any:             'any';
In:              'in';
Try:             'try';
As:              'as';
Number:          'number';
Unique:          'unique';
Symbol:          'symbol';
Undefined:       'undefined';
Object:          'object';
Constructor:     'constructor';
Abstract:        'abstract';
Require:         'require';
Module:          'module';
Declare:         'declare';
Angular:         'angular';
Common:          'common';
Core:            'core';
Router:          'router';
SomeClass:       'SomeClass';
AngularCore:     'angularCore';




/*Operators*/
LeftParen:           '(';
RightParen:          ')';
LeftBracket:         '[';
RightBracket:        ']';
LeftBrace:           '{';
RightBrace:          '}';
Plus:                '+';
Minus:               '-';
Star:                '*';
Div:                 '/';
Mod:                 '%';
Xor:                 '^^' | '^';
And:                 '&';
Or:                  '|';
Tilde:               '~';
Not:                 '!';
Assign:              '=';
Less:                '<';
Greater:             '>';
PlusAssign:          '+=';
MinusAssign:         '-=';
StarAssign:          '*=';
DivAssign:           '/=';
ModAssign:           '%=';
XorAssign:           '^=';
AndAssign:           '&=';
OrAssign:            '|=';
LeftShiftAssign:     '<<=';
RightShiftAssign:    '>>=';
Equal:               '==';
NotEqual:            '!=';
LessEqual:           '<=';
GreaterEqual:        '>=';
AndAnd:              '&&';
OrOr:                '||';
PlusPlus:            '++';
MinusMinus:          '--';
Comma:               ',';
Question:            '?';
Colon:               ':';
Doublecolon:         '::';
Semi:                ';';
Dot:                 '.';
Ellipsis:            '...';
Underscore:          '_';
Power:               '**';
Hashtag:             '#';
Arrow:               '=>';
NullLiteral:         'null';
Quotation :          '\'';


Div_:               'div';
LBRACE_LBRACE:      '{{';
RBRACE_RBRACE:      '}}';
QuestionDot:         '?.';
H1:                 'h1';
H2:                 'h2';
H3:                 'h3';
H4:                 'h4';
IMG_:                'img';
P:                   'p';
Click:               '(click)';
Button:               'button';



//CSS
Display:               'display';
Flex_Direction:        'flex-direction';
Gap:                   'gap';
Padding:               'padding';
Box_Size:              'box-sizing';
Flex:                  'flex';
Border:                'border';
Text_Align:            'text-align';
Max_With:              'max-width';
Height:                'height';
Cursor:                'cursor';
Transition:            'transition';
Pointer:               'pointer';
Center:                'center';
Solid:                 'solid';
Background_Color:      'background-color';
Margin:                'margin';
Row:                   'row';
Column:                'column';
Border_Box:            'border-box';
DecimalLiteral_UNIT:DecimalLiteral ('px'|'s'|'%');
STRING:[a-zA-Z0-9_][a-zA-Z0-9_-]*;
QUOTED_STRING:         '"' .*? '"';
HEXCHAR:               '#'STRING+;
String_DecimalLiteral:STRING DecimalLiteral;



/// Numeric Literals
DecimalLiteral:
    DecimalIntegerLiteral '.' [0-9] [0-9_]* ExponentPart?
    | '.' [0-9] [0-9_]* ExponentPart?
    | DecimalIntegerLiteral ExponentPart?;

// Numeric Literals
HexIntegerLiteral    : '0' [xX] [0-9a-fA-F] HexDigit*;//0x1A3F

At: '@';

Identifier: IdentifierStart IdentifierPart*;

EVENT_BINDING: '(' STRING ')' ;
/// String Literals
StringLiteral:
   ('"' DoubleStringCharacter* '"' | '\'' SingleStringCharacter* '\'') //{this.ProcessStringLiteral();}
         ;
//Messages:('"' STRING* '"' | '\'' STRING* '\'');

//WhiteSpaces: [\t\u000B\u000C\u0020\u00A0]+  -> skip;

//LineTerminator: [\r\n\u2028\u2029] -> skip;

// Fragment rules
fragment DoubleStringCharacter: ~["\\\r\n] | '\\' EscapeSequence | LineContinuation;
fragment SingleStringCharacter: ~['\\\r\n] | '\\' EscapeSequence | LineContinuation;
fragment EscapeSequence:
    CharacterEscapeSequence
    | '0' // no digit ahead! null
    | HexEscapeSequence
    | UnicodeEscapeSequence;
fragment CharacterEscapeSequence: SingleEscapeCharacter | NonEscapeCharacter;
fragment HexEscapeSequence: 'x' HexDigit HexDigit;//"x41\" يمثل الحرف A
fragment UnicodeEscapeSequence:
    'u' HexDigit HexDigit HexDigit HexDigit//"\u0041"
    | 'u' '{' HexDigit HexDigit+ '}'//"\u{1F600}"
;
fragment SingleEscapeCharacter: ['"\\bfnrtv];
fragment NonEscapeCharacter: ~['"\\bfnrtv0-9xu\r\n];
fragment EscapeCharacter: SingleEscapeCharacter | [0-9] | [xu];
fragment LineContinuation: '\\' [\r\n\u2028\u2029]+;
fragment HexDigit: [_0-9a-fA-F];
fragment DecimalIntegerLiteral: '0' | [1-9] [0-9_]*;
fragment ExponentPart: [eE] [+-]? [0-9_]+;
fragment IdentifierPart: IdentifierStart | [\p{Mn}] | [\p{Nd}] | [\p{Pc}] | '\u200C' | '\u200D';
fragment IdentifierStart: [\p{L}] | [$_] | '\\' UnicodeEscapeSequence;
fragment RegularExpressionFirstChar:
    ~[*\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;
fragment RegularExpressionChar:
    ~[\r\n\u2028\u2029\\/[]
    | RegularExpressionBackslashSequence
    | '[' RegularExpressionClassChar* ']'
;
fragment RegularExpressionClassChar: ~[\r\n\u2028\u2029\]\\] | RegularExpressionBackslashSequence;
fragment RegularExpressionBackslashSequence: '\\' ~[\r\n\u2028\u2029];

///////////HTML
/// Comments
HTML_COMMENT: '<!--' .*? '-->';
HTML_CONDITIONAL_COMMENT: '<![' .*? ']>';
XML: '<?xml' .*? '>';// يُعرّف إعلان XML في ملف HTML
DTD: '<!' .*? '>';//<!DOCTYPE html>إعلان نوع المستند
// SEA_WS: (' ' | '\t' | '\r'? '\n')+;

SCRIPT_OPEN: '<script' .*? '>' -> pushMode(SCRIPT);

STYLE_OPEN: '<style' .*? '>' -> pushMode(STYLE);

TAG_OPEN_1: Assign  -> pushMode(TAG);


mode TAG;

TAG_SLASH: '/';

TAG_EQUALS: '=' -> pushMode(ATTVALUE);

TAG_NAME: TAG_NameStartChar TAG_NameChar*;//يُعرّف أسماء العلامات<html>, <body>, <div>

   TEXT: ~[<]+;

TAG_WHITESPACE: [ \t\r\n] -> skip;

fragment DIGIT: [0-9];

fragment TAG_NameChar:
    TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300' ..'\u036F'
    | '\u203F' ..'\u2040'
;

fragment TAG_NameStartChar:
    [:a-zA-Z]
    | '\u2070' ..'\u218F'
    | '\u2C00' ..'\u2FEF'
    | '\u3001' ..'\uD7FF'
    | '\uF900' ..'\uFDCF'
    | '\uFDF0' ..'\uFFFD'
;

// <scripts>

mode SCRIPT;

SCRIPT_BODY: .*? '</script>' -> popMode;

SCRIPT_SHORT_BODY: .*? '</>' -> popMode;

// <styles>

mode STYLE;

STYLE_BODY: .*? '</style>' -> popMode;

STYLE_SHORT_BODY: .*? '</>' -> popMode;

// attribute values

mode ATTVALUE;

ATTRIBUT: DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING | ATTCHARS | HEXCHARS | DECCHARS;

fragment ATTCHARS: ATTCHAR+ ' '?;

fragment ATTCHAR: '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';' | '#' | [0-9a-zA-Z];

fragment HEXCHARS: '#' [0-9a-fA-F]+;

fragment DECCHARS: [0-9]+ '%'?;

fragment DOUBLE_QUOTE_STRING: '"' ~[<"]* '"';

fragment SINGLE_QUOTE_STRING: '\'' ~[<']* '\'';
//////////CSS

CLASS_SELECTOR: '.' STRING;
ID_SELECTOR: '#' STRING;
// الوحدات
UNIT: 'px' | 'em' | 'rem' | '%' | 'vh' | 'vw' |'s';



