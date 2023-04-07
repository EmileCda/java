package packMotor; 
import  packMotor.Motor;
import  packMotor.Gearbox;
import  packMotor.Tank;


public class Vehicle {
    private String model;
    private Motor motor;
    private Gearbox gearBox;
    private Tank tank;

    public Vehicle(String model,Motor motor,Gearbox gearBox,Tank tank){

        this.setModel(model);
        this.setMotor(motor);
        this.setGearbox(gearBox);
        this.setTank(tank);

    }

    public Vehicle(String model,Motor motor,Gearbox gearBox){
        this (model,motor,gearBox,new Tank(0));

    }

    public Vehicle buildSportVehicule(String model,Motor motor,Gearbox gearBox,Tank tank){
        return new Vehicle ( model, motor, gearBox, tank  );
    }
    public Vehicle buildCityVehicule(String model,Motor motor,Gearbox gearBox,Tank tank){
        return new Vehicle (
                model, motor, gearBox, tank
            
        );

    }



    public void setModel(String value){
        this.model = value;
    }

    public void setMotor(Motor value){
        this.motor = value;

    }
    public void setGearbox(Gearbox value){
        this.gearBox = value;

    }
    public void setTank(Tank value){
        this.tank = value;

    }


    public String getModel(){
        return this.model;

    }
    public Motor getMotor(){
        return this.motor;

    }
    public Gearbox getGearbox(){
        return this.gearBox;

    }   
    public Tank getTank(){
        return this.tank;

    }



    public String toString(){

        return String.format("modele %s [%s] [%s] [%s]", 
                                this.getModel(),
                                this.getMotor(),
                                this.getGearbox(),
                                this.getTank());

    }


}
