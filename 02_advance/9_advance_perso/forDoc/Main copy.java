import java.util.Scanner;
import java.lang.Math;


// ----------------------------------------------------------------------------
// public class ClassPublic{
class ClassPublic{


    public String Name (){

        return "Je suis une class public";
    }
}
// ----------------------------------------------------------------------------
class ClassDefault{


    public String Name (){

        return "Je suis une class par défaut"+
                " accessible seulement par les classes dans le même package";
    }
}
// ----------------------------------------------------------------------------
class IntString{
    int publicInt;
    String publicString;
    private   int myInt;
    protected   String myString;
// ----------------------------------------------------------------------------
    public IntString(){
        this.publicInt = 100;
        this.publicString = "Cent";
        this.myInt = 3 ;
        this.myString = "protected string";
    }
// ----------------------------------------------------------------------------
    public IntString(int pubInt){
        this.publicInt = pubInt;
    }
// ----------------------------------------------------------------------------
    public IntString(String pubStr){
        this.publicString = pubStr;
    }
// ----------------------------------------------------------------------------
    public IntString(int privInt, String privStr){
        this.myInt = privInt ;
        this.myString = privStr;
    }
// ----------------------------------------------------------------------------
    public  void setMyInt(int value){
        this.myInt = value ;
    }
// ----------------------------------------------------------------------------
    public  int getMyInt(){
        return this.myInt ;
    }
// ----------------------------------------------------------------------------
    public String  toString(){
        return String.format( "publicInt [%d] publicString [%s]  myInt [%d]  myString [%s]",
            publicInt,publicString, myInt, myString);
    }
// ----------------------------------------------------------------------------
}
public class Main {
// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void main(String[] args) {
            Scanner myScan = new Scanner(System.in);

            IntString  myObject = new IntString(1234) ;
            IntString  myObject2 = new IntString(99) ;
            IntString  myObject3 = new IntString(-12, "moins douze") ;
            IntString  myObject4 = new IntString();
            System.out.println(myObject.toString());
            myObject.publicInt = 5 ;
            System.out.println(myObject.toString());
            System.out.println(myObject2.toString());
            System.out.println(myObject3.toString());
            System.out.println(myObject4.toString());
    }
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}


