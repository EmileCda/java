 package packResponsability; 
 import packResponsability.Authenticate;
//  7. Créer une classe FileReader



public class FileReader{

    
    // 8. Lui ajouter les méthodes statiques read et write prenant en paramètre un Personnel et un Fichier
    // 9. Cette méthode exécute l'écriture et la lecture aprés authentification via une classe Authenticate
    // 10. Aprés authentification, on encode (ecriture) ou décode (lecture) la donnée
    public static String  read (File file, Personnel personnel,int key){

        if (Authenticate.haveAccess (file, personnel)){
            return Cipher.decode(file.getContent(),key);
        }
        return "";
    }

    public static String  read (File file, Personnel personnel){
        return FileReader.read (file, personnel,0);
    }





    public static void  write (File file, Personnel personnel, String text,int key){
        if (Authenticate.haveAccess (file, personnel)){
            file.setContent(Cipher.encode(text,key));
        }

    }
    public static void  write (File file, Personnel personnel, String text){
        FileReader.write (file, personnel,text,0);

    }


}