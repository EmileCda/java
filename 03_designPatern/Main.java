import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;


// import  packMotor.Energie;
// import  packMotor.EnumTransmission;
import  adaptator.*;

// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {
        Box myBox = new Box (5,3);
        
        Rectangle rectangle = new Rectangle(1,2);

        myBox.insertRectangle (new Rectangle(1,1));
        myBox.insertRectangle (new Rectangle(2,2));
        myBox.insertRectangle (new Rectangle(3,3));
        myBox.insertRectangle (new Rectangle(4,4));
        myBox.insertRectangle (new Rectangle(5,1));
        myBox.insertRectangle (new Rectangle(2,4));

        Circle myCircle =  new Circle(3);
        myBox.insertRectangle (new Adaptator(myCircle));
        myBox.insertRectangle (new Adaptator(new Circle(1)));
        System.out.println(myBox);


    }
}

 


class Adaptator extends Rectangle{


    public Adaptator(Circle myCircle){
        super (myCircle.getRadius() *2,myCircle.getRadius() *2);
        // this.setLargeur(myCircle.getRadius *2);
        // this.setLongueur(myCircle.getRadius *2);
    }
}

/*

    1. Créer une classe Rectangle
        1.1 Ajouter les attributs longueur et largeur
    2. Créer une classe Boite
        2.1 Ajouter les dimentions de l'ouverture longueur et largeur
        2.2 Ajouter une méthode insererRectangle prennant en paramètre un Rectangle
        2.3 Si la forme donnée en paramètre est assez petite pour rentrer, on l'ajoute à une liste d'élements que contient la boite
        2.4 Créer une méthode afficher contenant
    
    3. Dans le main, créer une boite et 3 rectangles
        3.1 Insérer les 3 rectangles
        3.2 Afficher le contenant


- Partie Adaptateur --
    -----------------------

    4. Créer une classe Rond ayant pour attributs un rayon (double)
        4.1 Ajouter un constructeur et un getter
    
    5. Créer une classe Adaptateur, héritant de Rectangle, prenant en parmètre dans son constructeur un Rond
        5.1 Initialiser dans le constructeur les attributs de l'adaptateur avec ceux du Rond passé en paramètre
    6. Créer un rond et tenter de l'ajouter à la boite avec un adaptateur



*/