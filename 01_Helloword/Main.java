import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        exempleSwitch();

    }

    // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public static void exempleSwitch() {

        Scanner keyb = new Scanner(System.in);

        System.out.print("choix ? [1,2 ou 3] :");
        int choix = keyb.nextInt();
        switch (choix) {
            case 1:
                System.out.printf("votre choix %d \n", choix);

                break;
            case 2:
                System.out.printf("votre choix %d \n", choix);

                break;
            case 3:
                System.out.printf("votre choix %d \n", choix);

                break;

            default:
                System.out.printf("choix %d n'est pas possible\n", choix);
                break;
        }

        keyb.close();

    }

    public static void exempleIf() {
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
