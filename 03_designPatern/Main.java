import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;


// import  packMotor.Energie;
// import  packMotor.EnumTransmission;
import  packMotor.*;

// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {

        CarMaker bagnolMaker = new CarMaker() ;
        // Vehicle myCar = bagnolMaker.buildSportVehicule();
        // Vehicle myCar2 = bagnolMaker.buildCityVehicule();

        // System.out.println(myCar);
        // System.out.println(myCar2);

        Driver alain = new Driver("Alain",true,true,15);
        Driver lulu = new Driver("Lulu",true,false,3);
        Driver riri = new Driver("Riri",true,true,2);
        Driver fifi = new Driver("Fifi",true,false,2);
        Driver titi = new Driver("titi",false,false,2);

        System.out.println(Dealer.dealVehicle(alain));
        System.out.println(Dealer.dealVehicle(lulu));
        System.out.println(Dealer.dealVehicle(riri));
        System.out.println(Dealer.dealVehicle(fifi));
        System.out.println(Dealer.dealVehicle(titi));


    }

}








/*
    1. Créer une classe Moteur comportant un nom, une enumeration avec les valeur "Thermique", "Electrique", "Gaz", et une puissance
    2. Transmission comportant un nom, une enumeration "Manuelle", "Semi-auto", "automatique"
    3. Réservoir comportant une capacité (entier)
    
    4. Créer une classe vehicule comportant un nom de modèle, un moteur, une transmission et un réservoir
    5. Créer une classe voiture et une classe moto héritants tous deux de véhicule

     6. Leur ajouter des setter permettant de définir les composants

       7. Créer une interface Concession
    8. Dans Concession ajouter les méthodes construire_vehicule_sport et construire_vehicule_citadin, retournant un Vehicule
    9. Créer 2 Concession différentes (implémentant l'interface Concession), l'un construisant un véhicule de type Voiture et l'autre de type Moto

    10. Dans le main, créer les 4 type de véhicules à partir de nos builders
*/


/*
    11. Créer une classe Conducteur possédant les attributs nom, permis_a (bool), permis_b (bool), annees_exprience (int)
    12. Créer une classe Vendeur possédant une méthode "vendre_vehicule" prenant en paramètre un conducteur et retournant le vehicule qu'on lui vend (créer un affichage)
    
    13. Si l'utilisateur posséde un permis B, on lui vend une voiture de chez DeluxeCars et si il possède un permis A, on lui vend une Moto de chez NostalMotors
    14. Si l'utilisateur posséde au moins 3 ans d'expérience, on l'oriente vers un véhicule de sport, sinon, plutot vers un citadin.

*/

/*
-- Partie création d'application --
    -----------------------------------

    15. Répartir les différentes classes et énumération dans différents fichier (un fichier par entité )
    16. Créer des packages (et donc une arborescence) tel que :
        - vehicules
            - Vehicule.java
            - Moto.java
            - Voiture.java
            - Composants
                - Enums
                    - MoteurType.java
                    - TransmissionType.java
                - Moteur.java
                - Transmission.java
                - Reservoir.java
        - concessions
            - Concession.java
            - NostalMotors.java
            - DeluxCars.java
        - users
            - Vendeur.java
            - Conducteur.java

    17. Créer un .jar exécutable via "java -jar"

*/