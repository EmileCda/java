package packMotor; 
import  packMotor.Vehicle;
import  packMotor.VehicleMaker;
import  packMotor.Motor;
import  packMotor.Gearbox;
import  packMotor.Tank;
import  packMotor.Bike;



public class BikeMaker   implements  VehicleMaker{
    public Vehicle buildSportVehicule(){

        String model    = "Sport Bike";
        Motor motor     = new Motor("moteur-sport-Moto",Energy.THERMIQUE,100);
        Gearbox gearBox = new Gearbox("GearBox-Manual",EnumGearbox.MANUELLE);
        Tank    tank    = new Tank (200);

        //  Vehicle myBike = new Vehicle(model,motor,gearBox,tank);
        Bike myBike = new Bike(model,motor,gearBox,tank);
        return myBike ;
    };
    public Vehicle buildCityVehicule(){

        String model    = "Scooter";
        Motor motor     = new Motor("petit moteur-Moto",Energy.ELECTRIQUE,10);
        Gearbox gearBox = new Gearbox("GearBox-Auto",EnumGearbox.AUTOMATIQUE);

        Bike myBike = new Bike(model,motor,gearBox);
        //  Vehicle myBike = new Vehicle(model,motor,gearBox,tank);
        return myBike ;

    };


}