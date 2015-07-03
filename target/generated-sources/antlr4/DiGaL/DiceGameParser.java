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
		T__64=1, T__63=2, T__62=3, T__61=4, T__60=5, T__59=6, T__58=7, T__57=8, 
		T__56=9, T__55=10, T__54=11, T__53=12, T__52=13, T__51=14, T__50=15, T__49=16, 
		T__48=17, T__47=18, T__46=19, T__45=20, T__44=21, T__43=22, T__42=23, 
		T__41=24, T__40=25, T__39=26, T__38=27, T__37=28, T__36=29, T__35=30, 
		T__34=31, T__33=32, T__32=33, T__31=34, T__30=35, T__29=36, T__28=37, 
		T__27=38, T__26=39, T__25=40, T__24=41, T__23=42, T__22=43, T__21=44, 
		T__20=45, T__19=46, T__18=47, T__17=48, T__16=49, T__15=50, T__14=51, 
		T__13=52, T__12=53, T__11=54, T__10=55, T__9=56, T__8=57, T__7=58, T__6=59, 
		T__5=60, T__4=61, T__3=62, T__2=63, T__1=64, T__0=65, INT=66, ID=67, COMMENT=68;
	public static final String[] tokenNames = {
		"<INVALID>", "'würfel '", "'legt würfel aus '", "' mal '", "'allen spielern'", 
		"'das spiel ist für '", "'aller würfel'", "' ist '", "' nicht '", "'nächster spieler ist dran'", 
		"'alle spieler'", "' '", "' absteigend'", "'('", "' inaktiv ist'", "'würfelt mit '", 
		"'setze '", "'sortiert '", "'allen würfeln'", "'\n'", "'aller spieler'", 
		"'spieler '", "'position von '", "' wird so gespielt:\n'", "' - '", "' hat diese seiten:'", 
		"' gilt'", "' oder '", "' + '", "', sonst '", "'wahr'", "'spieler sind aktiv, solange '", 
		"', dann '", "' spieler geeignet'", "' in '", "'spieler haben die werte'", 
		"', '", "' auf '", "'.\n'", "'rechter spieler'", "' aufsteigend'", "';'", 
		"'alle würfel'", "'falsch'", "'spieler #'", "' größergleich '", "' und '", 
		"'aktueller spieler'", "'macht '", "'linker spieler'", "' bis '", "'wenn '", 
		"'der spieler'", "'das spiel hat die werte'", "':'", "' kleiner als '", 
		"'das spiel hat folgende würfel:'", "' * '", "' ist die summe '", "' gleich '", 
		"' größer als '", "')'", "'für '", "'ist ein spieler am zug macht er folgendes:\n'", 
		"' kleinergleich '", "'würfel #'", "INT", "ID", "COMMENT"
	};
	public static final int
		RULE_game = 0, RULE_gameinit = 1, RULE_diceinit = 2, RULE_playerinit = 3, 
		RULE_loop = 4, RULE_action = 5, RULE_dicesaction = 6, RULE_playerobject = 7, 
		RULE_playerobjects = 8, RULE_diceobject = 9, RULE_diceobjects = 10, RULE_variable = 11, 
		RULE_expr = 12, RULE_assignment = 13, RULE_law = 14, RULE_condition = 15;
	public static final String[] ruleNames = {
		"game", "gameinit", "diceinit", "playerinit", "loop", "action", "dicesaction", 
		"playerobject", "playerobjects", "diceobject", "diceobjects", "variable", 
		"expr", "assignment", "law", "condition"
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
		public PlayerinitContext PLAYERINIT;
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
			setState(32); ((GameContext)_localctx).NAME = match(ID);
			setState(33); match(T__42);
			setState(34); match(T__46);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35); gameinit();
				setState(36); match(T__27);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__12) | (1L << T__9))) != 0) );
			setState(42); match(T__46);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43); ((GameContext)_localctx).PLAYERINIT = playerinit();
				setState(44); match(T__27);
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__34 || _la==T__30 );
			setState(50); match(T__46);
			setState(51); match(T__2);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__64) | (1L << T__63) | (1L << T__61) | (1L << T__59) | (1L << T__56) | (1L << T__55) | (1L << T__50) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__45) | (1L << T__44) | (1L << T__43) | (1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__14) | (1L << T__13) | (1L << T__3))) != 0) || _la==T__0 || _la==ID) {
				{
				{
				setState(52); ((GameContext)_localctx).ACTION = action(0);
				setState(53); match(T__27);
				}
				}
				setState(59);
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
		public TerminalNode INT(int i) {
			return getToken(DiceGameParser.INT, i);
		}
		public List<DiceinitContext> diceinit() {
			return getRuleContexts(DiceinitContext.class);
		}
		public List<TerminalNode> ID() { return getTokens(DiceGameParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DiceGameParser.ID, i);
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
			setState(80);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); match(T__12);
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(61); match(T__54);
					setState(62); match(ID);
					}
					}
					setState(65); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__54 );
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); match(T__60);
				setState(68); match(INT);
				setState(69); match(T__15);
				setState(70); match(INT);
				setState(71); match(T__32);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(T__9);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__46) {
					{
					{
					setState(73); match(T__46);
					setState(74); diceinit();
					}
					}
					setState(79);
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
		public Token FACE;
		public TerminalNode INT(int i) {
			return getToken(DiceGameParser.INT, i);
		}
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public List<TerminalNode> INT() { return getTokens(DiceGameParser.INT); }
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
			setState(82); match(T__64);
			setState(83); ((DiceinitContext)_localctx).NAME = match(ID);
			setState(84); match(T__40);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85); match(T__54);
				setState(86); ((DiceinitContext)_localctx).FACE = match(INT);
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__54 );
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
		public Token VAR;
		public ConditionContext CONDITION;
		public List<TerminalNode> ID() { return getTokens(DiceGameParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DiceGameParser.ID, i);
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
		enterRule(_localctx, 6, RULE_playerinit);
		int _la;
		try {
			setState(102);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); match(T__30);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92); match(T__54);
					setState(93); ((PlayerinitContext)_localctx).VAR = match(ID);
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__54 );
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(T__34);
				setState(99); ((PlayerinitContext)_localctx).CONDITION = condition(0);
				setState(100); match(T__39);
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
		enterRule(_localctx, 8, RULE_loop);
		try {
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(T__3);
				setState(105); ((LoopContext)_localctx).PLAYEROBJETS = playerobjects();
				setState(106); match(T__54);
				setState(107); ((LoopContext)_localctx).VAR = match(ID);
				setState(108); match(T__54);
				setState(109); ((LoopContext)_localctx).ACTION = action(0);
				setState(110); match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(T__3);
				setState(113); ((LoopContext)_localctx).DICEOBJECTS = diceobjects();
				setState(114); match(T__54);
				setState(115); ((LoopContext)_localctx).VAR = match(ID);
				setState(116); match(T__54);
				setState(117); ((LoopContext)_localctx).ACTION = action(0);
				setState(118); match(T__24);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); match(T__17);
				setState(121); ((LoopContext)_localctx).VALUE = match(INT);
				setState(122); match(T__62);
				setState(123); ((LoopContext)_localctx).ACTION = action(0);
				setState(124); match(T__24);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_action, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			switch (_input.LA(1)) {
			case T__64:
			case T__61:
			case T__59:
			case T__55:
			case T__49:
			case T__47:
			case T__45:
			case T__44:
			case T__43:
			case T__26:
			case T__23:
			case T__21:
			case T__18:
			case T__16:
			case T__13:
			case T__0:
			case ID:
				{
				setState(129); ((ActionContext)_localctx).ASSIGNMENT = assignment();
				}
				break;
			case T__63:
			case T__50:
			case T__48:
				{
				setState(130); ((ActionContext)_localctx).DICEACTION = dicesaction();
				}
				break;
			case T__17:
			case T__3:
				{
				setState(131); ((ActionContext)_localctx).LOOP = loop();
				}
				break;
			case T__14:
				{
				setState(132); ((ActionContext)_localctx).LAW = law();
				}
				break;
			case T__56:
				{
				setState(133); ((ActionContext)_localctx).NEXT = match(T__56);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionContext(_parentctx, _parentState);
					_localctx.ACTION1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_action);
					setState(136);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(137); match(T__19);
					setState(138); ((ActionContext)_localctx).ACTION2 = action(5);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 12, RULE_dicesaction);
		try {
			setState(161);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); match(T__50);
				setState(145); diceobjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); match(T__48);
				setState(147); diceobjects();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148); match(T__48);
				setState(149); diceobjects();
				setState(150); match(T__25);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152); match(T__48);
				setState(153); diceobjects();
				setState(154); match(T__53);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156); match(T__63);
				setState(157); diceobjects();
				setState(158); match(T__31);
				setState(159); diceobjects();
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
		public Token NAME;
		public Token POS;
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
		enterRule(_localctx, 14, RULE_playerobject);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); match(T__13);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(T__18);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 3);
				{
				setState(165); match(T__44);
				setState(166); ((PlayerobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(167); match(T__21);
				setState(168); ((PlayerobjectContext)_localctx).POS = match(INT);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(169); match(T__26);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(170); match(T__16);
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
		enterRule(_localctx, 16, RULE_playerobjects);
		try {
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); match(T__55);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); match(T__61);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175); match(T__45);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176); playerobject();
				setState(177); match(T__29);
				setState(178); playerobject();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180); playerobject();
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
		enterRule(_localctx, 18, RULE_diceobject);
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__64:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); match(T__64);
				setState(184); ((DiceobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); match(T__0);
				setState(186); ((DiceobjectContext)_localctx).POS = match(INT);
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
		enterRule(_localctx, 20, RULE_diceobjects);
		try {
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); match(T__47);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); match(T__59);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(192); diceobject();
				setState(193); match(T__29);
				setState(194); diceobjects();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(196); diceobject();
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
		public Token VAR;
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
		}
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public PlayerobjectContext playerobject() {
			return getRuleContext(PlayerobjectContext.class,0);
		}
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_variable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(200); ((VariableContext)_localctx).VAR = match(ID);
				}
				break;
			case T__64:
			case T__59:
			case T__47:
			case T__23:
			case T__0:
				{
				setState(201); diceobjects();
				}
				break;
			case T__61:
			case T__55:
			case T__45:
			case T__44:
			case T__26:
			case T__21:
			case T__18:
			case T__16:
			case T__13:
				{
				setState(202); playerobjects();
				}
				break;
			case T__43:
				{
				setState(203); match(T__43);
				setState(204); playerobject();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variable);
					setState(207);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(208); match(T__11);
					setState(209); variable(2);
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public ExprContext E;
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(216); match(INT);
				}
				break;
			case T__52:
				{
				setState(217); match(T__52);
				setState(218); ((ExprContext)_localctx).E = expr(0);
				setState(219); match(T__4);
				}
				break;
			case T__64:
			case T__61:
			case T__59:
			case T__55:
			case T__47:
			case T__45:
			case T__44:
			case T__43:
			case T__26:
			case T__23:
			case T__21:
			case T__18:
			case T__16:
			case T__13:
			case T__0:
			case ID:
				{
				setState(221); variable(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
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
						if ( !(_la==T__41 || _la==T__37) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext V;
		public Token OP;
		public ExprContext E;
		public PlayerobjectContext P;
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
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); ((AssignmentContext)_localctx).V = variable(0);
				setState(236); ((AssignmentContext)_localctx).OP = match(T__58);
				setState(237); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); ((AssignmentContext)_localctx).V = variable(0);
				setState(240); ((AssignmentContext)_localctx).OP = match(T__58);
				setState(241); ((AssignmentContext)_localctx).P = playerobject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(243); ((AssignmentContext)_localctx).V = variable(0);
				setState(244); ((AssignmentContext)_localctx).OP = match(T__7);
				setState(245); ((AssignmentContext)_localctx).DICES = diceobjects();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(247); match(T__49);
				setState(248); ((AssignmentContext)_localctx).V = variable(0);
				setState(249); ((AssignmentContext)_localctx).OP = match(T__28);
				setState(250); ((AssignmentContext)_localctx).E = expr(0);
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
		enterRule(_localctx, 28, RULE_law);
		try {
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); match(T__14);
				setState(255); condition(0);
				setState(256); match(T__33);
				setState(257); action(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); match(T__14);
				setState(260); condition(0);
				setState(261); match(T__33);
				setState(262); action(0);
				setState(263); match(T__36);
				setState(264); action(0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(269); match(T__57);
				setState(270); condition(4);
				}
				break;
			case 2:
				{
				setState(271); expr(0);
				setState(272); match(T__6);
				setState(273); expr(0);
				}
				break;
			case 3:
				{
				setState(275); expr(0);
				setState(276); match(T__10);
				setState(277); expr(0);
				}
				break;
			case 4:
				{
				setState(279); expr(0);
				setState(280); match(T__5);
				setState(281); expr(0);
				}
				break;
			case 5:
				{
				setState(283); expr(0);
				setState(284); match(T__1);
				setState(285); expr(0);
				}
				break;
			case 6:
				{
				setState(287); expr(0);
				setState(288); match(T__20);
				setState(289); expr(0);
				}
				break;
			case 7:
				{
				setState(291); match(T__35);
				}
				break;
			case 8:
				{
				setState(292); match(T__22);
				}
				break;
			case 9:
				{
				setState(293); playerobject();
				setState(294); match(T__51);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(304);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(298);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(299); match(T__19);
						setState(300); condition(7);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(301);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(302); match(T__38);
						setState(303); condition(6);
						}
						break;
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		case 5: return action_sempred((ActionContext)_localctx, predIndex);
		case 11: return variable_sempred((VariableContext)_localctx, predIndex);
		case 12: return expr_sempred((ExprContext)_localctx, predIndex);
		case 15: return condition_sempred((ConditionContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\6\2)\n\2\r\2\16\2*\3\2\3\2\3\2\3\2\6\2\61\n\2\r\2\16\2"+
		"\62\3\2\3\2\3\2\3\2\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\3\3\6\3B\n\3\r"+
		"\3\16\3C\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3Q\13\3\5\3S"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\6\4Z\n\4\r\4\16\4[\3\5\3\5\3\5\6\5a\n\5\r\5\16"+
		"\5b\3\5\3\5\3\5\3\5\5\5i\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00a4\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ae\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b8\n\n\3\13\3\13\3\13\3\13\5\13\u00be"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00d0\n\r\3\r\3\r\3\r\7\r\u00d5\n\r\f\r\16\r\u00d8\13\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00e1\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00e9\n\16\f\16\16\16\u00ec\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00ff"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u010d\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u012b\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0133\n"+
		"\21\f\21\16\21\u0136\13\21\3\21\2\6\f\30\32 \22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\3\4\2\32\32\36\36\u0160\2\"\3\2\2\2\4R\3\2\2\2\6T\3"+
		"\2\2\2\bh\3\2\2\2\n\u0080\3\2\2\2\f\u0088\3\2\2\2\16\u00a3\3\2\2\2\20"+
		"\u00ad\3\2\2\2\22\u00b7\3\2\2\2\24\u00bd\3\2\2\2\26\u00c7\3\2\2\2\30\u00cf"+
		"\3\2\2\2\32\u00e0\3\2\2\2\34\u00fe\3\2\2\2\36\u010c\3\2\2\2 \u012a\3\2"+
		"\2\2\"#\7E\2\2#$\7\31\2\2$(\7\25\2\2%&\5\4\3\2&\'\7(\2\2\')\3\2\2\2(%"+
		"\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+,\3\2\2\2,\60\7\25\2\2-.\5\b\5"+
		"\2./\7(\2\2/\61\3\2\2\2\60-\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\64\3\2\2\2\64\65\7\25\2\2\65;\7A\2\2\66\67\5\f\7\2\678\7("+
		"\2\28:\3\2\2\29\66\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=;"+
		"\3\2\2\2>A\7\67\2\2?@\7\r\2\2@B\7E\2\2A?\3\2\2\2BC\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2DS\3\2\2\2EF\7\7\2\2FG\7D\2\2GH\7\64\2\2HI\7D\2\2IS\7#\2\2JO"+
		"\7:\2\2KL\7\25\2\2LN\5\6\4\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P"+
		"S\3\2\2\2QO\3\2\2\2R>\3\2\2\2RE\3\2\2\2RJ\3\2\2\2S\5\3\2\2\2TU\7\3\2\2"+
		"UV\7E\2\2VY\7\33\2\2WX\7\r\2\2XZ\7D\2\2YW\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2"+
		"[\\\3\2\2\2\\\7\3\2\2\2]`\7%\2\2^_\7\r\2\2_a\7E\2\2`^\3\2\2\2ab\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2ci\3\2\2\2de\7!\2\2ef\5 \21\2fg\7\34\2\2gi\3\2\2"+
		"\2h]\3\2\2\2hd\3\2\2\2i\t\3\2\2\2jk\7@\2\2kl\5\22\n\2lm\7\r\2\2mn\7E\2"+
		"\2no\7\r\2\2op\5\f\7\2pq\7+\2\2q\u0081\3\2\2\2rs\7@\2\2st\5\26\f\2tu\7"+
		"\r\2\2uv\7E\2\2vw\7\r\2\2wx\5\f\7\2xy\7+\2\2y\u0081\3\2\2\2z{\7\62\2\2"+
		"{|\7D\2\2|}\7\5\2\2}~\5\f\7\2~\177\7+\2\2\177\u0081\3\2\2\2\u0080j\3\2"+
		"\2\2\u0080r\3\2\2\2\u0080z\3\2\2\2\u0081\13\3\2\2\2\u0082\u0083\b\7\1"+
		"\2\u0083\u0089\5\34\17\2\u0084\u0089\5\16\b\2\u0085\u0089\5\n\6\2\u0086"+
		"\u0089\5\36\20\2\u0087\u0089\7\13\2\2\u0088\u0082\3\2\2\2\u0088\u0084"+
		"\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008f\3\2\2\2\u008a\u008b\f\6\2\2\u008b\u008c\7\60\2\2\u008c\u008e\5"+
		"\f\7\7\u008d\u008a\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\r\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\21\2"+
		"\2\u0093\u00a4\5\26\f\2\u0094\u0095\7\23\2\2\u0095\u00a4\5\26\f\2\u0096"+
		"\u0097\7\23\2\2\u0097\u0098\5\26\f\2\u0098\u0099\7*\2\2\u0099\u00a4\3"+
		"\2\2\2\u009a\u009b\7\23\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\16\2\2"+
		"\u009d\u00a4\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\5\26\f\2\u00a0\u00a1"+
		"\7$\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a4\3\2\2\2\u00a3\u0092\3\2\2\2\u00a3"+
		"\u0094\3\2\2\2\u00a3\u0096\3\2\2\2\u00a3\u009a\3\2\2\2\u00a3\u009e\3\2"+
		"\2\2\u00a4\17\3\2\2\2\u00a5\u00ae\7\66\2\2\u00a6\u00ae\7\61\2\2\u00a7"+
		"\u00a8\7\27\2\2\u00a8\u00ae\7E\2\2\u00a9\u00aa\7.\2\2\u00aa\u00ae\7D\2"+
		"\2\u00ab\u00ae\7)\2\2\u00ac\u00ae\7\63\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6"+
		"\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\21\3\2\2\2\u00af\u00b8\7\f\2\2\u00b0\u00b8\7\6\2"+
		"\2\u00b1\u00b8\7\26\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\7&\2\2\u00b4"+
		"\u00b5\5\20\t\2\u00b5\u00b8\3\2\2\2\u00b6\u00b8\5\20\t\2\u00b7\u00af\3"+
		"\2\2\2\u00b7\u00b0\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b8\23\3\2\2\2\u00b9\u00ba\7\3\2\2\u00ba\u00be\7E\2\2"+
		"\u00bb\u00bc\7C\2\2\u00bc\u00be\7D\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\25\3\2\2\2\u00bf\u00c8\7,\2\2\u00c0\u00c8\7\24\2\2\u00c1"+
		"\u00c8\7\b\2\2\u00c2\u00c3\5\24\13\2\u00c3\u00c4\7&\2\2\u00c4\u00c5\5"+
		"\26\f\2\u00c5\u00c8\3\2\2\2\u00c6\u00c8\5\24\13\2\u00c7\u00bf\3\2\2\2"+
		"\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\27\3\2\2\2\u00c9\u00ca\b\r\1\2\u00ca\u00d0\7E\2\2\u00cb"+
		"\u00d0\5\26\f\2\u00cc\u00d0\5\22\n\2\u00cd\u00ce\7\30\2\2\u00ce\u00d0"+
		"\5\20\t\2\u00cf\u00c9\3\2\2\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00d0\u00d6\3\2\2\2\u00d1\u00d2\f\3\2\2\u00d2\u00d3"+
		"\78\2\2\u00d3\u00d5\5\30\r\4\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\31\3\2\2\2\u00d8\u00d6\3\2\2"+
		"\2\u00d9\u00da\b\16\1\2\u00da\u00e1\7D\2\2\u00db\u00dc\7\17\2\2\u00dc"+
		"\u00dd\5\32\16\2\u00dd\u00de\7?\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5"+
		"\30\r\2\u00e0\u00d9\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00ea\3\2\2\2\u00e2\u00e3\f\7\2\2\u00e3\u00e4\7;\2\2\u00e4\u00e9\5\32"+
		"\16\b\u00e5\u00e6\f\6\2\2\u00e6\u00e7\t\2\2\2\u00e7\u00e9\5\32\16\7\u00e8"+
		"\u00e2\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\33\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee"+
		"\5\30\r\2\u00ee\u00ef\7\t\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00ff\3\2\2"+
		"\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4\5\20\t\2\u00f4"+
		"\u00ff\3\2\2\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\7<\2\2\u00f7\u00f8\5\26"+
		"\f\2\u00f8\u00ff\3\2\2\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\5\30\r\2\u00fb"+
		"\u00fc\7\'\2\2\u00fc\u00fd\5\32\16\2\u00fd\u00ff\3\2\2\2\u00fe\u00ed\3"+
		"\2\2\2\u00fe\u00f1\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f9\3\2\2\2\u00ff"+
		"\35\3\2\2\2\u0100\u0101\7\65\2\2\u0101\u0102\5 \21\2\u0102\u0103\7\"\2"+
		"\2\u0103\u0104\5\f\7\2\u0104\u010d\3\2\2\2\u0105\u0106\7\65\2\2\u0106"+
		"\u0107\5 \21\2\u0107\u0108\7\"\2\2\u0108\u0109\5\f\7\2\u0109\u010a\7\37"+
		"\2\2\u010a\u010b\5\f\7\2\u010b\u010d\3\2\2\2\u010c\u0100\3\2\2\2\u010c"+
		"\u0105\3\2\2\2\u010d\37\3\2\2\2\u010e\u010f\b\21\1\2\u010f\u0110\7\n\2"+
		"\2\u0110\u012b\5 \21\6\u0111\u0112\5\32\16\2\u0112\u0113\7=\2\2\u0113"+
		"\u0114\5\32\16\2\u0114\u012b\3\2\2\2\u0115\u0116\5\32\16\2\u0116\u0117"+
		"\79\2\2\u0117\u0118\5\32\16\2\u0118\u012b\3\2\2\2\u0119\u011a\5\32\16"+
		"\2\u011a\u011b\7>\2\2\u011b\u011c\5\32\16\2\u011c\u012b\3\2\2\2\u011d"+
		"\u011e\5\32\16\2\u011e\u011f\7B\2\2\u011f\u0120\5\32\16\2\u0120\u012b"+
		"\3\2\2\2\u0121\u0122\5\32\16\2\u0122\u0123\7/\2\2\u0123\u0124\5\32\16"+
		"\2\u0124\u012b\3\2\2\2\u0125\u012b\7 \2\2\u0126\u012b\7-\2\2\u0127\u0128"+
		"\5\20\t\2\u0128\u0129\7\20\2\2\u0129\u012b\3\2\2\2\u012a\u010e\3\2\2\2"+
		"\u012a\u0111\3\2\2\2\u012a\u0115\3\2\2\2\u012a\u0119\3\2\2\2\u012a\u011d"+
		"\3\2\2\2\u012a\u0121\3\2\2\2\u012a\u0125\3\2\2\2\u012a\u0126\3\2\2\2\u012a"+
		"\u0127\3\2\2\2\u012b\u0134\3\2\2\2\u012c\u012d\f\b\2\2\u012d\u012e\7\60"+
		"\2\2\u012e\u0133\5 \21\t\u012f\u0130\f\7\2\2\u0130\u0131\7\35\2\2\u0131"+
		"\u0133\5 \21\b\u0132\u012c\3\2\2\2\u0132\u012f\3\2\2\2\u0133\u0136\3\2"+
		"\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135!\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\35*\62;COR[bh\u0080\u0088\u008f\u00a3\u00ad\u00b7\u00bd\u00c7"+
		"\u00cf\u00d6\u00e0\u00e8\u00ea\u00fe\u010c\u012a\u0132\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}