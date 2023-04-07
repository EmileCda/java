package decoration ;
import decoration.Stdio; 

public class File extends Stdio {

   
    public File(){
        this.flush();
    }

    public  String  getContent(){

        return this.content ;
    }

    public  void  setContent(String value){

        this.content = value ;
    }

    public  void  add(String value){

        this.content +=  value + "\n"; 

    }

    public  void  flush(){

        this.setContent("");
    }


    
    public String toString(){

        return String.format("{%s}[%s]", 
                                this.getClass(),
                                this.getContent());

    }



}

