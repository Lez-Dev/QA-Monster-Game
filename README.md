Monster Game
Liam, Osman

## User Stories
1. As the game player I would like to specify the size of the grid that I play on so that I can make the game easier or harder.
2. As the game player I would like the game to start my playing piece at a random location on the grid to make the game more interesting.
3. As the game player I would like the game to place some treasure on a random square in the grid for me to find to win the game.
4. As the game player I would like the game to print out a message when I find the treasure so I know that I have won the game.
5. As the game player I would like to move my playing piece around the grid (up, down, left, right) to find the treasure so that I can win the game.
6. As the game player I would like the game to tell me how far away I am from the treasure after each move so that I can decide what my next move should be.
7. As the game player I would like the game to add some monsters at random locations to catch me so that I lose the game.
8. As the game player I would like the game to add different types of monsters to make the game interesting.
9. As the game player I would like each monster to greet me differently to make the game more fun.

TDD, GitHub, Clean code

### Class design
4 classes:
[PARENT] Character Class
position (x,y)
token (*,@,!,&)

-Monster *extend* character
greeting - when caught; sout -> monster greeting
caughtPlayer()

-Player *extend* character
move()

-Grid
size (x,y) [][]
printGrid()
boolean isValidPosition()

-Treasure *extend* character
ifFound()

.*....
....&.
......
.P....
......