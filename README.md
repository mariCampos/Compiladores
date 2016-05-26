# Compiladores
Fazendo um compilador para a disciplina de Compiladores

Universidade de Pernambuco

Alunas: ​Bettina Cavalcanti, Mariana de Albuquerque e Rebeca Sarai

Linguagem:​Pascal

Gramática Léxica

letter ­> [a­zA­Z]

Digit ­> [0­9]

boolean ­> [True­False]

integer ­> Digit

ID ­> letter (letter|digit)*

Comp ­> = | >= | <= | > | < | <>

Type ­> integer | boolean

Token ­> ID | begin | end | . | ; | = | >= | <= | > | < | <>| + | ­ | / | * | , | # | := | Comp | ( | )

| if | else | then | letter | return | while | integer | boolean | continue | break | true | false |

/n | “ | “ | Type | endif | procedure | writeln | : | var | program | EOT

+

Gramática sintática

● Program ::= program id; (VariableDeclaration; | FunctionDec;| ProcedureCmd;)*

BeginCommand

● Command ::= VariableDeclaration;

| ifCmd

| whileCmd

| continue; | break;

| writeln(expression);

| returnCmd;

| ID ( ((ArgumentList

?

);) | (:= expression;) )

● FunctionDec ::= function ID(parameterList) : Type; VariableDeclaration;*

BeginCommand

● ProcedureCmd ::= procedure ID(parameterList); VariableDeclaration;*

BeginCommand

● BeginCommand ::= begin Command* end

● ifCmd ::= if (expression ) then (BeginCommand || Command*) (else

(BeginCommand || Command*)endif;)

● whileCmd ::= while (expression) do BeginCommand;

● returnCmd ::= return (expression)

● expression ::= expressionAdd ( (= | >= | <= | > | < | <>) expressionAdd)?

● expressionAdd ::= termo ( (+ | ­ ) termo)*

● termo ::= fator ( ( * | / ) fator)*

● fator ::= ID(ArgumentList)?

;

?

//lista de parâmetros

| integer

| (expression)

| boolean

● ParameterList ::= (VariableDeclaration)(, VariableDeclaration)*

● ArgumentList ::= (expression) (, expression)*

● VariableDeclaration ::= var ID: Type

Observações

Os comentários de linha serão iniciados por “#”
