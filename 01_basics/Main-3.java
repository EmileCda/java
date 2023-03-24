import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {

        // 1. Créer une variable contenant le nom d'un étudiant
        String nomEtudiant = "poilAuDent";

        // 2. Créer une variable contenant la note de l'étudiant (il a eu 13.8542)
        double note = 13.8542;
        // 3. Créer une variable contenant la matière pour laquelle l'étudiant a eu
        // cette note
        String matiere = "Organique";

        // 4. Afficher en un seul print ces différentes informations sous la forme d'une
        // phrase avec une concaténation simple (+)
        System.out.println("l'étudiant " + nomEtudiant + " a eu une note de " + note + " en " + matiere);

        // 5. Idem que le 4 mais avec String.format
        System.out.println(String.format("l'étudiant %s a eu une note de %f en %s", nomEtudiant, note, matiere));

        // 6. Dans ce dernier print, n'afficher que 2 chiffres aprés la virgule
        System.out.println(String.format("l'étudiant %s a eu une note de %.2f en %s", nomEtudiant, note, matiere));

        // 7. Afficher la longeur totale de la chaine affichée dans le (6)
        String finalString = String.format("l'étudiant %s a eu une note de %.2f en %s", nomEtudiant, note, matiere);
        System.out.println(finalString.length());

    }

    // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void nomAge() {
        Scanner keyb = new Scanner(System.in);

        System.out.print("age ?: ");
        int age = keyb.nextInt();

        System.out.print("nom ?: ");
        keyb.nextLine();

        String nom = keyb.nextLine();

        if (isMajeur(age)) {
            System.out.printf("l'individue %s est majeur\n ", nom);
        } else {
            System.out.printf("l'individue %s n'est pas majeur\n ", nom);

        }
        keyb.close();

    }

    public static boolean isMajeur(int age) {
        if (age > 18) {
            return true;

        } else {
            return false;

        }

    }
}
