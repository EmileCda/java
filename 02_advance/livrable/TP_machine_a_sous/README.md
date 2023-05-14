# bandit-manchot

ou Machine à sous

**Objectif** : Créer un jeu de machine à sous, générant à chaque tout un tirage de 3 symboles
aléatoires parmi un ensemble de symboles pré -établi.

1. Préparation de fonctions
   a. Créer une fonction « count » prenant en paramètre un char x et un tableau t. Elle
   retournera le nombre de x dans t
   b. Créer une fonction tirage prenant en paramètre un tableau des différents symboles qu’il
   est possible d’obtenir à chaque tirage (on considère qu’un caractère est un symbole, par
   exemple ‘@’ ou ‘%’).
2. Préparation du jeu
   a. Créer un Array de 15 différents symboles possibles (sous la forme de caractères, par
   exemple ‘@’ ou ‘%’)
   b. Créer une variable crédits que l’on initialisera à 10. Il s’agit de la monnaie utilisée pour
   jouer.
3. Tour de jeu
   a. On affiche au joueur ses crédit restant
   b. Si le joueur ne dispose plus de crédits, on lui affiche un écran de gameover et quitte la
   partie
   c. Sinon, on demande à l’utilisateur, soit d’appuyer sur entrer (sans rien écrire), ce qui
   lancera un tirage et lui retirera un crédit, soit d’entrer « exit » ou « quit » ou « stop »
   pour quitter la partie avec ses crédit (dans ce cas on lui affiche un écran de fin de partie
   avec les crédits qu’il empoche).
4. Tirage
   a. Effectuer un tirage avec la fonction tirage.
   b. En utilisant la fonction count, si un symbole intervient 3 fois, ajouter 5 crédits à
   l’utilisateur et si un symbole intervient 2 fois, ajouter 2 crédits

# Intallation

1. Cloner le repository
2. compiler le programme : `javac Main.java`
3. lancer le programme : `java Main`

# Ce programme a été créé avec les versions de java suivantes

```sh
javac --version

javac 19.0.2
```

```sh
java --version

java 19.0.2 2023-01-17
Java(TM) SE Runtime Environment (build 19.0.2+7-44)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.2+7-44, mixed mode, sharing)

```
