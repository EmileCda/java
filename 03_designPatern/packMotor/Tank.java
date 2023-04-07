package packMotor; 

public class Tank{
    private int capacity ;

    public Tank(int capacity){
        this.setCapacity(capacity);
    }


    public void setCapacity(int value){

        this.capacity = value;

    }
    public int getCapacity(){

        return this.capacity ;

    }


    public String toString(){

        return String.format("Tank:%s", 
                               this.getCapacity()>0 ? this.getCapacity() + " L" : "no Tank" );
    }


}