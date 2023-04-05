import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

import bridge.device.Device;
import bridge.device.RadioSet;
import bridge.device.TvSet;

// import  bridge.*;

// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        System.out.printf("*********************");
        return 0;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {    


        TvSet myTV = new TvSet();
        RadioSet myRadio = new RadioSet();        
        
        System.out.println(myTV);
        System.out.println(myRadio);

        myTV.setChanel(10);
        TvRemote myTvRemote = new TvRemote(myTV);
        System.out.println(myTvRemote);
        myTvRemote.setChanel(3);
        System.out.println(myTvRemote);
        System.out.println(myTV);
        myTvRemote.incBrightness();
        System.out.println(myTvRemote);
        System.out.println(myTV);


    }
}

// 7. Créer une classe CommandeDistante
class Remote {

// 8. Lui ajouter un appareil à commander en tant qu'attribut
    private Device device ; 

// 9. Ajouter un constructeur prenant en paramètre cet Appareil

    public Remote( Device device){
        this.setDevice(device );
    }

    public  void  setChanel(int value){
         this.device.setChanel (value);
    }
    public  void  incChanel(){
         this.device.setChanel (this.device.getChanel()+1);
    }
    public  void  decChanel(){
         this.device.setChanel (this.device.getChanel()-1);
    }

    public  void  incVolume(){
         this.device.setVolume (this.device.getVolume()+1);
    }
    public  void  decVolume(){
         this.device.setVolume (this.device.getVolume()-1);
    }

    public  void  setVolume(int value){
         this.device.setVolume (value);
    }
    public  int  getVolume(){
         return this.device.getVolume ();
    }

// 10. Développer les fonctionnalités chainePlus, chaineMoins, volumePlus, volumeMoins, detailsAppareil
    public  String  DeviceDetail(){
        return this.device.toString();
    }

    public  Device  getDevice(){

       return  this.device  ;
    }


    public  void  setDevice(Device value){

        this.device = value ;
    }

    public String toString(){

        return String.format("%s %s", 
                                this.getClass(),
                                this.device);

    }

}



class AdvancedRemote extends Remote {
    private int volumeSave ; 
    private boolean isMute ; 

    public AdvancedRemote(Device myDevice){

        super(myDevice);
        this.volumeSave = myDevice.getVolume();
    }

     public  void  setIsMute(boolean value){
        this.isMute  = value ;
     }
     public  boolean  getIsMute(){
        return this.isMute ;
     }
     public  void  setVolumeSave(int value){
        this.volumeSave  = value ;
     }
     public  int  getVolumeSave(){
        return this.volumeSave ;
     }

     
     public  void  toggleIsMute(){
        if (getIsMute()){
            this.setIsMute(false);
            this.setVolume(this.getVolumeSave());
        }
        else{
            this.setIsMute(true);
            this.volumeSave = this.getVolume();
            this.setVolume(0);
            this.setVolume(this.getVolumeSave());
        }
     }

// 13. Elle dispose également des boutons 1 à 5 utilisant chacun une méthode set_chaine_1, etc...
    public  void  button(int buttonNumer){
        this.setChanel(buttonNumer) ;
    }


}


    // 14. Créer une classe TeleCommande héritant de CommandeDistante
    // 15. Modifier son type d'appareil (les Televiseurs)
    // 16. Lui ajouter une commande pour gérer la luminosite

class TvRemote extends AdvancedRemote  {

    private TvSet device ; 

    public TvRemote (TvSet myTvSet){
        super(myTvSet);
        this.setDevice(myTvSet);
        
    }

    public  void  setDevice(TvSet value){

        this.device = value ;
    }
   
    public  TvSet  getDevice(){

       return  this.device  ;
    }


    public  void  incBrightness(){
         this.device.setBrightness (this.device.getBrightness()+1);
    }
    public  void  decBrightness(){
         this.device.setBrightness (this.device.getBrightness()-1);
    }


}

/*
- Création des commandes -- 
    ----------------------------

   - Création des commandes -- 
    ----------------------------

    7. Créer une classe CommandeDistante
    8. Lui ajouter un appareil à commander en tant qu'attribut
    9. Ajouter un constructeur prenant en paramètre cet Appareil
    10. Développer les fonctionnalités chainePlus, chaineMoins, volumePlus, volumeMoins, detailsAppareil

    11. Créer une classe AdvancedCommand héritant de CommandeDistante
    12. Elle propose une fonction Mute/Unmute
    13. Elle dispose également des boutons 1 à 5 utilisant chacun une méthode set_chaine_1, etc...

    14. Créer une classe TeleCommande héritant de CommandeDistante
    15. Modifier son type d'appareil (les Televiseurs)
    16. Lui ajouter une commande pour gérer la luminosite

   /*

    -- Préparation coté appareil --
    -------------------------------

    1. Créer une classe Appareil
    2. Lui ajouter les attributs nom (String), volume (int), chaine (int)
    3. Lui ajouter des getters et des setters
    4. Créer un constructeur prenant en paramètre le nom, tous les autres paramètres seront définit avec des valeurs par défaut

    5. Créer un Téléviseur héritant d'appareil et disposant d'un nouvel attribut luminosité
    6. Créer une Radio héritant d'appareil

*/