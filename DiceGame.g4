grammar DiceGame;

INT 			: '-'?[0-9]+;
//WS  			: [ \r\t\n]+ -> skip; // skip spaces, tabs, newlines
ID  			: [a-z0-9]+; // ids are lowercase, to easily differentiate from code
COMMENT			: '//' ~[\r\n]* '\n' -> skip;
 
game			: NAME=ID' wird so gespielt:\n' '\n' (GAMEINIT=gameinit '.\n')+ '\n' (PLAYERINIT=playerinit'.\n')+ '\n' 'ist ein spieler am zug macht er folgendes:\n' (ACTION=action'.\n')*;

gameinit		: 'das spiel hat die werte' (' 'VAR=ID)+
				| 'das spiel ist für 'FROM=INT' bis 'TO=INT' spieler geeignet'
				| 'das spiel hat folgende würfel:' ('\n'DICEINIT=diceinit)*;
			 
diceinit		: 'würfel ' NAME=ID ' hat diese seiten:' (' 'FACE=face)+;

face			: INT;

playerinit		: 'spieler haben die werte' (' 'VAR=ID)+
				| 'spieler sind aktiv, solange ' CONDITION=condition ' gilt'; 
				
loop			: 'für ' PLAYEROBJETS=playerobjects ' ' VAR=ID ' ' ACTION=action ';'
				| 'für ' DICEOBJECTS=diceobjects ' ' VAR=ID ' ' ACTION=action ';'
				| 'macht ' VALUE=INT ' mal ' ACTION=action ';';
    	
action			: ASSIGNMENT=assignment
				| DICEACTION=dicesaction
				| ACTION1=action ' und ' ACTION2=action
				| LOOP=loop
				| LAW=law
				| NEXT='nächster spieler ist dran';
		
dicesaction		: 'würfelt mit ' diceobjects
				| 'sortiert ' diceobjects
				| 'sortiert ' diceobjects ' aufsteigend'
				| 'sortiert ' diceobjects ' absteigend'
				| 'legt würfel aus 'diceobjects' in 'diceobjects;

playerobject	: 'der spieler'
				| 'aktueller spieler'
				| 'spieler ' NAME=ID
				| 'spieler #' POS=INT
				| 'rechter spieler'
				| 'linker spieler'; 
		
playerobjects	: 'alle spieler' 
				| 'allen spielern'
				| 'aller spieler'
				| playerobject ', ' playerobject
				| playerobject;
			
diceobject		: 'würfel ' NAME=ID
				| 'würfel #' POS=INT;
			
diceobjects		: 'alle würfel'
				| 'allen würfeln'
				| 'aller würfel'
				| diceobject ', ' diceobjects 
				| diceobject;

variable		: VAR=ID 
				| diceobjects
				| playerobjects
//				| VAR=ID ' von ' PLAYER=playerobject
				| 'position von ' playerobject
				| variable':'variable;
			
		
expr 			: A=expr OP=' * ' B=expr
    			| A=expr OP=(' + '|' - ') B=expr
    			| INT
    			| '(' E=expr ')'
    			| variable;
 
assignment		: V=variable OP=' ist ' E=expr
				| V=variable OP=' ist ' P=playerobject
				| V=variable OP=' ist die summe ' DICES=diceobjects
				| 'setze 'V=variable OP=' auf ' E=expr;

law				: 'wenn ' condition ', dann ' action
				| 'wenn ' condition ', dann ' action ', sonst ' action;

condition		: expr ' gleich ' expr 
				| expr ' kleiner als ' expr
				| expr ' größer als ' expr
				| expr ' kleinergleich ' expr
				| expr ' größergleich ' expr
				| condition ' und ' condition
				| condition ' oder ' condition
				| ' nicht 'condition
				| 'wahr'
				| 'falsch'
				| playerobject ' inaktiv ist';
				
