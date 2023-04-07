

// 5. Créer une nouvelle classe Cercle, non abstraite, héritant de Forme2D et disposant de l'attribut rayon

package packClass; 

public class Cercle extends Forme2D { 
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