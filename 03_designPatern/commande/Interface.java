package commande ; 
import commande.Light;
import java.util.Scanner; 
import konsole.Konsole; 


public class Interface {

    final static String COMMANDE_0  = "Mars";
    final static String COMMANDE_1  = "Avril";
    final static String COMMANDE_2  = "Mai";
    final static String COMMANDE_3  = "Juin";
    final static String COMMANDE_4  = "Juillet";
    final static String COMMANDE_100= "1";  // cheat code
    final static String COMMANDE_101= "2"; // cheat code
    final static String COMMANDE_102= "3";// cheat code
    final static String COMMANDE_103= "4";// cheat code

    private Light light ;

    public Interface(){
        this.light = new Light();
    }

    public void run (){

        Scanner myScan = new Scanner (System.in);
        int count = 0 ; 
        Konsole.clearScreen();
        System.out.println("Le but est d'allumer (vert) toutes les lampes en utilisant les commandes ci-dessous");
        System.out.println(light);

        while (!this.light.allLit()){
            System.out.printf("commande svp  %s, %s, %s, %s ou %s :",
                            COMMANDE_0,COMMANDE_1,COMMANDE_2,COMMANDE_3,COMMANDE_4);
            String response = myScan.nextLine();

            switch (response){
                case COMMANDE_0 : Commande.commande0(light); break ;
                case COMMANDE_1 : Commande.commande1(light); break ;
                case COMMANDE_2 : Commande.commande2(light); break ;
                case COMMANDE_3 : Commande.commande3(light); break ;
                case COMMANDE_4 : Commande.commande4(light); break ;
                case COMMANDE_100 : Commande.commande100(light); break ;
                case COMMANDE_101 : Commande.commande101(light); break ;
                case COMMANDE_102 : Commande.commande102(light); break ;
                case COMMANDE_103 : Commande.commande103(light); break ;
                default : break ; 
            }
            count++;
            Konsole.clearScreen();
            System.out.println(light);
        }
        System.out.printf("toutes les lampes sont allumées en %d coups\n", count);


    }
}




// class Interface {


//  final static String COMMANDE_0  = "z";
//  final static String COMMANDE_1  = "a";
//  final static String  COMMANDE_2 = "b";
//  final static String  COMMANDE_3 = "c";
//  final static String  COMMANDE_4 = "d";
// final static String  COMMANDE_100 = "1";
// final static String  COMMANDE_101 = "2";
// final static String  COMMANDE_102 = "3";
// final static String  COMMANDE_103 = "4";

//     private Light light ;

//     public Interface(){
//         this.light = new Light();
//     }

//     public void run (){

//         Scanner myScan = new Scanner (System.in);
//         System.out.println(light);
//         int count = 0 ; 

//         while (!this.light.allLit()){
//             System.out.print("commande svp :");
//             String response = myScan.nextLine();

//             switch (response){
//                 case COMMANDE_0 : Commande.commande0(light); break ;
//                 case COMMANDE_1 : Commande.commande1(light); break ;
//                 case COMMANDE_2 : Commande.commande2(light); break ;
//                 case COMMANDE_3 : Commande.commande3(light); break ;
//                 case COMMANDE_100 : Commande.commande100(light); break ;
//                 case COMMANDE_101 : Commande.commande101(light); break ;
//                 case COMMANDE_102 : Commande.commande102(light); break ;
//                 case COMMANDE_103 : Commande.commande103(light); break ;
//                 default : break ; 
//             }
//             count++;
//             Konsole.clearScreen();
//             System.out.println(light);
//         }
//         System.out.printf("tous est allumé en %d coup\n", count);


//     }
// }
