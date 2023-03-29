import java.util.Scanner;
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

    try{

    // 2. Dans le main, créer un rectangle r1 de 9 de longeur et de 6 de largeur
    //     2.1 Afficher son périmétre et son aire
        Rectangle r1 = new Rectangle("r1",9,6);

        System.out.println(r1);

        Rectangle r2 = new Rectangle(r1);
        r2.setName("r2");
        r2.setLongeur(10);
        System.out.println(r2);

        // 3.2 Créer un carré c1, de coté 12, dont on affichera le périmétre et l'aire

        Carre c1 = new Carre("c1",12);
        System.out.println(c1);

        Carre c2 = new Carre(c1);
        System.out.println(c2);


        Rectangle r3 = new Rectangle("r3",0,6);
        System.out.println(r3);
        Rectangle r4 = new Rectangle("r4",10,-6);
        System.out.println(r4);

        Carre c3 = new Carre(-12);
        System.out.println(c3);

        Carre c4 = new Carre("c4",2);
        System.out.println(c4);


    }catch (Exception e) {
                System.out.println(e); 
        } 
    }

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}


   // 1. Créer une classe Rectangle

class Rectangle{

    //     1.1 Elle dispose des attributs largeur et longeur
    private int largeur;
    private int longeur;
    private String name;
    public static int count; 
    public static final String DEFAULT_NAME = "Default name";


    //     1.2 Respecter l'encapsulation et ajouter un constructeur prenant en paramètre la largeur et la longeur

    Rectangle(String name, int myLong, int myLarg) throws  MauvaiseValeurException {
        if ((myLong <=0) || (myLarg <=0))
            throw new MauvaiseValeurException ("Rectangle :valeur positive svp"); 
        else{
            this.setLongeur(myLong) ;
            this.setLargeur(myLarg) ;
            this.setName(name) ;
            this.count ++;

        }
    }
    Rectangle( int myLong, int myLarg) throws  MauvaiseValeurException {
       this (Rectangle.DEFAULT_NAME,myLong,myLarg);
    }

    Rectangle (Rectangle newRectangle)throws MauvaiseValeurException{
        this (
            newRectangle.getName(),
            newRectangle.getLongeur(),
            newRectangle.getLargeur()
        );
    }


    public int getLongeur(){
        return this.longeur;
    }
    // 5. Lors de la construction d'un Rectangle, vérifier que les valeurs de soient ni nulles ni négatives, auquel cas, envoyer une MauvaiseValeurException
    // 6. Idem que pour le 5 concernant les valeurs du setter
    public void setLongeur(int myLong)throws  MauvaiseValeurException{

        if (myLong <=0)
            throw new MauvaiseValeurException ("setLongeur: valeur positive svp"); 
        else
            this.longeur = myLong;
    }

    public int getLargeur(){
        return this.largeur;
    }
    public void setLargeur(int myLarg)throws  MauvaiseValeurException{
        if (myLarg <=0)
            throw new MauvaiseValeurException ("setLargeur :valeur positive svp"); 
        else
            this.largeur = myLarg;
    }


    public String getName(){
        return this.name;
    }

    public void setName(String value){
        this.name = value;
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
        return String.format ("[%d] name : %s longueur: %s largeur : %d périmètre %s aire %d ",
        this.count,this.getName() == this.DEFAULT_NAME ? "" : this.getName(),this.getLongeur(),this.getLargeur(),this.perimetre(),this.aire());

    }


}

    // 3. Créer une classe Carre

class Carre extends Rectangle { 
        // 3.1 Lui ajouter un constructeur ne prenant qu'un unique paramètre coté, faisant appel au constructeur du rectangle
    Carre (int cote) throws MauvaiseValeurException{
        super( cote, cote);
    } 

    Carre (String name, int cote) throws MauvaiseValeurException{
        super( name,cote, cote);
    } 

    Carre (Carre carreCopi) throws MauvaiseValeurException{
        this ( carreCopi.getLargeur()  );
    }

}

// 4. Créer une nouvelle Exception : MauvaiseValeurException
class MauvaiseValeurException extends Exception{
    MauvaiseValeurException (String infos){
        super(infos);
    }
}


