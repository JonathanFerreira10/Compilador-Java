// Generated from tok.g4 by ANTLR 4.10.1
 
	import java.util.*; 
	import java.util.Scanner.*;
	import java.util.ArrayList;
	import java.util.Stack;
	import java.lang.*;
	import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tokParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ABREP=12, FECHAP=13, ABRECH=14, FECHACH=15, ARROB=16, 
		VIR=17, OP=18, OPERAR=19, OPERLOG=20, ATTR=21, ID=22, NUMBER=23, TEXTO=24, 
		WS=25;
	public static final int
		RULE_start = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdLeitura = 6, RULE_cmdEscrita = 7, RULE_cmdAtribu = 8, 
		RULE_cmdSelecao = 9, RULE_cmdEnquanto = 10, RULE_cmdFazEnquanto = 11, 
		RULE_expr = 12, RULE_termo = 13, RULE_termo_one = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdLeitura", 
			"cmdEscrita", "cmdAtribu", "cmdSelecao", "cmdEnquanto", "cmdFazEnquanto", 
			"expr", "termo", "termo_one"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fimprog'", "'numero'", "'texto'", "'float'", "'ler'", 
			"'escreva'", "'se'", "'senao'", "'enquanto'", "'faz'", "'('", "')'", 
			"'{'", "'}'", "'@'", "','", null, null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"ABREP", "FECHAP", "ABRECH", "FECHACH", "ARROB", "VIR", "OP", "OPERAR", 
			"OPERLOG", "ATTR", "ID", "NUMBER", "TEXTO", "WS"
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
	public String getGrammarFileName() { return "tok.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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


	public tokParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			decl();
			setState(32);
			bloco();
			setState(33);
			match(T__1);
			 
						program.setVarTable(symbolTable);	
						program.setComandos(stack.pop());
						generateCode();
						
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

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(36);
					declaravar();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(39); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(tokParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tokParser.ID, i);
		}
		public TerminalNode ARROB() { return getToken(tokParser.ARROB, 0); }
		public TerminalNode ATTR() { return getToken(tokParser.ATTR, 0); }
		public List<TerminalNode> VIR() { return getTokens(tokParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(tokParser.VIR, i);
		}
		public TerminalNode TEXTO() { return getToken(tokParser.TEXTO, 0); }
		public TerminalNode NUMBER() { return getToken(tokParser.NUMBER, 0); }
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			tipo();
			setState(42);
			match(ID);

									_varName = _input.LT(-1).getText();
									_varValue = null;
									symbol = new IsVariable(_varName, _tipo, _varValue);
									if (!symbolTable.exist(_varName)) {
										symbolTable.add(symbol);
									}else {
										exception.variableExist(_varName);
									}

								
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTR) {
				{
				setState(44);
				match(ATTR);
				setState(45);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==TEXTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(48);
				match(VIR);
				setState(49);
				match(ID);
					
										_varName = _input.LT(-1).getText();
										_varValue = null;
										symbol = new IsVariable(_varName, _tipo, _varValue);
										if (!symbolTable.exist(_varName)) {
											symbolTable.add(symbol);
										}else {
											exception.variableExist(_varName);
										}
									
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(ARROB);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(T__2);
				 _tipo = IsVariable.NUMBER; 
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(T__3);
				 _tipo = IsVariable.TEXT;   
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				match(T__4);
				 _tipo = IsVariable.FLOAT;  
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

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

						currentThread = new ArrayList<AbastractCommand>();
						stack.push(currentThread);
					  
			{
			setState(68); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				cmd();
				}
				}
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public CmdLeituraContext cmdLeitura() {
			return getRuleContext(CmdLeituraContext.class,0);
		}
		public CmdEscritaContext cmdEscrita() {
			return getRuleContext(CmdEscritaContext.class,0);
		}
		public CmdAtribuContext cmdAtribu() {
			return getRuleContext(CmdAtribuContext.class,0);
		}
		public CmdSelecaoContext cmdSelecao() {
			return getRuleContext(CmdSelecaoContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFazEnquantoContext cmdFazEnquanto() {
			return getRuleContext(CmdFazEnquantoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				cmdLeitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				cmdEscrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				cmdAtribu();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				cmdSelecao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				cmdEnquanto();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				cmdFazEnquanto();
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

	public static class CmdLeituraContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(tokParser.ABREP, 0); }
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode FECHAP() { return getToken(tokParser.FECHAP, 0); }
		public TerminalNode ARROB() { return getToken(tokParser.ARROB, 0); }
		public DeclaravarContext declaravar() {
			return getRuleContext(DeclaravarContext.class,0);
		}
		public CmdLeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdLeitura(this);
		}
	}

	public final CmdLeituraContext cmdLeitura() throws RecognitionException {
		CmdLeituraContext _localctx = new CmdLeituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdLeitura);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__5);
				setState(81);
				match(ABREP);
				setState(82);
				match(ID);

										_varName = _input.LT(-1).getText();
										if (symbolTable.exist(_varName)) {
											exception.variableExist(_varName);
										}
										_readId = _input.LT(-1).getText();
									
				setState(84);
				match(FECHAP);
				setState(85);
				match(ARROB);

											_tipo = IsVariable.INPUT;
											symbol = new IsVariable(_varName, _tipo, _varValue);
											symbolTable.add(symbol);
											Scanner input = new Scanner(System.in);
											_varValue = input.nextLine();
											symbolTable.setValue(_varName, _varValue);
									

										CommandLeitura cmd = new CommandLeitura(_readId, _newVarName);
										stack.peek().add(cmd);
									
				}
				break;
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				declaravar();
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

	public static class CmdEscritaContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(tokParser.ABREP, 0); }
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode FECHAP() { return getToken(tokParser.FECHAP, 0); }
		public TerminalNode ARROB() { return getToken(tokParser.ARROB, 0); }
		public DeclaravarContext declaravar() {
			return getRuleContext(DeclaravarContext.class,0);
		}
		public CmdEscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdEscrita(this);
		}
	}

	public final CmdEscritaContext cmdEscrita() throws RecognitionException {
		CmdEscritaContext _localctx = new CmdEscritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdEscrita);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__6);
				setState(92);
				match(ABREP);
				setState(93);
				match(ID);

											_varName = _input.LT(-1).getText();
											if (!symbolTable.exist(_varName)) {
												exception.variableNotExist(_varName);
											}
											_readId = _input.LT(-1).getText();
								       
				setState(95);
				match(FECHAP);
				setState(96);
				match(ARROB);

										symbolTable.getValue(_varName);
									   

										CommandEscrita cmd = new CommandEscrita(_readId);
										stack.peek().add(cmd);
									   
				}
				break;
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				declaravar();
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

	public static class CmdAtribuContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(tokParser.ATTR, 0); }
		public TerminalNode ARROB() { return getToken(tokParser.ARROB, 0); }
		public TerminalNode TEXTO() { return getToken(tokParser.TEXTO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaravarContext declaravar() {
			return getRuleContext(DeclaravarContext.class,0);
		}
		public CmdAtribuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdAtribu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdAtribu(this);
		}
	}

	public final CmdAtribuContext cmdAtribu() throws RecognitionException {
		CmdAtribuContext _localctx = new CmdAtribuContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdAtribu);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(ID);

								_varName = _input.LT(-1).getText();
								_varValueVerificad = _varName;
								if (!symbolTable.exist(_varName)) {
									exception.variableNotExist(_varName);
								}
								_exprID = _input.LT(-1).getText();
							
				setState(104);
				match(ATTR);
				 _content = ""; 
				setState(109);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TEXTO:
					{
					setState(106);
					match(TEXTO);
					 _content += _input.LT(-1).getText(); 
					}
					break;
				case ABREP:
				case FECHAP:
				case ID:
				case NUMBER:
					{
					setState(108);
					expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

								_varValue = _input.LT(-1).getText();
								_newVarName = symbolTable.getTypes(_varName);

								if (_newVarName != "texto" && _varValue.charAt(0) == '"' && _varValue.charAt(_varValue.length() - 1) == '"') { 
									exception.typeIncorret(_varValue, _newVarName);
								}else if (_newVarName == "texto" && !_varValue.contains("\"")) {
									exception.typeIncorret(_varValue, _newVarName);
								}
							
				setState(112);
				match(ARROB);
				 
								symbolTable.setValue(_varName, _varValue);
							
				 
								CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _content);
								stack.peek().add(cmd);
							
				}
				break;
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				declaravar();
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

	public static class CmdSelecaoContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(tokParser.ABREP, 0); }
		public TerminalNode OPERAR() { return getToken(tokParser.OPERAR, 0); }
		public TerminalNode FECHAP() { return getToken(tokParser.FECHAP, 0); }
		public List<TerminalNode> ABRECH() { return getTokens(tokParser.ABRECH); }
		public TerminalNode ABRECH(int i) {
			return getToken(tokParser.ABRECH, i);
		}
		public List<TerminalNode> FECHACH() { return getTokens(tokParser.FECHACH); }
		public TerminalNode FECHACH(int i) {
			return getToken(tokParser.FECHACH, i);
		}
		public List<TerminalNode> ID() { return getTokens(tokParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tokParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(tokParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(tokParser.NUMBER, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSelecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdSelecao(this);
		}
	}

	public final CmdSelecaoContext cmdSelecao() throws RecognitionException {
		CmdSelecaoContext _localctx = new CmdSelecaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdSelecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__7);
			setState(119);
			match(ABREP);
			setState(120);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecisao = _input.LT(-1).getText(); 
			setState(122);
			match(OPERAR);
			_exprDecisao += _input.LT(-1).getText(); 
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecisao += _input.LT(-1).getText(); 
			setState(126);
			match(FECHAP);
			setState(127);
			match(ABRECH);
			 
								currentThread = new ArrayList<AbastractCommand>();
								stack.push(currentThread);
							   
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				cmd();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );

								listaTrue = stack.pop();
								CommandDecisaoSe cmd = new CommandDecisaoSe(_exprDecisao, listaTrue);
								stack.peek().add(cmd);
							   
			setState(135);
			match(FECHACH);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(136);
				match(T__8);
				setState(137);
				match(ABRECH);

											currentThread = new ArrayList<AbastractCommand>();
											stack.push(currentThread);
											
				{
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(139);
					cmd();
					}
					}
					setState(142); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
				}
				setState(144);
				match(FECHACH);

											listaFalse = stack.pop();
											CommandDecisao cmd_one = new CommandDecisao(listaFalse);
											stack.peek().add(cmd_one);
											
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

	public static class CmdEnquantoContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(tokParser.ABREP, 0); }
		public TerminalNode OPERAR() { return getToken(tokParser.OPERAR, 0); }
		public TerminalNode FECHAP() { return getToken(tokParser.FECHAP, 0); }
		public TerminalNode ABRECH() { return getToken(tokParser.ABRECH, 0); }
		public TerminalNode FECHACH() { return getToken(tokParser.FECHACH, 0); }
		public List<TerminalNode> ID() { return getTokens(tokParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tokParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(tokParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(tokParser.NUMBER, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__9);
			setState(150);
			match(ABREP);
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprEnquanto = _input.LT(-1).getText(); 
			setState(153);
			match(OPERAR);
			_exprEnquanto += _input.LT(-1).getText(); 
			setState(155);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprEnquanto += _input.LT(-1).getText(); 
			setState(157);
			match(FECHAP);
			setState(158);
			match(ABRECH);

										currentThread = new ArrayList<AbastractCommand>();
										stack.push(currentThread);
									 
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				cmd();
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
			setState(165);
			match(FECHACH);

										_exprEnquantoContent = stack.pop();
										CommandEquanto cmd = new CommandEquanto(_exprEnquanto, _exprEnquantoContent);
										stack.peek().add(cmd);
									 
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

	public static class CmdFazEnquantoContext extends ParserRuleContext {
		public TerminalNode ABRECH() { return getToken(tokParser.ABRECH, 0); }
		public TerminalNode FECHACH() { return getToken(tokParser.FECHACH, 0); }
		public TerminalNode ABREP() { return getToken(tokParser.ABREP, 0); }
		public TerminalNode OPERAR() { return getToken(tokParser.OPERAR, 0); }
		public TerminalNode FECHAP() { return getToken(tokParser.FECHAP, 0); }
		public TerminalNode ARROB() { return getToken(tokParser.ARROB, 0); }
		public List<TerminalNode> ID() { return getTokens(tokParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tokParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(tokParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(tokParser.NUMBER, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFazEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFazEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterCmdFazEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitCmdFazEnquanto(this);
		}
	}

	public final CmdFazEnquantoContext cmdFazEnquanto() throws RecognitionException {
		CmdFazEnquantoContext _localctx = new CmdFazEnquantoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdFazEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__10);
			setState(169);
			match(ABRECH);

								currentThread = new ArrayList<AbastractCommand>();
								stack.push(currentThread);
							 
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				cmd();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << ID))) != 0) );
			setState(176);
			match(FECHACH);
			setState(177);
			match(T__9);
			setState(178);
			match(ABREP);
			setState(179);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			exprFazEnquanto = _input.LT(-1).getText(); 
			setState(181);
			match(OPERAR);
			exprFazEnquanto += _input.LT(-1).getText(); 
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			exprFazEnquanto += _input.LT(-1).getText(); 
			setState(185);
			match(FECHAP);
			setState(186);
			match(ARROB);

								exprFazEnquantoContent = stack.pop();
								CommandEquantoFaz cmd = new CommandEquantoFaz(exprFazEnquanto, exprFazEnquantoContent);
								stack.peek().add(cmd);
							 
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(tokParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(tokParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			termo();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABREP) | (1L << FECHAP) | (1L << OP) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP:
					{
					setState(190);
					match(OP);
					_content += _input.LT(-1).getText();
					}
					break;
				case ABREP:
				case FECHAP:
				case ID:
				case NUMBER:
					{
					setState(192);
					termo();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tokParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(tokParser.NUMBER, 0); }
		public Termo_oneContext termo_one() {
			return getRuleContext(Termo_oneContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termo);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(ID);

								_varName = _input.LT(-1).getText();
								_varValueOtherVerificad = _varName;
								if (!symbolTable.exist(_varName)) {
									exception.variableNotExist(_varName);
								} else if (!symbolTable.typeInvalid(_varValueVerificad, _varValueOtherVerificad)) {
									exception.typeIncorret(_varValueVerificad, _varValueOtherVerificad);
								}
								_content += _input.LT(-1).getText();
							
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(NUMBER);
				_content += _input.LT(-1).getText();
				}
				break;
			case ABREP:
			case FECHAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				termo_one();
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

	public static class Termo_oneContext extends ParserRuleContext {
		public TerminalNode ABREP() { return getToken(tokParser.ABREP, 0); }
		public TerminalNode FECHAP() { return getToken(tokParser.FECHAP, 0); }
		public Termo_oneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).enterTermo_one(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tokListener ) ((tokListener)listener).exitTermo_one(this);
		}
	}

	public final Termo_oneContext termo_one() throws RecognitionException {
		Termo_oneContext _localctx = new Termo_oneContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termo_one);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABREP:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(ABREP);
				_content += _input.LT(-1).getText();
				}
				break;
			case FECHAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(FECHAP);
				_content += _input.LT(-1).getText();
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00d4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004"+
		"\u0001&\b\u0001\u000b\u0001\f\u0001\'\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002/\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00024\b\u0002\n\u0002\f\u00027\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003A\b\u0003\u0001\u0004\u0001\u0004\u0004\u0004"+
		"E\b\u0004\u000b\u0004\f\u0004F\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007e\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bn\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bu\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u0083\b\t\u000b\t\f\t\u0084"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u008d\b\t\u000b"+
		"\t\f\t\u008e\u0001\t\u0001\t\u0001\t\u0003\t\u0094\b\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u00a2\b\n\u000b\n\f\n\u00a3\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00ad\b\u000b"+
		"\u000b\u000b\f\u000b\u00ae\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00c2\b\f\n\f\f\f\u00c5\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00cc\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00d2\b\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001"+
		"\u0000\u0017\u0018\u0001\u0000\u0016\u0017\u00dd\u0000\u001e\u0001\u0000"+
		"\u0000\u0000\u0002%\u0001\u0000\u0000\u0000\u0004)\u0001\u0000\u0000\u0000"+
		"\u0006@\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000\u0000\nN\u0001\u0000"+
		"\u0000\u0000\fY\u0001\u0000\u0000\u0000\u000ed\u0001\u0000\u0000\u0000"+
		"\u0010t\u0001\u0000\u0000\u0000\u0012v\u0001\u0000\u0000\u0000\u0014\u0095"+
		"\u0001\u0000\u0000\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018\u00bd"+
		"\u0001\u0000\u0000\u0000\u001a\u00cb\u0001\u0000\u0000\u0000\u001c\u00d1"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f \u0003"+
		"\u0002\u0001\u0000 !\u0003\b\u0004\u0000!\"\u0005\u0002\u0000\u0000\""+
		"#\u0006\u0000\uffff\uffff\u0000#\u0001\u0001\u0000\u0000\u0000$&\u0003"+
		"\u0004\u0002\u0000%$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(\u0003\u0001\u0000"+
		"\u0000\u0000)*\u0003\u0006\u0003\u0000*+\u0005\u0016\u0000\u0000+.\u0006"+
		"\u0002\uffff\uffff\u0000,-\u0005\u0015\u0000\u0000-/\u0007\u0000\u0000"+
		"\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/5\u0001\u0000"+
		"\u0000\u000001\u0005\u0011\u0000\u000012\u0005\u0016\u0000\u000024\u0006"+
		"\u0002\uffff\uffff\u000030\u0001\u0000\u0000\u000047\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000089\u0005\u0010\u0000\u00009\u0005"+
		"\u0001\u0000\u0000\u0000:;\u0005\u0003\u0000\u0000;A\u0006\u0003\uffff"+
		"\uffff\u0000<=\u0005\u0004\u0000\u0000=A\u0006\u0003\uffff\uffff\u0000"+
		">?\u0005\u0005\u0000\u0000?A\u0006\u0003\uffff\uffff\u0000@:\u0001\u0000"+
		"\u0000\u0000@<\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000A\u0007"+
		"\u0001\u0000\u0000\u0000BD\u0006\u0004\uffff\uffff\u0000CE\u0003\n\u0005"+
		"\u0000DC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000G\t\u0001\u0000\u0000\u0000HO\u0003"+
		"\f\u0006\u0000IO\u0003\u000e\u0007\u0000JO\u0003\u0010\b\u0000KO\u0003"+
		"\u0012\t\u0000LO\u0003\u0014\n\u0000MO\u0003\u0016\u000b\u0000NH\u0001"+
		"\u0000\u0000\u0000NI\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000"+
		"NK\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000"+
		"\u0000O\u000b\u0001\u0000\u0000\u0000PQ\u0005\u0006\u0000\u0000QR\u0005"+
		"\f\u0000\u0000RS\u0005\u0016\u0000\u0000ST\u0006\u0006\uffff\uffff\u0000"+
		"TU\u0005\r\u0000\u0000UV\u0005\u0010\u0000\u0000VW\u0006\u0006\uffff\uffff"+
		"\u0000WZ\u0006\u0006\uffff\uffff\u0000XZ\u0003\u0004\u0002\u0000YP\u0001"+
		"\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\r\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0007\u0000\u0000\\]\u0005\f\u0000\u0000]^\u0005\u0016\u0000"+
		"\u0000^_\u0006\u0007\uffff\uffff\u0000_`\u0005\r\u0000\u0000`a\u0005\u0010"+
		"\u0000\u0000ab\u0006\u0007\uffff\uffff\u0000be\u0006\u0007\uffff\uffff"+
		"\u0000ce\u0003\u0004\u0002\u0000d[\u0001\u0000\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000e\u000f\u0001\u0000\u0000\u0000fg\u0005\u0016\u0000\u0000"+
		"gh\u0006\b\uffff\uffff\u0000hi\u0005\u0015\u0000\u0000im\u0006\b\uffff"+
		"\uffff\u0000jk\u0005\u0018\u0000\u0000kn\u0006\b\uffff\uffff\u0000ln\u0003"+
		"\u0018\f\u0000mj\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0006\b\uffff\uffff\u0000pq\u0005\u0010\u0000\u0000"+
		"qr\u0006\b\uffff\uffff\u0000ru\u0006\b\uffff\uffff\u0000su\u0003\u0004"+
		"\u0002\u0000tf\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\u0011"+
		"\u0001\u0000\u0000\u0000vw\u0005\b\u0000\u0000wx\u0005\f\u0000\u0000x"+
		"y\u0007\u0001\u0000\u0000yz\u0006\t\uffff\uffff\u0000z{\u0005\u0013\u0000"+
		"\u0000{|\u0006\t\uffff\uffff\u0000|}\u0007\u0001\u0000\u0000}~\u0006\t"+
		"\uffff\uffff\u0000~\u007f\u0005\r\u0000\u0000\u007f\u0080\u0005\u000e"+
		"\u0000\u0000\u0080\u0082\u0006\t\uffff\uffff\u0000\u0081\u0083\u0003\n"+
		"\u0005\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0006\t\uffff"+
		"\uffff\u0000\u0087\u0093\u0005\u000f\u0000\u0000\u0088\u0089\u0005\t\u0000"+
		"\u0000\u0089\u008a\u0005\u000e\u0000\u0000\u008a\u008c\u0006\t\uffff\uffff"+
		"\u0000\u008b\u008d\u0003\n\u0005\u0000\u008c\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0005\u000f\u0000\u0000\u0091\u0092\u0006\t\uffff\uffff\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0088\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0013\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\n\u0000\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097"+
		"\u0098\u0007\u0001\u0000\u0000\u0098\u0099\u0006\n\uffff\uffff\u0000\u0099"+
		"\u009a\u0005\u0013\u0000\u0000\u009a\u009b\u0006\n\uffff\uffff\u0000\u009b"+
		"\u009c\u0007\u0001\u0000\u0000\u009c\u009d\u0006\n\uffff\uffff\u0000\u009d"+
		"\u009e\u0005\r\u0000\u0000\u009e\u009f\u0005\u000e\u0000\u0000\u009f\u00a1"+
		"\u0006\n\uffff\uffff\u0000\u00a0\u00a2\u0003\n\u0005\u0000\u00a1\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u000f\u0000\u0000\u00a6\u00a7"+
		"\u0006\n\uffff\uffff\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005\u000b\u0000\u0000\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u00ac"+
		"\u0006\u000b\uffff\uffff\u0000\u00ab\u00ad\u0003\n\u0005\u0000\u00ac\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005\u000f\u0000\u0000\u00b1\u00b2"+
		"\u0005\n\u0000\u0000\u00b2\u00b3\u0005\f\u0000\u0000\u00b3\u00b4\u0007"+
		"\u0001\u0000\u0000\u00b4\u00b5\u0006\u000b\uffff\uffff\u0000\u00b5\u00b6"+
		"\u0005\u0013\u0000\u0000\u00b6\u00b7\u0006\u000b\uffff\uffff\u0000\u00b7"+
		"\u00b8\u0007\u0001\u0000\u0000\u00b8\u00b9\u0006\u000b\uffff\uffff\u0000"+
		"\u00b9\u00ba\u0005\r\u0000\u0000\u00ba\u00bb\u0005\u0010\u0000\u0000\u00bb"+
		"\u00bc\u0006\u000b\uffff\uffff\u0000\u00bc\u0017\u0001\u0000\u0000\u0000"+
		"\u00bd\u00c3\u0003\u001a\r\u0000\u00be\u00bf\u0005\u0012\u0000\u0000\u00bf"+
		"\u00c2\u0006\f\uffff\uffff\u0000\u00c0\u00c2\u0003\u001a\r\u0000\u00c1"+
		"\u00be\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c4\u0019\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0016\u0000\u0000\u00c7"+
		"\u00cc\u0006\r\uffff\uffff\u0000\u00c8\u00c9\u0005\u0017\u0000\u0000\u00c9"+
		"\u00cc\u0006\r\uffff\uffff\u0000\u00ca\u00cc\u0003\u001c\u000e\u0000\u00cb"+
		"\u00c6\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u001b\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0005\f\u0000\u0000\u00ce\u00d2\u0006\u000e\uffff\uffff\u0000\u00cf"+
		"\u00d0\u0005\r\u0000\u0000\u00d0\u00d2\u0006\u000e\uffff\uffff\u0000\u00d1"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u001d\u0001\u0000\u0000\u0000\u0013\'.5@FNYdmt\u0084\u008e\u0093\u00a3"+
		"\u00ae\u00c1\u00c3\u00cb\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}