grammar DiceGame;

INT 			: '-'?[0-9]+;
//WS  			: [ \r\t\n]+ -> skip; // skip spaces, tabs, newlines
ID  			: [a-z0-9]+; // ids are lowercase, to easily differentiate from code
COMMENT			: '//' ~[\r\n]* '\n' -> skip;
 
game			: NAME=ID' wird so gespielt:\n' '\n' (GAMEINIT=gameinit '.\n')+ '\n' (PLAYERINIT=playerinit'.\n')+  '\n' PLAY='ist ein spieler am zug macht er folgendes:\n' (ACTION=action'.\n')*;

gameinit		: 'das spiel hat den wert 'ASSN=assignment
				| 'das spiel ist für 'FROM=INT' bis 'TO=INT' spieler geeignet'
				| 'das spiel hat folgende würfel:' ('\n'DICEINIT=diceinit)*;
			 
diceinit		: 'würfel ' NAME=ID ' hat diese seiten:' (' 'FACE=face)+;

face			: INT;

playerinit  	: 'spieler haben die werte 'ASSN=assignment
				| 'spieler sind aktiv, solange ' PLAYERACTIVECOND=condition ' gilt'; 
				
var				: ID;
				
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

playerobject	: CUR='der spieler'
				| CUR='aktueller spieler'
				| 'spieler ' NAME=ID
				| 'spieler #' POS=INT
				| RIGHT='rechter spieler'
				| LEFT='linker spieler'; 
		
playerobjects	: ALL='alle spieler' 
				| ALL='allen spielern'
				| ALL='aller spieler'
				| (PO=playerobject', ')* LAST=playerobject;
			
diceobject		: 'würfel ' NAME=ID
				| 'würfel #' POS=INT;
			
diceobjects		: 'alle würfel'
				| 'allen würfeln'
				| 'aller würfel'
				| diceobject ', ' diceobjects 
				| diceobject;

variable		: IDENT=ID
				| DO=diceobjects
				| PO=playerobjects
//				| VAR=ID ' von ' PLAYER=playerobject
//				| 'position von ' PLPOS=playerobject
				| INST=variable':'VAR=variable;
			
		
expr 			: A=expr OP=' * ' B=expr
    			| A=expr OP=(' + '|' - ' ) B=expr
    			| INTEGER=INT
    			| '(' E=expr ')'
    			| VAR=variable;
 
assignment		: V=variable OP=' ist ' E=expr
				| 'setze 'V=variable OP=' auf ' E=expr
				| V=variable OP=' ist ' P=playerobject
				| V=variable OPSUM=' ist die summe ' DICES=diceobjects;

law				: 'wenn ' COND=condition ', dann ' THEN=action
				| 'wenn ' COND=condition ', dann ' THEN=action ', sonst ' ELSE=action;

condition		: A=expr EQ=' gleich ' B=expr
				| A=expr LT=' kleiner als ' B=expr
				| A=expr GT=' größer als ' B=expr
				| A=expr LE=' kleinergleich ' B=expr
				| A=expr GE=' größergleich ' B=expr
				| C=condition AND=' und ' D=condition
				| C=condition OR=' oder ' D=condition
				| NOT=' nicht ' C=condition
				| TRUE='wahr'
				| FALSE='falsch'
				| PLAYER=playerobject ' inaktiv ist';
				
