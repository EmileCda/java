package personage.equipement ;
// 2. Créer une nouvelle classe Arme 
//     12.1 Elle comportera un nom et une puissance d'attaque
//     12.2 Respecter le principe d'encapsulation


public class Arme{

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



