
package packClass; 
//    3. Faire hériter Rectangle de Forme2D

public class Rectangle extends Forme2D{

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
