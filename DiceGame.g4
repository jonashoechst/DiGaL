grammar DiceGame;

INT : '-'?[0-9]+;
WS  : [ \r\t\n]+ -> skip; // skip spaces, tabs, newlines
ID  : [a-z0-9]+; // ids are lowercase, to easily differentiate from code

dice: 'würfel ' NAME=ID ' hat diese seiten: ' FACES=faces;
faces   : INT ' ' faces
        | INT;

value	: INT
		| ID;
		
dicesaction	: 'würfelt mit ' diceobjects
			| 'sortiert ' diceobjects '.'
			| 'sortiert ' diceobjects ' aufsteigend.'
			| 'sortiert ' diceobjects ' absteigend.';

		
variables	: ID ', ' variables
			| ID;

playerobject	: 'der spieler'
				| 'spieler ' NAME=ID
				| 'spieler #' POS=INT;

		
playerobjects	: 'alle spieler'
				| 'allen spielern'
				| 'aller spieler'
				| playerobject ', ' playerobject
				| playerobject;
			
diceobject	: 'würfel ' NAME=ID
			| 'würfel #' POS=INT;
			
			
diceobjects	: 'alle würfel'
			| 'allen würfeln'
			| 'aller würfel'
			| diceobject ', ' diceobjects
			| diceobject;


result	: ' ist die summe von ' diceobjects;
		
variable	: VAR=ID 
			| DICE=diceobject
			| VAR=ID ' von ' PLAYER=playerobject;
		
expr 	:	A=expr OP=('*'|'/') B=expr
    	|   A=expr OP=('+'|'-') B=expr
    	|   INT
    	|   '(' E=expr ')'
    	|	variable;
    	
assignment	: V=variable OP=' ist ' E=expr
			| V=variable OP=' ist die summe ' DICES=diceobjects;
    	
action	:	assignment
		|	dicesaction
		|	action ' und ' action;


regel	: 'wenn ' condition ', dann ' action
		| 'wenn ' condition ', dann ' action ' sonst ' action;

condition	: expr ' gleich ' expr
			| expr ' kleiner ' expr
			| expr ' größer ' expr
			| expr ' kleinergleich ' expr
			| expr ' größergleich' expr
			| condition ' und ' condition
			| condition ' oder ' condition
			| ' nicht 'condition
			| 'wahr'
			| 'falsch';
			
			

			
player	: 'spieler haben die variablen ' variables '.'
		| 'spieler sind aktiv, solange ' condition ' gilt.';

//mul	: '*' ; // assigns token name to '*' used above in grammar
//div : '/' ;
//add : '+' ;
//sub : '-' ;
//assign	:	'=' ;
