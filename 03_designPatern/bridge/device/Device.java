package bridge.device ;
 
// 1. Créer une classe Appareil

public class Device  {
    // 2. Lui ajouter les attributs nom (String), volume (int), chaine (int)
    private String name ;
    private int volume ;
    private int chanel ;

    public Device(String name,int volume,int chanel){

        this.setName(name);
        this.setVolume(volume);
        this.setChanel(chanel);
    }
// 4. Créer un constructeur prenant en paramètre le nom, tous les autres paramètres seront définit avec des valeurs par défaut
    public Device(String name){

        this( name,0,0 );
    }

    public Device(){

        this( "Device-noname",0,0 );
    }

    // 3. Lui ajouter des getters et des setters
   public  void  setName(String value){

        this.name = value ;
    }
   public  void  setVolume(int value){

        this.volume = value ;
    }
   public  void  setChanel(int value){
        this.chanel = value ;

    }
    public  String  getName(){

        return this.name ;
    }
   public  int  getVolume(){

        return this.volume ;
    }
   public  int  getChanel(){
        return this.chanel  ;

    }


    public String toString(){

        return String.format("%s VOl[%s] Ch[%s] ", 
                                this.getName(),
                                this.getVolume(),
                                this.getChanel());

    }


}