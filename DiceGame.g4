grammar DiceGame;

INT 			: '-'?[0-9]+;
//WS  			: [ \r\t\n]+ -> skip; // skip spaces, tabs, newlines
ID  			: [A-ZÄÖÜ]+; // ids are uppercase, to easily differentiate from code
COMMENT			: '//' ~[\r\n]* '\n' -> skip;
 
game			: NAME=ID' wird so gespielt:\n' '\n' (GAMEINIT=gameinit '.\n')+ '\n' (PLAYERINIT=playerinit'.\n')*  '\n' PLAY='ist ein spieler am zug macht er folgendes:\n' (ACTION=action'.\n')* '\n' (GAMEEND=gameend) ;

gameinit		: 'das spiel hat den wert 'ASSN=assignment
				| 'das spiel ist für 'FROM=INT' bis 'TO=INT' spieler geeignet'
				| 'das spiel ist für 'FROM=INT' spieler geeignet'
				| 'das spiel läuft solange ' COND=condition
				| 'das spiel hat folgende würfel:' ('\n'DICEINIT=diceinit)*;
			  
diceinit		: 'würfel ' NAME=ID ' hat diese seiten:' (' 'FACE=face)+;

face			: INT;

playerinit  	: 'spieler haben die werte 'ASSN=assignment
				| 'spieler sind aktiv, solange ' PLAYERACTIVECOND=condition ' gilt'; 
				
var				: ID; 
				
loop			: FORLOOP='für ' (DOs=diceobjects|POs=playerobjects) ' ' VAR=ID ' ' ACTION=action ';'
//				| 'für ' DICEOBJECTS=diceobjects ' ' VAR=ID ' ' ACTION=action ';'
				| NLOOP='macht ' VALUE=INT ' mal ' ACTION=action ';'
				; 
    
gameend			: MULTI='gewonnen haben alle spieler, bei denen ' COND=condition '.'
				| SINGLE='gewonnen hat der spieler, bei dem ' COND=condition '.'
				| MOST='gewonnen hat der spieler mit den meisten ' VAR=var '.'
				| LEAST='gewonnen hat der spieler mit den wenigsten ' VAR=var '.'
				;

action			: AS=assignment 
				| DA=dicesaction
				| LOOP=loop
				| LAW=law
				| ACTION1=action ' und ' ACTION2=action
				| 'ist ' PLAYER=playerobject NEXT=' dran'
				| PLAYER=playerobject NEXT=' ist dran'
				| ENDLOOP='spiel ist zu ende'
				;
		
dicesaction		: THROW='würfelt mit ' DOs=diceobjects
				| SORT='sortiert alle würfel'
				| SORT='sortiert alle würfel'' aufsteigend'
				| SORT='sortiert alle würfel'REVERSE=' absteigend'
//				| 'legt würfel aus 'diceobjects' in 'diceobjects
				;

playerobject	: CUR='der spieler'
				| CUR='aktueller spieler'
				| 'spieler ' POS=INT
				| RIGHT='rechter spieler'
				| LEFT='linker spieler'; 
		
playerobjects	: ALL='alle spieler' 
				| ALL='allen spielern'
				| ALL='aller spieler'
				| ALL='alle'('r'|'n')? ' spieler'('n')?
				| ACTIVE='aktive spieler'
				| ACTIVE='aktiver spieler'
				| (PO=playerobject', ')* LAST=playerobject
				;
			
diceobject		: 'würfel ' NAME=ID
				| 'würfel ' POS=INT;
			
diceobjects		: ALL='allen würfeln'
				| ALL='alle würfel'
				| ALL='aller würfel'
//				| ALL='würfel'
				| (DO=diceobject', ')* LAST=diceobject
				;

condition		: A=expr EQ=' gleich ' B=expr
				| A=expr GT=' größer als ' B=expr
				| A=expr GT=' größer ' B=expr
				| A=expr GT=' mehr als ' B=expr
				| A=expr LT=' kleiner als ' B=expr
				| A=expr LT=' kleiner ' B=expr
				| A=expr LE=' kleinergleich ' B=expr
				| A=expr GE=' größergleich ' B=expr
				| C=condition AND=' und ' D=condition
				| C=condition OR=' oder ' D=condition
				| NOT=' nicht ' C=condition
				| TRUE='wahr' 
				| FALSE='falsch'
				;

variable		: VAR=ID
				| DO=diceobject
				| PO=playerobject
//				| VAR=ID ' von ' PLAYER=playerobject
//				| 'position von ' PLPOS=playerobject
//				| VAR=ID OF=' von ' (REF=ID|PO=playerobject)
//				| (REF=ID|PO=playerobject) OF=' ' VAR=ID
				| IVAR=ID ' von ' INST=variable
				| INST=variable ' ' IVAR=ID
				;
			
		
expr 			: A=expr OP=' * ' B=expr
    			| A=expr OP=(' + '|' - ' ) B=expr
    			| INTEGER=INT
    			| VAR=variable
    			| '(' E=expr ')'
    			| SUM='die summe von ' DOs=diceobjects
				| COUNT='anzahl '(POs=playerobjects|DOs=diceobjects)
				;
 
assignment		: 'setze ' V=variable ' auf ' E=expr
				| V=variable ' ist ' E=expr
//				| V=variable ' ist ' P=playerobject
				;

law				: 'wenn ' COND=condition ', dann ' THEN=action
				| 'wenn ' COND=condition ', dann ' THEN=action ', sonst ' ELSE=action;

				
