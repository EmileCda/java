package adaptator ;

//   4. Créer une classe Rond ayant pour attributs un rayon (double)
//         4.1 Ajouter un constructeur et un getter
  
public class Circle  { 
    private int radius; 
    
    public Circle (int myRadius){
        this.setRadius(myRadius);
    } 

    public Circle (Circle circleCopy){
        this ( circleCopy.getRadius() );
    } 

    public void setRadius(int value){

        this.radius = value; 
    }
    public int getRadius(){

        return this.radius ;
    }

    public double perimetre(){

        return 2* Math.PI* getRadius() ;
    }
    public double aire(){

        return  Math.PI * getRadius()* getRadius() ;
    }


    public  String toString() {
        return String.format ("cercle de rayon   : %2d              périmètre %02.2f aire %02.2f",
        this.getRadius(),this.perimetre(),this.aire());

    }

}