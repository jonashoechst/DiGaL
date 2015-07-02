grammar DiceGame;
r	: 'Hello';
INT : '-'?[0-9]+;
WS  : [ \r\t\n]+ -> skip; // skip spaces, tabs, newlines
ID  : [a-z0-9]+; // ids are lowercase, to easily differentiate from CODE

DICE: 'würfel ' name=ID ' hat diese seiten: ' faces=FACES;
FACES   : INT ' ' FACES
        | INT;

VALUE	: INT
		| ID;
		
DICESACTION	: 'würfelt mit ' DICEOBJECTS
			| 'sortiert ' DICEOBJECTS '.'
			| 'sortiert ' DICEOBJECTS ' aufsteigend.'
			| 'sortiert ' DICEOBJECTS ' absteigend.';

		
VARIABLES	: ID ', ' VARIABLES
			| ID;

PLAYEROBJECT	: 'der spieler'
				| 'spieler ' name=ID
				| 'spieler #' pos=INT;

		
PLAYEROBJECTS	: 'alle spieler'
				| 'allen spielern'
				| 'aller spieler'
				| PLAYEROBJECT ', ' PLAYEROBJECT
				| PLAYEROBJECT;
			
DICEOBJECT	: 'würfel ' name=ID
			| 'würfel #' pos=INT;
			
			
DICEOBJECTS	: 'alle würfel'
			| 'allen würfeln'
			| 'aller würfel'
			| DICEOBJECT ', ' DICEOBJECTS
			| DICEOBJECT;


RESULT	: ' ist die summe von ' DICEOBJECTS;
		
VARIABLE	: id=ID 
			| dice=DICEOBJECT
			| id=ID ' von ' player=PLAYEROBJECT;
		
EXPR	:	a=EXPR op=('*'|'/') b=EXPR
    	|   a=EXPR op=('+'|'-') b=EXPR        
    	|   v=INT
    	|   '(' e=EXPR ')'
    	|	v=VARIABLE;
    	
ASSIGNMENT	: v=VARIABLE op=' ist ' e=EXPR
			| v=VARIABLE op=' ist die summe ' dices=DICEOBJECTS;
    	
ACTION	:	ASSIGNMENT
		|	DICESACTION
		|	ACTION ' und ' ACTION;


RULE	: 'wenn ' CONDITION ', dann ' ACTION
		| 'wenn ' CONDITION ', dann ' ACTION ' sonst ' ACTION;

CONDITION	: EXPR ' gleich ' EXPR
			| EXPR ' kleiner ' EXPR
			| EXPR ' größer ' EXPR
			| EXPR ' kleinergleich ' EXPR
			| EXPR ' größergleich' EXPR
			| CONDITION ' und ' CONDITION
			| CONDITION ' oder ' CONDITION
			| ' nicht 'CONDITION
			| 'wahr'
			| 'falsch';
			
			

			
PLAYER	: 'spieler haben die Variablen ' VARIABLES '.'
		| 'spieler sind aktiv, solange ' CONDITION ' gilt.';

//MUL	: '*' ; // assigns token name to '*' used above in grammar
//DIV : '/' ;
//ADD : '+' ;
//SUB : '-' ;
//ASSIGN	:	'=' ;
