package commande ; 


public class LightPrimary {

    String name = "";
    boolean  state = false; 

    public LightPrimary(String name,boolean  state ){
        this.setName(name);
        this.setState(state);

    }
    public  void  setName(String value){ this.name = value ;  }
    public  String  getName(){ return this.name ; }

    public  void  setState(boolean value){ this.state = value ;  }
    public  boolean  getState(){ return this.state ; }

}