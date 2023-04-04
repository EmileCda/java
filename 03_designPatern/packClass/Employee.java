package packClass; 
import java.util.ArrayList;
import packClass.Imprimante;

    // 2. Créer la classe Employee

public class Employee  { 

    private String name ;
    private Imprimante myPrinter ;

    public Employee( String name){
        this.setName (name);
        this.myPrinter = Imprimante.getPrinter();
        // this.myPrinter = new Imprimante();
    }


    public  void  setName(String name){

        this.name = name ;
    }

    public  String  getName(){

        return this.name ;
    }

// 2.1 Pourra se servir d'une nouvelle imprimante pour lancer une impression
    public  void addJob(String myJob){

        this.myPrinter.addjob(this.getName(),myJob);
    }

    public  void print(){
        this.myPrinter.print();
    }

    public  void print(String textToPrint){
        this.addJob(textToPrint);
        this.print();
    }

    public  int printerCount(){
       return this.myPrinter.getCounter();
    }

    public  void printQueue(){
       this.myPrinter.displayQueue();
    }



}  



