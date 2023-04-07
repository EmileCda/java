
package packClass; 
import konsole.konsole;

public class Cylindre extends Forme3D { 
    
    private double radius; 


    Cylindre (double myRadius, double hauteur, ColorEnum color){
        super(hauteur,color);
        this.setRadius(myRadius);
        
    } 
    Cylindre (double myRadius, double hauteur){
        this( myRadius,hauteur,ColorEnum.YELLOW );
        
    } 

    public  double  volume(){

        return  Math.PI* this.getRadius() *this.getRadius() * this.getHauteur();

    }
    public  String toString() {
        return String.format ("Cylindre %s de rayon : %.2f  Hauteur %.2f volume  %.2f",
        this.getColor(),

        this.getRadius(),this.getHauteur(),this.volume());

    }

    public void setRadius(double value){

        this.radius = value; 
    }
    public double getRadius(){

        return this.radius ;
    }

 
}

