## android-monty-hall
A simple simulation of the Monty Hall problem. The purpose of which was to develop the knowledge of using explicit
and implicit intents. Develped as part of coursework.

### Reference for Monty Hall problem:
https://en.wikipedia.org/wiki/Monty_Hall_problem

### Intro:
- The First screen displayes three buttons, each representing a door,
and another button which takes the user to the wikipedia page of the description (this is the only part where
the knoweldge of the implicit intents is used).

- The second screen asks the user if they they want to keep their choice or switch it.

- The third screen displays the result of their game. And a button to play again to go back to the

### Architecture and Design:
The design tries to conform the practice of granularity of each module overall.

- The main activity class represents the first screen (Homepage).
- The second, third and fourth depresent each a unique intent for each outcome of the openDoorX methods
(In terms of the Intro above that is the Second screen the user encounters).
- The fifth and sixth activities represent the outcome of each each choice.
As two outcomes of two doors are the same, the same method is called in both options.
There is also a button which takes the user back to the Homepage.
