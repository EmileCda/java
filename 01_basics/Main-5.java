import java.util.Scanner;
import java.lang.Math;



public class Main {

    public static void main(String[] args) {
        parametre(args);
        paramVariable(1,2,3,9,11);
    }

    // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    // ---------------------------------------------------------------------------------
    public static void template() {
    }
    // ---------------------------------------------------------------------------------
    public static void paramVariable(int ... tableauNbr) {

        int somme = 0 ; 
        for (int nombre : tableauNbr ){
            somme += nombre;

        }
        System.out.printf (" somme %d \n", somme);

    }
    // ---------------------------------------------------------------------------------
    public static void parametre(String[] args) {
        int index = 0 ; 
        for (String value : args){
            System.out.printf (" arg %d : arg %s\n", index , value);
            index++;
        }
    }
    
    // ---------------------------------------------------------------------------------
 


}
