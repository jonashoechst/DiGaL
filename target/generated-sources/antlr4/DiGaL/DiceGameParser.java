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
		T__76=1, T__75=2, T__74=3, T__73=4, T__72=5, T__71=6, T__70=7, T__69=8, 
		T__68=9, T__67=10, T__66=11, T__65=12, T__64=13, T__63=14, T__62=15, T__61=16, 
		T__60=17, T__59=18, T__58=19, T__57=20, T__56=21, T__55=22, T__54=23, 
		T__53=24, T__52=25, T__51=26, T__50=27, T__49=28, T__48=29, T__47=30, 
		T__46=31, T__45=32, T__44=33, T__43=34, T__42=35, T__41=36, T__40=37, 
		T__39=38, T__38=39, T__37=40, T__36=41, T__35=42, T__34=43, T__33=44, 
		T__32=45, T__31=46, T__30=47, T__29=48, T__28=49, T__27=50, T__26=51, 
		T__25=52, T__24=53, T__23=54, T__22=55, T__21=56, T__20=57, T__19=58, 
		T__18=59, T__17=60, T__16=61, T__15=62, T__14=63, T__13=64, T__12=65, 
		T__11=66, T__10=67, T__9=68, T__8=69, T__7=70, T__6=71, T__5=72, T__4=73, 
		T__3=74, T__2=75, T__1=76, T__0=77, INT=78, ID=79, COMMENT=80;
	public static final String[] tokenNames = {
		"<INVALID>", "'sortiert alle würfel'", "'würfel '", "' mal '", "'allen spielern'", 
		"'das spiel ist für '", "'aller würfel'", "' dran'", "'spieler haben die werte '", 
		"' ist '", "' nicht '", "'alle spieler'", "' '", "'das spiel läuft solange '", 
		"'das spiel hat den wert '", "'alle'", "' absteigend'", "'('", "'würfelt mit '", 
		"'setze '", "'gewonnen hat der spieler, bei dem '", "'n'", "'allen würfeln'", 
		"'\n'", "'r'", "'aller spieler'", "'spieler '", "' kleiner '", "' mehr als '", 
		"' wird so gespielt:\n'", "' - '", "' hat diese seiten:'", "' gilt'", 
		"' + '", "' oder '", "'aktiver spieler'", "' spieler'", "', sonst '", 
		"'wahr'", "'spieler sind aktiv, solange '", "', dann '", "' spieler geeignet'", 
		"'ist '", "', '", "'aktive spieler'", "' auf '", "'spiel ist zu ende'", 
		"' größer '", "'.\n'", "'rechter spieler'", "' aufsteigend'", "';'", "'gewonnen haben alle spieler, bei denen '", 
		"'alle würfel'", "'falsch'", "'würfel'", "' größergleich '", "' und '", 
		"'aktueller spieler'", "'anzahl '", "'macht '", "'linker spieler'", "'.'", 
		"' ist dran'", "' bis '", "'wenn '", "'der spieler'", "' kleiner als '", 
		"'das spiel hat folgende würfel:'", "' * '", "' gleich '", "'die summe von '", 
		"')'", "' größer als '", "' von '", "'für '", "'ist ein spieler am zug macht er folgendes:\n'", 
		"' kleinergleich '", "INT", "ID", "COMMENT"
	};
	public static final int
		RULE_game = 0, RULE_gameinit = 1, RULE_diceinit = 2, RULE_face = 3, RULE_playerinit = 4, 
		RULE_var = 5, RULE_loop = 6, RULE_gameend = 7, RULE_action = 8, RULE_dicesaction = 9, 
		RULE_playerobject = 10, RULE_playerobjects = 11, RULE_diceobject = 12, 
		RULE_diceobjects = 13, RULE_condition = 14, RULE_variable = 15, RULE_expr = 16, 
		RULE_assignment = 17, RULE_law = 18;
	public static final String[] ruleNames = {
		"game", "gameinit", "diceinit", "face", "playerinit", "var", "loop", "gameend", 
		"action", "dicesaction", "playerobject", "playerobjects", "diceobject", 
		"diceobjects", "condition", "variable", "expr", "assignment", "law"
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
		public GameendContext GAMEEND;
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
		public GameendContext gameend() {
			return getRuleContext(GameendContext.class,0);
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
			setState(38); ((GameContext)_localctx).NAME = match(ID);
			setState(39); match(T__48);
			setState(40); match(T__54);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41); ((GameContext)_localctx).GAMEINIT = gameinit();
				setState(42); match(T__29);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 5)) & ~0x3f) == 0 && ((1L << (_la - 5)) & ((1L << (T__72 - 5)) | (1L << (T__64 - 5)) | (1L << (T__63 - 5)) | (1L << (T__9 - 5)))) != 0) );
			setState(48); match(T__54);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__69 || _la==T__38) {
				{
				{
				setState(49); ((GameContext)_localctx).PLAYERINIT = playerinit();
				setState(50); match(T__29);
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); match(T__54);
			setState(58); ((GameContext)_localctx).PLAY = match(T__1);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__76) | (1L << T__75) | (1L << T__59) | (1L << T__58) | (1L << T__51) | (1L << T__35) | (1L << T__31) | (1L << T__28) | (1L << T__19) | (1L << T__17) | (1L << T__16))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__12 - 65)) | (1L << (T__11 - 65)) | (1L << (T__2 - 65)) | (1L << (ID - 65)))) != 0)) {
				{
				{
				setState(59); ((GameContext)_localctx).ACTION = action(0);
				setState(60); match(T__29);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); match(T__54);
			{
			setState(68); ((GameContext)_localctx).GAMEEND = gameend();
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
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(T__63);
				setState(71); ((GameinitContext)_localctx).ASSN = assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); match(T__72);
				setState(73); ((GameinitContext)_localctx).FROM = match(INT);
				setState(74); match(T__13);
				setState(75); ((GameinitContext)_localctx).TO = match(INT);
				setState(76); match(T__36);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); match(T__72);
				setState(78); ((GameinitContext)_localctx).FROM = match(INT);
				setState(79); match(T__36);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); match(T__64);
				setState(81); ((GameinitContext)_localctx).COND = condition(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(82); match(T__9);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__54) {
					{
					{
					setState(83); match(T__54);
					setState(84); ((GameinitContext)_localctx).DICEINIT = diceinit();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
			setState(92); match(T__75);
			setState(93); ((DiceinitContext)_localctx).NAME = match(ID);
			setState(94); match(T__46);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95); match(T__65);
				setState(96); ((DiceinitContext)_localctx).FACE = face();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__65 );
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
			setState(101); match(INT);
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
			setState(109);
			switch (_input.LA(1)) {
			case T__69:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(T__69);
				setState(104); ((PlayerinitContext)_localctx).ASSN = assignment();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(T__38);
				setState(106); ((PlayerinitContext)_localctx).PLAYERACTIVECOND = condition(0);
				setState(107); match(T__45);
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
			setState(111); match(ID);
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
			setState(130);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); ((LoopContext)_localctx).FORLOOP = match(T__2);
				setState(116);
				switch (_input.LA(1)) {
				case T__75:
				case T__71:
				case T__55:
				case T__24:
				case T__22:
					{
					setState(114); ((LoopContext)_localctx).DOs = diceobjects();
					}
					break;
				case T__73:
				case T__66:
				case T__62:
				case T__52:
				case T__51:
				case T__42:
				case T__33:
				case T__28:
				case T__19:
				case T__16:
				case T__11:
					{
					setState(115); ((LoopContext)_localctx).POs = playerobjects();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); match(T__65);
				setState(119); ((LoopContext)_localctx).VAR = match(ID);
				setState(120); match(T__65);
				setState(121); ((LoopContext)_localctx).ACTION = action(0);
				setState(122); match(T__26);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(124); ((LoopContext)_localctx).NLOOP = match(T__17);
				setState(125); ((LoopContext)_localctx).VALUE = match(INT);
				setState(126); match(T__74);
				setState(127); ((LoopContext)_localctx).ACTION = action(0);
				setState(128); match(T__26);
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

	public static class GameendContext extends ParserRuleContext {
		public Token MULTI;
		public ConditionContext COND;
		public Token SINGLE;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public GameendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterGameend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitGameend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DiceGameVisitor ) return ((DiceGameVisitor<? extends T>)visitor).visitGameend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameendContext gameend() throws RecognitionException {
		GameendContext _localctx = new GameendContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_gameend);
		try {
			setState(140);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); ((GameendContext)_localctx).MULTI = match(T__25);
				setState(133); ((GameendContext)_localctx).COND = condition(0);
				setState(134); match(T__15);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); ((GameendContext)_localctx).SINGLE = match(T__57);
				setState(137); ((GameendContext)_localctx).COND = condition(0);
				setState(138); match(T__15);
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
		public Token ENDLOOP;
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_action, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(143); ((ActionContext)_localctx).AS = assignment();
				}
				break;
			case 2:
				{
				setState(144); ((ActionContext)_localctx).DA = dicesaction();
				}
				break;
			case 3:
				{
				setState(145); ((ActionContext)_localctx).LOOP = loop();
				}
				break;
			case 4:
				{
				setState(146); ((ActionContext)_localctx).LAW = law();
				}
				break;
			case 5:
				{
				setState(147); match(T__35);
				setState(148); ((ActionContext)_localctx).PLAYER = playerobject();
				setState(149); ((ActionContext)_localctx).NEXT = match(T__70);
				}
				break;
			case 6:
				{
				setState(151); ((ActionContext)_localctx).PLAYER = playerobject();
				setState(152); ((ActionContext)_localctx).NEXT = match(T__14);
				}
				break;
			case 7:
				{
				setState(154); ((ActionContext)_localctx).ENDLOOP = match(T__31);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(162);
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
					setState(157);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(158); match(T__20);
					setState(159); ((ActionContext)_localctx).ACTION2 = action(5);
					}
					} 
				}
				setState(164);
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
		enterRule(_localctx, 18, RULE_dicesaction);
		try {
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165); ((DicesactionContext)_localctx).THROW = match(T__59);
				setState(166); ((DicesactionContext)_localctx).DOs = diceobjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167); ((DicesactionContext)_localctx).SORT = match(T__76);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168); ((DicesactionContext)_localctx).SORT = match(T__76);
				setState(169); match(T__27);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170); ((DicesactionContext)_localctx).SORT = match(T__76);
				setState(171); ((DicesactionContext)_localctx).REVERSE = match(T__61);
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
		enterRule(_localctx, 20, RULE_playerobject);
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); ((PlayerobjectContext)_localctx).CUR = match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175); ((PlayerobjectContext)_localctx).CUR = match(T__19);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(T__51);
				setState(177); ((PlayerobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178); match(T__51);
				setState(179); ((PlayerobjectContext)_localctx).POS = match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180); ((PlayerobjectContext)_localctx).RIGHT = match(T__28);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181); ((PlayerobjectContext)_localctx).LEFT = match(T__16);
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
		enterRule(_localctx, 22, RULE_playerobjects);
		int _la;
		try {
			int _alt;
			setState(206);
			switch (_input.LA(1)) {
			case T__66:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); ((PlayerobjectsContext)_localctx).ALL = match(T__66);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); ((PlayerobjectsContext)_localctx).ALL = match(T__73);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 3);
				{
				setState(186); ((PlayerobjectsContext)_localctx).ALL = match(T__52);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 4);
				{
				setState(187); ((PlayerobjectsContext)_localctx).ALL = match(T__62);
				setState(189);
				_la = _input.LA(1);
				if (_la==T__56 || _la==T__53) {
					{
					setState(188);
					_la = _input.LA(1);
					if ( !(_la==T__56 || _la==T__53) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(191); match(T__41);
				setState(193);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(192); match(T__56);
					}
					break;
				}
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 5);
				{
				setState(195); ((PlayerobjectsContext)_localctx).ACTIVE = match(T__33);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 6);
				{
				setState(196); ((PlayerobjectsContext)_localctx).ACTIVE = match(T__42);
				}
				break;
			case T__51:
			case T__28:
			case T__19:
			case T__16:
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(197); ((PlayerobjectsContext)_localctx).PO = playerobject();
						setState(198); match(T__34);
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(205); ((PlayerobjectsContext)_localctx).LAST = playerobject();
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
		enterRule(_localctx, 24, RULE_diceobject);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); match(T__75);
				setState(209); ((DiceobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); match(T__75);
				setState(211); ((DiceobjectContext)_localctx).POS = match(INT);
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
		enterRule(_localctx, 26, RULE_diceobjects);
		try {
			int _alt;
			setState(227);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); ((DiceobjectsContext)_localctx).ALL = match(T__55);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); ((DiceobjectsContext)_localctx).ALL = match(T__24);
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 3);
				{
				setState(216); ((DiceobjectsContext)_localctx).ALL = match(T__71);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(217); ((DiceobjectsContext)_localctx).ALL = match(T__22);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 5);
				{
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(218); ((DiceobjectsContext)_localctx).DO = diceobject();
						setState(219); match(T__34);
						}
						} 
					}
					setState(225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(226); ((DiceobjectsContext)_localctx).LAST = diceobject();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext C;
		public Token NOT;
		public ExprContext A;
		public Token EQ;
		public ExprContext B;
		public Token GT;
		public Token LT;
		public Token LE;
		public Token GE;
		public Token TRUE;
		public Token FALSE;
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(230); ((ConditionContext)_localctx).NOT = match(T__67);
				setState(231); ((ConditionContext)_localctx).C = condition(3);
				}
				break;
			case 2:
				{
				setState(232); ((ConditionContext)_localctx).A = expr(0);
				setState(233); ((ConditionContext)_localctx).EQ = match(T__7);
				setState(234); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 3:
				{
				setState(236); ((ConditionContext)_localctx).A = expr(0);
				setState(237); ((ConditionContext)_localctx).GT = match(T__4);
				setState(238); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 4:
				{
				setState(240); ((ConditionContext)_localctx).A = expr(0);
				setState(241); ((ConditionContext)_localctx).GT = match(T__30);
				setState(242); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 5:
				{
				setState(244); ((ConditionContext)_localctx).A = expr(0);
				setState(245); ((ConditionContext)_localctx).GT = match(T__49);
				setState(246); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 6:
				{
				setState(248); ((ConditionContext)_localctx).A = expr(0);
				setState(249); ((ConditionContext)_localctx).LT = match(T__10);
				setState(250); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 7:
				{
				setState(252); ((ConditionContext)_localctx).A = expr(0);
				setState(253); ((ConditionContext)_localctx).LT = match(T__50);
				setState(254); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 8:
				{
				setState(256); ((ConditionContext)_localctx).A = expr(0);
				setState(257); ((ConditionContext)_localctx).LE = match(T__0);
				setState(258); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 9:
				{
				setState(260); ((ConditionContext)_localctx).A = expr(0);
				setState(261); ((ConditionContext)_localctx).GE = match(T__21);
				setState(262); ((ConditionContext)_localctx).B = expr(0);
				}
				break;
			case 10:
				{
				setState(264); ((ConditionContext)_localctx).TRUE = match(T__39);
				}
				break;
			case 11:
				{
				setState(265); ((ConditionContext)_localctx).FALSE = match(T__23);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(276);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(274);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.C = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269); ((ConditionContext)_localctx).AND = match(T__20);
						setState(270); ((ConditionContext)_localctx).D = condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.C = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(271);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(272); ((ConditionContext)_localctx).OR = match(T__43);
						setState(273); ((ConditionContext)_localctx).D = condition(5);
						}
						break;
					}
					} 
				}
				setState(278);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_variable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(280); ((VariableContext)_localctx).IVAR = match(ID);
				setState(281); match(T__3);
				setState(282); ((VariableContext)_localctx).INST = variable(2);
				}
				break;
			case 2:
				{
				setState(283); ((VariableContext)_localctx).VAR = match(ID);
				}
				break;
			case 3:
				{
				setState(284); ((VariableContext)_localctx).DO = diceobject();
				}
				break;
			case 4:
				{
				setState(285); ((VariableContext)_localctx).PO = playerobject();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VariableContext(_parentctx, _parentState);
					_localctx.INST = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_variable);
					setState(288);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(289); match(T__65);
					setState(290); ((VariableContext)_localctx).IVAR = match(ID);
					}
					} 
				}
				setState(295);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(297); ((ExprContext)_localctx).INTEGER = match(INT);
				}
				break;
			case T__75:
			case T__51:
			case T__28:
			case T__19:
			case T__16:
			case T__11:
			case ID:
				{
				setState(298); ((ExprContext)_localctx).VAR = variable(0);
				}
				break;
			case T__60:
				{
				setState(299); match(T__60);
				setState(300); ((ExprContext)_localctx).E = expr(0);
				setState(301); match(T__5);
				}
				break;
			case T__6:
				{
				setState(303); ((ExprContext)_localctx).SUM = match(T__6);
				setState(304); ((ExprContext)_localctx).DOs = diceobjects();
				}
				break;
			case T__18:
				{
				setState(305); ((ExprContext)_localctx).COUNT = match(T__18);
				setState(308);
				switch (_input.LA(1)) {
				case T__73:
				case T__66:
				case T__62:
				case T__52:
				case T__51:
				case T__42:
				case T__33:
				case T__28:
				case T__19:
				case T__16:
				case T__11:
					{
					setState(306); ((ExprContext)_localctx).POs = playerobjects();
					}
					break;
				case T__75:
				case T__71:
				case T__55:
				case T__24:
				case T__22:
					{
					setState(307); ((ExprContext)_localctx).DOs = diceobjects();
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
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(313); ((ExprContext)_localctx).OP = match(T__8);
						setState(314); ((ExprContext)_localctx).B = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(316);
						((ExprContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__47 || _la==T__44) ) {
							((ExprContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(317); ((ExprContext)_localctx).B = expr(7);
						}
						break;
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 34, RULE_assignment);
		try {
			setState(332);
			switch (_input.LA(1)) {
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(323); match(T__58);
				setState(324); ((AssignmentContext)_localctx).V = variable(0);
				setState(325); match(T__32);
				setState(326); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case T__75:
			case T__51:
			case T__28:
			case T__19:
			case T__16:
			case T__11:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); ((AssignmentContext)_localctx).V = variable(0);
				setState(329); match(T__68);
				setState(330); ((AssignmentContext)_localctx).E = expr(0);
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
		enterRule(_localctx, 36, RULE_law);
		try {
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334); match(T__12);
				setState(335); ((LawContext)_localctx).COND = condition(0);
				setState(336); match(T__37);
				setState(337); ((LawContext)_localctx).THEN = action(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); match(T__12);
				setState(340); ((LawContext)_localctx).COND = condition(0);
				setState(341); match(T__37);
				setState(342); ((LawContext)_localctx).THEN = action(0);
				setState(343); match(T__40);
				setState(344); ((LawContext)_localctx).ELSE = action(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return action_sempred((ActionContext)_localctx, predIndex);
		case 14: return condition_sempred((ConditionContext)_localctx, predIndex);
		case 15: return variable_sempred((VariableContext)_localctx, predIndex);
		case 16: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
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
		case 4: return precpred(_ctx, 7);
		case 5: return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3R\u015f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\6\2/\n\2\r\2\16\2\60\3\2"+
		"\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\3\2\3\2\7\2A\n\2\f"+
		"\2\16\2D\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\5\3]\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\6\4d\n\4\r\4\16\4e\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3"+
		"\b\3\b\3\b\5\bw\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0085\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\n\3\n\3\n\7\n"+
		"\u00a3\n\n\f\n\16\n\u00a6\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00af\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b9\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u00c0\n\r\3\r\3\r\5\r\u00c4\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cb"+
		"\n\r\f\r\16\r\u00ce\13\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\16\3\16\5\16\u00d7"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00e0\n\17\f\17\16\17\u00e3"+
		"\13\17\3\17\5\17\u00e6\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u010d\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0115\n\20\f\20"+
		"\16\20\u0118\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0121\n\21"+
		"\3\21\3\21\3\21\7\21\u0126\n\21\f\21\16\21\u0129\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0137\n\22\5\22\u0139"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0141\n\22\f\22\16\22\u0144\13"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014f\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u015d\n\24"+
		"\3\24\2\6\22\36 \"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4"+
		"\4\2\27\27\32\32\4\2  ##\u018f\2(\3\2\2\2\4\\\3\2\2\2\6^\3\2\2\2\bg\3"+
		"\2\2\2\no\3\2\2\2\fq\3\2\2\2\16\u0084\3\2\2\2\20\u008e\3\2\2\2\22\u009d"+
		"\3\2\2\2\24\u00ae\3\2\2\2\26\u00b8\3\2\2\2\30\u00d0\3\2\2\2\32\u00d6\3"+
		"\2\2\2\34\u00e5\3\2\2\2\36\u010c\3\2\2\2 \u0120\3\2\2\2\"\u0138\3\2\2"+
		"\2$\u014e\3\2\2\2&\u015c\3\2\2\2()\7Q\2\2)*\7\37\2\2*.\7\31\2\2+,\5\4"+
		"\3\2,-\7\62\2\2-/\3\2\2\2.+\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2"+
		"\2\2\61\62\3\2\2\2\628\7\31\2\2\63\64\5\n\6\2\64\65\7\62\2\2\65\67\3\2"+
		"\2\2\66\63\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2"+
		"\2;<\7\31\2\2<B\7N\2\2=>\5\22\n\2>?\7\62\2\2?A\3\2\2\2@=\3\2\2\2AD\3\2"+
		"\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\31\2\2FG\5\20\t\2G\3"+
		"\3\2\2\2HI\7\20\2\2I]\5$\23\2JK\7\7\2\2KL\7P\2\2LM\7B\2\2MN\7P\2\2N]\7"+
		"+\2\2OP\7\7\2\2PQ\7P\2\2Q]\7+\2\2RS\7\17\2\2S]\5\36\20\2TY\7F\2\2UV\7"+
		"\31\2\2VX\5\6\4\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y"+
		"\3\2\2\2\\H\3\2\2\2\\J\3\2\2\2\\O\3\2\2\2\\R\3\2\2\2\\T\3\2\2\2]\5\3\2"+
		"\2\2^_\7\4\2\2_`\7Q\2\2`c\7!\2\2ab\7\16\2\2bd\5\b\5\2ca\3\2\2\2de\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2f\7\3\2\2\2gh\7P\2\2h\t\3\2\2\2ij\7\n\2\2jp\5"+
		"$\23\2kl\7)\2\2lm\5\36\20\2mn\7\"\2\2np\3\2\2\2oi\3\2\2\2ok\3\2\2\2p\13"+
		"\3\2\2\2qr\7Q\2\2r\r\3\2\2\2sv\7M\2\2tw\5\34\17\2uw\5\30\r\2vt\3\2\2\2"+
		"vu\3\2\2\2wx\3\2\2\2xy\7\16\2\2yz\7Q\2\2z{\7\16\2\2{|\5\22\n\2|}\7\65"+
		"\2\2}\u0085\3\2\2\2~\177\7>\2\2\177\u0080\7P\2\2\u0080\u0081\7\5\2\2\u0081"+
		"\u0082\5\22\n\2\u0082\u0083\7\65\2\2\u0083\u0085\3\2\2\2\u0084s\3\2\2"+
		"\2\u0084~\3\2\2\2\u0085\17\3\2\2\2\u0086\u0087\7\66\2\2\u0087\u0088\5"+
		"\36\20\2\u0088\u0089\7@\2\2\u0089\u008f\3\2\2\2\u008a\u008b\7\26\2\2\u008b"+
		"\u008c\5\36\20\2\u008c\u008d\7@\2\2\u008d\u008f\3\2\2\2\u008e\u0086\3"+
		"\2\2\2\u008e\u008a\3\2\2\2\u008f\21\3\2\2\2\u0090\u0091\b\n\1\2\u0091"+
		"\u009e\5$\23\2\u0092\u009e\5\24\13\2\u0093\u009e\5\16\b\2\u0094\u009e"+
		"\5&\24\2\u0095\u0096\7,\2\2\u0096\u0097\5\26\f\2\u0097\u0098\7\t\2\2\u0098"+
		"\u009e\3\2\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7A\2\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009e\7\60\2\2\u009d\u0090\3\2\2\2\u009d\u0092\3\2\2\2\u009d"+
		"\u0093\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0095\3\2\2\2\u009d\u0099\3\2"+
		"\2\2\u009d\u009c\3\2\2\2\u009e\u00a4\3\2\2\2\u009f\u00a0\f\6\2\2\u00a0"+
		"\u00a1\7;\2\2\u00a1\u00a3\5\22\n\7\u00a2\u009f\3\2\2\2\u00a3\u00a6\3\2"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\23\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00af\5\34\17\2\u00a9\u00af\7\3\2"+
		"\2\u00aa\u00ab\7\3\2\2\u00ab\u00af\7\64\2\2\u00ac\u00ad\7\3\2\2\u00ad"+
		"\u00af\7\22\2\2\u00ae\u00a7\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00af\25\3\2\2\2\u00b0\u00b9\7D\2\2\u00b1\u00b9"+
		"\7<\2\2\u00b2\u00b3\7\34\2\2\u00b3\u00b9\7Q\2\2\u00b4\u00b5\7\34\2\2\u00b5"+
		"\u00b9\7P\2\2\u00b6\u00b9\7\63\2\2\u00b7\u00b9\7?\2\2\u00b8\u00b0\3\2"+
		"\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\27\3\2\2\2\u00ba\u00d1\7\r\2"+
		"\2\u00bb\u00d1\7\6\2\2\u00bc\u00d1\7\33\2\2\u00bd\u00bf\7\21\2\2\u00be"+
		"\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\7&\2\2\u00c2\u00c4\7\27\2\2\u00c3\u00c2\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00d1\3\2\2\2\u00c5\u00d1\7.\2\2\u00c6\u00d1\7%\2"+
		"\2\u00c7\u00c8\5\26\f\2\u00c8\u00c9\7-\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c7"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\5\26\f\2\u00d0\u00ba\3"+
		"\2\2\2\u00d0\u00bb\3\2\2\2\u00d0\u00bc\3\2\2\2\u00d0\u00bd\3\2\2\2\u00d0"+
		"\u00c5\3\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\31\3\2\2"+
		"\2\u00d2\u00d3\7\4\2\2\u00d3\u00d7\7Q\2\2\u00d4\u00d5\7\4\2\2\u00d5\u00d7"+
		"\7P\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\33\3\2\2\2\u00d8"+
		"\u00e6\7\30\2\2\u00d9\u00e6\7\67\2\2\u00da\u00e6\7\b\2\2\u00db\u00e6\7"+
		"9\2\2\u00dc\u00dd\5\32\16\2\u00dd\u00de\7-\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e6\5\32\16\2\u00e5"+
		"\u00d8\3\2\2\2\u00e5\u00d9\3\2\2\2\u00e5\u00da\3\2\2\2\u00e5\u00db\3\2"+
		"\2\2\u00e5\u00e1\3\2\2\2\u00e6\35\3\2\2\2\u00e7\u00e8\b\20\1\2\u00e8\u00e9"+
		"\7\f\2\2\u00e9\u010d\5\36\20\5\u00ea\u00eb\5\"\22\2\u00eb\u00ec\7H\2\2"+
		"\u00ec\u00ed\5\"\22\2\u00ed\u010d\3\2\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0"+
		"\7K\2\2\u00f0\u00f1\5\"\22\2\u00f1\u010d\3\2\2\2\u00f2\u00f3\5\"\22\2"+
		"\u00f3\u00f4\7\61\2\2\u00f4\u00f5\5\"\22\2\u00f5\u010d\3\2\2\2\u00f6\u00f7"+
		"\5\"\22\2\u00f7\u00f8\7\36\2\2\u00f8\u00f9\5\"\22\2\u00f9\u010d\3\2\2"+
		"\2\u00fa\u00fb\5\"\22\2\u00fb\u00fc\7E\2\2\u00fc\u00fd\5\"\22\2\u00fd"+
		"\u010d\3\2\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\7\35\2\2\u0100\u0101\5"+
		"\"\22\2\u0101\u010d\3\2\2\2\u0102\u0103\5\"\22\2\u0103\u0104\7O\2\2\u0104"+
		"\u0105\5\"\22\2\u0105\u010d\3\2\2\2\u0106\u0107\5\"\22\2\u0107\u0108\7"+
		":\2\2\u0108\u0109\5\"\22\2\u0109\u010d\3\2\2\2\u010a\u010d\7(\2\2\u010b"+
		"\u010d\78\2\2\u010c\u00e7\3\2\2\2\u010c\u00ea\3\2\2\2\u010c\u00ee\3\2"+
		"\2\2\u010c\u00f2\3\2\2\2\u010c\u00f6\3\2\2\2\u010c\u00fa\3\2\2\2\u010c"+
		"\u00fe\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0106\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010b\3\2\2\2\u010d\u0116\3\2\2\2\u010e\u010f\f\7\2\2\u010f"+
		"\u0110\7;\2\2\u0110\u0115\5\36\20\b\u0111\u0112\f\6\2\2\u0112\u0113\7"+
		"$\2\2\u0113\u0115\5\36\20\7\u0114\u010e\3\2\2\2\u0114\u0111\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\37\3\2\2"+
		"\2\u0118\u0116\3\2\2\2\u0119\u011a\b\21\1\2\u011a\u011b\7Q\2\2\u011b\u011c"+
		"\7L\2\2\u011c\u0121\5 \21\4\u011d\u0121\7Q\2\2\u011e\u0121\5\32\16\2\u011f"+
		"\u0121\5\26\f\2\u0120\u0119\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3"+
		"\2\2\2\u0120\u011f\3\2\2\2\u0121\u0127\3\2\2\2\u0122\u0123\f\3\2\2\u0123"+
		"\u0124\7\16\2\2\u0124\u0126\7Q\2\2\u0125\u0122\3\2\2\2\u0126\u0129\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128!\3\2\2\2\u0129\u0127"+
		"\3\2\2\2\u012a\u012b\b\22\1\2\u012b\u0139\7P\2\2\u012c\u0139\5 \21\2\u012d"+
		"\u012e\7\23\2\2\u012e\u012f\5\"\22\2\u012f\u0130\7J\2\2\u0130\u0139\3"+
		"\2\2\2\u0131\u0132\7I\2\2\u0132\u0139\5\34\17\2\u0133\u0136\7=\2\2\u0134"+
		"\u0137\5\30\r\2\u0135\u0137\5\34\17\2\u0136\u0134\3\2\2\2\u0136\u0135"+
		"\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u012a\3\2\2\2\u0138\u012c\3\2\2\2\u0138"+
		"\u012d\3\2\2\2\u0138\u0131\3\2\2\2\u0138\u0133\3\2\2\2\u0139\u0142\3\2"+
		"\2\2\u013a\u013b\f\t\2\2\u013b\u013c\7G\2\2\u013c\u0141\5\"\22\n\u013d"+
		"\u013e\f\b\2\2\u013e\u013f\t\3\2\2\u013f\u0141\5\"\22\t\u0140\u013a\3"+
		"\2\2\2\u0140\u013d\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143#\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\7\25\2\2"+
		"\u0146\u0147\5 \21\2\u0147\u0148\7/\2\2\u0148\u0149\5\"\22\2\u0149\u014f"+
		"\3\2\2\2\u014a\u014b\5 \21\2\u014b\u014c\7\13\2\2\u014c\u014d\5\"\22\2"+
		"\u014d\u014f\3\2\2\2\u014e\u0145\3\2\2\2\u014e\u014a\3\2\2\2\u014f%\3"+
		"\2\2\2\u0150\u0151\7C\2\2\u0151\u0152\5\36\20\2\u0152\u0153\7*\2\2\u0153"+
		"\u0154\5\22\n\2\u0154\u015d\3\2\2\2\u0155\u0156\7C\2\2\u0156\u0157\5\36"+
		"\20\2\u0157\u0158\7*\2\2\u0158\u0159\5\22\n\2\u0159\u015a\7\'\2\2\u015a"+
		"\u015b\5\22\n\2\u015b\u015d\3\2\2\2\u015c\u0150\3\2\2\2\u015c\u0155\3"+
		"\2\2\2\u015d\'\3\2\2\2\"\608BY\\eov\u0084\u008e\u009d\u00a4\u00ae\u00b8"+
		"\u00bf\u00c3\u00cc\u00d0\u00d6\u00e1\u00e5\u010c\u0114\u0116\u0120\u0127"+
		"\u0136\u0138\u0140\u0142\u014e\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}