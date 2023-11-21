grammar tok;

@header { 
	import java.util.*; 
	import java.util.Scanner.*;
	import java.util.ArrayList;
	import java.util.Stack;
	import java.lang.*;
	import java.io.*;
}

@members {
	private Number _tipo;
	private String _varName;
	private String _varNameNew;
	private String _newVarName;
	private float _newVarNameFloat;
	private String _varValue;
	private int _New_varValue;
	isSymboTable symbolTable = new isSymboTable();
	private IsSymbol symbol;
	private Expections exception = new Expections();
	private String _varValueVerificad;
	private String _varValueOtherVerificad;
	private Mylanguage program = new Mylanguage();
	private ArrayList<AbastractCommand> currentThread;
	private ArrayList<AbastractCommand> ncurrentThread = new ArrayList<AbastractCommand>();


    public void exibeComandos() {
        for (AbastractCommand c: program.getComandos()) {
            System.out.println(c);
        }
    }

	public void generateCode() {
		program.generateTarget();
	}
	
	private String _readId;
	private String _exprID;
	private String _content;
	private Stack<ArrayList<AbastractCommand>> stack = new Stack<ArrayList<AbastractCommand>>();
	private String _exprDecisao;
	private ArrayList<AbastractCommand> listaTrue;
	private ArrayList<AbastractCommand> listaFalse;
	private String _exprEnquanto;
	private ArrayList<AbastractCommand> _exprEnquantoContent;
	private String exprFazEnquanto;
	private ArrayList<AbastractCommand> exprFazEnquantoContent;

} 

start	: 'inicio' decl bloco 'fimprog'
			{ 
			program.setVarTable(symbolTable);	
			program.setComandos(stack.pop());
			generateCode();
			}
		; 

decl	: (declaravar)+
		;

declaravar	: tipo ID {
						_varName = _input.LT(-1).getText();
						_varValue = null;
						symbol = new IsVariable(_varName, _tipo, _varValue);
						if (!symbolTable.exist(_varName)) {
							symbolTable.add(symbol);
						}else {
							exception.variableExist(_varName);
						}

					}
			(ATTR (TEXTO | NUMBER))?			
			(
				VIR 
				ID  {	
						_varName = _input.LT(-1).getText();
						_varValue = null;
						symbol = new IsVariable(_varName, _tipo, _varValue);
						if (!symbolTable.exist(_varName)) {
							symbolTable.add(symbol);
						}else {
							exception.variableExist(_varName);
						}
					}
			)* 
			ARROB
			;

tipo	:  	'numero' { _tipo = IsVariable.NUMBER; }
		|	'texto'  { _tipo = IsVariable.TEXT;   }
		|	'float'	 { _tipo = IsVariable.FLOAT;  } 
		;
	
bloco	: {
			currentThread = new ArrayList<AbastractCommand>();
			stack.push(currentThread);
		  }
		(cmd+)
		;

cmd		: cmdLeitura
		| cmdEscrita 
		| cmdAtribu
		| cmdSelecao
		| cmdEnquanto
		| cmdFazEnquanto
		;

cmdLeitura	: 'ler' ABREP 
					ID {
						_varName = _input.LT(-1).getText();
						if (symbolTable.exist(_varName)) {
							exception.variableExist(_varName);
						}
						_readId = _input.LT(-1).getText();
					}
					FECHAP
					ARROB {
							_tipo = IsVariable.INPUT;
							symbol = new IsVariable(_varName, _tipo, _varValue);
							symbolTable.add(symbol);
							Scanner input = new Scanner(System.in);
							_varValue = input.nextLine();
							symbolTable.setValue(_varName, _varValue);
					}
					{
						CommandLeitura cmd = new CommandLeitura(_readId, _newVarName);
						stack.peek().add(cmd);
					}
					| 
					declaravar
					;

cmdEscrita : 'escreva' ABREP 
					   ID {
							_varName = _input.LT(-1).getText();
							if (!symbolTable.exist(_varName)) {
								exception.variableNotExist(_varName);
							}
							_readId = _input.LT(-1).getText();
				       }
					   FECHAP
					   ARROB {
						symbolTable.getValue(_varName);
					   }
					   {
						CommandEscrita cmd = new CommandEscrita(_readId);
						stack.peek().add(cmd);
					   }
					   | 
					   declaravar
		   ;

