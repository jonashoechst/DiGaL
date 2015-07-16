#!/usr/bin/env python
# -*- coding: utf-8 -*-
import random

class Player:
    def __str__(self): return self.name + ', ' + ', '.join(map(str, [value for key, value in self.__dict__.items() if key not in ['name']]))
    def __init__(self, name): self.name = name; self.PUNKTE = 0; self.GEWONNEN = 0; 

    

class Dice:
    def __init__(self, name, faces): self.name = name; self.faces = faces; self.roll()
    def roll(self): self.value = random.choice(self.faces)
    def __str__(self): return self.name+': '+str(self.value)
class Game:
    # Static methods
    def status(self): return 'Status[name, ' + ', '.join([key for key, value in self.players[0].__dict__.items() if key not in ['name']]).lower()+']: '+' - '.join(map(str, self.players))
    def rightPlayer(self): return self.players[ (self.players.index(self.activePlayer) - 1) % self.playerCount]
    def leftPlayer(self):  return self.players[ (self.players.index(self.activePlayer) + 1) % self.playerCount]
    def playerNum (self, num): return self.players[num]
    def rollDices(self): map(Dice.roll, self.dices)
    def sortDices(self, desc=False): self.dices = sorted(self.dices, key=lambda dice: dice.value, reverse=desc)
    def setup(self):
        self.playerCount = int(raw_input('Enter number of players: '))
        if self.playerCount < self.min: print(self.name+' is made for more than '+str(self.min)+' players. Bring some friends ;-)'); exit()
        if self.playerCount > self.max: print(str(self.playerCount)+' players? Thats too much for '+self.name+'... Maximum: '+str(self.max)); exit()
        
        for p in range(self.playerCount): name = raw_input('Enter name of player #'+str(p)+': '); self.players.append(Player(name))
        self.activePlayer = self.players[0]
        print('Game initialized '+self.status())
        
    def isRunning(self): return True
    def __init__(self):
        self.players = []
        # Dynamic inits
        self.name = 'EINS'
        
        self.min = 2
        self.max = 10
        self.dices = [Dice('A',[1, 2, 3, 4, 5, 6, ]), Dice('B',[1, 2, 3, 4, 5, 6, ]), Dice('C',[1, 2, 3, 4, 5, 6, ]), Dice('D',[1, 2, 3, 4, 5, 6, ]), ]
    def loop(self):
        while self.isRunning():
            
            print(self.status())
            print('\n'+self.activePlayer.name+' ist dran.'),
            
            raw_input('Enter drücken zum Würfeln...'); map(Dice.roll, self.dices); print('Du hast '+', '.join(map(str, [dice.value for dice in self.dices]))+' gewürfelt!')
            if self.dices[0].value == 1 or self.dices[1].value == 1 or self.dices[2].value == 1 or self.dices[3].value == 1:
                self.activePlayer = self.rightPlayer(); continue
            self.activePlayer.PUNKTE = self.activePlayer.PUNKTE + sum([dice.value for dice in self.dices])
            if self.activePlayer.PUNKTE >= 100:
                self.activePlayer.GEWONNEN = 1
                break
            self.activePlayer = self.rightPlayer(); continue

if __name__ == '__main__':
    game = Game()
    game.setup()
    game.loop()
    print('\nSpiel beendet: '+game.status())
    print([self.name for self in game.players if self.GEWONNEN == 1][0]+' hat gewonnen!')

