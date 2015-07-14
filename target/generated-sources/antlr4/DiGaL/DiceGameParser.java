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
		T__71=1, T__70=2, T__69=3, T__68=4, T__67=5, T__66=6, T__65=7, T__64=8, 
		T__63=9, T__62=10, T__61=11, T__60=12, T__59=13, T__58=14, T__57=15, T__56=16, 
		T__55=17, T__54=18, T__53=19, T__52=20, T__51=21, T__50=22, T__49=23, 
		T__48=24, T__47=25, T__46=26, T__45=27, T__44=28, T__43=29, T__42=30, 
		T__41=31, T__40=32, T__39=33, T__38=34, T__37=35, T__36=36, T__35=37, 
		T__34=38, T__33=39, T__32=40, T__31=41, T__30=42, T__29=43, T__28=44, 
		T__27=45, T__26=46, T__25=47, T__24=48, T__23=49, T__22=50, T__21=51, 
		T__20=52, T__19=53, T__18=54, T__17=55, T__16=56, T__15=57, T__14=58, 
		T__13=59, T__12=60, T__11=61, T__10=62, T__9=63, T__8=64, T__7=65, T__6=66, 
		T__5=67, T__4=68, T__3=69, T__2=70, T__1=71, T__0=72, INT=73, ID=74, COMMENT=75;
	public static final String[] tokenNames = {
		"<INVALID>", "'sortiert alle würfel'", "'würfel '", "' mal '", "'allen spielern'", 
		"'das spiel ist für '", "'aller würfel'", "' dran'", "'spieler haben die werte '", 
		"' ist '", "' nicht '", "'alle spieler'", "' '", "'das spiel läuft solange '", 
		"'das spiel hat den wert '", "'alle'", "' absteigend'", "'('", "' inaktiv ist'", 
		"'würfelt mit '", "'setze '", "'n'", "'allen würfeln'", "'\n'", "'r'", 
		"'aller spieler'", "'spieler '", "' mehr als '", "' wird so gespielt:\n'", 
		"' - '", "' hat diese seiten:'", "' gilt'", "' oder '", "' + '", "'aktiver spieler'", 
		"' spieler'", "', sonst '", "'wahr'", "'spieler sind aktiv, solange '", 
		"', dann '", "' spieler geeignet'", "'ist '", "', '", "'aktive spieler'", 
		"' auf '", "'.\n'", "'rechter spieler'", "' aufsteigend'", "';'", "'alle würfel'", 
		"'falsch'", "'würfel'", "' größergleich '", "' und '", "'aktueller spieler'", 
		"'anzahl '", "'macht '", "'linker spieler'", "' ist dran'", "' bis '", 
		"'wenn '", "'der spieler'", "' kleiner als '", "'das spiel hat folgende würfel:'", 
		"' * '", "' gleich '", "'die summe von '", "' größer als '", "')'", "' von '", 
		"'für '", "'ist ein spieler am zug macht er folgendes:\n'", "' kleinergleich '", 
		"INT", "ID", "COMMENT"
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
			setState(37); match(T__44);
			setState(38); match(T__49);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39); ((GameContext)_localctx).GAMEINIT = gameinit();
				setState(40); match(T__27);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__67) | (1L << T__59) | (1L << T__58) | (1L << T__9))) != 0) );
			setState(46); match(T__49);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47); ((GameContext)_localctx).PLAYERINIT = playerinit();
				setState(48); match(T__27);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__64 || _la==T__34 );
			setState(54); match(T__49);
			setState(55); ((GameContext)_localctx).PLAY = match(T__1);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__71) | (1L << T__70) | (1L << T__53) | (1L << T__52) | (1L << T__46) | (1L << T__31) | (1L << T__26) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__12) | (1L << T__11))) != 0) || _la==T__2 || _la==ID) {
				{
				{
				setState(56); ((GameContext)_localctx).ACTION = action(0);
				setState(57); match(T__27);
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
		public ConditionContext COND;
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
			setState(81);
			switch (_input.LA(1)) {
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(T__58);
				setState(65); ((GameinitContext)_localctx).ASSN = assignment();
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(T__67);
				setState(67); ((GameinitContext)_localctx).FROM = match(INT);
				setState(68); match(T__13);
				setState(69); ((GameinitContext)_localctx).TO = match(INT);
				setState(70); match(T__32);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); match(T__59);
				setState(72); ((GameinitContext)_localctx).COND = condition(0);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); match(T__9);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__49) {
					{
					{
					setState(74); match(T__49);
					setState(75); ((GameinitContext)_localctx).DICEINIT = diceinit();
					}
					}
					setState(80);
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
			setState(83); match(T__70);
			setState(84); ((DiceinitContext)_localctx).NAME = match(ID);
			setState(85); match(T__42);
			setState(88); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86); match(T__60);
				setState(87); ((DiceinitContext)_localctx).FACE = face();
				}
				}
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__60 );
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
			setState(92); match(INT);
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
			setState(100);
			switch (_input.LA(1)) {
			case T__64:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); match(T__64);
				setState(95); ((PlayerinitContext)_localctx).ASSN = assignment();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); match(T__34);
				setState(97); ((PlayerinitContext)_localctx).PLAYERACTIVECOND = condition(0);
				setState(98); match(T__41);
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
			setState(102); match(ID);
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
		public Token FORLOOP;
		public DiceobjectsContext DOs;
		public PlayerobjectsContext POs;
		public Token VAR;
		public ActionContext ACTION;
		public Token NLOOP;
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
			setState(121);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); ((LoopContext)_localctx).FORLOOP = match(T__2);
				setState(107);
				switch (_input.LA(1)) {
				case T__70:
				case T__66:
				case T__50:
				case T__23:
				case T__21:
					{
					setState(105); ((LoopContext)_localctx).DOs = diceobjects();
					}
					break;
				case T__68:
				case T__61:
				case T__57:
				case T__47:
				case T__46:
				case T__38:
				case T__29:
				case T__26:
				case T__18:
				case T__15:
				case T__11:
					{
					setState(106); ((LoopContext)_localctx).POs = playerobjects();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109); match(T__60);
				setState(110); ((LoopContext)_localctx).VAR = match(ID);
				setState(111); match(T__60);
				setState(112); ((LoopContext)_localctx).ACTION = action(0);
				setState(113); match(T__24);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); ((LoopContext)_localctx).NLOOP = match(T__16);
				setState(116); ((LoopContext)_localctx).VALUE = match(INT);
				setState(117); match(T__69);
				setState(118); ((LoopContext)_localctx).ACTION = action(0);
				setState(119); match(T__24);
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

	public static class ActionContext extends ParserRuleContext {
		public ActionContext ACTION1;
		public AssignmentContext AS;
		public DicesactionContext DA;
		public LoopContext LOOP;
		public LawContext LAW;
		public PlayerobjectContext PLAYER;
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
		public PlayerobjectContext playerobject() {
			return getRuleContext(PlayerobjectContext.class,0);
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
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(124); ((ActionContext)_localctx).AS = assignment();
				}
				break;
			case 2:
				{
				setState(125); ((ActionContext)_localctx).DA = dicesaction();
				}
				break;
			case 3:
				{
				setState(126); ((ActionContext)_localctx).LOOP = loop();
				}
				break;
			case 4:
				{
				setState(127); ((ActionContext)_localctx).LAW = law();
				}
				break;
			case 5:
				{
				setState(128); match(T__31);
				setState(129); ((ActionContext)_localctx).PLAYER = playerobject();
				setState(130); ((ActionContext)_localctx).NEXT = match(T__65);
				}
				break;
			case 6:
				{
				setState(132); ((ActionContext)_localctx).PLAYER = playerobject();
				setState(133); ((ActionContext)_localctx).NEXT = match(T__14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionContext(_parentctx, _parentState);
					_localctx.ACTION1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_action);
					setState(137);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(138); match(T__19);
					setState(139); ((ActionContext)_localctx).ACTION2 = action(4);
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public Token THROW;
		public DiceobjectsContext DOs;
		public Token SORT;
		public Token REVERSE;
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
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
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); ((DicesactionContext)_localctx).THROW = match(T__53);
				setState(146); ((DicesactionContext)_localctx).DOs = diceobjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); ((DicesactionContext)_localctx).SORT = match(T__71);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); ((DicesactionContext)_localctx).SORT = match(T__71);
				setState(149); match(T__25);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150); ((DicesactionContext)_localctx).SORT = match(T__71);
				setState(151); ((DicesactionContext)_localctx).REVERSE = match(T__56);
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
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); ((PlayerobjectContext)_localctx).CUR = match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); ((PlayerobjectContext)_localctx).CUR = match(T__18);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); match(T__46);
				setState(157); ((PlayerobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158); match(T__46);
				setState(159); ((PlayerobjectContext)_localctx).POS = match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(160); ((PlayerobjectContext)_localctx).RIGHT = match(T__26);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161); ((PlayerobjectContext)_localctx).LEFT = match(T__15);
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

	public static class PlayerobjectsContext extends ParserRuleContext {
		public Token ALL;
		public Token ACTIVE;
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
		int _la;
		try {
			int _alt;
			setState(186);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(164); ((PlayerobjectsContext)_localctx).ALL = match(T__61);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 2);
				{
				setState(165); ((PlayerobjectsContext)_localctx).ALL = match(T__68);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(166); ((PlayerobjectsContext)_localctx).ALL = match(T__47);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 4);
				{
				setState(167); ((PlayerobjectsContext)_localctx).ALL = match(T__57);
				setState(169);
				_la = _input.LA(1);
				if (_la==T__51 || _la==T__48) {
					{
					setState(168);
					_la = _input.LA(1);
					if ( !(_la==T__51 || _la==T__48) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(171); match(T__37);
				setState(173);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(172); match(T__51);
					}
					break;
				}
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(175); ((PlayerobjectsContext)_localctx).ACTIVE = match(T__29);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(176); ((PlayerobjectsContext)_localctx).ACTIVE = match(T__38);
				}
				break;
			case T__46:
			case T__26:
			case T__18:
			case T__15:
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177); ((PlayerobjectsContext)_localctx).PO = playerobject();
						setState(178); match(T__30);
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(185); ((PlayerobjectsContext)_localctx).LAST = playerobject();
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
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); match(T__70);
				setState(189); ((DiceobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(T__70);
				setState(191); ((DiceobjectContext)_localctx).POS = match(INT);
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

	public static class DiceobjectsContext extends ParserRuleContext {
		public Token ALL;
		public DiceobjectContext DO;
		public DiceobjectContext LAST;
		public List<DiceobjectContext> diceobject() {
			return getRuleContexts(DiceobjectContext.class);
		}
		public DiceobjectContext diceobject(int i) {
			return getRuleContext(DiceobjectContext.class,i);
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
			int _alt;
			setState(207);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); ((DiceobjectsContext)_localctx).ALL = match(T__50);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); ((DiceobjectsContext)_localctx).ALL = match(T__23);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(196); ((DiceobjectsContext)_localctx).ALL = match(T__66);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(197); ((DiceobjectsContext)_localctx).ALL = match(T__21);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198); ((DiceobjectsContext)_localctx).DO = diceobject();
						setState(199); match(T__30);
						}
						} 
					}
					setState(205);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(206); ((DiceobjectsContext)_localctx).LAST = diceobject();
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext INST;
		public Token IVAR;
		public Token VAR;
		public DiceobjectContext DO;
		public PlayerobjectContext PO;
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public PlayerobjectContext playerobject() {
			return getRuleContext(PlayerobjectContext.class,0);
		}
		public DiceobjectContext diceobject() {
			return getRuleContext(DiceobjectContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(210); ((VariableContext)_localctx).IVAR = match(ID);
				setState(211); match(T__3);
				setState(212); ((VariableContext)_localctx).INST = variable(2);
				}
				break;
			case 2:
				{
				setState(213); ((VariableContext)_localctx).VAR = match(ID);
				}
				break;
			case 3:
				{
				setState(214); ((VariableContext)_localctx).DO = diceobject();
				}
				break;
			case 4:
				{
				setState(215); ((VariableContext)_localctx).PO = playerobject();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableContext(_parentctx, _parentState);
					_localctx.INST = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_variable);
					setState(218);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(219); match(T__60);
					setState(220); ((VariableContext)_localctx).IVAR = match(ID);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public VariableContext VAR;
		public ExprContext E;
		public Token SUM;
		public DiceobjectsContext DOs;
		public Token COUNT;
		public PlayerobjectsContext POs;
		public Token OP;
		public ExprContext B;
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode INT() { return getToken(DiceGameParser.INT, 0); }
		public PlayerobjectsContext playerobjects() {
			return getRuleContext(PlayerobjectsContext.class,0);
		}
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
			setState(240);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(227); ((ExprContext)_localctx).INTEGER = match(INT);
				}
				break;
			case T__70:
			case T__46:
			case T__26:
			case T__18:
			case T__15:
			case T__11:
			case ID:
				{
				setState(228); ((ExprContext)_localctx).VAR = variable(0);
				}
				break;
			case T__55:
				{
				setState(229); match(T__55);
				setState(230); ((ExprContext)_localctx).E = expr(0);
				setState(231); match(T__4);
				}
				break;
			case T__6:
				{
				setState(233); ((ExprContext)_localctx).SUM = match(T__6);
				setState(234); ((ExprContext)_localctx).DOs = diceobjects();
				}
				break;
			case T__17:
				{
				setState(235); ((ExprContext)_localctx).COUNT = match(T__17);
				setState(238);
				switch (_input.LA(1)) {
				case T__68:
				case T__61:
				case T__57:
				case T__47:
				case T__46:
				case T__38:
				case T__29:
				case T__26:
				case T__18:
				case T__15:
				case T__11:
					{
					setState(236); ((ExprContext)_localctx).POs = playerobjects();
					}
					break;
				case T__70:
				case T__66:
				case T__50:
				case T__23:
				case T__21:
					{
					setState(237); ((ExprContext)_localctx).DOs = diceobjects();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(243); ((ExprContext)_localctx).OP = match(T__8);
						setState(244); ((ExprContext)_localctx).B = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(246);
						((ExprContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__43 || _la==T__39) ) {
							((ExprContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(247); ((ExprContext)_localctx).B = expr(7);
						}
						break;
					}
					} 
				}
				setState(252);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext V;
		public ExprContext E;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(262);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); match(T__52);
				setState(254); ((AssignmentContext)_localctx).V = variable(0);
				setState(255); match(T__28);
				setState(256); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case T__70:
			case T__46:
			case T__26:
			case T__18:
			case T__15:
			case T__11:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(258); ((AssignmentContext)_localctx).V = variable(0);
				setState(259); match(T__63);
				setState(260); ((AssignmentContext)_localctx).E = expr(0);
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
			setState(276);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); match(T__12);
				setState(265); ((LawContext)_localctx).COND = condition(0);
				setState(266); match(T__33);
				setState(267); ((LawContext)_localctx).THEN = action(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); match(T__12);
				setState(270); ((LawContext)_localctx).COND = condition(0);
				setState(271); match(T__33);
				setState(272); ((LawContext)_localctx).THEN = action(0);
				setState(273); match(T__36);
				setState(274); ((LawContext)_localctx).ELSE = action(0);
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
			setState(310);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(279); ((ConditionContext)_localctx).NOT = match(T__62);
				setState(280); ((ConditionContext)_localctx).C = condition(4);
				}
				break;
			case 2:
				{
				setState(281); ((ConditionContext)_localctx).A = expr(0);
				setState(282); ((ConditionContext)_localctx).EQ = match(T__7);
				setState(283); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 3:
				{
				setState(285); ((ConditionContext)_localctx).A = expr(0);
				setState(286); ((ConditionContext)_localctx).LT = match(T__10);
				setState(287); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 4:
				{
				setState(289); ((ConditionContext)_localctx).A = expr(0);
				setState(290); ((ConditionContext)_localctx).GT = match(T__5);
				setState(291); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 5:
				{
				setState(293); ((ConditionContext)_localctx).A = expr(0);
				setState(294); ((ConditionContext)_localctx).GT = match(T__45);
				setState(295); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 6:
				{
				setState(297); ((ConditionContext)_localctx).A = expr(0);
				setState(298); ((ConditionContext)_localctx).LE = match(T__0);
				setState(299); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 7:
				{
				setState(301); ((ConditionContext)_localctx).A = expr(0);
				setState(302); ((ConditionContext)_localctx).GE = match(T__20);
				setState(303); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 8:
				{
				setState(305); ((ConditionContext)_localctx).TRUE = match(T__35);
				}
				break;
			case 9:
				{
				setState(306); ((ConditionContext)_localctx).FALSE = match(T__22);
				}
				break;
			case 10:
				{
				setState(307); ((ConditionContext)_localctx).PLAYER = playerobject();
				setState(308); match(T__54);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.C = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(312);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(313); ((ConditionContext)_localctx).AND = match(T__19);
						setState(314); ((ConditionContext)_localctx).D = condition(7);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.C = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(315);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(316); ((ConditionContext)_localctx).OR = match(T__40);
						setState(317); ((ConditionContext)_localctx).D = condition(6);
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 7);
		case 3: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\6\2-\n\2\r\2\16\2.\3\2\3\2\3\2\3\2"+
		"\6\2\65\n\2\r\2\16\2\66\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3O\n\3\f\3\16\3R\13\3"+
		"\5\3T\n\3\3\4\3\4\3\4\3\4\3\4\6\4[\n\4\r\4\16\4\\\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\b\3\b\3\b\5\bn\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\7\t\u008f\n\t\f\t\16\t\u0092"+
		"\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009b\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00a5\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3"+
		"\f\3\f\5\f\u00b0\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b7\n\f\f\f\16\f\u00ba"+
		"\13\f\3\f\5\f\u00bd\n\f\3\r\3\r\3\r\3\r\5\r\u00c3\n\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u00cc\n\16\f\16\16\16\u00cf\13\16\3\16\5\16\u00d2"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00db\n\17\3\17\3\17\3\17"+
		"\7\17\u00e0\n\17\f\17\16\17\u00e3\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f1\n\20\5\20\u00f3\n\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u00fb\n\20\f\20\16\20\u00fe\13\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0109\n\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0117\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0139\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0141\n"+
		"\23\f\23\16\23\u0144\13\23\3\23\2\6\20\34\36$\24\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$\2\4\4\2\27\27\32\32\4\2\37\37##\u0173\2&\3\2\2"+
		"\2\4S\3\2\2\2\6U\3\2\2\2\b^\3\2\2\2\nf\3\2\2\2\fh\3\2\2\2\16{\3\2\2\2"+
		"\20\u0089\3\2\2\2\22\u009a\3\2\2\2\24\u00a4\3\2\2\2\26\u00bc\3\2\2\2\30"+
		"\u00c2\3\2\2\2\32\u00d1\3\2\2\2\34\u00da\3\2\2\2\36\u00f2\3\2\2\2 \u0108"+
		"\3\2\2\2\"\u0116\3\2\2\2$\u0138\3\2\2\2&\'\7L\2\2\'(\7\36\2\2(,\7\31\2"+
		"\2)*\5\4\3\2*+\7/\2\2+-\3\2\2\2,)\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2"+
		"\2/\60\3\2\2\2\60\64\7\31\2\2\61\62\5\n\6\2\62\63\7/\2\2\63\65\3\2\2\2"+
		"\64\61\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28"+
		"9\7\31\2\29?\7I\2\2:;\5\20\t\2;<\7/\2\2<>\3\2\2\2=:\3\2\2\2>A\3\2\2\2"+
		"?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BC\7\20\2\2CT\5 \21\2DE\7\7\2"+
		"\2EF\7K\2\2FG\7=\2\2GH\7K\2\2HT\7*\2\2IJ\7\17\2\2JT\5$\23\2KP\7A\2\2L"+
		"M\7\31\2\2MO\5\6\4\2NL\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QT\3\2\2\2"+
		"RP\3\2\2\2SB\3\2\2\2SD\3\2\2\2SI\3\2\2\2SK\3\2\2\2T\5\3\2\2\2UV\7\4\2"+
		"\2VW\7L\2\2WZ\7 \2\2XY\7\16\2\2Y[\5\b\5\2ZX\3\2\2\2[\\\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]\7\3\2\2\2^_\7K\2\2_\t\3\2\2\2`a\7\n\2\2ag\5 \21\2bc\7"+
		"(\2\2cd\5$\23\2de\7!\2\2eg\3\2\2\2f`\3\2\2\2fb\3\2\2\2g\13\3\2\2\2hi\7"+
		"L\2\2i\r\3\2\2\2jm\7H\2\2kn\5\32\16\2ln\5\26\f\2mk\3\2\2\2ml\3\2\2\2n"+
		"o\3\2\2\2op\7\16\2\2pq\7L\2\2qr\7\16\2\2rs\5\20\t\2st\7\62\2\2t|\3\2\2"+
		"\2uv\7:\2\2vw\7K\2\2wx\7\5\2\2xy\5\20\t\2yz\7\62\2\2z|\3\2\2\2{j\3\2\2"+
		"\2{u\3\2\2\2|\17\3\2\2\2}~\b\t\1\2~\u008a\5 \21\2\177\u008a\5\22\n\2\u0080"+
		"\u008a\5\16\b\2\u0081\u008a\5\"\22\2\u0082\u0083\7+\2\2\u0083\u0084\5"+
		"\24\13\2\u0084\u0085\7\t\2\2\u0085\u008a\3\2\2\2\u0086\u0087\5\24\13\2"+
		"\u0087\u0088\7<\2\2\u0088\u008a\3\2\2\2\u0089}\3\2\2\2\u0089\177\3\2\2"+
		"\2\u0089\u0080\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u0082\3\2\2\2\u0089\u0086"+
		"\3\2\2\2\u008a\u0090\3\2\2\2\u008b\u008c\f\5\2\2\u008c\u008d\7\67\2\2"+
		"\u008d\u008f\5\20\t\6\u008e\u008b\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\21\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\25\2\2\u0094\u009b\5\32\16\2\u0095\u009b\7\3\2\2\u0096\u0097"+
		"\7\3\2\2\u0097\u009b\7\61\2\2\u0098\u0099\7\3\2\2\u0099\u009b\7\22\2\2"+
		"\u009a\u0093\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\23\3\2\2\2\u009c\u00a5\7?\2\2\u009d\u00a5\78\2\2\u009e"+
		"\u009f\7\34\2\2\u009f\u00a5\7L\2\2\u00a0\u00a1\7\34\2\2\u00a1\u00a5\7"+
		"K\2\2\u00a2\u00a5\7\60\2\2\u00a3\u00a5\7;\2\2\u00a4\u009c\3\2\2\2\u00a4"+
		"\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\25\3\2\2\2\u00a6\u00bd\7\r\2\2\u00a7\u00bd"+
		"\7\6\2\2\u00a8\u00bd\7\33\2\2\u00a9\u00ab\7\21\2\2\u00aa\u00ac\t\2\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af"+
		"\7%\2\2\u00ae\u00b0\7\27\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00bd\3\2\2\2\u00b1\u00bd\7-\2\2\u00b2\u00bd\7$\2\2\u00b3\u00b4\5\24"+
		"\13\2\u00b4\u00b5\7,\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\5\24\13\2\u00bc\u00a6\3\2\2\2\u00bc"+
		"\u00a7\3\2\2\2\u00bc\u00a8\3\2\2\2\u00bc\u00a9\3\2\2\2\u00bc\u00b1\3\2"+
		"\2\2\u00bc\u00b2\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\27\3\2\2\2\u00be\u00bf"+
		"\7\4\2\2\u00bf\u00c3\7L\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c3\7K\2\2\u00c2"+
		"\u00be\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\31\3\2\2\2\u00c4\u00d2\7\30\2"+
		"\2\u00c5\u00d2\7\63\2\2\u00c6\u00d2\7\b\2\2\u00c7\u00d2\7\65\2\2\u00c8"+
		"\u00c9\5\30\r\2\u00c9\u00ca\7,\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c8\3\2"+
		"\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\5\30\r\2\u00d1\u00c4\3"+
		"\2\2\2\u00d1\u00c5\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d1"+
		"\u00cd\3\2\2\2\u00d2\33\3\2\2\2\u00d3\u00d4\b\17\1\2\u00d4\u00d5\7L\2"+
		"\2\u00d5\u00d6\7G\2\2\u00d6\u00db\5\34\17\4\u00d7\u00db\7L\2\2\u00d8\u00db"+
		"\5\30\r\2\u00d9\u00db\5\24\13\2\u00da\u00d3\3\2\2\2\u00da\u00d7\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00e1\3\2\2\2\u00dc\u00dd"+
		"\f\3\2\2\u00dd\u00de\7\16\2\2\u00de\u00e0\7L\2\2\u00df\u00dc\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\35\3\2\2"+
		"\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\b\20\1\2\u00e5\u00f3\7K\2\2\u00e6\u00f3"+
		"\5\34\17\2\u00e7\u00e8\7\23\2\2\u00e8\u00e9\5\36\20\2\u00e9\u00ea\7F\2"+
		"\2\u00ea\u00f3\3\2\2\2\u00eb\u00ec\7D\2\2\u00ec\u00f3\5\32\16\2\u00ed"+
		"\u00f0\79\2\2\u00ee\u00f1\5\26\f\2\u00ef\u00f1\5\32\16\2\u00f0\u00ee\3"+
		"\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00e4\3\2\2\2\u00f2"+
		"\u00e6\3\2\2\2\u00f2\u00e7\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00ed\3\2"+
		"\2\2\u00f3\u00fc\3\2\2\2\u00f4\u00f5\f\t\2\2\u00f5\u00f6\7B\2\2\u00f6"+
		"\u00fb\5\36\20\n\u00f7\u00f8\f\b\2\2\u00f8\u00f9\t\3\2\2\u00f9\u00fb\5"+
		"\36\20\t\u00fa\u00f4\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\37\3\2\2\2\u00fe\u00fc\3\2\2"+
		"\2\u00ff\u0100\7\26\2\2\u0100\u0101\5\34\17\2\u0101\u0102\7.\2\2\u0102"+
		"\u0103\5\36\20\2\u0103\u0109\3\2\2\2\u0104\u0105\5\34\17\2\u0105\u0106"+
		"\7\13\2\2\u0106\u0107\5\36\20\2\u0107\u0109\3\2\2\2\u0108\u00ff\3\2\2"+
		"\2\u0108\u0104\3\2\2\2\u0109!\3\2\2\2\u010a\u010b\7>\2\2\u010b\u010c\5"+
		"$\23\2\u010c\u010d\7)\2\2\u010d\u010e\5\20\t\2\u010e\u0117\3\2\2\2\u010f"+
		"\u0110\7>\2\2\u0110\u0111\5$\23\2\u0111\u0112\7)\2\2\u0112\u0113\5\20"+
		"\t\2\u0113\u0114\7&\2\2\u0114\u0115\5\20\t\2\u0115\u0117\3\2\2\2\u0116"+
		"\u010a\3\2\2\2\u0116\u010f\3\2\2\2\u0117#\3\2\2\2\u0118\u0119\b\23\1\2"+
		"\u0119\u011a\7\f\2\2\u011a\u0139\5$\23\6\u011b\u011c\5\36\20\2\u011c\u011d"+
		"\7C\2\2\u011d\u011e\5\36\20\2\u011e\u0139\3\2\2\2\u011f\u0120\5\36\20"+
		"\2\u0120\u0121\7@\2\2\u0121\u0122\5\36\20\2\u0122\u0139\3\2\2\2\u0123"+
		"\u0124\5\36\20\2\u0124\u0125\7E\2\2\u0125\u0126\5\36\20\2\u0126\u0139"+
		"\3\2\2\2\u0127\u0128\5\36\20\2\u0128\u0129\7\35\2\2\u0129\u012a\5\36\20"+
		"\2\u012a\u0139\3\2\2\2\u012b\u012c\5\36\20\2\u012c\u012d\7J\2\2\u012d"+
		"\u012e\5\36\20\2\u012e\u0139\3\2\2\2\u012f\u0130\5\36\20\2\u0130\u0131"+
		"\7\66\2\2\u0131\u0132\5\36\20\2\u0132\u0139\3\2\2\2\u0133\u0139\7\'\2"+
		"\2\u0134\u0139\7\64\2\2\u0135\u0136\5\24\13\2\u0136\u0137\7\24\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0118\3\2\2\2\u0138\u011b\3\2\2\2\u0138\u011f\3\2"+
		"\2\2\u0138\u0123\3\2\2\2\u0138\u0127\3\2\2\2\u0138\u012b\3\2\2\2\u0138"+
		"\u012f\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0134\3\2\2\2\u0138\u0135\3\2"+
		"\2\2\u0139\u0142\3\2\2\2\u013a\u013b\f\b\2\2\u013b\u013c\7\67\2\2\u013c"+
		"\u0141\5$\23\t\u013d\u013e\f\7\2\2\u013e\u013f\7\"\2\2\u013f\u0141\5$"+
		"\23\b\u0140\u013a\3\2\2\2\u0140\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143%\3\2\2\2\u0144\u0142\3\2\2\2"+
		"!.\66?PS\\fm{\u0089\u0090\u009a\u00a4\u00ab\u00af\u00b8\u00bc\u00c2\u00cd"+
		"\u00d1\u00da\u00e1\u00f0\u00f2\u00fa\u00fc\u0108\u0116\u0138\u0140\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}