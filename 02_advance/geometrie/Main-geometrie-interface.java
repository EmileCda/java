import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Iterator;
import konsole.Konsole;
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
            Konsole.clearScreen();
            Konsole.setColor (Konsole.Color.YELLOW);
// 7. Dans le main, créer une liste de forme 3D dans laquelle on en ajoutera 5 de différent types
        ArrayList<Forme3D> forme3dList = new ArrayList<Forme3D>();

        for (int index = 0 ; index < 5 ; index ++){
            Rectangle3D  myForm = new 
            Rectangle3D(Konsole.randDouble(1,10),Konsole.randDouble(1,10),Konsole.randDouble(1,10));
            forme3dList.add( myForm);
        }

        for (int index = 0 ; index < 5 ; index ++){
            Cylindre  myForm = new 
            Cylindre(Konsole.randDouble(1,10),Konsole.randDouble(1,10));

            forme3dList.add( myForm);
        }


// 8. Calculer et afficher le total des volumes de ces formes
        double volume = 0;
        for ( Forme3D myForm : forme3dList)
        {
            System.out.println(myForm);
            volume+= myForm.volume();
        }

        System.out.printf("total volume : %.2f\n", volume);

    }

// ---------------------------------------------------------------------------------
// 2. Créer une méthode dans Main permettant de calculer la somme des périmétres d'un ensemble de formes
// 4. Modifier les méthodes sum_perimeters, sum_surfaces et le main pour que le polymorphisme à base de Rectangle se fasse maintenant à base de Forme2D
 // 1. Créer un ensemble de 6 Rectangles ou Carrés aux cotés aléatoires (entree 2 et 10)

public static void testMainAbstract(){
        ArrayList<Forme2D> forme2dList = new ArrayList<Forme2D>();

        for (int index = 0 ; index < 15 ; index ++){
            Forme2D myForm ;

            int randForm = Konsole.randInt(0,2) ;

            switch (randForm){
                case 0 : myForm = new Rectangle(Konsole.randInt(1,10),Konsole.randInt(1,10)); break;
                case 1 : myForm = new Carre(Konsole.randInt(1,10)); break;
    // 6. Dans le main, dans la liste de formes, ajouter quelques cercles                
                default : myForm = new Cercle(Konsole.randInt(1,10)); break;
            }
            forme2dList.add( myForm);
        }

    // 4. Utiliser les méthode (2) et (3) sur notre ensemble de Rectangles et Carré (et afficher les résultats)

        int resultPerimeter = computeTotalPerimeter(forme2dList);
        int resultArea = computeTotalAera(forme2dList);
        display(forme2dList);
        System.out.printf("Total Perimeter : %d Total Area %s \n",resultPerimeter,resultArea);


}

// ---------------------------------------------------------------------------------

    public static int  computeTotalAera(ArrayList<Forme2D> formList) {
        // using iterator 
        Iterator <Forme2D> myIterator =formList.iterator();
        int returnValue = 0 ; 
        while (myIterator.hasNext())
        {
           returnValue+= myIterator.next().aire();
        }
        return returnValue; 
    }
// ---------------------------------------------------------------------------------
        // 4. Modifier les méthodes sum_perimeters, sum_surfaces et le main pour que le polymorphisme à base de Rectangle se fasse maintenant à base de Forme2D

    // 2. Créer une méthode dans Main permettant de calculer la somme des périmétres d'un ensemble de formes
    public static int  computeTotalPerimeter(ArrayList<Forme2D> formList) {
        // not using iterator : regular method
        int returnValue = 0 ; 
        for ( Forme2D myForm : formList)
        {
            returnValue+= myForm.perimetre();
        }
        return returnValue; 
    }
    // ---------------------------------------------------------------------------------
    public static void display (ArrayList<Forme2D> formList) {
        for ( Forme2D myForm : formList)
        {
            System.out.printf("%s\n",myForm);
        }
    }

