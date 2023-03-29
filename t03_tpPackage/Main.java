import java.util.Scanner;
import personage.equipement.Arme;
import personage.equipement.Armure;
import personage.Personage;
// ----------------------------------------------------------------------------
public class Main {
// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void main(String[] args) {
            Scanner myScan = new Scanner(System.in);
            System.out.println("hello de lu");

        // 6. Créer deux instances de Personnage
        Personage titi = new Personage ("titi",new Arme("brin d'herbe"),new Armure(),50);
        Personage toto = new Personage ("toto",new Arme(),new Armure(),10);
        Personage lulu = new Personage (1000);
        
         titi.afficher();
         toto.afficher();
    // 7. La première attaque la seconde
         titi.attaquer(toto) ;
         titi.afficher(toto);
        
        System.out.print(titi);
        System.out.println("riri: copie de titi");
        Personage riri = new Personage (titi); // copie de titi
        riri.setNom("riri");

        System.out.print(riri);
        Personage roro = titi.copy(); // copie de titi

        roro.setNom("roro");
        System.out.print(roro);

        System.out.printf("count %d\n", roro.getCount());

    }

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}


/*
    1. Reprendre l'exercice sur le personnage
    2. Découper le code en plusieurs fichiers (1 par classe)
    3. Créer un package "personnage" dans lequel se trouvera l'ensemble de nos classes sauf Main
    4. Dans le package "personnage", créer un sous-package "equipement", dans lequel on trouvera Arme et Armure
    5. Adapter le programme pour qu'il fonctionne avec cette arborscence
*/