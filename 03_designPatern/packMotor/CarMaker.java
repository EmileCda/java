package packMotor; 
import  packMotor.VehicleMaker;
import  packMotor.Vehicle;
import  packMotor.Motor;
import  packMotor.Gearbox;
import  packMotor.Tank;
import  packMotor.Car;

public class CarMaker  implements  VehicleMaker {


    public CarMaker(){};
    public  Vehicle buildSportVehicule(){

        String model    = "Sport Car";
        Motor motor     = new Motor("moteur-sport",Energy.THERMIQUE,1000);
        Gearbox gearBox = new Gearbox("GearBox-Manual",EnumGearbox.MANUELLE);
        Tank    tank    = new Tank (200);

        Car myCar = new Car(model,motor,gearBox,tank);
        return myCar ;
    };
    public  Vehicle buildCityVehicule(){

        String model    = "City Car";
        Motor motor     = new Motor("petit-moteur",Energy.ELECTRIQUE,50);
        Gearbox gearBox = new Gearbox("GearBox-Auto",EnumGearbox.AUTOMATIQUE);

        Car myCar = new Car(model,motor,gearBox);
       return myCar ;

    };

}