cmdAtribu : ID {
				_varName = _input.LT(-1).getText();
				_varValueVerificad = _varName;
				if (!symbolTable.exist(_varName)) {
					exception.variableNotExist(_varName);
				}
				_exprID = _input.LT(-1).getText();
			}
			ATTR { _content = ""; }
			(TEXTO { _content += _input.LT(-1).getText(); } | expr) {
				_varValue = _input.LT(-1).getText();
				_newVarName = symbolTable.getTypes(_varName);

				if (_newVarName != "texto" && _varValue.charAt(0) == '"' && _varValue.charAt(_varValue.length() - 1) == '"') { 
					exception.typeIncorret(_varValue, _newVarName);
				}else if (_newVarName == "texto" && !_varValue.contains("\"")) {
					exception.typeIncorret(_varValue, _newVarName);
				}
			}
			ARROB { 
				symbolTable.setValue(_varName, _varValue);
			} 
			{ 
				CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _content);
				stack.peek().add(cmd);
			}
			| 
			declaravar
		  ;

cmdSelecao	: 'se' ABREP 
				   (ID | NUMBER) {_exprDecisao = _input.LT(-1).getText(); }
				   OPERAR {_exprDecisao += _input.LT(-1).getText(); }
				   (ID | NUMBER) {_exprDecisao += _input.LT(-1).getText(); }
				   FECHAP
				   ABRECH { 
					currentThread = new ArrayList<AbastractCommand>();
					stack.push(currentThread);
				   }
				   (cmd)+
				   {
					listaTrue = stack.pop();
					CommandDecisaoSe cmd = new CommandDecisaoSe(_exprDecisao, listaTrue);
					stack.peek().add(cmd);
				   }
				   FECHACH
				   ('senao' ABRECH 
				   			{
							currentThread = new ArrayList<AbastractCommand>();
							stack.push(currentThread);
							}
				   			(cmd+) 
							FECHACH {
							listaFalse = stack.pop();
							CommandDecisao cmd_one = new CommandDecisao(listaFalse);
							stack.peek().add(cmd_one);
							})? 
			;

cmdEnquanto	: 'enquanto' ABREP 
						 (ID | NUMBER) {_exprEnquanto = _input.LT(-1).getText(); }
						 OPERAR {_exprEnquanto += _input.LT(-1).getText(); }
						 (ID | NUMBER) {_exprEnquanto += _input.LT(-1).getText(); }
						 FECHAP 
						 ABRECH 
						 {
							currentThread = new ArrayList<AbastractCommand>();
							stack.push(currentThread);
						 }
						 (cmd)+ 
						 FECHACH
						 {
							_exprEnquantoContent = stack.pop();
							CommandEquanto cmd = new CommandEquanto(_exprEnquanto, _exprEnquantoContent);
							stack.peek().add(cmd);
						 }
			;

cmdFazEnquanto : 'faz' ABRECH 
				 {
					currentThread = new ArrayList<AbastractCommand>();
					stack.push(currentThread);
				 }
				 (cmd)+ 
				 FECHACH
				 'enquanto' 
				 ABREP 
				 (ID | NUMBER) {exprFazEnquanto = _input.LT(-1).getText(); }
				 OPERAR {exprFazEnquanto += _input.LT(-1).getText(); }
				 (ID | NUMBER) {exprFazEnquanto += _input.LT(-1).getText(); }
				 FECHAP 
				 ARROB
				 {
					exprFazEnquantoContent = stack.pop();
					CommandEquantoFaz cmd = new CommandEquantoFaz(exprFazEnquanto, exprFazEnquantoContent);
					stack.peek().add(cmd);
				 }
			   ;

expr : termo (OP {_content += _input.LT(-1).getText();} | termo)* 
	 ;
	 
termo	: ID {
				_varName = _input.LT(-1).getText();
				_varValueOtherVerificad = _varName;
				if (!symbolTable.exist(_varName)) {
					exception.variableNotExist(_varName);
				} else if (!symbolTable.typeInvalid(_varValueVerificad, _varValueOtherVerificad)) {
					exception.typeIncorret(_varValueVerificad, _varValueOtherVerificad);
				}
				_content += _input.LT(-1).getText();
			}
		| NUMBER {_content += _input.LT(-1).getText();}
		| termo_one
		;

termo_one : ABREP {_content += _input.LT(-1).getText();} | FECHAP {_content += _input.LT(-1).getText();}
		  ;

ABREP : '('
      ;

FECHAP	: ')'
	    ;

ABRECH	: '{'
		;

FECHACH	: '}'
		;
	
ARROB : '@'
	  ;

VIR	: ','
	;

OP	: '+' | '-' | '*' | '/'
	;

OPERAR : '>' | '<' | '>=' | '<=' | '==' | '!='
	   ;

OPERLOG : '&&' | '||'
		;

ATTR : '='
	 ;

ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;

NUMBER	: [0-9]+ ('.' [0-9]+)?
		;

TEXTO : '"'[a-z]? [A-Z]? ([a-z] | [A-Z] | [0-9] | WS)*'"'
	  ;

WS	:	(' ' | '\t' | '\n' | '\r') -> skip
	;