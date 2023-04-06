package packResponsability; 
import packResponsability.Level;
    // 4. Créer une classe File comprenant les attributs contenu et niveau_acces

public class File  {

    
    private String content ;
    private Level securityLevel ;
    private int  keyCode ;

    public File(String content,Level securityLevel,int keyCode){
        this.setContent(content);
        this.setSecurityLevel(securityLevel);
        this.setKeyCode(keyCode);
    }
    
    public File(String content,int keyCode){
        this(content,Level.LEVEL_0,keyCode);
    }
    public File(String content){
        this(content,Level.LEVEL_0,0);
    }
    public File(Level securityLevel){
        this("",securityLevel,0);
    }
    public File(){
        this("",Level.LEVEL_0,0);
    }


    public  void  setSecurityLevel(Level value){ this.securityLevel = value ;  }
    public  Level getSecurityLevel(){ return this.securityLevel ; }

    public  String  getContent(){ return this.content ; }

    public  void  setContent(String value){this.content = value ;}

    public  int  getKeyCode(){ return this.keyCode ; }
    public  void  setKeyCode(int value){this.keyCode = value ;}

    public  void  add(String value){this.content +=  value + "\n"; }

    public  void  flush(){     this.setContent("");
    }


    
    public String toString(){

        return String.format("{%s}[%s]", 
                                this.getClass(),
                                this.getContent());

    }



}

