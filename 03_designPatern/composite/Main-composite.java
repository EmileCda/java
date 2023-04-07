import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import konsole.Konsole; 

import bridge.device.Device;
import bridge.device.RadioSet;
import bridge.device.TvSet;

// import  bridge.*;

import composite.Weight; 
import composite.Box; 
// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        System.out.printf("*********************");
        return 0;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {    
        Konsole.clearScreen();
        Box box1kg = new Box (new Weight(1));
        Box box3kg = new Box (new Weight(3));
        Box box8kg = new Box (new Weight(7));
        Box box11kg = new Box ();

        System.out.println(box1kg);
        System.out.println(box3kg);
        System.out.println(box8kg);
        System.out.println(box11kg);


        System.out.println(box8kg);
        box8kg.add(box1kg);
        System.out.println(box8kg);


        box11kg.add(box3kg);
        System.out.println(box11kg);
        box11kg.add(box8kg);
        System.out.println(box11kg);
    }
}





/*

    -- Préparation --
    -----------------

    1. Créer deux éléments de même type : la Boite et le Poids
    2. Le poids dispose d'un entier poids
    3. la boite dispose d'une liste d'élements qu'elle contient
    4. Ajouter a la boite les fonctionnalités "ajouterElement" et "calculerPoid"

    -- Utilisation --
    -----------------

    5. Créer le même schéma que le slide 32 du cours sur les Design-Patterns
    6. Demander le poids à la boite principale

*/