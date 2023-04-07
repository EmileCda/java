import java.util.Scanner;
import java.lang.Math;
import java.lang.Exception;
import java.lang.UnsupportedOperationException;
import java.util.InputMismatchException;


// ----------------------------------------------------------------------------
public class Main {
public static final String CLEAR_SCREEN = "\033\143";

// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        do{
            menu() ;
            try{
                int response = myScan.nextInt();  
                switch (response){
                    case 1 : System.out.println("ok pour  Faire du café"); break;
        // 3. Si le choix se porte sur (2), envoyer une exception avec la description ("Je ne peux pas faire ce travail à votre place !")
                    case 2 : throw new UnsupportedOperationException ("Je ne peux pas faire ce travail à votre place !"); 
                    case 3 : System.out.println("ok Faire un dissertation sur le Java"); break;
            // 2.1 Une valeur qui n'est pas présente dans les choix
                    default : throw new UnsupportedOperationException ("choix invalide!"); 
                }
            }
            catch ( InputMismatchException e) {
                System.out.println("pas un nombre"); 
            }
            catch (Exception e) {
                System.out.println(e); 
            }
        
            System.out.println("enter pour continuer ou ctrl + c  pour quitter ");
            String suite = myScan.nextLine(); 
             suite = myScan.nextLine(); 
        } while (true);
    }


    // 1. Proposer à l'utilisateur un menu avec plusieurs choix :
    public static void menu() {
            System.out.print(CLEAR_SCREEN);
            System.out.println("- (1) Faire du café");
            System.out.println("- (2) Ecrire son programme pour lui");
            System.out.println("- (3) Faire un dissertation sur le Java");
    }

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}

class MyException extends Exception{
    MyException (String infos){
        super(infos);
    }
}
/*

    1. Proposer à l'utilisateur un menu avec plusieurs choix :
        - (1) Faire du café
        - (2) Ecrire son programme pour lui
        - (3) Faire un dissertation sur le Java

    2. Gérer les différentes erreurs possibles

    
*/

   