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
        Personage titi = new Personage ("titi",new Arme("brin d'herbe"),new Armure(),50);
        Personage toto = new Personage ("toto",new Arme(),new Armure(),10);
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



// 14. Modifier la classe Personnage pour lui intégrer systématiquement une Arme et une Armure 
//     14.0 Remplacer l'attribut int attaque par Arme arme et l'attribut int armure par Armure armure
//     14.1 Modifier les constructeurs
//     14.2 Modifier les getters, setters (accesseurs)
//     14.3 Adapter l'ensemble des méthodes si nécéssaire
//     14.4 Adapter le scénario du main

// 1. Créer une classe Personnage

class Personage {

    // 2. Ajouter à chaque personnage les attributs : sante, attaque et armure
    // 9. Respecter le principe d'encapsulation pour notre classe Personnage
        // 9.1 Tous les attributs doivent être privés
    private String Nom;
    private int sante;
    private Arme arme;
    private Armure armure;
    private static final int MAX_ARMURE = 20; 
    private static final int DEFAULT_SANTE = 10; 
    private static final String DEFAULT_NAME = "John Doe"; 
    
    private static int count = 0 ;



// ============================================================================
    // 3. Créer un constructeur permettant d'initialiser ces 3 attributs
    public Personage(String nom,  Arme arme, Armure armure, int sante){
        this.setNom(nom);
        this.setAttaque(arme);
        this.setArmure(armure);
        this.setSante(sante);
        this.count++;

    }
    public Personage(String nom){
        this(nom, new Arme(), new Armure(), DEFAULT_SANTE ) ;
    }


    public Personage(String nom, Arme arme, Armure armure ){
        this(nom, arme, armure, DEFAULT_SANTE ) ;
    }

    // 8. Créer une surcharge du constructeur de Personnage permettant de spécifier la valeur de son attribut santé
    public Personage( int sante ){
        this( DEFAULT_NAME,new Arme(),new Armure(),DEFAULT_SANTE);
    }

    public Personage( ){
        this( DEFAULT_NAME,new Arme(),new Armure(),DEFAULT_SANTE);
    }

        // 9.4 Réaliser un constructeur par copie : une surcharge de constructeur prenant en paramètre une instance de la classe et en copiant toutes les valeurs de ses attributs
    // 10. A la suite de la création de Frodon, créer Sam par copie à Frodon
    // 11. S'assurer que le nom de Sam soit bien "Sam"
    public Personage( Personage personageCopie  ){
        this(   personageCopie.getNom(), 
                personageCopie.getAttaque(), 
                personageCopie.getArmure(),
                personageCopie.getSante());
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

        int dommage = this.MAX_ARMURE-this.armure.getPuissanceProtection();

        this.setSante(this.getSante()- dommage);
        this.armure.diminuer();
    }

    public  void setAttaque(Arme arme){ this.arme = new Arme(arme); }
    public  Arme getAttaque(){ return this.arme ; }
    public  void setArmure(Armure value){   
        this.armure = new Armure();
    }
    public  Armure getArmure(){ return  this.armure ;  }



    // 5. Ajouter au Personnage une méthode "attaquer" permettant d'attaquer un autre personnage
    //     5.1  Cet autre personnage est donc un paramètre de la méthode
    //     5.2 L'attaquant fait baisser la sante de l'adverssaire en fonction de son armure et de sa propre puissance d'attaque
    public  void attaquer(Personage  adversaire){
        System.out.printf("moi, %s j'attaque %s\n", this.getNom(), adversaire.getNom());
        adversaire.diminuerSante();
        this.armure.diminuer();
        this.arme.diminuer();
        

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
        return String.format ("nom : %s sante : %d arme : %s armure : %s\n",
        this.getNom(), this.getSante(),this.arme,this.armure);

    }


}

// 2. Créer une nouvelle classe Arme 
//     12.1 Elle comportera un nom et une puissance d'attaque
//     12.2 Respecter le principe d'encapsulation


class Arme{

    private String nom; 
    private int puissanceAttaque; 
    private static final String DEFAULT_NAME = "gourdin";
    private static final int DEFAULT_POWER = 1;
    
     
//====================== Constructor ==========================================
    public Arme(String name, int power ){
        this.setNom (name);
        this.setPuissanceAttaque (power);
    }

    public Arme(String name ){
        this(name,DEFAULT_POWER );
    }
    public Arme(int power ){
        this(DEFAULT_NAME,power );
    }

    public Arme( Arme armeCopie ){
        this(armeCopie.getNom(),armeCopie.getPuissanceAttaque());
    }
    public Arme( ){
        this(DEFAULT_NAME,DEFAULT_POWER );
    }

    public Arme  copy (){

        return new Arme(this);
    }

//======================Setter Getter =========================================
    public void setNom(String value) {
        this.nom = value ;
    }
    public String getNom() {
        return this.nom ; 
    }

    public void setPuissanceAttaque(int value) {
        this.puissanceAttaque = value ;
    }
    public int getPuissanceAttaque() {
        return this.puissanceAttaque  ;
    }

    public int diminuer() {
        int puissance =this.getPuissanceAttaque();
        setPuissanceAttaque(puissance--);
        return this.getPuissanceAttaque()  ;
    }


    public String toString () {
        return  String.format("nom : %s attaque : %d ",
                this.getNom(),this.getPuissanceAttaque())  ;
    }

}






// 13. Créer une nouvelle classe Armure (piéce d'équippement de protection)
//     13.1 Elle comportera un nom et une puissance de protection
//     13.2 Respecter le principe d'encapsulation

class Armure{

    private String nom; 
    private int puissanceProtection; 
    private static final String DEFAULT_NAME = "t-shirt";
    private static final int DEFAULT_SHIELD = 1;

//====================== Constructor ==========================================
    public Armure (String name, int shield ){
        this.setNom (name);
        this.setPuissanceProtection(shield);
    }
    public Armure (Armure armureCopie ){
        this(   armureCopie.getNom(),
                armureCopie.getPuissanceProtection()
            );
    }
    public Armure(){
        this(   DEFAULT_NAME,
                DEFAULT_SHIELD
            );

    }
    public Armure( int shield){
        this(   DEFAULT_NAME,
                shield
            );

    }
    public Armure(String name){
        this(   name,
                DEFAULT_SHIELD
            );

    }

    public Armure  copy (){

        return new Armure(this);
    }

//======================Setter Getter =========================================
    public void  setNom(String value) {
        this.nom = value ;
    }
    public String getNom() {
        return this.nom ; 
    }
     public void setPuissanceProtection(int value) {
        this.puissanceProtection = value ;
    }
    public int getPuissanceProtection() {
        return this.puissanceProtection  ;
    }

    public int diminuer() {
        int puissance =this.getPuissanceProtection();
        setPuissanceProtection(puissance--);
        return this.getPuissanceProtection()  ;
    }


//====================== utilities  ===========================================

    public String toString () {
        return String.format("nom : %s protection : %d ",
                this.getNom(),this.getPuissanceProtection())  ;
    }


}

