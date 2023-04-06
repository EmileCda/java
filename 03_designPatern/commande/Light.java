package commande ; 
import konsole.Konsole;
import commande.LightPrimary;

public class Light{

    private LightPrimary lightList[] = {
        
        new LightPrimary("**A**",false),
        new LightPrimary("**B**",false),
        new LightPrimary("**C**",false),
        new LightPrimary("**D**",false)};


    public Light(){

        this.setListLightOff();


    }
    public  void  setListLightOff(){ 
        for (int index = 0 ; index < this.lightList.length ; index++){

            this.setLightOff(index);
        } 
    }

    public  void  setListLightOn(){ 
        for (int index = 0 ; index < this.lightList.length ; index++){

            this.setLightOn(index);
        } 
    }
    public  void  setListLight(LightPrimary lightList[]){ this.lightList = lightList ; }
    public  LightPrimary[]   getListLight(){ return this.lightList; }

    public  void  setLightOn(int id){ this.getLight(id).setState(true) ; }
    public  void  setLightOff(int id){  this.getLight(id).setState(false); }

    public  void  setLight(int id,LightPrimary value){ this.lightList[id]= value ; }
    public  LightPrimary  getLight(int id){ return this.lightList[id]; }

    public  void  toggle(int id){  

        LightPrimary tempLight=this.getLight(id);
        tempLight.setState(!tempLight.getState());
        this.setLight(id,tempLight);
    }
    public  boolean  allLit(){  
        for (LightPrimary ligth :this.getListLight() ){
            if (!ligth.getState()){
                return false ;
            }  
        }
        return true ; 
    }

    public String toString(){
        String stringReturn = "";
        for (LightPrimary ligth :this.getListLight() ){
            stringReturn +=String.format(" %s  %s %s", 
            ligth.getState() ? Konsole.changeColor(Konsole.Color.GREEN) : Konsole.changeColor(Konsole.Color.RED), 
            ligth.getName(),
            Konsole.changeColor(Konsole.Color.WHITE));
        }
        return stringReturn;

    }
 
}