grammar DiceGame;

INT 			: '-'?[0-9]+;
WS  			: [ \r\t\n]+ -> skip; // skip spaces, tabs, newlines
ID  			: [a-z0-9]+; // ids are lowercase, to easily differentiate from code

game			: ID' wird so gespielt:\n''\n' gameinit* '\n' playerinit* '\nist ein spieler am zug macht er folgendes:' loop;

gameinit		: 'das spiel hat die werte' (' 'ID)+'.\n'
				| 'das spiel ist für 'INT' bis 'INT' spieler geeignet.\n'
				| 'das spiel hat folgende würfel:\n' diceinit*;
			
diceinit		: 'würfel ' NAME=ID ' hat diese seiten:' (' 'INT)+ '\n';

playerinit		: 'spieler haben die werte' (' 'ID)+ '.\n'
				| 'spieler sind aktiv, solange ' condition ' gilt.\n';

loopaction		: action
				| assignment
				| law;
				
loop			: '\n' loopaction loop
				| '\n' loopaction '\n';

value			: INT
				| ID;
		
dicesaction		: 'würfelt mit ' diceobjects '.'
				| 'sortiert ' diceobjects '.'
				| 'sortiert ' diceobjects ' aufsteigend.'
				| 'sortiert ' diceobjects ' absteigend.';

playerobject	: 'der spieler'
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


result			: ' ist die summe von ' diceobjects;
		
variable		: VAR=ID 
				| DICE=diceobject
				| VAR=ID ' von ' PLAYER=playerobject
				| 'position von ' playerobject;
			
		
expr 			:	A=expr OP=('*'|'/') B=expr
    			|   A=expr OP=('+'|'-') B=expr
    			|   INT
    			|   '(' E=expr ')'
    			|	variable;
    	
assignment		: V=variable OP=' ist ' E=expr
				| V=variable OP=' ist die summe ' DICES=diceobjects
				| 'setze 'V=variable OP=' auf ' E=expr;
    	
action			:	assignment
				|	dicesaction
				|	action ' und ' action
				|	'für ' playerobjects ' ' ID ' ' action ','
				|	'nächster spieler ist dran';

law				: 'wenn ' condition ', \ndann ' action
				| 'wenn ' condition ', \ndann ' action ', \nsonst ' action;

condition		: expr ' gleich ' expr 
				| expr ' kleiner als ' expr
				| expr ' größer als ' expr
				| expr ' kleinergleich ' expr
				| expr ' größergleich' expr
				| condition ' und ' condition
				| condition ' oder ' condition
				| ' nicht 'condition
				| 'wahr'
				| 'falsch';
			

