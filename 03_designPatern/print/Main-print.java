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


        william.addJob("lulu");
        william.print();
        
        System.out.println(  Imprimante.getCounter());
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