package packMotor; 
import  packMotor.Energy;

public class Motor{
    private String name;
    private Energy energy;
    private double power;


    public Motor(String name, Energy energy, double power ){

        this.setName(name);
        this.setEnergie(energy);
        this.setPower(power);
    }

    public void setName(String value){
        this.name = value;

    }

    public void setEnergie(Energy value){
        this.energy = value;
        
    }
    public void setPower(double value){
        this.power = value;
        
    }

    public String getName(){
        return this.name ;

    }

    public Energy getEnergie(){
        return this.energy ;
        
    }
    public double getPower(){
        return this.power ;
        
    }


    public String toString(){

        return String.format("%s %s %s hp", 
                                this.getName(),
                                this.getEnergie(),
                                this.getPower());
    }



}