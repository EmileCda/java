import java.util.Scanner;

public class Main {
    private static Scanner inputKey = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello tout le monde");

        System.out.print("texte sans retour chariot en utilisant print");

    }

    class COutil {

        public void truc() {
            System.out.print("texte sans avec chariot en utilisant print et \\n \n");
            System.out.print("texte avec tabulation \t après tab \n");
            int valNull = 10;

            System.out.printf("valeur null : %s\n", valNull);
            System.out.print("Entrez la premiere  valeur : ");
            int fisrtValue = inputKey.nextInt();
            System.out.printf("valeur double : %d\n", fisrtValue * 2);

            displayInt(10);
            displayInt(102);

            displayFloat(1.23);
            displayChar('Z');
            displayBool(true);
            displayString("trala èrrer");
            int monInt = 12;
            char monChar = 12;
            System.out.printf("number %d char %c \n", monInt, monChar);

        };

        public void displayInt(int number) {

            System.out.printf("number %d  double %d \n", number, number * 2);

        }

        public void displayFloat(double number) {

            System.out.printf("float %f  float/2 : %f\n", number, number / 2);

        }

        public void displayChar(char myCar) {

            System.out.printf("char %c  my char [%c%c]\n", myCar, myCar, myCar);

        }

        public void displayBool(Boolean myBool) {

            System.out.printf("myBool  %b  !myBool %b\n", myBool, (!(myBool)));

        }

        public void displayString(String myString) {

            System.out.printf("string  %s \n ", myString);

        }

    }
}
