package packResponsability; 

// 5. Créer une classe Authenticate
// 6. lui ajouter la méthode statique have_access prenant en paramètre un File 
// et un Personnel et retournant true si le Personnel dispose biend e suffisamment de droits

public class Authenticate{

    
    public static boolean  haveAccess (File file, Personnel personnel){

         System.out.printf("F %s  P %s  res[%b] \n",
                file.getSecurityLevel(),
                personnel.getSecurityLevel(),
                
                file.getSecurityLevel() <  personnel.getSecurityLevel());
        
        return (file.getSecurityLevel()< personnel.getSecurityLevel());
        // return true;

    }


}