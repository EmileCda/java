package packMotor; 
import  packMotor.Motor;
import  packMotor.Gearbox;
import  packMotor.Tank;

public class Bike extends Vehicle{

    public Bike(String model,Motor motor,Gearbox gearBox,Tank tank){
        super ( model, motor, gearBox, tank); 
    }

    public Bike(String model,Motor motor,Gearbox gearBox){
        this ( model, motor, gearBox,new Tank(0)); 
    }

}        
// public Vehicle(String model,Motor motor,Gearbox gearBox,Tank tank){