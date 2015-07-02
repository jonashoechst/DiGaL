// Generated from DiceGame.g4 by ANTLR 4.4
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
		T__44=1, T__43=2, T__42=3, T__41=4, T__40=5, T__39=6, T__38=7, T__37=8, 
		T__36=9, T__35=10, T__34=11, T__33=12, T__32=13, T__31=14, T__30=15, T__29=16, 
		T__28=17, T__27=18, T__26=19, T__25=20, T__24=21, T__23=22, T__22=23, 
		T__21=24, T__20=25, T__19=26, T__18=27, T__17=28, T__16=29, T__15=30, 
		T__14=31, T__13=32, T__12=33, T__11=34, T__10=35, T__9=36, T__8=37, T__7=38, 
		T__6=39, T__5=40, T__4=41, T__3=42, T__2=43, T__1=44, T__0=45, INT=46, 
		WS=47, ID=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "', '", "'würfel '", "'allen spielern'", "' größer '", 
		"'aller würfel'", "' größergleich'", "' ist '", "' nicht '", "'alle würfel'", 
		"'alle spieler'", "' gilt.'", "'falsch'", "'spieler #'", "' '", "' aufsteigend.'", 
		"' sonst '", "' und '", "'('", "'würfelt mit '", "'*'", "'sortiert '", 
		"'spieler haben die variablen '", "'.'", "'allen würfeln'", "' ist die summe von '", 
		"' absteigend.'", "'aller spieler'", "'spieler '", "' kleiner '", "'wenn '", 
		"'der spieler'", "' oder '", "'spieler sind aktiv, solange '", "'wahr'", 
		"' ist die summe '", "' gleich '", "' hat diese seiten: '", "', dann '", 
		"')'", "'+'", "' von '", "'-'", "' kleinergleich '", "'würfel #'", "INT", 
		"WS", "ID"
	};
	public static final int
		RULE_dice = 0, RULE_faces = 1, RULE_value = 2, RULE_dicesaction = 3, RULE_variables = 4, 
		RULE_playerobject = 5, RULE_playerobjects = 6, RULE_diceobject = 7, RULE_diceobjects = 8, 
		RULE_result = 9, RULE_variable = 10, RULE_expr = 11, RULE_assignment = 12, 
		RULE_action = 13, RULE_regel = 14, RULE_condition = 15, RULE_player = 16;
	public static final String[] ruleNames = {
		"dice", "faces", "value", "dicesaction", "variables", "playerobject", 
		"playerobjects", "diceobject", "diceobjects", "result", "variable", "expr", 
		"assignment", "action", "regel", "condition", "player"
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
	public static class DiceContext extends ParserRuleContext {
		public Token NAME;
		public FacesContext FACES;
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public FacesContext faces() {
			return getRuleContext(FacesContext.class,0);
		}
		public DiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterDice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitDice(this);
		}
	}

	public final DiceContext dice() throws RecognitionException {
		DiceContext _localctx = new DiceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(T__42);
			setState(35); ((DiceContext)_localctx).NAME = match(ID);
			setState(36); match(T__7);
			setState(37); ((DiceContext)_localctx).FACES = faces();
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

	public static class FacesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DiceGameParser.INT, 0); }
		public FacesContext faces() {
			return getRuleContext(FacesContext.class,0);
		}
		public FacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterFaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitFaces(this);
		}
	}

	public final FacesContext faces() throws RecognitionException {
		FacesContext _localctx = new FacesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_faces);
		try {
			setState(43);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); match(INT);
				setState(40); match(T__30);
				setState(41); faces();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); match(INT);
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
		enterRule(_localctx, 4, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
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
		enterRule(_localctx, 6, RULE_dicesaction);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); match(T__25);
				setState(48); diceobjects();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(T__23);
				setState(50); diceobjects();
				setState(51); match(T__21);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); match(T__23);
				setState(54); diceobjects();
				setState(55); match(T__29);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57); match(T__23);
				setState(58); diceobjects();
				setState(59); match(T__18);
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

	public static class VariablesContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode ID() { return getToken(DiceGameParser.ID, 0); }
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variables);
		try {
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); match(ID);
				setState(64); match(T__43);
				setState(65); variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); match(ID);
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
		enterRule(_localctx, 10, RULE_playerobject);
		try {
			setState(74);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); match(T__13);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); match(T__16);
				setState(71); ((PlayerobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(72); match(T__31);
				setState(73); ((PlayerobjectContext)_localctx).POS = match(INT);
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
		enterRule(_localctx, 12, RULE_playerobjects);
		try {
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); match(T__34);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); match(T__41);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); match(T__17);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79); playerobject();
				setState(80); match(T__43);
				setState(81); playerobject();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83); playerobject();
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
		enterRule(_localctx, 14, RULE_diceobject);
		try {
			setState(90);
			switch (_input.LA(1)) {
			case T__42:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(T__42);
				setState(87); ((DiceobjectContext)_localctx).NAME = match(ID);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(88); match(T__0);
				setState(89); ((DiceobjectContext)_localctx).POS = match(INT);
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
		enterRule(_localctx, 16, RULE_diceobjects);
		try {
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); match(T__35);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(T__20);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); match(T__39);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); diceobject();
				setState(96); match(T__43);
				setState(97); diceobjects();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99); diceobject();
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
		enterRule(_localctx, 18, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(T__19);
			setState(103); diceobjects();
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
		enterRule(_localctx, 20, RULE_variable);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); ((VariableContext)_localctx).VAR = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); ((VariableContext)_localctx).DICE = diceobject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107); ((VariableContext)_localctx).VAR = match(ID);
				setState(108); match(T__3);
				setState(109); ((VariableContext)_localctx).PLAYER = playerobject();
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(113); match(INT);
				}
				break;
			case T__26:
				{
				setState(114); match(T__26);
				setState(115); ((ExprContext)_localctx).E = expr(0);
				setState(116); match(T__5);
				}
				break;
			case T__42:
			case T__0:
			case ID:
				{
				setState(118); variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(127);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(122);
						((ExprContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__44 || _la==T__24) ) {
							((ExprContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(123); ((ExprContext)_localctx).B = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.A = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						((ExprContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__2) ) {
							((ExprContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(126); ((ExprContext)_localctx).B = expr(5);
						}
						break;
					}
					} 
				}
				setState(131);
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); ((AssignmentContext)_localctx).V = variable();
				setState(133); ((AssignmentContext)_localctx).OP = match(T__37);
				setState(134); ((AssignmentContext)_localctx).E = expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); ((AssignmentContext)_localctx).V = variable();
				setState(137); ((AssignmentContext)_localctx).OP = match(T__9);
				setState(138); ((AssignmentContext)_localctx).DICES = diceobjects();
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
	}

	public final ActionContext action() throws RecognitionException {
		return action(0);
	}

	private ActionContext action(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ActionContext _localctx = new ActionContext(_ctx, _parentState);
		ActionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_action, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			switch (_input.LA(1)) {
			case T__42:
			case T__0:
			case ID:
				{
				setState(143); assignment();
				}
				break;
			case T__25:
			case T__23:
				{
				setState(144); dicesaction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ActionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_action);
					setState(147);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(148); match(T__27);
					setState(149); action(2);
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class RegelContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RegelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterRegel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitRegel(this);
		}
	}

	public final RegelContext regel() throws RecognitionException {
		RegelContext _localctx = new RegelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_regel);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(T__14);
				setState(156); condition(0);
				setState(157); match(T__6);
				setState(158); action(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160); match(T__14);
				setState(161); condition(0);
				setState(162); match(T__6);
				setState(163); action(0);
				setState(164); match(T__28);
				setState(165); action(0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(170); match(T__36);
				setState(171); condition(3);
				}
				break;
			case 2:
				{
				setState(172); expr(0);
				setState(173); match(T__8);
				setState(174); expr(0);
				}
				break;
			case 3:
				{
				setState(176); expr(0);
				setState(177); match(T__15);
				setState(178); expr(0);
				}
				break;
			case 4:
				{
				setState(180); expr(0);
				setState(181); match(T__40);
				setState(182); expr(0);
				}
				break;
			case 5:
				{
				setState(184); expr(0);
				setState(185); match(T__1);
				setState(186); expr(0);
				}
				break;
			case 6:
				{
				setState(188); expr(0);
				setState(189); match(T__38);
				setState(190); expr(0);
				}
				break;
			case 7:
				{
				setState(192); match(T__10);
				}
				break;
			case 8:
				{
				setState(193); match(T__32);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(196);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(197); match(T__27);
						setState(198); condition(6);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(199);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(200); match(T__12);
						setState(201); condition(5);
						}
						break;
					}
					} 
				}
				setState(206);
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

	public static class PlayerContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DiceGameListener ) ((DiceGameListener)listener).exitPlayer(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_player);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); match(T__22);
				setState(208); variables();
				setState(209); match(T__21);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(211); match(T__11);
				setState(212); condition(0);
				setState(213); match(T__33);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return expr_sempred((ExprContext)_localctx, predIndex);
		case 13: return action_sempred((ActionContext)_localctx, predIndex);
		case 15: return condition_sempred((ConditionContext)_localctx, predIndex);
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
		case 2: return precpred(_ctx, 1);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00dc\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6\5\6"+
		"F\n\6\3\7\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"W\n\b\3\t\3\t\3\t\3\t\5\t]\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\ng\n"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fq\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\5\rz\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0082\n\r\f\r\16\r\u0085\13"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f\n\16\3\17\3\17\3"+
		"\17\5\17\u0094\n\17\3\17\3\17\3\17\7\17\u0099\n\17\f\17\16\17\u009c\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00aa"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c5"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00cd\n\21\f\21\16\21\u00d0\13"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00da\n\22\3\22\2\5\30"+
		"\34 \23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\5\4\2\60\60\62\62"+
		"\4\2\3\3\27\27\4\2++--\u00ee\2$\3\2\2\2\4-\3\2\2\2\6/\3\2\2\2\b?\3\2\2"+
		"\2\nE\3\2\2\2\fL\3\2\2\2\16V\3\2\2\2\20\\\3\2\2\2\22f\3\2\2\2\24h\3\2"+
		"\2\2\26p\3\2\2\2\30y\3\2\2\2\32\u008e\3\2\2\2\34\u0093\3\2\2\2\36\u00a9"+
		"\3\2\2\2 \u00c4\3\2\2\2\"\u00d9\3\2\2\2$%\7\5\2\2%&\7\62\2\2&\'\7(\2\2"+
		"\'(\5\4\3\2(\3\3\2\2\2)*\7\60\2\2*+\7\21\2\2+.\5\4\3\2,.\7\60\2\2-)\3"+
		"\2\2\2-,\3\2\2\2.\5\3\2\2\2/\60\t\2\2\2\60\7\3\2\2\2\61\62\7\26\2\2\62"+
		"@\5\22\n\2\63\64\7\30\2\2\64\65\5\22\n\2\65\66\7\32\2\2\66@\3\2\2\2\67"+
		"8\7\30\2\289\5\22\n\29:\7\22\2\2:@\3\2\2\2;<\7\30\2\2<=\5\22\n\2=>\7\35"+
		"\2\2>@\3\2\2\2?\61\3\2\2\2?\63\3\2\2\2?\67\3\2\2\2?;\3\2\2\2@\t\3\2\2"+
		"\2AB\7\62\2\2BC\7\4\2\2CF\5\n\6\2DF\7\62\2\2EA\3\2\2\2ED\3\2\2\2F\13\3"+
		"\2\2\2GM\7\"\2\2HI\7\37\2\2IM\7\62\2\2JK\7\20\2\2KM\7\60\2\2LG\3\2\2\2"+
		"LH\3\2\2\2LJ\3\2\2\2M\r\3\2\2\2NW\7\r\2\2OW\7\6\2\2PW\7\36\2\2QR\5\f\7"+
		"\2RS\7\4\2\2ST\5\f\7\2TW\3\2\2\2UW\5\f\7\2VN\3\2\2\2VO\3\2\2\2VP\3\2\2"+
		"\2VQ\3\2\2\2VU\3\2\2\2W\17\3\2\2\2XY\7\5\2\2Y]\7\62\2\2Z[\7/\2\2[]\7\60"+
		"\2\2\\X\3\2\2\2\\Z\3\2\2\2]\21\3\2\2\2^g\7\f\2\2_g\7\33\2\2`g\7\b\2\2"+
		"ab\5\20\t\2bc\7\4\2\2cd\5\22\n\2dg\3\2\2\2eg\5\20\t\2f^\3\2\2\2f_\3\2"+
		"\2\2f`\3\2\2\2fa\3\2\2\2fe\3\2\2\2g\23\3\2\2\2hi\7\34\2\2ij\5\22\n\2j"+
		"\25\3\2\2\2kq\7\62\2\2lq\5\20\t\2mn\7\62\2\2no\7,\2\2oq\5\f\7\2pk\3\2"+
		"\2\2pl\3\2\2\2pm\3\2\2\2q\27\3\2\2\2rs\b\r\1\2sz\7\60\2\2tu\7\25\2\2u"+
		"v\5\30\r\2vw\7*\2\2wz\3\2\2\2xz\5\26\f\2yr\3\2\2\2yt\3\2\2\2yx\3\2\2\2"+
		"z\u0083\3\2\2\2{|\f\7\2\2|}\t\3\2\2}\u0082\5\30\r\b~\177\f\6\2\2\177\u0080"+
		"\t\4\2\2\u0080\u0082\5\30\r\7\u0081{\3\2\2\2\u0081~\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\31\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\n\2\2\u0088\u0089\5"+
		"\30\r\2\u0089\u008f\3\2\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7&\2\2\u008c"+
		"\u008d\5\22\n\2\u008d\u008f\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008a\3"+
		"\2\2\2\u008f\33\3\2\2\2\u0090\u0091\b\17\1\2\u0091\u0094\5\32\16\2\u0092"+
		"\u0094\5\b\5\2\u0093\u0090\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u009a\3\2"+
		"\2\2\u0095\u0096\f\3\2\2\u0096\u0097\7\24\2\2\u0097\u0099\5\34\17\4\u0098"+
		"\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\35\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7!\2\2\u009e\u009f"+
		"\5 \21\2\u009f\u00a0\7)\2\2\u00a0\u00a1\5\34\17\2\u00a1\u00aa\3\2\2\2"+
		"\u00a2\u00a3\7!\2\2\u00a3\u00a4\5 \21\2\u00a4\u00a5\7)\2\2\u00a5\u00a6"+
		"\5\34\17\2\u00a6\u00a7\7\23\2\2\u00a7\u00a8\5\34\17\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u009d\3\2\2\2\u00a9\u00a2\3\2\2\2\u00aa\37\3\2\2\2\u00ab\u00ac"+
		"\b\21\1\2\u00ac\u00ad\7\13\2\2\u00ad\u00c5\5 \21\5\u00ae\u00af\5\30\r"+
		"\2\u00af\u00b0\7\'\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00c5\3\2\2\2\u00b2"+
		"\u00b3\5\30\r\2\u00b3\u00b4\7 \2\2\u00b4\u00b5\5\30\r\2\u00b5\u00c5\3"+
		"\2\2\2\u00b6\u00b7\5\30\r\2\u00b7\u00b8\7\7\2\2\u00b8\u00b9\5\30\r\2\u00b9"+
		"\u00c5\3\2\2\2\u00ba\u00bb\5\30\r\2\u00bb\u00bc\7.\2\2\u00bc\u00bd\5\30"+
		"\r\2\u00bd\u00c5\3\2\2\2\u00be\u00bf\5\30\r\2\u00bf\u00c0\7\t\2\2\u00c0"+
		"\u00c1\5\30\r\2\u00c1\u00c5\3\2\2\2\u00c2\u00c5\7%\2\2\u00c3\u00c5\7\17"+
		"\2\2\u00c4\u00ab\3\2\2\2\u00c4\u00ae\3\2\2\2\u00c4\u00b2\3\2\2\2\u00c4"+
		"\u00b6\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00be\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00ce\3\2\2\2\u00c6\u00c7\f\7\2\2\u00c7"+
		"\u00c8\7\24\2\2\u00c8\u00cd\5 \21\b\u00c9\u00ca\f\6\2\2\u00ca\u00cb\7"+
		"#\2\2\u00cb\u00cd\5 \21\7\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf!\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\31\2\2\u00d2\u00d3\5\n\6\2\u00d3\u00d4"+
		"\7\32\2\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6\u00d7\5 \21\2\u00d7"+
		"\u00d8\7\16\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d5\3"+
		"\2\2\2\u00da#\3\2\2\2\25-?ELV\\fpy\u0081\u0083\u008e\u0093\u009a\u00a9"+
		"\u00c4\u00cc\u00ce\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}