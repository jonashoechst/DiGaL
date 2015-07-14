import random, time

class Player:
    def __str__(self): return str(self.__dict__)
    def __init__(self, name): self.name = name; self.punkte = 3
    def isActive(self): return (self.punkte >= 0)
        
class Dice:
    def __init__(self, name, faces): self.name = name; self.faces = faces; self.roll()
    def roll(self): self.value = random.choice(self.faces)
    def __str__(self): return self.name+': '+str(self.value)

class Game:    
    # Static methods
    def status(self): return 'Status: '+ self.name + ' '.join(map(str, self.players))
    def rightPlayer(self): return self.players[ (self.players.index(self.activePlayer) - 1) % self.playerCount]
    def leftPlayer(self):  return self.players[ (self.players.index(self.activePlayer) + 1) % self.playerCount]
    def playerNum (self, num): return self.players[num]
    # def rollDices(self): map(Dice.roll, self.dices)
    def sortDices(self, desc=False): self.dices = sorted(self.dices, key=lambda dice: dice.value, reverse=desc)
    def setup(self):
        self.playerCount = int(raw_input('Enter number of players: '))
        if self.playerCount < self.min: print(self.name+' is made for more than '+str(self.min)+' players. Bring some friends ;-)'); exit()
        if self.playerCount > self.max: print(str(self.playerCount)+' players? Thats too much for '+self.name+'... Maximum: '+str(self.max)); exit()
    
        for p in range(self.playerCount): name = raw_input('Enter name of player #'+str(p)+': '); self.players.append(Player(name))
        self.activePlayer = self.players[0]
        print('Game initialized: '+self.status())
     
    def __init__(self):
        # Static inits
        self.players = []
    
        # Dynamic inits
        self.name = "Max"
        self.dices = [Dice("w1", [1,2,3,4,5,6]), Dice("w2",[1,2,3,4,5,6]), ]
        self.min = 2
        self.max = 10
        self.letztes = 0
   
    # Dynamic methods
    def isRunning(self): return (len([p for p in self.players if p.isActive()]) > 1)

    def loop(self):
        while self.isRunning():            
            print(self.status())
        
            if not self.activePlayer.isActive(): self.activePlayer = self.leftPlayer(); continue
            self.rollDices()
            self.sortDices(desc=True)
            
            ergebnis = self.dices[0].value * 10 + self.dices[1].value
            print(self.activePlayer.name+" threw "+' '.join(map(str, self.dices))+" -> "+str(ergebnis))
        
            print("Summe davon: "+str(sum([dice.value for dice in self.dices])))
        
            if ergebnis == 21:
                for s in self.players: s.punkte = s.punkte - 1
                self.activePlayer.punkte = self.activePlayer.punkte + 1
                self.letztes = 0
                self.activePlayer = self.activePlayer; continue
                
            if ergebnis < letztes:
                self.activePlayer.punkte = self.activePlayer.punkte - 1
                self.letztes = 0
                self.activePlayer = self.leftPlayer(); continue
                
            if ergebnis >= letztes:
                self.letztes = ergebnis
                self.activePlayer = self.leftPlayer(); continue

        
        print("Game finished "+self.status())

if __name__ == "__main__":
    game = Game()
    game.setup()
    game.loop()
        
        