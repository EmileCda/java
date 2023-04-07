package decoration ;
import decoration.Stdio; 
import java.util.Scanner;

public class ProtectedFile extends Stdio {

    private String password ;
    private Scanner myScan ;

   
    public ProtectedFile(String pass,Stdio file){
        this.myScan = new  Scanner(System.in);
        this.setPassword(pass);
        this.noPassSetContent(file.getContent());

    }

    public ProtectedFile(){
        this( "ezr(t)&éœ468vrefg",new ProtectedFile());
    }
    public ProtectedFile(String pass){
        this(pass,new ProtectedFile());
    }
    public ProtectedFile(Stdio file){
        this("ezr(t)&éœ468vrefg",file);
    }





    public  void  setPassword(String value){this.password = value ;}

    public  String  getPassword(){ return this.password ; }

    public  String  getContent(){ 
        if (askPass()) 
            return this.noPassGetContent() ;
        else
            return "";
        }
    
    public  void  setContent(String value){  
        if (askPass()) 
            this.noPassSetContent(value) ;  
    }

    public  void  add(String value){ 
        if (askPass())
            this.noPassAdd(value); 
    }

    public  void  flush(){         
        if (askPass())
            this.noPassSetContent("");  
    }

    private void  noPassSetContent (String value){
        this.content = value;
    }         
    private void  noPassAdd (String value){
        this.content +=  value + "\n"; 
    }         
    private String  noPassGetContent (){
        return this.content; 
    }         



    public  boolean  askPass(){
        System.out.printf("Pass svp :");
        return (this.getPassword().equals(myScan.nextLine()));
    }
    
    public String toString(){

        if (askPass()) 
            return String.format("{%s}[%s]", 
                                this.getClass(),
                                this.noPassGetContent());

        else
            return "";
    }



}

