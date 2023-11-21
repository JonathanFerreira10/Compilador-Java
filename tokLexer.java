// Generated from tok.g4 by ANTLR 4.10.1
 
	import java.util.*; 
	import java.util.Scanner.*;
	import java.util.ArrayList;
	import java.util.Stack;
	import java.lang.*;
	import java.io.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tokLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ABREP=12, FECHAP=13, ABRECH=14, FECHACH=15, ARROB=16, 
		VIR=17, OP=18, OPERAR=19, OPERLOG=20, ATTR=21, ID=22, NUMBER=23, TEXTO=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "ABREP", "FECHAP", "ABRECH", "FECHACH", "ARROB", "VIR", 
			"OP", "OPERAR", "OPERLOG", "ATTR", "ID", "NUMBER", "TEXTO", "WS"
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



	public tokLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tok.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u00c0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u008f\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0095\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u009b\b\u0015\n\u0015\f\u0015\u009e\t\u0015\u0001"+
		"\u0016\u0004\u0016\u00a1\b\u0016\u000b\u0016\f\u0016\u00a2\u0001\u0016"+
		"\u0001\u0016\u0004\u0016\u00a7\b\u0016\u000b\u0016\f\u0016\u00a8\u0003"+
		"\u0016\u00ab\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u00af\b\u0017"+
		"\u0001\u0017\u0003\u0017\u00b2\b\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u00b6\b\u0017\n\u0017\f\u0017\u00b9\t\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u0018"+
		"1\u0019\u0001\u0000\u0007\u0003\u0000*+--//\u0002\u0000<<>>\u0001\u0000"+
		"az\u0003\u000009AZaz\u0001\u000009\u0001\u0000AZ\u0003\u0000\t\n\r\r "+
		" \u00cc\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000"+
		"!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000"+
		"\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000"+
		"\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00013"+
		"\u0001\u0000\u0000\u0000\u0003:\u0001\u0000\u0000\u0000\u0005B\u0001\u0000"+
		"\u0000\u0000\u0007I\u0001\u0000\u0000\u0000\tO\u0001\u0000\u0000\u0000"+
		"\u000bU\u0001\u0000\u0000\u0000\rY\u0001\u0000\u0000\u0000\u000fa\u0001"+
		"\u0000\u0000\u0000\u0011d\u0001\u0000\u0000\u0000\u0013j\u0001\u0000\u0000"+
		"\u0000\u0015s\u0001\u0000\u0000\u0000\u0017w\u0001\u0000\u0000\u0000\u0019"+
		"y\u0001\u0000\u0000\u0000\u001b{\u0001\u0000\u0000\u0000\u001d}\u0001"+
		"\u0000\u0000\u0000\u001f\u007f\u0001\u0000\u0000\u0000!\u0081\u0001\u0000"+
		"\u0000\u0000#\u0083\u0001\u0000\u0000\u0000%\u008e\u0001\u0000\u0000\u0000"+
		"\'\u0094\u0001\u0000\u0000\u0000)\u0096\u0001\u0000\u0000\u0000+\u0098"+
		"\u0001\u0000\u0000\u0000-\u00a0\u0001\u0000\u0000\u0000/\u00ac\u0001\u0000"+
		"\u0000\u00001\u00bc\u0001\u0000\u0000\u000034\u0005i\u0000\u000045\u0005"+
		"n\u0000\u000056\u0005i\u0000\u000067\u0005c\u0000\u000078\u0005i\u0000"+
		"\u000089\u0005o\u0000\u00009\u0002\u0001\u0000\u0000\u0000:;\u0005f\u0000"+
		"\u0000;<\u0005i\u0000\u0000<=\u0005m\u0000\u0000=>\u0005p\u0000\u0000"+
		">?\u0005r\u0000\u0000?@\u0005o\u0000\u0000@A\u0005g\u0000\u0000A\u0004"+
		"\u0001\u0000\u0000\u0000BC\u0005n\u0000\u0000CD\u0005u\u0000\u0000DE\u0005"+
		"m\u0000\u0000EF\u0005e\u0000\u0000FG\u0005r\u0000\u0000GH\u0005o\u0000"+
		"\u0000H\u0006\u0001\u0000\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005e\u0000"+
		"\u0000KL\u0005x\u0000\u0000LM\u0005t\u0000\u0000MN\u0005o\u0000\u0000"+
		"N\b\u0001\u0000\u0000\u0000OP\u0005f\u0000\u0000PQ\u0005l\u0000\u0000"+
		"QR\u0005o\u0000\u0000RS\u0005a\u0000\u0000ST\u0005t\u0000\u0000T\n\u0001"+
		"\u0000\u0000\u0000UV\u0005l\u0000\u0000VW\u0005e\u0000\u0000WX\u0005r"+
		"\u0000\u0000X\f\u0001\u0000\u0000\u0000YZ\u0005e\u0000\u0000Z[\u0005s"+
		"\u0000\u0000[\\\u0005c\u0000\u0000\\]\u0005r\u0000\u0000]^\u0005e\u0000"+
		"\u0000^_\u0005v\u0000\u0000_`\u0005a\u0000\u0000`\u000e\u0001\u0000\u0000"+
		"\u0000ab\u0005s\u0000\u0000bc\u0005e\u0000\u0000c\u0010\u0001\u0000\u0000"+
		"\u0000de\u0005s\u0000\u0000ef\u0005e\u0000\u0000fg\u0005n\u0000\u0000"+
		"gh\u0005a\u0000\u0000hi\u0005o\u0000\u0000i\u0012\u0001\u0000\u0000\u0000"+
		"jk\u0005e\u0000\u0000kl\u0005n\u0000\u0000lm\u0005q\u0000\u0000mn\u0005"+
		"u\u0000\u0000no\u0005a\u0000\u0000op\u0005n\u0000\u0000pq\u0005t\u0000"+
		"\u0000qr\u0005o\u0000\u0000r\u0014\u0001\u0000\u0000\u0000st\u0005f\u0000"+
		"\u0000tu\u0005a\u0000\u0000uv\u0005z\u0000\u0000v\u0016\u0001\u0000\u0000"+
		"\u0000wx\u0005(\u0000\u0000x\u0018\u0001\u0000\u0000\u0000yz\u0005)\u0000"+
		"\u0000z\u001a\u0001\u0000\u0000\u0000{|\u0005{\u0000\u0000|\u001c\u0001"+
		"\u0000\u0000\u0000}~\u0005}\u0000\u0000~\u001e\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0005@\u0000\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005,\u0000\u0000\u0082\"\u0001\u0000\u0000\u0000\u0083\u0084\u0007"+
		"\u0000\u0000\u0000\u0084$\u0001\u0000\u0000\u0000\u0085\u008f\u0007\u0001"+
		"\u0000\u0000\u0086\u0087\u0005>\u0000\u0000\u0087\u008f\u0005=\u0000\u0000"+
		"\u0088\u0089\u0005<\u0000\u0000\u0089\u008f\u0005=\u0000\u0000\u008a\u008b"+
		"\u0005=\u0000\u0000\u008b\u008f\u0005=\u0000\u0000\u008c\u008d\u0005!"+
		"\u0000\u0000\u008d\u008f\u0005=\u0000\u0000\u008e\u0085\u0001\u0000\u0000"+
		"\u0000\u008e\u0086\u0001\u0000\u0000\u0000\u008e\u0088\u0001\u0000\u0000"+
		"\u0000\u008e\u008a\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000"+
		"\u0000\u008f&\u0001\u0000\u0000\u0000\u0090\u0091\u0005&\u0000\u0000\u0091"+
		"\u0095\u0005&\u0000\u0000\u0092\u0093\u0005|\u0000\u0000\u0093\u0095\u0005"+
		"|\u0000\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0095(\u0001\u0000\u0000\u0000\u0096\u0097\u0005=\u0000\u0000"+
		"\u0097*\u0001\u0000\u0000\u0000\u0098\u009c\u0007\u0002\u0000\u0000\u0099"+
		"\u009b\u0007\u0003\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d,\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0007\u0004\u0000\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005.\u0000\u0000\u00a5\u00a7\u0007"+
		"\u0004\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a4\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab.\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ae\u0005\"\u0000\u0000\u00ad\u00af\u0007\u0002\u0000"+
		"\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000"+
		"\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00b2\u0007\u0005\u0000"+
		"\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b7\u0001\u0000\u0000\u0000\u00b3\u00b6\u0007\u0003\u0000"+
		"\u0000\u00b4\u00b6\u00031\u0018\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0005\"\u0000\u0000\u00bb0\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0007\u0006\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0006\u0018\u0000\u0000\u00bf2\u0001\u0000\u0000\u0000\f\u0000"+
		"\u008e\u0094\u009a\u009c\u00a2\u00a8\u00aa\u00ae\u00b1\u00b5\u00b7\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}