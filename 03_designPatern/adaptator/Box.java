package adaptator ;
import adaptator.*;
import java.util.ArrayList;

public class Box {

        // 2.1 Ajouter les dimentions de l'ouverture longueur et largeur

    private  ArrayList<Rectangle> inBox = new ArrayList<Rectangle>();
    private int largeur;
    private int longueur;
    
    
    
    public Box(int longueur, int largeur){

        this.setLongueur(longueur);
        this.setLargeur(largeur);
        inBox = new ArrayList<Rectangle>();
    }
    
    public int getLongueur(){
        return this.longueur;
    }
    public void setLongueur(int myLong){
        this.longueur = myLong;
    }

    public int getLargeur(){
        return this.largeur;
    }
    public void setLargeur(int myLarg){
        this.largeur = myLarg;
    }

    public void add(Rectangle value){
        this.inBox.add(value) ;
    }



// 2.2 Ajouter une méthode insererRectangle prennant en paramètre un Rectangle
    public void insertRectangle(Rectangle opening){

//  2.3 Si la forme donnée en paramètre est assez petite pour rentrer, 
// on l'ajoute à une liste d'élements que contient la boite
        if (canFit(opening)){
            this.add(opening);
        }

    }

    public boolean  canFit(Rectangle opening){

        boolean result = false; 
        if ((opening.getLargeur()<= this.getLargeur()) &&
         (opening.getLongueur()<= this.getLongueur()))
            result = true ; 
        else if ((opening.getLargeur()<= this.getLongueur()) &&
         (opening.getLongueur()<= this.getLargeur()))
            result = true ; 

        
        return result;
    }

    public boolean  canFit(Circle opening){

        boolean result = false; 
        double larg = opening.getRadius() *2 ;
        if ((larg <= this.getLargeur()) &&
         (larg<= this.getLongueur()))
            result = true ; 

        return result;
    }

    public String toString(){

        String valueReturn = "";
        for ( Rectangle form : inBox){
            valueReturn += form + "\n";

        }
        return valueReturn ; 
    }


}