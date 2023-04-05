import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import konsole.Konsole; 

import decoration.Stdio; 
import decoration.File; 
import decoration.ProtectedFile; 
import decoration.EncryptFile; 


// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        System.out.printf("*********************");
        return 0;
    }
// ----------------------------------------------------------------------------
    public static int TestMainProtectedFile(String reponse) {
          File regularFile = new File () ;
        regularFile.add("il etait un petit navire");
        System.out.printf("l1 [%s]\n",regularFile);
        ProtectedFile pFile = new ProtectedFile ("aa",regularFile) ;
        System.out.printf("l1 [%s]\n",pFile);
        // pFile.add("dossier sérieux");
        // System.out.printf("l1 [%s]\n",pFile);
        regularFile.add("lalirette");
        pFile.add("Turlututu");
        System.out.printf("l1 [%s]\n",regularFile);
        System.out.printf("l1 [%s]\n",pFile);
        return 0;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {    
        Konsole.clearScreen();
        // int codeLock = 127 ;
        int codeLock = 1 ;
        File regularFile = new File () ;
        // regularFile.add("il etait un petit navire");
        regularFile.add("ABCDEFGHIJil etait un petit navire");
        System.out.printf("l1 [%s]\n",regularFile);
        EncryptFile eFile = new EncryptFile (codeLock,regularFile) ;

        System.out.printf("l2 [%s]\n",eFile);
        eFile.unLock(-codeLock);
        System.out.printf("l2 [%s]\n",eFile);
        eFile.unLock(codeLock);
        System.out.printf("l2 [%s]\n",eFile);
        // pFile.add("dossier sérieux");
        // System.out.printf("l1 [%s]\n",pFile);
        // regularFile.add("lalirette");
        // eFile.add("Turlututu");
        // System.out.printf("l1 [%s]\n",regularFile);
        // System.out.printf("l1 [%s]\n",eFile);




    }
}
