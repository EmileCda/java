package packMotor; 
import  packMotor.EnumGearbox;
public class Gearbox{
    private String name;
    private EnumGearbox boite;

    public Gearbox(String name,EnumGearbox boite){

        this.setName(name);
        this.setBoite(boite);

    }

    public void setName(String value){
        this.name = value;

    }
    public String getName(){
        return this.name;

    }

    public EnumGearbox getBoite(){
        return this.boite ;
        
    }
    public void setBoite(EnumGearbox value){
        this.boite = value; 
        
    }


    public String toString(){

        return String.format("%s %s", 
                this.getName(),
                this.getBoite());
   }


}
