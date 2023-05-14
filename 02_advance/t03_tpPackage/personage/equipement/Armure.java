package personage.equipement ;
// 13. Créer une nouvelle classe Armure (piéce d'équippement de protection)
//     13.1 Elle comportera un nom et une puissance de protection
//     13.2 Respecter le principe d'encapsulation

public class Armure{

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
