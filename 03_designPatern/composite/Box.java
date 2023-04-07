package composite ;
import composite.Stuff; 
import java.util.ArrayList;

public class Box implements Stuff {

    private  ArrayList<Stuff> itemList = new ArrayList<Stuff>();
    private int weight ; 

    public Box(Weight weight){
        this.add(weight);

    };
    public Box(){};
    public Box(Box otherBox){
        this.add(otherBox);

    }

  public  int  getWeight() {
        return this.weight  ;
    }

    public  void  setWeight(int value){

        this.weight = value ;
    }

    public void add(Stuff value){
        this.itemList.add(value) ;
        this.setWeight(this.getWeight()+value.getWeight());
    }

    // public void add(Box otherBox){
    //     //  ArrayList<Weight> otherTempList = otherBox.getItemList()
    //     for ( Stuff item : otherBox.getItemList()){
    //         this.add(item);

    //     } ;
    // }

    public ArrayList<Stuff> getItemList(){

        return this.itemList ;
    }
    public int sum(){
        int total = 0 ;

        for ( Stuff item : itemList){
            this.weight += item.getWeight();

        }
        return total ;
    }


    public String toString(){

        return String.format("%s poid %d ", 
                                this.getClass(),
                                this.getWeight());

    }

}