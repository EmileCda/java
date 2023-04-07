 package packResponsability; 

class Cipher{

    private int myInt ;


    public Cipher (){

    } 
// ---------------------------------------------------------------------------------
// 2. Lui ajouter les méthodes statiques encode et decode prenant en paramètre 
// un chaine à encoder et un entier (la clef)
 public  static String encode(String value,int code){

        String valueReturn = "";
        int codeEncript =code%92; 
        for (int index = 0 ; index < value.length(); index ++)
        {
            int asciiValue= (int) value.charAt(index) ;
            if (asciiValue>=32 && asciiValue<=127){
                 asciiValue= asciiValue+ codeEncript -32 ;
                asciiValue= (asciiValue + 92)%92;
                asciiValue+=32;
                valueReturn += (char) asciiValue ; 
            }else
                valueReturn +=  value.charAt(index); 

        }
        return valueReturn;
    }


    public  static String decode(String value,int code){

        String valueReturn = "";
        int codeEncript =code%92;
        for (int index = 0 ; index < value.length(); index ++)
        {
            int asciiValue= (int) value.charAt(index) ;
            if (asciiValue>=32 && asciiValue<=127){
                asciiValue= asciiValue - codeEncript -32 ;
                asciiValue= (asciiValue + 92)%92;
                asciiValue+=32;
                valueReturn += (char) asciiValue ; 

            }else
                valueReturn += value.charAt(index) ; 
        }
        return valueReturn;
    }
// ---------------------------------------------------------------------------------
 
}  

