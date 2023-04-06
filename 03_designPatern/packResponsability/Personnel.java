package packResponsability; 
import packResponsability.Level;

    // 2. Créer la classe Employee

public class Personnel  { 

    private String name ;
     private Level securityLevel ;

    public Personnel( String name, Level securityLevel){
        this.setName (name);
        this.setSecurityLevel(securityLevel);
    }

    public Personnel( String name){
        this(name,Level.LEVEL_0);
    }


    public  void  setName(String value){ this.name = value ;  }
    public  String  getName(){ return this.name ; }

    public  void  setSecurityLevel(Level value){ this.securityLevel = value ;  }
    public  Level getSecurityLevel(){ return this.securityLevel ; }



}  



