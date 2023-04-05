package bridge.device ;
import bridge.device.Device;


public class RadioSet extends Device  {

    public RadioSet(String name){
        super(name);
    }

    public RadioSet(){
        this("RadioSet-noname");
    }

    public String toString(){

        return String.format("%s %s", 
                                this.getClass(),
                                super.toString());

    }
}