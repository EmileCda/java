package packClass; 


    // 5. Créer une classe Rectangle3D

public class Rectangle3D extends Forme3D { 
    
    private double largeur;
    private double longueur;

    public Rectangle3D (double longueur, double largeur, double hauteur,ColorEnum couleur){
        super(hauteur,couleur);
        this.setLongeur(longueur);
        this.setLargeur(largeur);
    } 
    public Rectangle3D (double longueur, double largeur, double hauteur){
        this(longueur,largeur,hauteur,ColorEnum.RED);
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
        return String.format ("Rectangle3D %s :  longueur: %.2f largueur %.2f  Hauteur %.2f volume  %.2f",
        this.getColor(),
        this.getLongeur(),this.getLargeur(),this.getHauteur(),this.volume());

    }


}