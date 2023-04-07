import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

import packClass.Imprimante;
import packClass.Employee;


// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {

        Employee joe = new Employee("joe");
        Employee jack = new Employee("jack");
        Employee william = new Employee("william");


        william.addJob("Print-1 lulu");
        System.out.printf("lul1 %d\n",  william.printerCount());
        william.print();
        System.out.println(  william.printerCount());
        joe.addJob("Print-2 joe");
        joe.addJob("Print-3 joe-1");
        joe.addJob("Print-4 joe-2");
        jack.addJob("Print-5-fin jack-3");
        System.out.printf("********************* printqueue  %d\n",Imprimante.nbInstance);
        joe.printQueue();
        System.out.printf("********************* printqueue\n");

        joe.print();
        System.out.printf("william %d\n",  william.printerCount());
        joe.print();
        william.print();
        william.print();
        jack.print("jack-5-jack jack-3");
        
        william.print();
        william.print();
        System.out.println(  william.printerCount());
    }

}



/*
    1. Créer la classe imprimante
        1.1 Elle dispose d'une liste de chaine à imprimer
        1.2 Elle dispose d'un compteur d'impression
        1.3 Ajouter une méthode "ajouter_aux_impressions" qui ajoutera une chaine à la liste
        1.4 Ajouter une méthode "imprimer", qui écrit à l'écran la première chaine entrée dans la liste et la supprime
        1.5 Mettre à jour le compteur d'impression à chaque impression
        
    2. Créer la classe Employee
        2.1 Pourra se servir d'une nouvelle imprimante pour lancer une impression
        2.2 Créer quelques employés qui impriment

    3. Comment retrouve le nombre total d'impression en fin de script ?
*/