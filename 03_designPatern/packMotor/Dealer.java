
package packMotor; 
import  packMotor.Vehicle;
import  packMotor.Driver;
import  packMotor.CarMaker;
import  packMotor.BikeMaker;


// 12. Créer une classe Vendeur possédant une méthode "vendre_vehicule" prenant en paramètre un conducteur 
//et retournant le vehicule qu'on lui vend (créer un affichage)

 // 14. Si l'utilisateur posséde au moins 3 ans d'expérience, on l'oriente vers un véhicule de sport, 
 //sinon, plutot vers un citadin.

public class Dealer {

    public static Vehicle dealVehicle( Driver  driver){

        Vehicle vehicleToSell = null;

        if (driver.getLicenceB()){
            CarMaker carFactory = new CarMaker() ;
            if (driver.getYearPractice() >=3)
            {
                vehicleToSell= carFactory.buildSportVehicule();
            }
            else{
                vehicleToSell= carFactory.buildCityVehicule();
            }
        }else if (driver.getLicenceA()) {
            BikeMaker bikeFactory = new BikeMaker() ;
            if (driver.getYearPractice() >=3)
            {
                vehicleToSell= bikeFactory.buildSportVehicule();
            }
            else{
                vehicleToSell= bikeFactory.buildCityVehicule();
            }

        }

        return vehicleToSell;

    }

}
