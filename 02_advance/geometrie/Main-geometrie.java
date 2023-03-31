import java.util.Scanner;
import java.lang.Math;


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


    // 2. Dans le main, créer un rectangle r1 de 9 de longeur et de 6 de largeur
    //     2.1 Afficher son périmétre et son aire
        Rectangle r1 = new Rectangle(9,6);

        System.out.println(r1);

        Rectangle r2 = new Rectangle(r1);
        System.out.println(r2);

        // 3.2 Créer un carré c1, de coté 12, dont on affichera le périmétre et l'aire

        Carre c1 = new Carre(12);
        System.out.println(c1);

        Carre c2 = new Carre(c1);
        System.out.println(c2);


    }

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}


   // 1. Créer une classe Rectangle

class Rectangle{

    //     1.1 Elle dispose des attributs largeur et longeur
    private int largeur;
    private int longeur;


    //     1.2 Respecter l'encapsulation et ajouter un constructeur prenant en paramètre la largeur et la longeur

    Rectangle(int myLong, int myLarg){
        this.setLongeur(myLong) ;
        this.setLargeur(myLarg) ;
    }
    Rectangle (Rectangle newRectangle){
        this (
            newRectangle.getLongeur(),
            newRectangle.getLargeur()
        );
    }


    public int getLongeur(){
        return this.longeur;
    }
    public void setLongeur(int myLong){
        this.longeur = myLong;
    }

    public int getLargeur(){
        return this.largeur;
    }
    public void setLargeur(int myLarg){
        this.largeur = myLarg;
    }

    //     1.3 Lui ajouter la méthode périmétre (retourne le périmétre du rectangle : (longeur + largeur) * 2)
    public int perimetre(){
        return 
        (this.getLargeur() + this.getLongeur()) *2
        ;
    }

    //     1.4 Lui ajouter la méthode aire (retourne l'aire du rectangle : (longeur * largeur) )
    public int aire(){
        return (this.getLargeur() * this.getLongeur() );
    }

    public  String toString() {
        return String.format ("longueur: %s largeur : %d périmètre %s aire %d ",
        this.getLongeur(),this.getLargeur(),this.perimetre(),this.aire());

    }


}

    // 3. Créer une classe Carre

class Carre extends Rectangle { 
        // 3.1 Lui ajouter un constructeur ne prenant qu'un unique paramètre coté, faisant appel au constructeur du rectangle
    Carre (int cote){
        super( cote, cote);
    } 

    Carre (Carre carreCopi){
        this ( carreCopi.getLargeur()  );
    }

}

