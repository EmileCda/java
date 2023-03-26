
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello tout le monde");

        // 1. Afficher le résultat du calcul de 3 + 5 * 6
        System.out.print("1. Afficher le résultat du calcul de 3 + 5 * 6 : ");
        System.out.println(3 + 5 * 6);

        // 2. Créer une variable A contenant la valeur entière de 45
        System.out.println("2. Créer une variable A contenant la valeur entière de 45");
        int a = 45;

        // 3. Incrémenter de 1 A
        System.out.println("3. Incrémenter de 1 A");
        // a = a + 1 ;
        // a += 1 ;
        a++;
        // ++a ;

        // 4. Créer une variable B dont la valeur sera A x 2 + 10
        System.out.println("4. Créer une variable B dont la valeur sera A x 2 + 10");
        int b = a * 2 + 10;

        // 5. Afficher B - A
        System.out.print("5. Afficher B - A");
        System.out.println(b - a);

        // 6. Créer une nouvelle variable C, dont la valeur sera B + 0.25
        System.out.println("6. Créer une nouvelle variable C, dont la valeur sera B + 0.25 : ");
        double c = b + 0.25;

        // 7. Afficher B
        System.out.print("7. Afficher C : ");
        System.out.println(c);

        // 8. Afficher la valeur décimale de B
        System.out.print("8. Afficher la valeur décimale de c : ");
        System.out.println(c - (int) c);

    }
}
