package packMotor; 
import  packMotor.Motor;
import  packMotor.Gearbox;
import  packMotor.Tank;


public class Car extends Vehicle{
    public Car(String model,Motor motor,Gearbox gearBox,Tank tank){
        super ( model, motor, gearBox, tank); 
    }
    public Car(String model,Motor motor,Gearbox gearBox){
        this ( model, motor, gearBox,new Tank(0)); 
    }

}
