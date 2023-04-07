package decoration ;
import decoration.Io; 
import java.util.Scanner;
// 1. Créer une classe FichierProtege qui soit du même type que Fichier (classe abstraite ou interface) 

public class ProtectedFile implements Io{

// 2. Dans FichierProteger, créer une méthode autentification demandant à l'utilisateur 
// d'entrer un mot de passe et retournant true si il y parvient
    private String password ;
    private boolean isAuthentified ;
    private String content ;
    private Scanner myScan ;
    private Io file ; 
 

    public ProtectedFile(Io file,String passWord){

        this.myScan = new  Scanner(System.in);
        this.setPassword(passWord );
         this.setFile(file);
    }
    public ProtectedFile(String passWord){

        this ( new File(),passWord );
    }


    public  Io   getFile() {
        return this.file  ;
    }

    public  void  setFile(Io value){

        this.file = value ;
    }

    public  void  setPassword(String value){

        this.password = value ;
    }

    public  String  getPassword(){

        return this.password ;
    }
// 3. Dans FichierProteger, surcharger ces 3 méthodes de manière à systématiquement 
// demander à l'utilisateur de s'authentifier (par un simple mot de passe en dur)

    public  void  write(String value){
        if (this.authentication()){
            setIsAuthentified(false);
            this.content +=  value;
        }
    }

    public  void  flush(){

        if (this.authentication()){
            setIsAuthentified(false);
            this.content = "";
        }
    }

    public  String  read(){

        if (this.authentication()){
            setIsAuthentified(false);
            return this.getContent() ;
        }
        else
        return ("");
    }
  public  void  setContent(String value){

        this.content = value ;
    }

    public  String  getContent(){

        return this.content ;
    }
  public  void  setIsAuthentified(boolean value){

        this.isAuthentified = value ;
    }

    public  boolean  getIsAuthentified(){

        return this.isAuthentified ;
    }

// 2. Dans FichierProteger, créer une méthode autentification demandant à l'utilisateur 
// d'entrer un mot de passe et retournant true si il y parvient

    public   boolean authentication(){
        System.out.printf("pass :");
        String value = myScan.nextLine();
        return (this.password.equals(value));
    }

// 3. Dans FichierProteger, surcharger ces 3 méthodes de manière à systématiquement demander à 
// l'utilisateur de s'authentifier (par un simple mot de passe en dur)


}
