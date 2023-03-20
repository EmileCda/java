
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#0.000");
        Scanner keyb = new Scanner(System.in);

        int anneeInitiale = 2011; // annee initiale
        double tauxCroissance = 1.2; // taux de croissance, en %
        double populationInitiale = 7.0; // population initiale, en milliard d'humains

        double populationCourante = populationInitiale; // population mondiale pour l'annee courante
        int anneeCourante = anneeInitiale; // annee de calcul

        System.out.println("====---- PARTIE 1 ----====");
        System.out.println("Population en " + anneeCourante + " : " + df.format(populationCourante));

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        // ===== PARTIE 1 =====
        // utilisez cette instruction pour poser votre question :
        System.out.print("Quelle année (> " + anneeInitiale + ") ? ");

        // ===== PARTIE 2 =====
        System.out.println("\n====---- PARTIE 2 ----====");

        // ===== PARTIE 3 =====
        System.out.println("\n====---- PARTIE 3 ----====");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
    }
}
