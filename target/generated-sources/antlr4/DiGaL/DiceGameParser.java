// Generated from DiceGame.g4 by ANTLR 4.4
package digal;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DiceGameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__63=1, T__62=2, T__61=3, T__60=4, T__59=5, T__58=6, T__57=7, T__56=8, 
		T__55=9, T__54=10, T__53=11, T__52=12, T__51=13, T__50=14, T__49=15, T__48=16, 
		T__47=17, T__46=18, T__45=19, T__44=20, T__43=21, T__42=22, T__41=23, 
		T__40=24, T__39=25, T__38=26, T__37=27, T__36=28, T__35=29, T__34=30, 
		T__33=31, T__32=32, T__31=33, T__30=34, T__29=35, T__28=36, T__27=37, 
		T__26=38, T__25=39, T__24=40, T__23=41, T__22=42, T__21=43, T__20=44, 
		T__19=45, T__18=46, T__17=47, T__16=48, T__15=49, T__14=50, T__13=51, 
		T__12=52, T__11=53, T__10=54, T__9=55, T__8=56, T__7=57, T__6=58, T__5=59, 
		T__4=60, T__3=61, T__2=62, T__1=63, T__0=64, INT=65, ID=66, COMMENT=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'würfel '", "'legt würfel aus '", "' mal '", "'allen spielern'", 
		"'das spiel ist für '", "'aller würfel'", "'spieler haben die werte '", 
		"' ist '", "' nicht '", "'nächster spieler ist dran'", "'alle spieler'", 
		"' '", "'das spiel hat den wert '", "' absteigend'", "'('", "' inaktiv ist'", 
		"'würfelt mit '", "'setze '", "'sortiert '", "'allen würfeln'", "'\n'", 
		"'aller spieler'", "'spieler '", "' wird so gespielt:\n'", "' - '", "' hat diese seiten:'", 
		"' gilt'", "' oder '", "' + '", "', sonst '", "'wahr'", "'spieler sind aktiv, solange '", 
		"', dann '", "' spieler geeignet'", "' in '", "', '", "' auf '", "'.\n'", 
		"'rechter spieler'", "' aufsteigend'", "';'", "'alle würfel'", "'falsch'", 
		"'spieler #'", "' größergleich '", "' und '", "'aktueller spieler'", "'macht '", 
		"'linker spieler'", "' bis '", "'wenn '", "'der spieler'", "':'", "' kleiner als '", 
		"'das spiel hat folgende würfel:'", "' * '", "' ist die summe '", "' gleich '", 
		"' größer als '", "')'", "'für '", "'ist ein spieler am zug macht er folgendes:\n'", 
		"' kleinergleich '", "'würfel #'", "INT", "ID", "COMMENT"
	};
	public static final int
		RULE_game = 0, RULE_gameinit = 1, RULE_diceinit = 2, RULE_face = 3, RULE_playerinit = 4, 
		RULE_var = 5, RULE_loop = 6, RULE_action = 7, RULE_dicesaction = 8, RULE_playerobject = 9, 
		RULE_playerobjects = 10, RULE_diceobject = 11, RULE_diceobjects = 12, 
		RULE_variable = 13, RULE_expr = 14, RULE_assignment = 15, RULE_law = 16, 
		RULE_condition = 17;
	public static final String[] ruleNames = {
		"game", "gameinit", "diceinit", "face", "playerinit", "var", "loop", "action", 
		"dicesaction", "playerobject", "playerobjects", "diceobject", "diceobjects", 
		"variable", "expr", "assignment", "law", "condition"
	};

	@Override
	public String getGrammarFileName() { return "DiceGame.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DiceGameParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GameContext extends ParserRuleContext {
		public Token NAME;
		public GameinitContext GAMEINIT;
		public PlayerinitContext PLAYERINIT;
		public Token PLAY;
		public ActionContext ACTION;
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public List<PlayerinitContext> playerinit() {
			return getRuleContexts(PlayerinitContext.class);
		}
		public GameinitContext gameinit(int i) {
			return getRuleContext(GameinitContext.class,i);
		}
		public List<GameinitContext> gameinit() {
			return getRuleContexts(GameinitContext.class);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public PlayerinitContext playerinit(int i) {
			return getRuleContext(PlayerinitContext.class,i);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitGame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitGame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); ((GameContext)_localctx).NAME = match(ID);
			setState(37); match(T__40);
			setState(38); match(T__43);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39); ((GameContext)_localctx).GAMEINIT = gameinit();
				setState(40); match(T__26);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__51) | (1L << T__9))) != 0) );
			setState(46); match(T__43);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47); ((GameContext)_localctx).PLAYERINIT = playerinit();
				setState(48); match(T__26);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__57 || _la==T__32 );
			setState(54); match(T__43);
			setState(55); ((GameContext)_localctx).PLAY = match(T__2);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__63) | (1L << T__62) | (1L << T__60) | (1L << T__58) | (1L << T__54) | (1L << T__53) | (1L << T__47) | (1L << T__46) | (1L << T__45) | (1L << T__44) | (1L << T__42) | (1L << T__41) | (1L << T__25) | (1L << T__22) | (1L << T__20) | (1L << T__17) | (1L << T__16) | (1L << T__15) | (1L << T__13) | (1L << T__12) | (1L << T__3))) != 0) || _la==T__0 || _la==ID) {
				{
				{
				setState(56); ((GameContext)_localctx).ACTION = action(0);
				setState(57); match(T__26);
				}
				}
				setState(63);
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

	public static class GameinitContext extends ParserRuleContext {
		public AssignmentContext ASSN;
		public Token FROM;
		public Token TO;
		public DiceinitContext DICEINIT;
		public TerminalNode INT(int i) {
			return getToken(DiceGameParser.INT, i);
		}
		public List<DiceinitContext> diceinit() {
			return getRuleContexts(DiceinitContext.class);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DiceinitContext diceinit(int i) {
			return getRuleContext(DiceinitContext.class,i);
		}
		public List<TerminalNode> INT() { return getTokens(DiceGameParser.INT); }
		public GameinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameinit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterGameinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitGameinit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitGameinit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameinitContext gameinit() throws RecognitionException {
		GameinitContext _localctx = new GameinitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_gameinit);
		int _la;
		try {
			setState(79);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(T__51);
				setState(65); ((GameinitContext)_localctx).ASSN = assignment();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(T__59);
				setState(67); ((GameinitContext)_localctx).FROM = match(INT);
				setState(68); match(T__14);
				setState(69); ((GameinitContext)_localctx).TO = match(INT);
				setState(70); match(T__30);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); match(T__9);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__43) {
					{
					{
					setState(72); match(T__43);
					setState(73); ((GameinitContext)_localctx).DICEINIT = diceinit();
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DiceinitContext extends ParserRuleContext {
		public Token NAME;
		public FaceContext FACE;
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public List<FaceContext> face() {
			return getRuleContexts(FaceContext.class);
		}
		public FaceContext face(int i) {
			return getRuleContext(FaceContext.class,i);
		}
		public DiceinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diceinit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterDiceinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitDiceinit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitDiceinit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiceinitContext diceinit() throws RecognitionException {
		DiceinitContext _localctx = new DiceinitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_diceinit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(T__63);
			setState(82); ((DiceinitContext)_localctx).NAME = match(ID);
			setState(83); match(T__38);
			setState(86); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84); match(T__52);
				setState(85); ((DiceinitContext)_localctx).FACE = face();
				}
				}
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__52 );
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

	public static class FaceContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiceGameParser.INT, 0); }
		public FaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_face; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterFace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitFace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitFace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FaceContext face() throws RecognitionException {
		FaceContext _localctx = new FaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_face);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(INT);
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

	public static class PlayerinitContext extends ParserRuleContext {
		public AssignmentContext ASSN;
		public ConditionContext PLAYERACTIVECOND;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public PlayerinitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerinit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterPlayerinit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitPlayerinit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitPlayerinit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerinitContext playerinit() throws RecognitionException {
		PlayerinitContext _localctx = new PlayerinitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_playerinit);
		try {
			setState(98);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); match(T__57);
				setState(93); ((PlayerinitContext)_localctx).ASSN = assignment();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(94); match(T__32);
				setState(95); ((PlayerinitContext)_localctx).PLAYERACTIVECOND = condition(0);
				setState(96); match(T__37);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(ID);
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

	public static class LoopContext extends ParserRuleContext {
		public PlayerobjectsContext PLAYEROBJETS;
		public Token VAR;
		public ActionContext ACTION;
		public DiceobjectsContext DICEOBJECTS;
		public Token VALUE;
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
		}
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode INT() { return getToken(DiceGameParser.INT, 0); }
		public PlayerobjectsContext playerobjects() {
			return getRuleContext(PlayerobjectsContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		try {
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); match(T__3);
				setState(103); ((LoopContext)_localctx).PLAYEROBJETS = playerobjects();
				setState(104); match(T__52);
				setState(105); ((LoopContext)_localctx).VAR = match(ID);
				setState(106); match(T__52);
				setState(107); ((LoopContext)_localctx).ACTION = action(0);
				setState(108); match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(T__3);
				setState(111); ((LoopContext)_localctx).DICEOBJECTS = diceobjects();
				setState(112); match(T__52);
				setState(113); ((LoopContext)_localctx).VAR = match(ID);
				setState(114); match(T__52);
				setState(115); ((LoopContext)_localctx).ACTION = action(0);
				setState(116); match(T__23);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(T__16);
				setState(119); ((LoopContext)_localctx).VALUE = match(INT);
				setState(120); match(T__61);
				setState(121); ((LoopContext)_localctx).ACTION = action(0);
				setState(122); match(T__23);
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext ACTION1;
		public AssignmentContext ASSIGNMENT;
		public DicesactionContext DICEACTION;
		public LoopContext LOOP;
		public LawContext LAW;
		public Token NEXT;
		public ActionContext ACTION2;
		public LawContext law() {
			return getRuleContext(LawContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public DicesactionContext dicesaction() {
			return getRuleContext(DicesactionContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		return action(0);
	}

	private ActionContext action(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ActionContext _localctx = new ActionContext(_ctx, _parentState);
		ActionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_action, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			switch (_input.LA(1)) {
			case T__63:
			case T__60:
			case T__58:
			case T__53:
			case T__46:
			case T__44:
			case T__42:
			case T__41:
			case T__25:
			case T__22:
			case T__20:
			case T__17:
			case T__15:
			case T__12:
			case T__0:
			case ID:
				{
				setState(127); ((ActionContext)_localctx).ASSIGNMENT = assignment();
				}
				break;
			case T__62:
			case T__47:
			case T__45:
				{
				setState(128); ((ActionContext)_localctx).DICEACTION = dicesaction();
				}
				break;
			case T__16:
			case T__3:
				{
				setState(129); ((ActionContext)_localctx).LOOP = loop();
				}
				break;
			case T__13:
				{
				setState(130); ((ActionContext)_localctx).LAW = law();
				}
				break;
			case T__54:
				{
				setState(131); ((ActionContext)_localctx).NEXT = match(T__54);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionContext(_parentctx, _parentState);
					_localctx.ACTION1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_action);
					setState(134);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(135); match(T__18);
					setState(136); ((ActionContext)_localctx).ACTION2 = action(5);
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DicesactionContext extends ParserRuleContext {
		public List<DiceobjectsContext> diceobjects() {
			return getRuleContexts(DiceobjectsContext.class);
		}
		public DiceobjectsContext diceobjects(int i) {
			return getRuleContext(DiceobjectsContext.class,i);
		}
		public DicesactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dicesaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterDicesaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitDicesaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitDicesaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DicesactionContext dicesaction() throws RecognitionException {
		DicesactionContext _localctx = new DicesactionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dicesaction);
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142); match(T__47);
				setState(143); diceobjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(T__45);
				setState(145); diceobjects();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(T__45);
				setState(147); diceobjects();
				setState(148); match(T__24);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150); match(T__45);
				setState(151); diceobjects();
				setState(152); match(T__50);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154); match(T__62);
				setState(155); diceobjects();
				setState(156); match(T__29);
				setState(157); diceobjects();
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

	public static class PlayerobjectContext extends ParserRuleContext {
		public Token CUR;
		public Token NAME;
		public Token POS;
		public Token RIGHT;
		public Token LEFT;
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public TerminalNode INT() { return getToken(DiceGameParser.INT, 0); }
		public PlayerobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterPlayerobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitPlayerobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitPlayerobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerobjectContext playerobject() throws RecognitionException {
		PlayerobjectContext _localctx = new PlayerobjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_playerobject);
		try {
			setState(169);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); ((PlayerobjectContext)_localctx).CUR = match(T__12);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); ((PlayerobjectContext)_localctx).CUR = match(T__17);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(163); match(T__41);
				setState(164); ((PlayerobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(165); match(T__20);
				setState(166); ((PlayerobjectContext)_localctx).POS = match(INT);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(167); ((PlayerobjectContext)_localctx).RIGHT = match(T__25);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(168); ((PlayerobjectContext)_localctx).LEFT = match(T__15);
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

	public static class PlayerobjectsContext extends ParserRuleContext {
		public Token ALL;
		public PlayerobjectContext PO;
		public PlayerobjectContext LAST;
		public PlayerobjectContext playerobject(int i) {
			return getRuleContext(PlayerobjectContext.class,i);
		}
		public List<PlayerobjectContext> playerobject() {
			return getRuleContexts(PlayerobjectContext.class);
		}
		public PlayerobjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playerobjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterPlayerobjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitPlayerobjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitPlayerobjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerobjectsContext playerobjects() throws RecognitionException {
		PlayerobjectsContext _localctx = new PlayerobjectsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_playerobjects);
		try {
			int _alt;
			setState(183);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); ((PlayerobjectsContext)_localctx).ALL = match(T__53);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); ((PlayerobjectsContext)_localctx).ALL = match(T__60);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); ((PlayerobjectsContext)_localctx).ALL = match(T__42);
				}
				break;
			case T__41:
			case T__25:
			case T__20:
			case T__17:
			case T__15:
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(174); ((PlayerobjectsContext)_localctx).PO = playerobject();
						setState(175); match(T__28);
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(182); ((PlayerobjectsContext)_localctx).LAST = playerobject();
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

	public static class DiceobjectContext extends ParserRuleContext {
		public Token NAME;
		public Token POS;
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public TerminalNode INT() { return getToken(DiceGameParser.INT, 0); }
		public DiceobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diceobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterDiceobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitDiceobject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitDiceobject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiceobjectContext diceobject() throws RecognitionException {
		DiceobjectContext _localctx = new DiceobjectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_diceobject);
		try {
			setState(189);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(T__63);
				setState(186); ((DiceobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(187); match(T__0);
				setState(188); ((DiceobjectContext)_localctx).POS = match(INT);
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

	public static class DiceobjectsContext extends ParserRuleContext {
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
		}
		public DiceobjectContext diceobject() {
			return getRuleContext(DiceobjectContext.class,0);
		}
		public DiceobjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_diceobjects; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterDiceobjects(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitDiceobjects(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitDiceobjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DiceobjectsContext diceobjects() throws RecognitionException {
		DiceobjectsContext _localctx = new DiceobjectsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_diceobjects);
		try {
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(T__44);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193); match(T__58);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(194); diceobject();
				setState(195); match(T__28);
				setState(196); diceobjects();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(198); diceobject();
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext INST;
		public Token IDENT;
		public DiceobjectsContext DO;
		public PlayerobjectsContext PO;
		public VariableContext VAR;
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
		}
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public PlayerobjectsContext playerobjects() {
			return getRuleContext(PlayerobjectsContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		return variable(0);
	}

	private VariableContext variable(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableContext _localctx = new VariableContext(_ctx, _parentState);
		VariableContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_variable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(202); ((VariableContext)_localctx).IDENT = match(ID);
				}
				break;
			case T__63:
			case T__58:
			case T__44:
			case T__22:
			case T__0:
				{
				setState(203); ((VariableContext)_localctx).DO = diceobjects();
				}
				break;
			case T__60:
			case T__53:
			case T__42:
			case T__41:
			case T__25:
			case T__20:
			case T__17:
			case T__15:
			case T__12:
				{
				setState(204); ((VariableContext)_localctx).PO = playerobjects();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableContext(_parentctx, _parentState);
					_localctx.INST = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_variable);
					setState(207);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(208); match(T__11);
					setState(209); ((VariableContext)_localctx).VAR = variable(2);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext A;
		public Token INTEGER;
		public ExprContext E;
		public VariableContext VAR;
		public Token OP;
		public ExprContext B;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(DiceGameParser.INT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(216); ((ExprContext)_localctx).INTEGER = match(INT);
				}
				break;
			case T__49:
				{
				setState(217); match(T__49);
				setState(218); ((ExprContext)_localctx).E = expr(0);
				setState(219); match(T__4);
				}
				break;
			case T__63:
			case T__60:
			case T__58:
			case T__53:
			case T__44:
			case T__42:
			case T__41:
			case T__25:
			case T__22:
			case T__20:
			case T__17:
			case T__15:
			case T__12:
			case T__0:
			case ID:
				{
				setState(221); ((ExprContext)_localctx).VAR = variable(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(225); ((ExprContext)_localctx).OP = match(T__8);
						setState(226); ((ExprContext)_localctx).B = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(228);
						((ExprContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__35) ) {
							((ExprContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(229); ((ExprContext)_localctx).B = expr(5);
						}
						break;
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext V;
		public Token OP;
		public ExprContext E;
		public PlayerobjectContext P;
		public Token OPSUM;
		public DiceobjectsContext DICES;
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PlayerobjectContext playerobject() {
			return getRuleContext(PlayerobjectContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); ((AssignmentContext)_localctx).V = variable(0);
				setState(236); ((AssignmentContext)_localctx).OP = match(T__56);
				setState(237); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); match(T__46);
				setState(240); ((AssignmentContext)_localctx).V = variable(0);
				setState(241); ((AssignmentContext)_localctx).OP = match(T__27);
				setState(242); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244); ((AssignmentContext)_localctx).V = variable(0);
				setState(245); ((AssignmentContext)_localctx).OP = match(T__56);
				setState(246); ((AssignmentContext)_localctx).P = playerobject();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248); ((AssignmentContext)_localctx).V = variable(0);
				setState(249); ((AssignmentContext)_localctx).OPSUM = match(T__7);
				setState(250); ((AssignmentContext)_localctx).DICES = diceobjects();
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

	public static class LawContext extends ParserRuleContext {
		public ConditionContext COND;
		public ActionContext THEN;
		public ActionContext ELSE;
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_law; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterLaw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitLaw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitLaw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LawContext law() throws RecognitionException {
		LawContext _localctx = new LawContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_law);
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); match(T__13);
				setState(255); ((LawContext)_localctx).COND = condition(0);
				setState(256); match(T__31);
				setState(257); ((LawContext)_localctx).THEN = action(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); match(T__13);
				setState(260); ((LawContext)_localctx).COND = condition(0);
				setState(261); match(T__31);
				setState(262); ((LawContext)_localctx).THEN = action(0);
				setState(263); match(T__34);
				setState(264); ((LawContext)_localctx).ELSE = action(0);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext C;
		public Token NOT;
		public ExprContext A;
		public Token EQ;
		public ExprContext B;
		public Token LT;
		public Token GT;
		public Token LE;
		public Token GE;
		public Token TRUE;
		public Token FALSE;
		public PlayerobjectContext PLAYER;
		public Token AND;
		public ConditionContext D;
		public Token OR;
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PlayerobjectContext playerobject() {
			return getRuleContext(PlayerobjectContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(269); ((ConditionContext)_localctx).NOT = match(T__55);
				setState(270); ((ConditionContext)_localctx).C = condition(4);
				}
				break;
			case 2:
				{
				setState(271); ((ConditionContext)_localctx).A = expr(0);
				setState(272); ((ConditionContext)_localctx).EQ = match(T__6);
				setState(273); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 3:
				{
				setState(275); ((ConditionContext)_localctx).A = expr(0);
				setState(276); ((ConditionContext)_localctx).LT = match(T__10);
				setState(277); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 4:
				{
				setState(279); ((ConditionContext)_localctx).A = expr(0);
				setState(280); ((ConditionContext)_localctx).GT = match(T__5);
				setState(281); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 5:
				{
				setState(283); ((ConditionContext)_localctx).A = expr(0);
				setState(284); ((ConditionContext)_localctx).LE = match(T__1);
				setState(285); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 6:
				{
				setState(287); ((ConditionContext)_localctx).A = expr(0);
				setState(288); ((ConditionContext)_localctx).GE = match(T__19);
				setState(289); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 7:
				{
				setState(291); ((ConditionContext)_localctx).TRUE = match(T__33);
				}
				break;
			case 8:
				{
				setState(292); ((ConditionContext)_localctx).FALSE = match(T__21);
				}
				break;
			case 9:
				{
				setState(293); ((ConditionContext)_localctx).PLAYER = playerobject();
				setState(294); match(T__48);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.C = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(298);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(299); ((ConditionContext)_localctx).AND = match(T__18);
						setState(300); ((ConditionContext)_localctx).D = condition(7);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.C = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(301);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(302); ((ConditionContext)_localctx).OR = match(T__36);
						setState(303); ((ConditionContext)_localctx).D = condition(6);
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return action_sempred((ActionContext)_localctx, predIndex);
		case 13: return variable_sempred((VariableContext)_localctx, predIndex);
		case 14: return expr_sempred((ExprContext)_localctx, predIndex);
		case 17: return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 6);
		case 5: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean action_sempred(ActionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\6\2-\n\2\r\2\16\2.\3\2\3\2\3\2\3\2"+
		"\6\2\65\n\2\r\2\16\2\66\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\5\3R\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6e\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0087\n\t\3\t\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f\13\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a2"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ac\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3\f\5\f\u00ba\n\f\3\r"+
		"\3\r\3\r\3\r\5\r\u00c0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00ca\n\16\3\17\3\17\3\17\3\17\5\17\u00d0\n\17\3\17\3\17\3\17\7\17\u00d5"+
		"\n\17\f\17\16\17\u00d8\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e1"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00e9\n\20\f\20\16\20\u00ec\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u00ff\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u010d\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u012b\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0133\n\23\f\23\16\23\u0136\13\23\3\23\2\6\20\34"+
		"\36$\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\3\4\2\33\33\37\37"+
		"\u015b\2&\3\2\2\2\4Q\3\2\2\2\6S\3\2\2\2\b\\\3\2\2\2\nd\3\2\2\2\ff\3\2"+
		"\2\2\16~\3\2\2\2\20\u0086\3\2\2\2\22\u00a1\3\2\2\2\24\u00ab\3\2\2\2\26"+
		"\u00b9\3\2\2\2\30\u00bf\3\2\2\2\32\u00c9\3\2\2\2\34\u00cf\3\2\2\2\36\u00e0"+
		"\3\2\2\2 \u00fe\3\2\2\2\"\u010c\3\2\2\2$\u012a\3\2\2\2&\'\7D\2\2\'(\7"+
		"\32\2\2(,\7\27\2\2)*\5\4\3\2*+\7(\2\2+-\3\2\2\2,)\3\2\2\2-.\3\2\2\2.,"+
		"\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\64\7\27\2\2\61\62\5\n\6\2\62\63\7(\2"+
		"\2\63\65\3\2\2\2\64\61\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2"+
		"\2\678\3\2\2\289\7\27\2\29?\7@\2\2:;\5\20\t\2;<\7(\2\2<>\3\2\2\2=:\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BC\7\17\2\2CR\5"+
		" \21\2DE\7\7\2\2EF\7C\2\2FG\7\64\2\2GH\7C\2\2HR\7$\2\2IN\79\2\2JK\7\27"+
		"\2\2KM\5\6\4\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2"+
		"\2\2QB\3\2\2\2QD\3\2\2\2QI\3\2\2\2R\5\3\2\2\2ST\7\3\2\2TU\7D\2\2UX\7\34"+
		"\2\2VW\7\16\2\2WY\5\b\5\2XV\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\7\3"+
		"\2\2\2\\]\7C\2\2]\t\3\2\2\2^_\7\t\2\2_e\5 \21\2`a\7\"\2\2ab\5$\23\2bc"+
		"\7\35\2\2ce\3\2\2\2d^\3\2\2\2d`\3\2\2\2e\13\3\2\2\2fg\7D\2\2g\r\3\2\2"+
		"\2hi\7?\2\2ij\5\26\f\2jk\7\16\2\2kl\7D\2\2lm\7\16\2\2mn\5\20\t\2no\7+"+
		"\2\2o\177\3\2\2\2pq\7?\2\2qr\5\32\16\2rs\7\16\2\2st\7D\2\2tu\7\16\2\2"+
		"uv\5\20\t\2vw\7+\2\2w\177\3\2\2\2xy\7\62\2\2yz\7C\2\2z{\7\5\2\2{|\5\20"+
		"\t\2|}\7+\2\2}\177\3\2\2\2~h\3\2\2\2~p\3\2\2\2~x\3\2\2\2\177\17\3\2\2"+
		"\2\u0080\u0081\b\t\1\2\u0081\u0087\5 \21\2\u0082\u0087\5\22\n\2\u0083"+
		"\u0087\5\16\b\2\u0084\u0087\5\"\22\2\u0085\u0087\7\f\2\2\u0086\u0080\3"+
		"\2\2\2\u0086\u0082\3\2\2\2\u0086\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008d\3\2\2\2\u0088\u0089\f\6\2\2\u0089\u008a\7\60"+
		"\2\2\u008a\u008c\5\20\t\7\u008b\u0088\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\21\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0091\7\23\2\2\u0091\u00a2\5\32\16\2\u0092\u0093\7\25\2\2\u0093"+
		"\u00a2\5\32\16\2\u0094\u0095\7\25\2\2\u0095\u0096\5\32\16\2\u0096\u0097"+
		"\7*\2\2\u0097\u00a2\3\2\2\2\u0098\u0099\7\25\2\2\u0099\u009a\5\32\16\2"+
		"\u009a\u009b\7\20\2\2\u009b\u00a2\3\2\2\2\u009c\u009d\7\4\2\2\u009d\u009e"+
		"\5\32\16\2\u009e\u009f\7%\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a2\3\2\2"+
		"\2\u00a1\u0090\3\2\2\2\u00a1\u0092\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u0098"+
		"\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\23\3\2\2\2\u00a3\u00ac\7\66\2\2\u00a4"+
		"\u00ac\7\61\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00ac\7D\2\2\u00a7\u00a8\7"+
		".\2\2\u00a8\u00ac\7C\2\2\u00a9\u00ac\7)\2\2\u00aa\u00ac\7\63\2\2\u00ab"+
		"\u00a3\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a7\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ba"+
		"\7\r\2\2\u00ae\u00ba\7\6\2\2\u00af\u00ba\7\30\2\2\u00b0\u00b1\5\24\13"+
		"\2\u00b1\u00b2\7&\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b4\u00b7"+
		"\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00ba\5\24\13\2\u00b9\u00ad\3\2\2\2\u00b9\u00ae\3"+
		"\2\2\2\u00b9\u00af\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\27\3\2\2\2\u00bb"+
		"\u00bc\7\3\2\2\u00bc\u00c0\7D\2\2\u00bd\u00be\7B\2\2\u00be\u00c0\7C\2"+
		"\2\u00bf\u00bb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\31\3\2\2\2\u00c1\u00ca"+
		"\7,\2\2\u00c2\u00ca\7\26\2\2\u00c3\u00ca\7\b\2\2\u00c4\u00c5\5\30\r\2"+
		"\u00c5\u00c6\7&\2\2\u00c6\u00c7\5\32\16\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca"+
		"\5\30\r\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2\2\2\u00c9\u00c3\3\2\2\2"+
		"\u00c9\u00c4\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00cc"+
		"\b\17\1\2\u00cc\u00d0\7D\2\2\u00cd\u00d0\5\32\16\2\u00ce\u00d0\5\26\f"+
		"\2\u00cf\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d6"+
		"\3\2\2\2\u00d1\u00d2\f\3\2\2\u00d2\u00d3\7\67\2\2\u00d3\u00d5\5\34\17"+
		"\4\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\35\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\b\20\1\2\u00da"+
		"\u00e1\7C\2\2\u00db\u00dc\7\21\2\2\u00dc\u00dd\5\36\20\2\u00dd\u00de\7"+
		">\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5\34\17\2\u00e0\u00d9\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3\f\7"+
		"\2\2\u00e3\u00e4\7:\2\2\u00e4\u00e9\5\36\20\b\u00e5\u00e6\f\6\2\2\u00e6"+
		"\u00e7\t\2\2\2\u00e7\u00e9\5\36\20\7\u00e8\u00e2\3\2\2\2\u00e8\u00e5\3"+
		"\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\37\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\5\34\17\2\u00ee\u00ef\7\n"+
		"\2\2\u00ef\u00f0\5\36\20\2\u00f0\u00ff\3\2\2\2\u00f1\u00f2\7\24\2\2\u00f2"+
		"\u00f3\5\34\17\2\u00f3\u00f4\7\'\2\2\u00f4\u00f5\5\36\20\2\u00f5\u00ff"+
		"\3\2\2\2\u00f6\u00f7\5\34\17\2\u00f7\u00f8\7\n\2\2\u00f8\u00f9\5\24\13"+
		"\2\u00f9\u00ff\3\2\2\2\u00fa\u00fb\5\34\17\2\u00fb\u00fc\7;\2\2\u00fc"+
		"\u00fd\5\32\16\2\u00fd\u00ff\3\2\2\2\u00fe\u00ed\3\2\2\2\u00fe\u00f1\3"+
		"\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00fa\3\2\2\2\u00ff!\3\2\2\2\u0100\u0101"+
		"\7\65\2\2\u0101\u0102\5$\23\2\u0102\u0103\7#\2\2\u0103\u0104\5\20\t\2"+
		"\u0104\u010d\3\2\2\2\u0105\u0106\7\65\2\2\u0106\u0107\5$\23\2\u0107\u0108"+
		"\7#\2\2\u0108\u0109\5\20\t\2\u0109\u010a\7 \2\2\u010a\u010b\5\20\t\2\u010b"+
		"\u010d\3\2\2\2\u010c\u0100\3\2\2\2\u010c\u0105\3\2\2\2\u010d#\3\2\2\2"+
		"\u010e\u010f\b\23\1\2\u010f\u0110\7\13\2\2\u0110\u012b\5$\23\6\u0111\u0112"+
		"\5\36\20\2\u0112\u0113\7<\2\2\u0113\u0114\5\36\20\2\u0114\u012b\3\2\2"+
		"\2\u0115\u0116\5\36\20\2\u0116\u0117\78\2\2\u0117\u0118\5\36\20\2\u0118"+
		"\u012b\3\2\2\2\u0119\u011a\5\36\20\2\u011a\u011b\7=\2\2\u011b\u011c\5"+
		"\36\20\2\u011c\u012b\3\2\2\2\u011d\u011e\5\36\20\2\u011e\u011f\7A\2\2"+
		"\u011f\u0120\5\36\20\2\u0120\u012b\3\2\2\2\u0121\u0122\5\36\20\2\u0122"+
		"\u0123\7/\2\2\u0123\u0124\5\36\20\2\u0124\u012b\3\2\2\2\u0125\u012b\7"+
		"!\2\2\u0126\u012b\7-\2\2\u0127\u0128\5\24\13\2\u0128\u0129\7\22\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u010e\3\2\2\2\u012a\u0111\3\2\2\2\u012a\u0115\3\2"+
		"\2\2\u012a\u0119\3\2\2\2\u012a\u011d\3\2\2\2\u012a\u0121\3\2\2\2\u012a"+
		"\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012b\u0134\3\2"+
		"\2\2\u012c\u012d\f\b\2\2\u012d\u012e\7\60\2\2\u012e\u0133\5$\23\t\u012f"+
		"\u0130\f\7\2\2\u0130\u0131\7\36\2\2\u0131\u0133\5$\23\b\u0132\u012c\3"+
		"\2\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135%\3\2\2\2\u0136\u0134\3\2\2\2\34.\66?NQZd~\u0086\u008d"+
		"\u00a1\u00ab\u00b5\u00b9\u00bf\u00c9\u00cf\u00d6\u00e0\u00e8\u00ea\u00fe"+
		"\u010c\u012a\u0132\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}