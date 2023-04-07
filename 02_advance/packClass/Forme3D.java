package packClass; 
import packClass.Forme;
import packClass.ColorEnum;

// 2. Créer une classe Forme3D implémentant l'interface Forme
public abstract class Forme3D  implements Forme{
    // 3. Ajouter l'attribut hauteur à la Forme3D
    private double hauteur;
    // 3. Ajouter un attribut color à la Forme3D et lui définir une valeur par défaut
    private ColorEnum color;




    // 4. Ajouter un constructeur à Forma3D permettant de spécifier une couleur (idem pour Rectangle3D et cylindre)
    public Forme3D(double hauteur,ColorEnum color ){
        this.setHauteur( hauteur);
        this.setColor( color);
    }
    public Forme3D(double hauteur ){
        this( hauteur,ColorEnum.GREY);
    }

    // 4. Ajouter la méthodes abstraites volume
    public abstract double  volume();
    public void setHauteur(double value){
        this.hauteur = value; 
    }
    public double getHauteur(){

        return this.hauteur ;
    }
    public ColorEnum getColor(){

        return this.color ;
    }

    // 5. Ajouter un setter à Forme3D permettant de changer la couleur

    public void setColor(ColorEnum value){

        this.color = value;
    }


}
