package adaptator ;


  // 1. Créer une classe Rectangle

public class Rectangle{

    //     1.1 Elle dispose des attributs largeur et longeur
    private int largeur;
    private int longueur;


    //     1.2 Respecter l'encapsulation et ajouter un constructeur prenant en paramètre la largeur et la longeur

    public Rectangle(int myLong, int myLarg){
        this.setLongueur(myLong) ;
        this.setLargeur(myLarg) ;
    }
    public Rectangle (Rectangle newRectangle){
        this (
            newRectangle.getLongueur(),
            newRectangle.getLargeur()
        );
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

    //     1.3 Lui ajouter la méthode périmétre (retourne le périmétre du rectangle : (longeur + largeur) * 2)
    public int perimetre(){
        return 
        (this.getLargeur() + this.getLongueur()) *2
        ;
    }

    //     1.4 Lui ajouter la méthode aire (retourne l'aire du rectangle : (longeur * largeur) )
    public int aire(){
        return (this.getLargeur() * this.getLongueur() );
    }

    public  String toString() {
        return String.format ("longueur: %s largeur : %d périmètre %s aire %d ",
        this.getLongueur(),this.getLargeur(),this.perimetre(),this.aire());

    }



}
