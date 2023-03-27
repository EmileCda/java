import java.util.Scanner;
import java.lang.Math;


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

        // 6. Créer deux instances de Personnage
        Personage titi = new Personage ("titi",100,1,50);
        Personage toto = new Personage ("toto",10,10,10);
        Personage lulu = new Personage (1000);
        
        titi.afficher();
        toto.afficher();
    // 7. La première attaque la seconde
        titi.attaquer(toto) ;
        titi.afficher(toto);
        
        System.out.print(titi);
        System.out.println("riri: copie de titi");
        Personage riri = new Personage (titi); // copie de titi
        riri.setNom("riri");

        System.out.print(riri);
        Personage roro = titi.copy(); // copie de titi

        roro.setNom("roro");
        System.out.print(roro);

        System.out.printf("count %d\n", roro.getCount());

    }

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}

  // 1. Créer une classe Personnage

class Personage {

    // 2. Ajouter à chaque personnage les attributs : sante, attaque et armure
    // 9. Respecter le principe d'encapsulation pour notre classe Personnage
        // 9.1 Tous les attributs doivent être privés
    private String Nom;
    private int sante;
    private int attaque;
    private int armure;
    private final int MAX_ARMURE = 20; 
    static private int count = 0 ;



// ============================================================================
    // 3. Créer un constructeur permettant d'initialiser ces 3 attributs
    public Personage(String nom, int sante, int attaque, int armure ){
        this.setNom(nom);
        this.setSante(sante);
        this.setAttaque(attaque);
        this.setArmure(armure);
        this.count++;

    }

    public Personage(String nom, int attaque, int armure ){
        this(nom, 100, attaque, armure ) ;
      

    }
    // 8. Créer une surcharge du constructeur de Personnage permettant de spécifier la valeur de son attribut santé
    public Personage( int sante ){
        this("Inconnu", sante, 0,0);
    }
        // 9.4 Réaliser un constructeur par copie : une surcharge de constructeur prenant en paramètre une instance de la classe et en copiant toutes les valeurs de ses attributs
    // 10. A la suite de la création de Frodon, créer Sam par copie à Frodon
    // 11. S'assurer que le nom de Sam soit bien "Sam"
    public Personage( Personage personageCopie  ){
        this(   personageCopie.getNom(), 
                personageCopie.getSante(), 
                personageCopie.getAttaque(), 
                personageCopie.getArmure());
    }

    public Personage  copy (){

        return new Personage(this);
    }

    public static int getCount(){

        return count;
    }
// ============================================================================
        // 9.2 Définir toutes les méthode comme publique
        // 9.3 Réaliser les getters et setters de tous nos attributs
    public  void setNom(String value){ this.Nom = value; }
    public  String getNom(){  return this.Nom;  }

    public  void setSante(int value){
        int valueCheck = value;
        if (sante < 0)
            valueCheck = 0 ; 
        else if ((sante > 1000))    
            valueCheck = 1000 ; 

        this.sante = valueCheck;
    }
    public  int getSante(){ return this.sante ;  }

    private void diminuerSante(){

        int dommage = this.MAX_ARMURE-this.getArmure();
        this.setSante(this.getSante()- dommage);
        this.setArmure(this.getArmure()- 1);
    }

    public  void setAttaque(int value){ this.attaque = value; }
    public  int getAttaque(){ return this.attaque ; }
    public  void setArmure(int value){   
        if (value > this.MAX_ARMURE)
            this.armure = this.MAX_ARMURE;
        else
            this.armure = value;

    }
    public  int getArmure(){ return  this.armure ;  }


    // 5. Ajouter au Personnage une méthode "attaquer" permettant d'attaquer un autre personnage
    //     5.1  Cet autre personnage est donc un paramètre de la méthode
    //     5.2 L'attaquant fait baisser la sante de l'adverssaire en fonction de son armure et de sa propre puissance d'attaque
    public  void attaquer(Personage  adversaire){
        System.out.printf("moi, %s j'attaque %s\n", this.getNom(), adversaire.getNom());
        adversaire.diminuerSante();
        this.setArmure(this.getArmure()- 1);
        this.setAttaque(this.getAttaque()- 5);
        

    }


    // 4. Ajouter au Personnage une méthode "afficher" permettant de présenter le personnage
    public  void afficher(){
        System.out.printf(this.toString()    );

    }

    //     5.3 Ajouter un affichage du combat
    public  void afficher(Personage  adversaire){
         this.afficher();
         adversaire.afficher();

    }

    public  String toString() {
        return String.format ("nom : %s sante : %d attaque : %d armure : %d\n",
        this.getNom(), this.getSante(),this.getAttaque(),this.getArmure());

    }





}

