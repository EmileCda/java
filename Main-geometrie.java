/*
    1. Créer un ensemble de 6 Rectangles ou Carrés aux cotés aléatoires (entree 2 et 10)
    2. Créer une méthode dans Main permettant de calculer la somme des périmétres d'un ensemble de formes
    3. Créer une méthode dans Main permettant de calculer la somme des aires d'un ensemble de formes
    4. Utiliser les méthode (2) et (3) sur notre ensemble de Rectangles et Carré (et afficher les résultats)
*/

class Main {

    public static void main( String[] args ){



    }

}

class Rectangle {

    protected int largeur, longeur ;

    // Constructeur par défaut
    public Rectangle() {}

    public Rectangle( int longeur, int largeur ) {

        this.largeur = largeur ;
        this.longeur = longeur ;
    }

    public int get_longeur() {
        return this.longeur ;
    }

    public int get_largeur() {
        return this.largeur ;
    }

    public void set_longeur( int longeur ) {
        this.longeur = longeur ;
    }

    public void set_largeur( int largeur ) {
        this.largeur = largeur ;
    }

    public static int perimetre( Rectangle r ) {
        return ( r.get_largeur() + r.get_longeur() ) * 2 ;
    }

    public int perimetre() {
        return ( this.get_largeur() + this.get_longeur() ) * 2 ;
    }

    public int aire() {
        int valeur_aire = this.longeur * this.largeur ;
        return valeur_aire ;
    }

}

class Carre extends Rectangle {

    Carre( int cote ) {
        super( cote, cote );
    }

}