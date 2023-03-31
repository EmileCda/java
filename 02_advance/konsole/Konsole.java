package konsole; 

public class Konsole{

    public static enum Color {BLACK,RED,GREEN,YELLOW,BLUE,PURPLE,CYAN,WHITE};
    

    // ---------------------------------------------------------------------------------
 
    public static void  setCursor (int row, int column){
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df",escCode,row,column));
    }
// ---------------------------------------------------------------------------------
    public static void  clearScreen (){
        System.out.print("\033\143");
    }

    public static void  setColor (Color myColor){

        String choice = "\u001B[0m";
        switch (myColor){
            case BLACK : choice = "\u001B[30m"; break;
            case  RED : choice = "\u001B[31m"; break;
            case  GREEN : choice = "\u001B[32m"; break;
            case  YELLOW : choice = "\u001B[33m"; break;
            case  BLUE : choice = "\u001B[34m"; break;
            case  PURPLE : choice = "\u001B[35m"; break;
            case  CYAN : choice = "\u001B[36m"; break;
            case  WHITE: choice = "\u001B[37m"; break;
            default : choice = "\u001B[0m"; break;
        }
         System.out.print(choice);
    }

// fonction random qui renvoie une fonction entre minValue et maxValue
// attention dans le cas de l'utilisation pour indexer un tableau (maxIndex = length)    
    public static int randInt(int minValue, int maxValue) {
        // minvalue er maxValue inclus
        return   (int)(Math.random() * (maxValue + 1-minValue) + minValue );  
    }


}