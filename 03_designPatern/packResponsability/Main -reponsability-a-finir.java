import java.util.Scanner;
import java.lang.Math;
import java.util.HashMap; 
import java.util.ArrayList; 
import konsole.Konsole; 

import packResponsability.Personnel; 
import packResponsability.File; 
import packResponsability.FileReader; 
import packResponsability.Level; 




// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        System.out.printf("*********************");
        return 0;
    }
// ----------------------------------------------------------------------------
    public static int TestMainProtectedFile(String reponse) {
     
        return 0;
    }
    
// ----------------------------------------------------------------------------
    public static void main(String[] args) {    
        Konsole.clearScreen();
        ArrayList<Personnel> listPersonnel = new ArrayList<Personnel>() ; 
        ArrayList<File> listFile = new ArrayList<File>() ; 



        for (int index = 0 ; index < 5 ; index ++){

            listPersonnel.add(new Personnel(String.format("Lulu-%d",index), Level.values()[Konsole.randInt(0,5)]));
            listFile.add(new File(String.format("Text file %d",index),
                                Level.values()[Konsole.randInt(0,5)],
                                Konsole.randInt(80,83)));

        }


        for (Personnel  personne : listPersonnel){

            for (File  file : listFile){
                for (int index = 80 ; index <=83; index ++){
                    System.out.printf (" %s  P[%s]  F[%s] kc[%d] [%s]\n",personne.getName(),personne.getSecurityLevel(),
                    file.getSecurityLevel(),file.getKeyCode(), FileReader.read(file,personne));
                }
            }
    
        }
    
    }
}




    /*
    -- Préparation --
    -----------------

    1. Créer une classe Cipher
    2. Lui ajouter les méthodes statiques encode et decode prenant en paramètre un chaine à encoder et un entier (la clef)

    3. Créer une classe Personnel comprenant les attributs nom et niveau_accès (1-5, 5 étant le niveau max)
    4. Créer une classe File comprenant les attributs contenu et niveau_acces

    5. Créer une classe Authenticate
    6. lui ajouter la méthode statique have_access prenant en paramètre un File et un Personnel et retournant true si le Personnel dispose biend e suffisamment de droits

    -- Début de chaine --
    ---------------------
    
    7. Créer une classe FileReader
    8. Lui ajouter les méthodes statiques read et write prenant en paramètre un Personnel et un Fichier
    9. Cette méthode exécute l'écriture et la lecture aprés authentification via une classe Authenticate
    10. Aprés authentification, on encode (ecriture) ou décode (lecture) la donnée


*/