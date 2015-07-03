// Generated from DiceGame.g4 by ANTLR 4.4
package DiGaL;
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
		T__61=1, T__60=2, T__59=3, T__58=4, T__57=5, T__56=6, T__55=7, T__54=8, 
		T__53=9, T__52=10, T__51=11, T__50=12, T__49=13, T__48=14, T__47=15, T__46=16, 
		T__45=17, T__44=18, T__43=19, T__42=20, T__41=21, T__40=22, T__39=23, 
		T__38=24, T__37=25, T__36=26, T__35=27, T__34=28, T__33=29, T__32=30, 
		T__31=31, T__30=32, T__29=33, T__28=34, T__27=35, T__26=36, T__25=37, 
		T__24=38, T__23=39, T__22=40, T__21=41, T__20=42, T__19=43, T__18=44, 
		T__17=45, T__16=46, T__15=47, T__14=48, T__13=49, T__12=50, T__11=51, 
		T__10=52, T__9=53, T__8=54, T__7=55, T__6=56, T__5=57, T__4=58, T__3=59, 
		T__2=60, T__1=61, T__0=62, INT=63, ID=64, COMMENT=65;
	public static final String[] tokenNames = {
		"<INVALID>", "'würfel '", "'allen spielern'", "'das spiel ist für '", 
		"'aller würfel'", "' ist '", "' nicht '", "'nächster spieler ist dran'", 
		"'alle spieler'", "' '", "', \nsonst '", "'('", "'würfelt mit '", "','", 
		"'setze '", "'sortiert '", "'allen würfeln'", "' absteigend.'", "'\n'", 
		"'aller spieler'", "'spieler '", "'position von '", "' wird so gespielt:\n'", 
		"' hat diese seiten:'", "' oder '", "'wahr'", "'spieler sind aktiv, solange '", 
		"'+'", "'spieler haben die werte'", "'/'", "', '", "', \ndann '", "' auf '", 
		"'.\n'", "'rechter spieler'", "'alle würfel'", "'falsch'", "'spieler #'", 
		"' aufsteigend.'", "' größergleich '", "' und '", "'*'", "'linker spieler'", 
		"' gilt.\n'", "'.'", "' ist die summe von '", "' bis '", "'wenn '", "'der spieler'", 
		"'das spiel hat die werte'", "' spieler geeignet.\n'", "' kleiner als '", 
		"'\nist ein spieler am zug macht er folgendes:'", "' ist die summe '", 
		"' gleich '", "' größer als '", "')'", "'das spiel hat folgende würfel:\n'", 
		"'für '", "' von '", "'-'", "' kleinergleich '", "'würfel #'", "INT", 
		"ID", "COMMENT"
	};
	public static final int
		RULE_game = 0, RULE_gameinit = 1, RULE_diceinit = 2, RULE_playerinit = 3, 
		RULE_loopaction = 4, RULE_loop = 5, RULE_value = 6, RULE_dicesaction = 7, 
		RULE_playerobject = 8, RULE_playerobjects = 9, RULE_diceobject = 10, RULE_diceobjects = 11, 
		RULE_result = 12, RULE_variable = 13, RULE_expr = 14, RULE_assignment = 15, 
		RULE_action = 16, RULE_law = 17, RULE_condition = 18;
	public static final String[] ruleNames = {
		"game", "gameinit", "diceinit", "playerinit", "loopaction", "loop", "value", 
		"dicesaction", "playerobject", "playerobjects", "diceobject", "diceobjects", 
		"result", "variable", "expr", "assignment", "action", "law", "condition"
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
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public List<PlayerinitContext> playerinit() {
			return getRuleContexts(PlayerinitContext.class);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public GameinitContext gameinit(int i) {
			return getRuleContext(GameinitContext.class,i);
		}
		public List<GameinitContext> gameinit() {
			return getRuleContexts(GameinitContext.class);
		}
		public PlayerinitContext playerinit(int i) {
			return getRuleContext(PlayerinitContext.class,i);
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
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(ID);
			setState(39); match(T__40);
			setState(40); match(T__44);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(41); gameinit();
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__13) | (1L << T__5))) != 0) );
			setState(46); match(T__44);
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(47); playerinit();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__36 || _la==T__34 );
			setState(52); match(T__10);
			setState(53); loop();
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
	}

	public final GameinitContext gameinit() throws RecognitionException {
		GameinitContext _localctx = new GameinitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_gameinit);
		int _la;
		try {
			setState(75);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); match(T__13);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56); match(T__53);
					setState(57); match(ID);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__53 );
				setState(62); match(T__29);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); match(T__59);
				setState(64); match(INT);
				setState(65); match(T__16);
				setState(66); match(INT);
				setState(67); match(T__12);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); match(T__5);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__61) {
					{
					{
					setState(69); diceinit();
					}
					}
					setState(74);
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
	}

	public final DiceinitContext diceinit() throws RecognitionException {
		DiceinitContext _localctx = new DiceinitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_diceinit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(T__61);
			setState(78); ((DiceinitContext)_localctx).NAME = match(ID);
			setState(79); match(T__39);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80); match(T__53);
				setState(81); match(INT);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__53 );
			setState(86); match(T__44);
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
	}

	public final PlayerinitContext playerinit() throws RecognitionException {
		PlayerinitContext _localctx = new PlayerinitContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_playerinit);
		int _la;
		try {
			setState(100);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); match(T__34);
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89); match(T__53);
					setState(90); match(ID);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__53 );
				setState(95); match(T__29);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); match(T__36);
				setState(97); condition(0);
				setState(98); match(T__19);
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

	public static class LoopactionContext extends ParserRuleContext {
		public LawContext law() {
			return getRuleContext(LawContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public LoopactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterLoopaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitLoopaction(this);
		}
	}

	public final LoopactionContext loopaction() throws RecognitionException {
		LoopactionContext _localctx = new LoopactionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopaction);
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); action(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); law();
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

	public static class LoopContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopactionContext loopaction() {
			return getRuleContext(LoopactionContext.class,0);
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
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_loop);
		try {
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(T__44);
				setState(108); loopaction();
				setState(109); loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); match(T__44);
				setState(112); loopaction();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public TerminalNode INT() { return getToken(DiceGameParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class DicesactionContext extends ParserRuleContext {
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
	}

	public final DicesactionContext dicesaction() throws RecognitionException {
		DicesactionContext _localctx = new DicesactionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dicesaction);
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); match(T__50);
				setState(118); diceobjects();
				setState(119); match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(T__47);
				setState(122); diceobjects();
				setState(123); match(T__18);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(T__47);
				setState(126); diceobjects();
				setState(127); match(T__24);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(129); match(T__47);
				setState(130); diceobjects();
				setState(131); match(T__45);
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
	}

	public final PlayerobjectContext playerobject() throws RecognitionException {
		PlayerobjectContext _localctx = new PlayerobjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_playerobject);
		try {
			setState(142);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(T__14);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(T__42);
				setState(137); ((PlayerobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(138); match(T__25);
				setState(139); ((PlayerobjectContext)_localctx).POS = match(INT);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); match(T__28);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(141); match(T__20);
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
	}

	public final PlayerobjectsContext playerobjects() throws RecognitionException {
		PlayerobjectsContext _localctx = new PlayerobjectsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_playerobjects);
		try {
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); match(T__54);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); match(T__60);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(T__43);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); playerobject();
				setState(148); match(T__32);
				setState(149); playerobject();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151); playerobject();
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
	}

	public final DiceobjectContext diceobject() throws RecognitionException {
		DiceobjectContext _localctx = new DiceobjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_diceobject);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); match(T__61);
				setState(155); ((DiceobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); match(T__0);
				setState(157); ((DiceobjectContext)_localctx).POS = match(INT);
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
	}

	public final DiceobjectsContext diceobjects() throws RecognitionException {
		DiceobjectsContext _localctx = new DiceobjectsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_diceobjects);
		try {
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); match(T__27);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(T__46);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162); match(T__58);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163); diceobject();
				setState(164); match(T__32);
				setState(165); diceobjects();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167); diceobject();
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

	public static class ResultContext extends ParserRuleContext {
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(T__17);
			setState(171); diceobjects();
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
		public DiceobjectContext DICE;
		public PlayerobjectContext PLAYER;
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public PlayerobjectContext playerobject() {
			return getRuleContext(PlayerobjectContext.class,0);
		}
		public DiceobjectContext diceobject() {
			return getRuleContext(DiceobjectContext.class,0);
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
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); ((VariableContext)_localctx).VAR = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); ((VariableContext)_localctx).DICE = diceobject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175); ((VariableContext)_localctx).VAR = match(ID);
				setState(176); match(T__3);
				setState(177); ((VariableContext)_localctx).PLAYER = playerobject();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178); match(T__41);
				setState(179); playerobject();
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
			setState(189);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(183); match(INT);
				}
				break;
			case T__51:
				{
				setState(184); match(T__51);
				setState(185); ((ExprContext)_localctx).E = expr(0);
				setState(186); match(T__6);
				}
				break;
			case T__61:
			case T__41:
			case T__0:
			case ID:
				{
				setState(188); variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(192);
						((ExprContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__21) ) {
							((ExprContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(193); ((ExprContext)_localctx).B = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						((ExprContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__2) ) {
							((ExprContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(196); ((ExprContext)_localctx).B = expr(5);
						}
						break;
					}
					} 
				}
				setState(201);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext V;
		public Token OP;
		public ExprContext E;
		public DiceobjectsContext DICES;
		public DiceobjectsContext diceobjects() {
			return getRuleContext(DiceobjectsContext.class,0);
		}
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); ((AssignmentContext)_localctx).V = variable();
				setState(203); ((AssignmentContext)_localctx).OP = match(T__57);
				setState(204); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); ((AssignmentContext)_localctx).V = variable();
				setState(207); ((AssignmentContext)_localctx).OP = match(T__9);
				setState(208); ((AssignmentContext)_localctx).DICES = diceobjects();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210); match(T__48);
				setState(211); ((AssignmentContext)_localctx).V = variable();
				setState(212); ((AssignmentContext)_localctx).OP = match(T__30);
				setState(213); ((AssignmentContext)_localctx).E = expr(0);
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
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DicesactionContext dicesaction() {
			return getRuleContext(DicesactionContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public PlayerobjectsContext playerobjects() {
			return getRuleContext(PlayerobjectsContext.class,0);
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
	}

	public final ActionContext action() throws RecognitionException {
		return action(0);
	}

	private ActionContext action(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ActionContext _localctx = new ActionContext(_ctx, _parentState);
		ActionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_action, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			switch (_input.LA(1)) {
			case T__61:
			case T__48:
			case T__41:
			case T__0:
			case ID:
				{
				setState(218); assignment();
				}
				break;
			case T__50:
			case T__47:
				{
				setState(219); dicesaction();
				}
				break;
			case T__4:
				{
				setState(220); match(T__4);
				setState(221); playerobjects();
				setState(222); match(T__53);
				setState(223); match(ID);
				setState(224); match(T__53);
				setState(225); action(0);
				setState(226); match(T__49);
				}
				break;
			case T__55:
				{
				setState(228); match(T__55);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_action);
					setState(231);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(232); match(T__22);
					setState(233); action(4);
					}
					} 
				}
				setState(238);
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
	}

	public final LawContext law() throws RecognitionException {
		LawContext _localctx = new LawContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_law);
		try {
			setState(251);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); match(T__15);
				setState(240); condition(0);
				setState(241); match(T__31);
				setState(242); action(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); match(T__15);
				setState(245); condition(0);
				setState(246); match(T__31);
				setState(247); action(0);
				setState(248); match(T__52);
				setState(249); action(0);
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
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(254); match(T__56);
				setState(255); condition(3);
				}
				break;
			case 2:
				{
				setState(256); expr(0);
				setState(257); match(T__8);
				setState(258); expr(0);
				}
				break;
			case 3:
				{
				setState(260); expr(0);
				setState(261); match(T__11);
				setState(262); expr(0);
				}
				break;
			case 4:
				{
				setState(264); expr(0);
				setState(265); match(T__7);
				setState(266); expr(0);
				}
				break;
			case 5:
				{
				setState(268); expr(0);
				setState(269); match(T__1);
				setState(270); expr(0);
				}
				break;
			case 6:
				{
				setState(272); expr(0);
				setState(273); match(T__23);
				setState(274); expr(0);
				}
				break;
			case 7:
				{
				setState(276); match(T__37);
				}
				break;
			case 8:
				{
				setState(277); match(T__26);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(286);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(280);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281); match(T__22);
						setState(282); condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(283);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(284); match(T__38);
						setState(285); condition(5);
						}
						break;
					}
					} 
				}
				setState(290);
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
		case 14: return expr_sempred((ExprContext)_localctx, predIndex);
		case 16: return action_sempred((ActionContext)_localctx, predIndex);
		case 18: return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 5);
		case 4: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean action_sempred(ActionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		case 1: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\6\2-\n\2\r\2\16\2.\3\2\3\2\6\2\63"+
		"\n\2\r\2\16\2\64\3\2\3\2\3\2\3\3\3\3\3\3\6\3=\n\3\r\3\16\3>\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\5\3N\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\6\4U\n\4\r\4\16\4V\3\4\3\4\3\5\3\5\3\5\6\5^\n\5\r\5\16\5_\3\5\3"+
		"\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7t\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0091\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3\f\3\f\5"+
		"\f\u00a1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ab\n\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b7\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00c0\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u00c8\n\20\f\20\16\20\u00cb\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00da\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e8\n\22\3\22\3\22\3\22\7\22"+
		"\u00ed\n\22\f\22\16\22\u00f0\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00fe\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0119\n\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\7\24\u0121\n\24\f\24\16\24\u0124\13\24\3\24\2\5\36\"&\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\5\3\2AB\4\2\37\37++\4\2\35\35>>\u0145"+
		"\2(\3\2\2\2\4M\3\2\2\2\6O\3\2\2\2\bf\3\2\2\2\nk\3\2\2\2\fs\3\2\2\2\16"+
		"u\3\2\2\2\20\u0087\3\2\2\2\22\u0090\3\2\2\2\24\u009a\3\2\2\2\26\u00a0"+
		"\3\2\2\2\30\u00aa\3\2\2\2\32\u00ac\3\2\2\2\34\u00b6\3\2\2\2\36\u00bf\3"+
		"\2\2\2 \u00d9\3\2\2\2\"\u00e7\3\2\2\2$\u00fd\3\2\2\2&\u0118\3\2\2\2()"+
		"\7B\2\2)*\7\30\2\2*,\7\24\2\2+-\5\4\3\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2"+
		"./\3\2\2\2/\60\3\2\2\2\60\62\7\24\2\2\61\63\5\b\5\2\62\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\66\3\2\2\2\66\67\7\66\2\2\678"+
		"\5\f\7\28\3\3\2\2\29<\7\63\2\2:;\7\13\2\2;=\7B\2\2<:\3\2\2\2=>\3\2\2\2"+
		"><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@N\7#\2\2AB\7\5\2\2BC\7A\2\2CD\7\60\2\2"+
		"DE\7A\2\2EN\7\64\2\2FJ\7;\2\2GI\5\6\4\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2"+
		"JK\3\2\2\2KN\3\2\2\2LJ\3\2\2\2M9\3\2\2\2MA\3\2\2\2MF\3\2\2\2N\5\3\2\2"+
		"\2OP\7\3\2\2PQ\7B\2\2QT\7\31\2\2RS\7\13\2\2SU\7A\2\2TR\3\2\2\2UV\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\24\2\2Y\7\3\2\2\2Z]\7\36\2\2[\\\7"+
		"\13\2\2\\^\7B\2\2][\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2\2ag"+
		"\7#\2\2bc\7\34\2\2cd\5&\24\2de\7-\2\2eg\3\2\2\2fZ\3\2\2\2fb\3\2\2\2g\t"+
		"\3\2\2\2hl\5\"\22\2il\5 \21\2jl\5$\23\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2"+
		"l\13\3\2\2\2mn\7\24\2\2no\5\n\6\2op\5\f\7\2pt\3\2\2\2qr\7\24\2\2rt\5\n"+
		"\6\2sm\3\2\2\2sq\3\2\2\2t\r\3\2\2\2uv\t\2\2\2v\17\3\2\2\2wx\7\16\2\2x"+
		"y\5\30\r\2yz\7.\2\2z\u0088\3\2\2\2{|\7\21\2\2|}\5\30\r\2}~\7.\2\2~\u0088"+
		"\3\2\2\2\177\u0080\7\21\2\2\u0080\u0081\5\30\r\2\u0081\u0082\7(\2\2\u0082"+
		"\u0088\3\2\2\2\u0083\u0084\7\21\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7"+
		"\23\2\2\u0086\u0088\3\2\2\2\u0087w\3\2\2\2\u0087{\3\2\2\2\u0087\177\3"+
		"\2\2\2\u0087\u0083\3\2\2\2\u0088\21\3\2\2\2\u0089\u0091\7\62\2\2\u008a"+
		"\u008b\7\26\2\2\u008b\u0091\7B\2\2\u008c\u008d\7\'\2\2\u008d\u0091\7A"+
		"\2\2\u008e\u0091\7$\2\2\u008f\u0091\7,\2\2\u0090\u0089\3\2\2\2\u0090\u008a"+
		"\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\23\3\2\2\2\u0092\u009b\7\n\2\2\u0093\u009b\7\4\2\2\u0094\u009b\7\25\2"+
		"\2\u0095\u0096\5\22\n\2\u0096\u0097\7 \2\2\u0097\u0098\5\22\n\2\u0098"+
		"\u009b\3\2\2\2\u0099\u009b\5\22\n\2\u009a\u0092\3\2\2\2\u009a\u0093\3"+
		"\2\2\2\u009a\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\25\3\2\2\2\u009c\u009d\7\3\2\2\u009d\u00a1\7B\2\2\u009e\u009f\7@\2\2"+
		"\u009f\u00a1\7A\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\27\3"+
		"\2\2\2\u00a2\u00ab\7%\2\2\u00a3\u00ab\7\22\2\2\u00a4\u00ab\7\6\2\2\u00a5"+
		"\u00a6\5\26\f\2\u00a6\u00a7\7 \2\2\u00a7\u00a8\5\30\r\2\u00a8\u00ab\3"+
		"\2\2\2\u00a9\u00ab\5\26\f\2\u00aa\u00a2\3\2\2\2\u00aa\u00a3\3\2\2\2\u00aa"+
		"\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\31\3\2\2"+
		"\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\5\30\r\2\u00ae\33\3\2\2\2\u00af\u00b7"+
		"\7B\2\2\u00b0\u00b7\5\26\f\2\u00b1\u00b2\7B\2\2\u00b2\u00b3\7=\2\2\u00b3"+
		"\u00b7\5\22\n\2\u00b4\u00b5\7\27\2\2\u00b5\u00b7\5\22\n\2\u00b6\u00af"+
		"\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\35\3\2\2\2\u00b8\u00b9\b\20\1\2\u00b9\u00c0\7A\2\2\u00ba\u00bb\7\r\2"+
		"\2\u00bb\u00bc\5\36\20\2\u00bc\u00bd\7:\2\2\u00bd\u00c0\3\2\2\2\u00be"+
		"\u00c0\5\34\17\2\u00bf\u00b8\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00be\3"+
		"\2\2\2\u00c0\u00c9\3\2\2\2\u00c1\u00c2\f\7\2\2\u00c2\u00c3\t\3\2\2\u00c3"+
		"\u00c8\5\36\20\b\u00c4\u00c5\f\6\2\2\u00c5\u00c6\t\4\2\2\u00c6\u00c8\5"+
		"\36\20\7\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\37\3\2\2\2\u00cb\u00c9\3\2\2"+
		"\2\u00cc\u00cd\5\34\17\2\u00cd\u00ce\7\7\2\2\u00ce\u00cf\5\36\20\2\u00cf"+
		"\u00da\3\2\2\2\u00d0\u00d1\5\34\17\2\u00d1\u00d2\7\67\2\2\u00d2\u00d3"+
		"\5\30\r\2\u00d3\u00da\3\2\2\2\u00d4\u00d5\7\20\2\2\u00d5\u00d6\5\34\17"+
		"\2\u00d6\u00d7\7\"\2\2\u00d7\u00d8\5\36\20\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00cc\3\2\2\2\u00d9\u00d0\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da!\3\2\2\2"+
		"\u00db\u00dc\b\22\1\2\u00dc\u00e8\5 \21\2\u00dd\u00e8\5\20\t\2\u00de\u00df"+
		"\7<\2\2\u00df\u00e0\5\24\13\2\u00e0\u00e1\7\13\2\2\u00e1\u00e2\7B\2\2"+
		"\u00e2\u00e3\7\13\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\7\17\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e8\7\t\2\2\u00e7\u00db\3\2\2\2\u00e7\u00dd\3\2"+
		"\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00ee\3\2\2\2\u00e9"+
		"\u00ea\f\5\2\2\u00ea\u00eb\7*\2\2\u00eb\u00ed\5\"\22\6\u00ec\u00e9\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"#\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\5&\24\2"+
		"\u00f3\u00f4\7!\2\2\u00f4\u00f5\5\"\22\2\u00f5\u00fe\3\2\2\2\u00f6\u00f7"+
		"\7\61\2\2\u00f7\u00f8\5&\24\2\u00f8\u00f9\7!\2\2\u00f9\u00fa\5\"\22\2"+
		"\u00fa\u00fb\7\f\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fe\3\2\2\2\u00fd\u00f1"+
		"\3\2\2\2\u00fd\u00f6\3\2\2\2\u00fe%\3\2\2\2\u00ff\u0100\b\24\1\2\u0100"+
		"\u0101\7\b\2\2\u0101\u0119\5&\24\5\u0102\u0103\5\36\20\2\u0103\u0104\7"+
		"8\2\2\u0104\u0105\5\36\20\2\u0105\u0119\3\2\2\2\u0106\u0107\5\36\20\2"+
		"\u0107\u0108\7\65\2\2\u0108\u0109\5\36\20\2\u0109\u0119\3\2\2\2\u010a"+
		"\u010b\5\36\20\2\u010b\u010c\79\2\2\u010c\u010d\5\36\20\2\u010d\u0119"+
		"\3\2\2\2\u010e\u010f\5\36\20\2\u010f\u0110\7?\2\2\u0110\u0111\5\36\20"+
		"\2\u0111\u0119\3\2\2\2\u0112\u0113\5\36\20\2\u0113\u0114\7)\2\2\u0114"+
		"\u0115\5\36\20\2\u0115\u0119\3\2\2\2\u0116\u0119\7\33\2\2\u0117\u0119"+
		"\7&\2\2\u0118\u00ff\3\2\2\2\u0118\u0102\3\2\2\2\u0118\u0106\3\2\2\2\u0118"+
		"\u010a\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0117\3\2\2\2\u0119\u0122\3\2\2\2\u011a\u011b\f\7\2\2\u011b"+
		"\u011c\7*\2\2\u011c\u0121\5&\24\b\u011d\u011e\f\6\2\2\u011e\u011f\7\32"+
		"\2\2\u011f\u0121\5&\24\7\u0120\u011a\3\2\2\2\u0120\u011d\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\'\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\34.\64>JMV_fks\u0087\u0090\u009a\u00a0\u00aa\u00b6"+
		"\u00bf\u00c7\u00c9\u00d9\u00e7\u00ee\u00fd\u0118\u0120\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}