package bridge.device ;
import bridge.device.Device;
// 5. Créer un Téléviseur héritant d'appareil et disposant d'un nouvel attribut luminosité

public class TvSet extends Device  {
    private int brightness ;

    public TvSet(String name, int brightness){
        super(name);
        this.setBrightness( brightness);
    }
    public TvSet(String name){
        this(name,0);
    }
    public TvSet(){
        this("tvSet-noname",0);
    }
        

    public  void  setBrightness(int value){

        this.brightness = value ;
    }
    public  int  getBrightness(){

       return  this.brightness  ;
    }



    public String toString(){

        return String.format("%s %s br[%s] ", 
                                this.getClass(),
                                super.toString(),
                                this.getBrightness());

    }

}
