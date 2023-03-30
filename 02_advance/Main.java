import java.util.Scanner;
// import java.lang.Math;
import java.util.HashMap;

public class Main {

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String[] horseName = {"Houra","Girelle","Totor","Lunaire","Romual","Brutus"};
            // 1. Créer un hashmap contenant 6 chevaux sous forme de chaine de caractère ("Bob", "Hypotipus", "Lila")
        HashMap <String,Integer> runnerHashMap = new HashMap <String,Integer> ();
            // 2. Chaque cheval commence avec la valeur 0

        int maxNameSize = 0 ;
        int maxStep = 0 ;
        String horseWinner = horseName[0] ;
        for (String name : horseName){
            if (name.length() > maxNameSize)
                maxNameSize = name.length();
            runnerHashMap.put(name,0);
            Integer position = runnerHashMap.get(name) ;
        }


        // 3. Chaque cheval évoluera d'une valeur de 1 à 5 unités à chaque tour de boucle, 
        // que l'on répétera tant qu'aucun cheval ne sera arrivé (100)
        boolean fin = false ; 
        int lap = 0 ;
        do{
            lap++;
            for (String name : horseName){
                int advancement = runnerHashMap.get(name)+randInt(1,5);
                runnerHashMap.put(name,advancement);
                if (advancement>maxStep){
                    maxStep = advancement;
                    horseWinner = name;
                }  


            }
        
       // 4. A chaque tour de boucle, afficher sur chaque ligne le nom du cheval et 
        //    une barre de progression sous la forme de '--------'

            displayRace(horseName,runnerHashMap,maxNameSize);
            
             for (String name : horseName){
                if (runnerHashMap.get(name) >= 100 )
                    fin = true ;
            }
            System.out.printf("premier %s avance [%d]\n",horseWinner,maxStep);
            System.out.printf("tour [%d] taper entrée pour une nouveau tour",lap);
            myScan.nextLine();

        }while (!fin) ;
       // 5. A la fin, afficher le nom du vainqueur
       System.out.printf("\ngagnant %s\n",horseWinner);

        // displayWinner(horseName,runnerHashMap);

    }
// ---------------------------------------------------------------------------------
// fonction random qui renvoie une fonction entre minValue et maxValue
// attention dans le cas de l'utilisation pour indexer un tableau (maxIndex = length)    
    public static void  displayRace(String[] horseName,HashMap myHashMap, int maxNameSize){

        char[] symbole = {'-','=','*','%',':','~','+','_','#'};
        clearScreen ();
        int row = 10 ; 
        int rowIndex = 0 ; 
        int columHorseName = 10 ;
        int raceColumn = maxNameSize +  columHorseName+2 ;
        int finish = maxNameSize + columHorseName+2 + 100 +1 ;
        
        for (String name : horseName){
            gotoXY (row,columHorseName);
            System.out.print(name);
            // Integer position = myHashMap.get(name) ;
            int position = (int) myHashMap.get(name) ;
            gotoXY (row,raceColumn);
            for (int index = 0 ; index < position; index ++)
                System.out.print(symbole[rowIndex]);

            System.out.println('>');
            gotoXY (row,finish);
            System.out.println('|');
            row ++ ;
            rowIndex++ ;
        }

    }
    // ---------------------------------------------------------------------------------
// fonction random qui renvoie une fonction entre minValue et maxValue
// attention dans le cas de l'utilisation pour indexer un tableau (maxIndex = length)    
    public static void  displayWinner(String[] horseName,HashMap myHashMap){
        for (String name : horseName){
            if ((int) myHashMap.get(name) >=100){
                System.out.printf(" le gagnant : %s \n",name);
                break;
            }
        }

    }
// ---------------------------------------------------------------------------------
// fonction random qui renvoie une fonction entre minValue et maxValue
// attention dans le cas de l'utilisation pour indexer un tableau (maxIndex = length)    
    public static int randInt(int minValue, int maxValue) {
        return   (int)(Math.random() * (maxValue + 1-minValue) + minValue );  
    }
// ---------------------------------------------------------------------------------
 
    public static void  gotoXY (int row, int column){
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df",escCode,row,column));
    }
// ---------------------------------------------------------------------------------
    public static void  clearScreen (){
        
        System.out.print("\033\143");
    }


}






            // Principe : Course de chevaux
            //     Bob       : ------------                                         |
            //     Stephan   : ------------------------                             |
            //     StBernard : -------                                              |
            

