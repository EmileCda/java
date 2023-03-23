import java.util.Scanner;
import java.lang.Math;

public class Main {

// ---------------------------------------------------------------------------------
// test si la reponse est egal aux mots de fin 
    public static boolean testReponse(String reponse) {
        
        String[] tabMotFin = {"exit","quit","stop"};

        boolean valeurRetour = false;
        for (String motFin : tabMotFin){
            
                System.out.println(motFin);
            if (reponse.equals(motFin)){
               valeurRetour = true; 
               break ;
            }
        }
        return valeurRetour;
    }
// ---------------------------------------------------------------------------------
// cette fonction recherche, pour chaque symbole du tableau s'il est en double ou en triple
    public static int calculOccurence(char[] tabTirage) {
        int maxPoint = count(tabTirage[0], tabTirage );
        int pointCourant= count(tabTirage[0], tabTirage );
        for (int index = 0 ; index <tabTirage.length; index++)
        {
            pointCourant = count(tabTirage[index], tabTirage );
            if ( maxPoint< pointCourant){
                maxPoint=  pointCourant;
            }
        }
        return maxPoint;
    }
// ---------------------------------------------------------------------------------
// le calcul du gain se fait de la facon suivant
// 1 symbole = perdu => credit -1
// 2 symboles = gagné => credit +2
// 3 symboles = gagné => credit +5
// cette fonction retourne le gains (perte étant gains negatif)

    public static int calculGain(int occurence){
        int outputCredit = 0;
        switch(occurence){
            case 1 : outputCredit= -1 ; break;
            case 2 : outputCredit= 2 ; break;
            case 3 : outputCredit= 5; break;
            default : break;
        }
        return outputCredit ; 
    }
// ---------------------------------------------------------------------------------
// fonction de confort pour afficher le tirage dans le but de vérifier les gains
    public static void afficherTirage(char[] tableauResultat) {
        for (char myChar : tableauResultat){
            System.out.print(String.format(" %c",myChar));
        }
        System.out.println("");
    }
// ---------------------------------------------------------------------------------
// fonction random qui renvoie une fonction entre minValue et maxValue
// attention dans le cas de l'utilisation pour indexer un tableau (maxIndex = length)    
    public static int randInt(int minValue, int maxValue) {
        return   (int)(Math.random() * (maxValue + 1-minValue) + minValue );  
    }
// ---------------------------------------------------------------------------------
// 1. Préparation de fonctions
// a. Créer une fonction « count » prenant en paramètre un char x et un tableau t. Elle
// retournera le nombre de x dans t
    public static int count(char myChar, char[] tableau ) {
        int nombreOccurence = 0 ;
        for (int index = 0 ; index < tableau.length; index++){
            if (tableau[index] == myChar) {
                nombreOccurence++ ; 
            }
        }
        return nombreOccurence ; 
    }
// ---------------------------------------------------------------------------------
// b. Créer une fonction tirage prenant en paramètre un tableau des différents symboles qu’il
// est possible d’obtenir à chaque tirage (on considère qu’un caractère est un symbole, par
// exemple ‘@’ ou ‘%’).
    public static char[] tirage(char[] tableauSymbole ) {

        char[] resultat = new char[3];
        for (int index = 0 ; index < resultat.length; index++){
            //attention max index = length-1 sinon dédordement 
            resultat[index] = tableauSymbole[randInt(0,tableauSymbole.length-1) ]; 
        }
        return resultat ; 
    }
// ---------------------------------------------------------------------------------

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

 public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
// table de symbole utilisé pour la représentation des rouleaux        
        char[] tabSymbole =  {'3','q','Z','$','*','@','#','£','€','&','%','ù','§','1','2','A','B'};
        int credit = 10 ;       // crédit initialisé en dure; evolution = passer en args
        boolean fin = false;
        do{
            System.out.println("appuyer sur entrer (sans rien écrire) pour jouer");
            System.out.println("ou  « exit » ou « quit » ou « stop » pour quitter ");

            String reponse = myScan.nextLine();  
// choix possible : 1 = enter => chaine vide , 2 string de fin, 3 autres string (on ne joue pas)
            // taper entrer (reponse vide) choix 1
            if (reponse.length() ==0){                          
                char[] tableauTirage = tirage(tabSymbole) ;
                afficherTirage(tableauTirage);
                int nbOccurence = calculOccurence(tableauTirage);
                credit += calculGain(nbOccurence);
                System.out.print(String.format("il vous reste %d crédit\n",credit));
            }
            // choix 2 => fin de jeu ( la reponse fait partie des mots de fin )
            else if (testReponse(reponse)){                       
                fin = true;
            }
            // la reponse est different de entrer, et different des mots de fin  
            else {                             
                continue;
            }
        }while (!fin && credit >0 );            // pas-fin et encore du credit

        System.out.print(String.format( "N'hésiter pas à re%stenter votre chance\n",
                                        credit > 0 ? "-" : "venir "));    }
// ---------------------------------------------------------------------------------

}



// spécification 
/*
Machine à sous
Objectif : Créer un jeu de machine à sous, générant à chaque tout un tirage de 3 symboles
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

*/
