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
		"'das spiel ist für '", "'aller würfel'", "' ist '", "' nicht '", "'nächster spieler ist dran'", 
		"'alle spieler'", "' '", "' absteigend'", "'('", "' inaktiv ist'", "'würfelt mit '", 
		"'setze '", "'sortiert '", "'allen würfeln'", "'\n'", "'aller spieler'", 
		"'spieler '", "' wird so gespielt:\n'", "' - '", "' hat diese seiten:'", 
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
			setState(37); match(T__42);
			setState(38); match(T__45);
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__12) | (1L << T__9))) != 0) );
			setState(46); match(T__45);
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
			} while ( _la==T__34 || _la==T__30 );
			setState(54); match(T__45);
			setState(55); ((GameContext)_localctx).PLAY = match(T__2);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__63) | (1L << T__62) | (1L << T__60) | (1L << T__58) | (1L << T__55) | (1L << T__54) | (1L << T__49) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__44) | (1L << T__43) | (1L << T__26) | (1L << T__23) | (1L << T__21) | (1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__14) | (1L << T__13) | (1L << T__3))) != 0) || _la==T__0 || _la==ID) {
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
		public Token VAR;
		public Token FROM;
		public Token TO;
		public DiceinitContext DICEINIT;
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
			setState(84);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(T__12);
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65); match(T__53);
					setState(66); ((GameinitContext)_localctx).VAR = match(ID);
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__53 );
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); match(T__59);
				setState(72); ((GameinitContext)_localctx).FROM = match(INT);
				setState(73); match(T__15);
				setState(74); ((GameinitContext)_localctx).TO = match(INT);
				setState(75); match(T__32);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(76); match(T__9);
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__45) {
					{
					{
					setState(77); match(T__45);
					setState(78); ((GameinitContext)_localctx).DICEINIT = diceinit();
					}
					}
					setState(83);
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
			setState(86); match(T__63);
			setState(87); ((DiceinitContext)_localctx).NAME = match(ID);
			setState(88); match(T__40);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89); match(T__53);
				setState(90); ((DiceinitContext)_localctx).FACE = face();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__53 );
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
			setState(95); match(INT);
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
		public VarContext VAR;
		public ConditionContext PLAYERCOND;
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
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
		int _la;
		try {
			setState(108);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(97); match(T__30);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98); match(T__53);
					setState(99); ((PlayerinitContext)_localctx).VAR = var();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__53 );
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(T__34);
				setState(105); ((PlayerinitContext)_localctx).PLAYERCOND = condition(0);
				setState(106); match(T__39);
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
			setState(110); match(ID);
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
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(T__3);
				setState(113); ((LoopContext)_localctx).PLAYEROBJETS = playerobjects();
				setState(114); match(T__53);
				setState(115); ((LoopContext)_localctx).VAR = match(ID);
				setState(116); match(T__53);
				setState(117); ((LoopContext)_localctx).ACTION = action(0);
				setState(118); match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(T__3);
				setState(121); ((LoopContext)_localctx).DICEOBJECTS = diceobjects();
				setState(122); match(T__53);
				setState(123); ((LoopContext)_localctx).VAR = match(ID);
				setState(124); match(T__53);
				setState(125); ((LoopContext)_localctx).ACTION = action(0);
				setState(126); match(T__24);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(T__17);
				setState(129); ((LoopContext)_localctx).VALUE = match(INT);
				setState(130); match(T__61);
				setState(131); ((LoopContext)_localctx).ACTION = action(0);
				setState(132); match(T__24);
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
			setState(142);
			switch (_input.LA(1)) {
			case T__63:
			case T__60:
			case T__58:
			case T__54:
			case T__48:
			case T__46:
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
				setState(137); ((ActionContext)_localctx).ASSIGNMENT = assignment();
				}
				break;
			case T__62:
			case T__49:
			case T__47:
				{
				setState(138); ((ActionContext)_localctx).DICEACTION = dicesaction();
				}
				break;
			case T__17:
			case T__3:
				{
				setState(139); ((ActionContext)_localctx).LOOP = loop();
				}
				break;
			case T__14:
				{
				setState(140); ((ActionContext)_localctx).LAW = law();
				}
				break;
			case T__55:
				{
				setState(141); ((ActionContext)_localctx).NEXT = match(T__55);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
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
					setState(144);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(145); match(T__19);
					setState(146); ((ActionContext)_localctx).ACTION2 = action(5);
					}
					} 
				}
				setState(151);
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
		enterRule(_localctx, 16, RULE_dicesaction);
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(T__49);
				setState(153); diceobjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154); match(T__47);
				setState(155); diceobjects();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); match(T__47);
				setState(157); diceobjects();
				setState(158); match(T__25);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160); match(T__47);
				setState(161); diceobjects();
				setState(162); match(T__52);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164); match(T__62);
				setState(165); diceobjects();
				setState(166); match(T__31);
				setState(167); diceobjects();
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
		enterRule(_localctx, 18, RULE_playerobject);
		try {
			setState(179);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(171); match(T__13);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(172); match(T__18);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 3);
				{
				setState(173); match(T__43);
				setState(174); ((PlayerobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 4);
				{
				setState(175); match(T__21);
				setState(176); ((PlayerobjectContext)_localctx).POS = match(INT);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(177); match(T__26);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(178); match(T__16);
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
		enterRule(_localctx, 20, RULE_playerobjects);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); match(T__54);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); match(T__60);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183); match(T__44);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184); playerobject();
				setState(185); match(T__29);
				setState(186); playerobject();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188); playerobject();
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
		enterRule(_localctx, 22, RULE_diceobject);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(T__63);
				setState(192); ((DiceobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(193); match(T__0);
				setState(194); ((DiceobjectContext)_localctx).POS = match(INT);
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
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); match(T__23);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); match(T__46);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199); match(T__58);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(200); diceobject();
				setState(201); match(T__29);
				setState(202); diceobjects();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(204); diceobject();
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
			setState(211);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(208); ((VariableContext)_localctx).IDENT = match(ID);
				}
				break;
			case T__63:
			case T__58:
			case T__46:
			case T__23:
			case T__0:
				{
				setState(209); ((VariableContext)_localctx).DO = diceobjects();
				}
				break;
			case T__60:
			case T__54:
			case T__44:
			case T__43:
			case T__26:
			case T__21:
			case T__18:
			case T__16:
			case T__13:
				{
				setState(210); ((VariableContext)_localctx).PO = playerobjects();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableContext(_parentctx, _parentState);
					_localctx.INST = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_variable);
					setState(213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(214); match(T__11);
					setState(215); ((VariableContext)_localctx).VAR = variable(2);
					}
					} 
				}
				setState(220);
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
			setState(228);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(222); ((ExprContext)_localctx).INTEGER = match(INT);
				}
				break;
			case T__51:
				{
				setState(223); match(T__51);
				setState(224); ((ExprContext)_localctx).E = expr(0);
				setState(225); match(T__4);
				}
				break;
			case T__63:
			case T__60:
			case T__58:
			case T__54:
			case T__46:
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
				setState(227); ((ExprContext)_localctx).VAR = variable(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(236);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(231); ((ExprContext)_localctx).OP = match(T__8);
						setState(232); ((ExprContext)_localctx).B = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(234);
						((ExprContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__41 || _la==T__37) ) {
							((ExprContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(235); ((ExprContext)_localctx).B = expr(5);
						}
						break;
					}
					} 
				}
				setState(240);
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
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); ((AssignmentContext)_localctx).V = variable(0);
				setState(242); ((AssignmentContext)_localctx).OP = match(T__57);
				setState(243); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); match(T__48);
				setState(246); ((AssignmentContext)_localctx).V = variable(0);
				setState(247); ((AssignmentContext)_localctx).OP = match(T__28);
				setState(248); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250); ((AssignmentContext)_localctx).V = variable(0);
				setState(251); ((AssignmentContext)_localctx).OP = match(T__57);
				setState(252); ((AssignmentContext)_localctx).P = playerobject();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254); ((AssignmentContext)_localctx).V = variable(0);
				setState(255); ((AssignmentContext)_localctx).OPSUM = match(T__7);
				setState(256); ((AssignmentContext)_localctx).DICES = diceobjects();
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
		enterRule(_localctx, 32, RULE_law);
		try {
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260); match(T__14);
				setState(261); condition(0);
				setState(262); match(T__33);
				setState(263); action(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); match(T__14);
				setState(266); condition(0);
				setState(267); match(T__33);
				setState(268); action(0);
				setState(269); match(T__36);
				setState(270); action(0);
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
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(275); ((ConditionContext)_localctx).NOT = match(T__56);
				setState(276); ((ConditionContext)_localctx).C = condition(4);
				}
				break;
			case 2:
				{
				setState(277); ((ConditionContext)_localctx).A = expr(0);
				setState(278); ((ConditionContext)_localctx).EQ = match(T__6);
				setState(279); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 3:
				{
				setState(281); ((ConditionContext)_localctx).A = expr(0);
				setState(282); ((ConditionContext)_localctx).LT = match(T__10);
				setState(283); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 4:
				{
				setState(285); ((ConditionContext)_localctx).A = expr(0);
				setState(286); ((ConditionContext)_localctx).GT = match(T__5);
				setState(287); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 5:
				{
				setState(289); ((ConditionContext)_localctx).A = expr(0);
				setState(290); ((ConditionContext)_localctx).LE = match(T__1);
				setState(291); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 6:
				{
				setState(293); ((ConditionContext)_localctx).A = expr(0);
				setState(294); ((ConditionContext)_localctx).GE = match(T__20);
				setState(295); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 7:
				{
				setState(297); ((ConditionContext)_localctx).TRUE = match(T__35);
				}
				break;
			case 8:
				{
				setState(298); ((ConditionContext)_localctx).FALSE = match(T__22);
				}
				break;
			case 9:
				{
				setState(299); ((ConditionContext)_localctx).PLAYER = playerobject();
				setState(300); match(T__50);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(310);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.C = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(304);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(305); ((ConditionContext)_localctx).AND = match(T__19);
						setState(306); ((ConditionContext)_localctx).D = condition(7);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.C = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(307);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(308); ((ConditionContext)_localctx).OR = match(T__38);
						setState(309); ((ConditionContext)_localctx).D = condition(6);
						}
						break;
					}
					} 
				}
				setState(314);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\6\2-\n\2\r\2\16\2.\3\2\3\2\3\2\3\2"+
		"\6\2\65\n\2\r\2\16\2\66\3\2\3\2\3\2\3\2\3\2\7\2>\n\2\f\2\16\2A\13\2\3"+
		"\3\3\3\3\3\6\3F\n\3\r\3\16\3G\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3R\n\3"+
		"\f\3\16\3U\13\3\5\3W\n\3\3\4\3\4\3\4\3\4\3\4\6\4^\n\4\r\4\16\4_\3\5\3"+
		"\5\3\6\3\6\3\6\6\6g\n\6\r\6\16\6h\3\6\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u0089\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0091\n\t\3\t"+
		"\3\t\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ac\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00b6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u00c0\n\f\3\r\3\r\3\r\3\r\5\r\u00c6\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00d0\n\16\3\17\3\17\3\17\3\17\5\17\u00d6\n\17"+
		"\3\17\3\17\3\17\7\17\u00db\n\17\f\17\16\17\u00de\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00e7\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00ef\n\20\f\20\16\20\u00f2\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0105\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0113\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0131\n\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0139\n\23\f\23\16"+
		"\23\u013c\13\23\3\23\2\6\20\34\36$\24\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$\2\3\4\2\31\31\35\35\u0163\2&\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2"+
		"\ba\3\2\2\2\nn\3\2\2\2\fp\3\2\2\2\16\u0088\3\2\2\2\20\u0090\3\2\2\2\22"+
		"\u00ab\3\2\2\2\24\u00b5\3\2\2\2\26\u00bf\3\2\2\2\30\u00c5\3\2\2\2\32\u00cf"+
		"\3\2\2\2\34\u00d5\3\2\2\2\36\u00e6\3\2\2\2 \u0104\3\2\2\2\"\u0112\3\2"+
		"\2\2$\u0130\3\2\2\2&\'\7D\2\2\'(\7\30\2\2(,\7\25\2\2)*\5\4\3\2*+\7\'\2"+
		"\2+-\3\2\2\2,)\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\64"+
		"\7\25\2\2\61\62\5\n\6\2\62\63\7\'\2\2\63\65\3\2\2\2\64\61\3\2\2\2\65\66"+
		"\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\25\2\29?\7@\2\2:"+
		";\5\20\t\2;<\7\'\2\2<>\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@\3\3\2\2\2A?\3\2\2\2BE\7\66\2\2CD\7\r\2\2DF\7D\2\2EC\3\2\2\2FG\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HW\3\2\2\2IJ\7\7\2\2JK\7C\2\2KL\7\63\2\2LM\7C\2"+
		"\2MW\7\"\2\2NS\79\2\2OP\7\25\2\2PR\5\6\4\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2"+
		"\2ST\3\2\2\2TW\3\2\2\2US\3\2\2\2VB\3\2\2\2VI\3\2\2\2VN\3\2\2\2W\5\3\2"+
		"\2\2XY\7\3\2\2YZ\7D\2\2Z]\7\32\2\2[\\\7\r\2\2\\^\5\b\5\2][\3\2\2\2^_\3"+
		"\2\2\2_]\3\2\2\2_`\3\2\2\2`\7\3\2\2\2ab\7C\2\2b\t\3\2\2\2cf\7$\2\2de\7"+
		"\r\2\2eg\5\f\7\2fd\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2io\3\2\2\2jk\7"+
		" \2\2kl\5$\23\2lm\7\33\2\2mo\3\2\2\2nc\3\2\2\2nj\3\2\2\2o\13\3\2\2\2p"+
		"q\7D\2\2q\r\3\2\2\2rs\7?\2\2st\5\26\f\2tu\7\r\2\2uv\7D\2\2vw\7\r\2\2w"+
		"x\5\20\t\2xy\7*\2\2y\u0089\3\2\2\2z{\7?\2\2{|\5\32\16\2|}\7\r\2\2}~\7"+
		"D\2\2~\177\7\r\2\2\177\u0080\5\20\t\2\u0080\u0081\7*\2\2\u0081\u0089\3"+
		"\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7C\2\2\u0084\u0085\7\5\2\2\u0085"+
		"\u0086\5\20\t\2\u0086\u0087\7*\2\2\u0087\u0089\3\2\2\2\u0088r\3\2\2\2"+
		"\u0088z\3\2\2\2\u0088\u0082\3\2\2\2\u0089\17\3\2\2\2\u008a\u008b\b\t\1"+
		"\2\u008b\u0091\5 \21\2\u008c\u0091\5\22\n\2\u008d\u0091\5\16\b\2\u008e"+
		"\u0091\5\"\22\2\u008f\u0091\7\13\2\2\u0090\u008a\3\2\2\2\u0090\u008c\3"+
		"\2\2\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0097\3\2\2\2\u0092\u0093\f\6\2\2\u0093\u0094\7/\2\2\u0094\u0096\5\20"+
		"\t\7\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\21\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\21\2"+
		"\2\u009b\u00ac\5\32\16\2\u009c\u009d\7\23\2\2\u009d\u00ac\5\32\16\2\u009e"+
		"\u009f\7\23\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\7)\2\2\u00a1\u00ac\3"+
		"\2\2\2\u00a2\u00a3\7\23\2\2\u00a3\u00a4\5\32\16\2\u00a4\u00a5\7\16\2\2"+
		"\u00a5\u00ac\3\2\2\2\u00a6\u00a7\7\4\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9"+
		"\7#\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ac\3\2\2\2\u00ab\u009a\3\2\2\2"+
		"\u00ab\u009c\3\2\2\2\u00ab\u009e\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a6"+
		"\3\2\2\2\u00ac\23\3\2\2\2\u00ad\u00b6\7\65\2\2\u00ae\u00b6\7\60\2\2\u00af"+
		"\u00b0\7\27\2\2\u00b0\u00b6\7D\2\2\u00b1\u00b2\7-\2\2\u00b2\u00b6\7C\2"+
		"\2\u00b3\u00b6\7(\2\2\u00b4\u00b6\7\62\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00ae"+
		"\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\25\3\2\2\2\u00b7\u00c0\7\f\2\2\u00b8\u00c0\7\6\2"+
		"\2\u00b9\u00c0\7\26\2\2\u00ba\u00bb\5\24\13\2\u00bb\u00bc\7%\2\2\u00bc"+
		"\u00bd\5\24\13\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\5\24\13\2\u00bf\u00b7"+
		"\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\27\3\2\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00c6\7D\2\2"+
		"\u00c3\u00c4\7B\2\2\u00c4\u00c6\7C\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c3"+
		"\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00d0\7+\2\2\u00c8\u00d0\7\24\2\2\u00c9"+
		"\u00d0\7\b\2\2\u00ca\u00cb\5\30\r\2\u00cb\u00cc\7%\2\2\u00cc\u00cd\5\32"+
		"\16\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\5\30\r\2\u00cf\u00c7\3\2\2\2\u00cf"+
		"\u00c8\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0\33\3\2\2\2\u00d1\u00d2\b\17\1\2\u00d2\u00d6\7D\2\2\u00d3\u00d6"+
		"\5\32\16\2\u00d4\u00d6\5\26\f\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2"+
		"\2\u00d5\u00d4\3\2\2\2\u00d6\u00dc\3\2\2\2\u00d7\u00d8\f\3\2\2\u00d8\u00d9"+
		"\7\67\2\2\u00d9\u00db\5\34\17\4\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2"+
		"\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\35\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e0\b\20\1\2\u00e0\u00e7\7C\2\2\u00e1\u00e2\7\17\2\2"+
		"\u00e2\u00e3\5\36\20\2\u00e3\u00e4\7>\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7"+
		"\5\34\17\2\u00e6\u00df\3\2\2\2\u00e6\u00e1\3\2\2\2\u00e6\u00e5\3\2\2\2"+
		"\u00e7\u00f0\3\2\2\2\u00e8\u00e9\f\7\2\2\u00e9\u00ea\7:\2\2\u00ea\u00ef"+
		"\5\36\20\b\u00eb\u00ec\f\6\2\2\u00ec\u00ed\t\2\2\2\u00ed\u00ef\5\36\20"+
		"\7\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\37\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f4\5\34\17\2\u00f4\u00f5\7\t\2\2\u00f5\u00f6\5\36\20\2\u00f6\u0105"+
		"\3\2\2\2\u00f7\u00f8\7\22\2\2\u00f8\u00f9\5\34\17\2\u00f9\u00fa\7&\2\2"+
		"\u00fa\u00fb\5\36\20\2\u00fb\u0105\3\2\2\2\u00fc\u00fd\5\34\17\2\u00fd"+
		"\u00fe\7\t\2\2\u00fe\u00ff\5\24\13\2\u00ff\u0105\3\2\2\2\u0100\u0101\5"+
		"\34\17\2\u0101\u0102\7;\2\2\u0102\u0103\5\32\16\2\u0103\u0105\3\2\2\2"+
		"\u0104\u00f3\3\2\2\2\u0104\u00f7\3\2\2\2\u0104\u00fc\3\2\2\2\u0104\u0100"+
		"\3\2\2\2\u0105!\3\2\2\2\u0106\u0107\7\64\2\2\u0107\u0108\5$\23\2\u0108"+
		"\u0109\7!\2\2\u0109\u010a\5\20\t\2\u010a\u0113\3\2\2\2\u010b\u010c\7\64"+
		"\2\2\u010c\u010d\5$\23\2\u010d\u010e\7!\2\2\u010e\u010f\5\20\t\2\u010f"+
		"\u0110\7\36\2\2\u0110\u0111\5\20\t\2\u0111\u0113\3\2\2\2\u0112\u0106\3"+
		"\2\2\2\u0112\u010b\3\2\2\2\u0113#\3\2\2\2\u0114\u0115\b\23\1\2\u0115\u0116"+
		"\7\n\2\2\u0116\u0131\5$\23\6\u0117\u0118\5\36\20\2\u0118\u0119\7<\2\2"+
		"\u0119\u011a\5\36\20\2\u011a\u0131\3\2\2\2\u011b\u011c\5\36\20\2\u011c"+
		"\u011d\78\2\2\u011d\u011e\5\36\20\2\u011e\u0131\3\2\2\2\u011f\u0120\5"+
		"\36\20\2\u0120\u0121\7=\2\2\u0121\u0122\5\36\20\2\u0122\u0131\3\2\2\2"+
		"\u0123\u0124\5\36\20\2\u0124\u0125\7A\2\2\u0125\u0126\5\36\20\2\u0126"+
		"\u0131\3\2\2\2\u0127\u0128\5\36\20\2\u0128\u0129\7.\2\2\u0129\u012a\5"+
		"\36\20\2\u012a\u0131\3\2\2\2\u012b\u0131\7\37\2\2\u012c\u0131\7,\2\2\u012d"+
		"\u012e\5\24\13\2\u012e\u012f\7\20\2\2\u012f\u0131\3\2\2\2\u0130\u0114"+
		"\3\2\2\2\u0130\u0117\3\2\2\2\u0130\u011b\3\2\2\2\u0130\u011f\3\2\2\2\u0130"+
		"\u0123\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u012b\3\2\2\2\u0130\u012c\3\2"+
		"\2\2\u0130\u012d\3\2\2\2\u0131\u013a\3\2\2\2\u0132\u0133\f\b\2\2\u0133"+
		"\u0134\7/\2\2\u0134\u0139\5$\23\t\u0135\u0136\f\7\2\2\u0136\u0137\7\34"+
		"\2\2\u0137\u0139\5$\23\b\u0138\u0132\3\2\2\2\u0138\u0135\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b%\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\35.\66?GSV_hn\u0088\u0090\u0097\u00ab\u00b5\u00bf"+
		"\u00c5\u00cf\u00d5\u00dc\u00e6\u00ee\u00f0\u0104\u0112\u0130\u0138\u013a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}