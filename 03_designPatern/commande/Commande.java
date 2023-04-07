
package commande ; 
import commande.Light;

public class Commande{


    public static void commande0 (Light light){

        light.toggle(0);
        light.toggle(1);
        light.toggle(2);

    }
    public static void commande1 (Light light){

        light.toggle(0);
        light.toggle(2);
        light.toggle(3);

    }

    public static void commande2 (Light light){

        light.toggle(2);
        light.toggle(3);

    }
    public static void commande3 (Light light){

        light.toggle(1);
        light.toggle(3);
        light.toggle(0);

    }

    public static void commande4 (Light light){

        light.toggle(3);
        light.toggle(1);

    }
    public static void commande100 (Light light){ light.toggle(0); }
    public static void commande101 (Light light){ light.toggle(1); }
    public static void commande102 (Light light){ light.toggle(2); }
    public static void commande103 (Light light){ light.toggle(3); }


}