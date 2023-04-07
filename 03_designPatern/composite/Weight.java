package composite ;
import composite.Stuff; 

public class Weight implements Stuff {
    private int weight ; 


    public Weight(int weight){
        this.setWeight(weight);
    }

    public  int  getWeight() {
        return this.weight  ;
    }

    public  void  setWeight(int value){

        this.weight = value ;
    }



}