# Rock Paper Scissors
A simple Java rock paper scissors game.

## Requirements

#### Features

* Main menu
  * 2p = pass and play
  * 1p = vs computer
  * Game history
* When game over, declare winner

#### Technical

* Use classes to remove repetitive parts of code
* Create an abstract Player class to
  * Manage the state of the player
    * win/lose, points, move they made
* User Input
  * Handle invalid input
  * Handle incorrect capitalization of otherwise valid user input
* Each class (including Player) should have
    * Methods associated with it
    * Be instantiated as an object
* Use public/private/static variables and methods within each class appropriately
* Exception handling user input game crash etc
* Get input using scanner or processing
* Use arrays or array lists to store game history


## Starter Algo

1. Print welcome message
2. Print menu
3. Get user input for game type
   1. Input handling
4. Start game (1p or 2p)
5. Prompt choices
6. Get p1 choice
   1. Hide choice if 2p
   2. Input handling
7. Get (or generate) p2 choice
   1. Hide choice if 2p
   2. Input handling
8. Print p1 choice vs p2 choice
9. Check win conditions
10. Print game result
11. Store game result in game history

