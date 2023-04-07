package decoration ;
import decoration.Io; 

public class File implements Io {

    private String content ;

    public File(){
        this.flush();
    }


    public  void  add(String value){

        this.content +=  value;
    }

    public  void  write(String value){

        this.add(value);
    }

    public  void  flush(){

        this.content = "";
    }

    public  String  read(){

        return this.getContent() ;
    }

    public  void  setContent(String value){

        this.content = value ;
    }

    public  String  getContent(){

        return this.content ;
    }


    


}