// ---------------------------------------------------------------------------------

   public static void testMain() {
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

//    3. Faire hériter Rectangle de Forme2D

class Rectangle extends Forme2D{

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
    public double perimetre(){
        return 
        (this.getLargeur() + this.getLongeur()) *2.0
        ;
    }

    //     1.4 Lui ajouter la méthode aire (retourne l'aire du rectangle : (longeur * largeur) )
    public double aire(){
        return (double)(this.getLargeur() * this.getLongeur() );
    }

    public  String toString() {
        return String.format ("Rectangle longueur: %2d largeur : %2d périmètre %2.2f aire %2.2f",
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
    public  String toString() {
        return String.format ("Carre        coté : %2d              périmètre %2.2f aire %2.2f",
        this.getLargeur(),this.perimetre(),this.aire());

    }

}


// 1. Créer une nouvelle classe abstraite Forme2D
abstract class Forme2D  { 

    Forme2D (){
    } 
// 2. Lui ajouter les méthodes abstraites périmetre et aire
    public abstract double  perimetre();
    public abstract double  aire();

}

//    1. Transformer la classe Forme en interface
interface Forme  { 
    public abstract String toString() ;
}

// 2. Créer une classe Forme3D implémentant l'interface Forme
abstract class Forme3D  implements Forme{
    // 3. Ajouter l'attribut hauteur à la Forme3D
    private double hauteur;

    Forme3D(double hauteur){
        this.setHauteur( hauteur);
    }

    // 4. Ajouter la méthodes abstraites volume
    public abstract double  volume();
    public void setHauteur(double value){
        this.hauteur = value; 
    }
    public double getHauteur(){

        return this.hauteur ;
    }


}

    // 5. Créer une classe Rectangle3D

class Rectangle3D extends Forme3D { 
    
    private double largeur;
    private double longueur;

    Rectangle3D (double longueur, double largeur, double hauteur){
        super(hauteur);
        this.setLongeur(longueur);
        this.setLargeur(largeur);
    } 

    public  double  volume(){

        return this.getLongeur() * this.getLongeur()* this.getLongeur();

    }

    public double getLongeur(){
        return this.longueur;
    }
    public void setLongeur(double myLong){
        this.longueur = myLong;
    }

    public double getLargeur(){
        return this.largeur;
    }
    public void setLargeur(double myLarg){
        this.largeur = myLarg;
    }

    public  String toString() {
        return String.format ("Rectangle3D  longueur: %.2f largueur %.2f  Hauteur %.2f volume  %.2f",
        this.getLongeur(),this.getLargeur(),this.getHauteur(),this.volume());

    }


}

class Cylindre extends Forme3D { 
    
    private double radius; 


    Cylindre (double myRadius, double hauteur){
        super(hauteur);
        this.setRadius(myRadius);
        
    } 

    public  double  volume(){

        return  Math.PI* this.getRadius() *this.getRadius() * this.getHauteur();

    }
    public  String toString() {
        return String.format ("Cylindre de rayon : %.2f  Hauteur %.2f volume  %.2f",
        this.getRadius(),this.getHauteur(),this.volume());

    }

    public void setRadius(double value){

        this.radius = value; 
    }
    public double getRadius(){

        return this.radius ;
    }

 
}




  



// 5. Créer une nouvelle classe Cercle, non abstraite, héritant de Forme2D et disposant de l'attribut rayon

class Cercle extends Forme2D { 
    private int radius; 
    
    Cercle (int myRadius){
        this.setRadius(myRadius);
    } 

    Cercle (Cercle circleCopy){
        this ( circleCopy.getRadius() );
    } 

    public void setRadius(int value){

        this.radius = value; 
    }
    public int getRadius(){

        return this.radius ;
    }

    public double perimetre(){

        return 2* Math.PI* getRadius() ;
    }
    public double aire(){

        return  Math.PI * getRadius()* getRadius() ;
    }


    public  String toString() {
        return String.format ("cercle de rayon   : %2d              périmètre %02.2f aire %02.2f",
        this.getRadius(),this.perimetre(),this.aire());

    }

}

// -------------------- consigne abstract -------------------
/*
    1. Créer une nouvelle classe abstraite Forme2D
    2. Lui ajouter les méthodes abstraites périmetre et aire
    3. Faire hériter Rectangle de Forme2D
    4. Modifier les méthodes sum_perimeters, sum_surfaces et le main pour que le polymorphisme à base de Rectangle se fasse maintenant à base de Forme2D
    5. Créer une nouvelle classe Cercle, non abstraite, héritant de Forme2D et disposant de l'attribut rayon
    6. Dans le main, dans la liste de formes, ajouter quelques cercles
*/



// -------------------- consigne  implement -------------------
/*
    1. Transformer la classe Forme en interface
    2. Créer une classe Forme3D implémentant l'interface Forme
    3. Ajouter l'attribut hauteur à la Forme3D
    4. Ajouter la méthodes abstraites volume
    5. Créer une classe Rectangle3D
    6. Créer une classe Cylindre

    7. Dans le main, créer une liste de forme 3D dans laquelle on en ajoutera 5 de différent types
    8. Calculer et afficher le total des volumes de ces formes
*/