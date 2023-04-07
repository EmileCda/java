import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import packCar.Voiture;
import packCar.Color;
import konsole.Konsole;





// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {
    // 4. Créer 2 voitures différentes
        Konsole.clearScreen();
        Voiture voiture1 = new Voiture ("clio", 100, "AA Clio 88", Color.RED);
        Voiture voiture2 = new Voiture ("Kango", 32100, "B1 KANG 28", Color.YELLOW);
        Voiture voitureClone = new Voiture(voiture2);
        Voiture voitureClone2 = voiture1.clone();
        Voiture voitureClone3 = Voiture.clone(voitureClone2);


        voitureClone.avancer();
        voitureClone2.avancer(10);
        voitureClone3.setColor(Color.GREEN);

        System.out.println(voiture1);
        System.out.println(voiture2);
        System.out.println(voitureClone);
        System.out.println(voitureClone2);
        System.out.println(voitureClone3);
    }

}



/*
    0. Créer une enumératio Color disposant de 6 valeurs de couleur
    1. Créer une classe Voiture disposant d'attributs : modele, kilometrage, immatriculation et couleur
    2. Lui ajouter les méthodes avancer dans laquelle on fait progresser le kilometrage d'une certaine valeur. Illustrer par un affichage

    3. Créer une méthode clone() faisant appel à un constructeur par copie
    
    5. Créer un clone d'une des deux voiture
    6. Aprés avoir utiliser la méthode "avancer" sur le clone, afficher les 3 voiture et leurs id
*/