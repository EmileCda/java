package packCar; 
import packCar.Color;
    // 3. Créer une classe Carre

public class Voiture { 


    private String modele;
    private int kilometrage;
    private String immatriculation;
    private Color color ; 

    public Voiture (String modele, int kilometrage,String immatriculation,Color color)
    {
        this.setModele(modele) ;
        this.setKilometrage(kilometrage) ;
        this.setImmatriculation(immatriculation) ;
        this.setColor(color) ;
    } 

    public Voiture (Voiture clone){

        this(   clone.getModele(),
                clone.getKilometrage(),
                clone.getImmatriculation(),
                clone.getColor());

    }

    public  void setModele(String value) {
        this.modele = value;
    }
    public  String getModele() {
        return this.modele ;
    }
    public  void setKilometrage(int value) {
        this.kilometrage = value;

    }
    public  int  getKilometrage() {
        return this.kilometrage ;

    }
    public  void setImmatriculation( String value) {
        this.immatriculation = value ;

    }
    public  String getImmatriculation( ) {
        return this.immatriculation;

    }
    public  void setColor(Color value) {
        this.color = value;

    }
    public  Color getColor() {
        return this.color  ;

    }
    // 2. Lui ajouter les méthodes avancer dans laquelle on fait progresser le kilometrage 
    //  d'une certaine valeur. 

    public  void  avancer(int increment) {
        
        this.setKilometrage(this.getKilometrage() +increment) ;

    }

    public  void  avancer() {
        
        this.setKilometrage(this.getKilometrage()+1) ;

    }

    // 3. Créer une méthode clone() faisant appel à un constructeur par copie
    public  Voiture  clone() {
        
        return new Voiture (this);

    }
    // 3. Créer une méthode clone() faisant appel à un constructeur par copie

    public static Voiture  clone(Voiture copi) {
        return new Voiture (copi);
    }

// Illustrer par un affichage

    public  String toString() {
        return String.format ("voiture %s %s immat %s  a %d km",
        this.getModele(),this.getColor(),this.getImmatriculation(),this.getKilometrage());

    }

}



/*
    0. Créer une enumératio Color disposant de 6 valeurs de couleur
    1. Créer une classe Voiture disposant d'attributs : modele, kilometrage, immatriculation et couleur

    
    4. Créer 2 voitures différentes
    5. Créer un clone d'une des deux voiture
    6. Aprés avoir utiliser la méthode "avancer" sur le clone, afficher les 3 voiture et leurs id
*/