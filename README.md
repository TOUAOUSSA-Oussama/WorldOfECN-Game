# WorldOfECN-Game
This is a game from skratch programmed in java.

The game elements are objects and creatures:
----------UML-----------
* The creatures of the game are :
	- Characters (Personnage): contains Archers, Warriors(Guerrier), Mages (magician), Peasants(Paysan). The characters move around the game world in a random way. Apart from the Peasant, each of them has its own power and can fight either at a distance (e.g. an Archer with felches) or in a collision (e.g. a Warrior)
	- Monsters: contain Wolves(Loup) and Rabbits(Lapin), they also move around the world in a random way and the Wolf can fight the characters. 
* The objects can be :
	- Food (Nourriture): allow to present bonus or malus points that modify a randomly chosen character's characteristic in a temporary way (for a certain number of game turns)
	- ToxicCloud(NuageToxique): Characterised by its centre and radius, this cloud reduces the life points of creatures below it. This cloud can move around the world at random each turn.
	- Potions: contain Healing(Soin) which increases a character's life points and Mana which increases magic points.

Thus, a human player who has the option of being one of the characters, chooses his or her own name and chooses whether to fight or flee for each round of the game. For the second case, the user has the possibility to control his movement by using one of ther "wdsa" buttons on the keyboard.
When moving in the world, the creatures and the player cannot fill the same world space and can collect and consume potions and food and fight each other.

At the beginning of the game, the user has the choice to play a random game or load an existing game as a text file.
-----------choix d'une partie existante -------
In the case of a random game, the user has to choose a player type and a name. Then the characters, monsters, potions and toxic cloud are generated randomly.
At each turn, the user is given a choice to save the game or not. If he chooses to save it, he has the option to let the program choose a name for the game so as not to overwrite existing games or to enter a name of his choice.
--------- choix de sauvegarder partie --------------------
At the end of the game, a display of the characteristics of all game elements and the player is made. Thus, a graphical interface is displayed, this interface allows to visualize the distribution of the game elements and the player in the world.
------------Interface Graphique----------------
