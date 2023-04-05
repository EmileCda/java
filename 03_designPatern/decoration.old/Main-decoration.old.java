import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import konsole.Konsole; 

import decoration.File; 
import decoration.ProtectedFile; 
import decoration.Io; 

// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        System.out.printf("*********************");
        return 0;
    }
// ----------------------------------------------------------------------------
    public static int testMain() {
        String pass = "azss" ;
        ProtectedFile myFile = new ProtectedFile(pass);

        System.out.printf("1-[%s]\n",myFile.read());
        myFile.write ("ligne 1 text1\n");

        System.out.printf("2-[%s]\n",myFile.read());
        myFile.write ("ligne 2 text2\n");
        System.out.printf("3-[%s]\n",myFile.read());
        myFile.write ("write ligne 3 text3\n");

        System.out.printf("4-[%s]\n",myFile.read());

        return 0;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {    
        Konsole.clearScreen();
        File myFile = new File();


        myFile.write ("il etait un petit navire\n");
        myFile.write ("matelot hissez haut\n");
        myFile.write ("la lirette\n");
        EncryptFile myEncrypt = new EncryptFile(myFile,2);
        System.out.printf("1-[%s]\n",myFile.read());
        System.out.printf("2-[%s]\n",myEncrypt.read());
        System.out.printf("3-[%s]\n",myEncrypt.readDecode());
        
  
    }
}
    // 12. Créer un déocrateur pour Fichier permettant d'encoder l'écriture et de décoder la lecture
    // 13. L'encodage sera l'incrémentation de la valeur entière du caractère (de 1 ou plus)

class EncryptFile implements Io{
    private int shift ;
    private Io file ; 


    public EncryptFile (Io file, int shift){
        this.setShift(shift) ;
        this.setFile(file);
        this.file.write(
            this.encode(this.file.read()));

    }

    public EncryptFile ( int shift){
        this (new File(),shift) ;
    }


    public  Io   getFile() {
        return this.file  ;
    }

    public  void  setFile(Io value){

        this.file = new Io(value) ;
    }

    public  int  getShift() {
        return this.shift  ;
    }

    public  void  setShift(int value){

        this.shift = value ;
    }


    public  void  add(String value){

        this.setContent(value );
    }

    public  void  write(String value){
        
        this.add(value);
    }

    public  void  flush(){

        this.file.flush();
    }

    public  String  read(){

        return this.file.read() ;
    }
    public  String  readDecode(){

        return this.getContent() ;
    }

    public  void  setContent(String value){

        this.file.write(encode(value)) ;
    }

    public  String  getContent(){

        return decode(this.file.read()) ;
    }

    public String encode(String value){

        String valueReturn = "";
        for (int index = 0 ; index < value.length(); index ++)
        {
            int asciiValue= (int) value.charAt(index)+ getShift();
            valueReturn += (char) asciiValue ; 
        }
        return valueReturn;
    }


    public String decode(String value){

        String valueReturn = "";
        for (int index = 0 ; index < value.length(); index ++)
        {
            int asciiValue= (int) value.charAt(index)- getShift();
            valueReturn += (char) asciiValue ; 
        }
        return valueReturn;
    }



}

/*
- Création d'un décorateur de chiffrement --
    ---------------------------------------------

    12. Créer un déocrateur pour Fichier permettant d'encoder l'écriture et de décoder la lecture
    13. L'encodage sera l'incrémentation de la valeur entière du caractère (de 1 ou plus)

    String.charAt( n° du caractère ) -> char
    String.length() -> int
    (int) char -> int (n° du caractère)
    (char) int -> char (le caractère au n°)

    14. Utiliser le décorateur sur notre précédent décorateur FichierProtege

*/

/*
- Création d'un décorateur d'autentification --
    ------------------------------------------------

    1. Créer une classe FichierProtege qui soit du même type que Fichier (classe abstraite ou interface) 
    pour que les méthodes lire, ecrire et vider soient obligatoires
    2. Dans FichierProteger, créer une méthode autentification demandant à l'utilisateur d'entrer un mot de passe et retournant true si il y parvient
    3. Dans FichierProteger, surcharger ces 3 méthodes de manière à systématiquement demander à l'utilisateur de s'authentifier (par un simple mot de passe en dur)

    4. Dans Main, à la place de Fichier, utiliser un FichierProtege

*/
/*

    -- Préparation de la classe Fichier --
    --------------------------------------

    1. Créer une classe Fichier
    2. Lui ajouter un attribut contenu (String)
    3. Lui ajouter un constructeur vide (contenu = "" )
    4. Ajouter les méthodes lire (renvoie contenu), ecrire( ajouter à la suite ) et vider (vide le contenu )

    -- Test de Fichier --
    ---------------------

    5. Créer un Fichier
    6. Ecrire des données
    7. Lire ces données

*/