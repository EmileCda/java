package packClass; 

import java.util.ArrayList;



public class Imprimante  { 

        // 1.1 Elle dispose d'une liste de chaine à imprimer
    private  ArrayList<String> jobList ;
// 1.2 Elle dispose d'un compteur d'impression
    private  int counter ;  
    private static Imprimante printer = null;
    public  static int nbInstance;


    // public Imprimante(){
    //     this.setCounter(0);
    //     this.jobList = new ArrayList<String> ();
    //     Imprimante.printer = this ;
    // }

    private Imprimante(){
        this.setCounter(0);
        this.nbInstance++;
        this.jobList = new ArrayList<String> ();
        Imprimante.printer = this ;
    }

    public static Imprimante getPrinter (){
        if (Imprimante.printer != null){
             System.out.println("(Imprimante.printer != null) " );
            return Imprimante.printer;
        }else{
             System.out.println("(return new Imprimante();) " );

            return new Imprimante();
        }
    }

    public  void  addjob(String user, String toPrint){

        this.jobList.add(String.format("{%s}->{%s}",user,toPrint));
    }


    public  void  setCounter(int  value){

        this.counter = value ;
    }
    public  void  incCounter(){

        this.counter++ ;
    }
    public  int  getCounter(){

        return this.counter ;
    }




 // 1.4 Ajouter une méthode "imprimer", qui écrit à l'écran la première chaine entrée dans la liste et la supprime

    public  void  print(){

    if (this.jobList.size() > 0 ){
        System.out.printf("%s\n", this.jobList.get(0));
        this.jobList.remove(0);
// 1.5 Mettre à jour le compteur d'impression à chaque impression
         this.incCounter();
    }
    else      
        System.out.println("liste vide " );
    }


    public  void  print(String user,String text ){

        this.addjob(user,text);
        this.print();
    }



    public void displayQueue(){


        for (String text :this.jobList ){
            System.out.printf ("[%s]\n",text);
        }

    }


}  



