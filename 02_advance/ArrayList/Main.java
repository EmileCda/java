import java.util.Scanner;
    // 1. Importer ArrayList ou LinkedList
import java.util.ArrayList;
import java.lang.Math;
import java.lang.Exception;

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
        syllabeListExo();
  
    }

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public static void syllabeListExo() {
        Scanner myScan = new Scanner(System.in);
        ArrayList<String> syllabeList = new ArrayList<String>();

       // 1. Créer une liste de 6 syllabes ("do", "ta", "si", etc...)
        syllabeList.add("Ba");
        syllabeList.add("doit");
        syllabeList.add("je");
        syllabeList.add("truc");
        syllabeList.add("ré");
        syllabeList.add("faire");
        

        int maxSize =  syllabeList.size();
        int wordCount = 0 ;
        for (int index = 0 ; index <maxSize; index ++){

            for (int indice = 0 ; indice <maxSize; indice ++){
            // 2. Créer une liste de toutes les combinaisons possibles avec deux de ces syllabes
            // 3. Les afficher chacun sur une ligne
                if (syllabeList.get(index) !=syllabeList.get(indice) ){
                    wordCount++;
                    System.out.printf(" mot %d %s-%s \n",
                                    wordCount,
                                    syllabeList.get(index),
                                    syllabeList.get(indice));
                }
            }


        }

        /*
        */

    }

//  ----------------------------------------------------------------------------
    public static void arrayPetList() {
    // 2. Créer une nouvelle liste de String vide
        Scanner myScan = new Scanner(System.in);
        ArrayList<String> myPetList = new ArrayList<String>();

       // 3. Demander à l'utilisateur d'entrer ses 5 animaux préférés sous la forme de String

        System.out.println("utilisateur, entrez ses 5 animaux préférés sous la forme de String");

        do {

            System.out.printf("animal %d svp ?:", myPetList.size()+1 );
            String response = myScan.nextLine();  
            // 5. Interdir l'ajout d'un animal déjà existant ( ma_liste.contains( la_chaine ) )
            if (!myPetList.contains(response)){
            // 4. Ajouter chaque nom d'animal dans la liste
                myPetList.add(response);
                // System.out.printf("animal %d : %s\n", index ,response );
            }
            else{
                System.out.printf("animal %s existe déja\n", response );
            }


        }while (myPetList.size()<5);
    // 6. Afficher l'animal favoris de l'utilisateur
        System.out.printf("liste animal préféré :  %s\n", myPetList );

        System.out.printf("animal préféré :  %s\n", myPetList.get(0) );
        myScan.close();
    }
// ----------------------------------------------------------------------------
    public static void arrayPetListMyJob() {
             Scanner myScan = new Scanner(System.in);

            // 2. Créer une nouvelle liste de String vide
        ArrayList<String> myPetList = new ArrayList<String>();

       // 3. Demander à l'utilisateur d'entrer ses 5 animaux préférés sous la forme de String

        System.out.println("utilisateur, entrez ses 5 animaux préférés sous la forme de String");

        for (int index= 0 ; index <5 ; index ++)
        {

            System.out.printf("animal %d svp ?:", myPetList.size()+1 );
            String response = myScan.nextLine();  
            // 5. Interdir l'ajout d'un animal déjà existant ( ma_liste.contains( la_chaine ) )
            if (!myPetList.contains(response)){
            // 4. Ajouter chaque nom d'animal dans la liste
                myPetList.add(response);
                // System.out.printf("animal %d : %s\n", index ,response );
            }
            else{
                System.out.printf("animal %s existe déja\n", response );
                index--;
            }

        }
    // 6. Afficher l'animal favoris de l'utilisateur
        System.out.printf("liste animal préféré :  %s\n", myPetList );

        System.out.printf("animal préféré :  %s\n", myPetList.get(0) );
        myScan.close();
    }

}

