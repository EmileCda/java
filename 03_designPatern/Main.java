import commande.Interface;
public class Main {

// ----------------------------------------------------------------------------
    public static void main(String[] args) {    
        Interface gui = new Interface();
        gui.run();

    }

}



/*

    -- Préparation --
    -----------------

    1. Créer une classe Lights
    2. Lui ajouter 4 attributs boolean : light_A, light_B, light_C et light_D représentant 4 lumières éteintes par défaut
    3. Ajouter une méthode pour chaque lampe toggle_A, toggle_B, etc... inversant sa valeur
    4. Ajouter la méthode toString retournant une chaine du style : "A: Off / B: On etc..."
    5. Ajouter une méthode all_on retorunatn true si toutes les lampes sont allumées

    -- Utilisation --
    -----------------

    6. Créer une classe Interface contenant une unique méthode statique run
    7. Cette méthode run demande au joueur d'entrer le nom d'une commande (chaine de caractère)
    8. On déclenchera une Commande en fonction de ce qu'a entré l'utilistateur, et ce jusqu'à ce que toutes les lampes soient allumées

    9. Créer une classe Commandes contenant un ensemble de méthodes statique dont 
        9.1 La méthode "bambi" qui toggle A et C
        9.2 La méthode "peterpan" qui toggle B et C
        9.3 La méthode "shrek" qui toggle A, B et D
        
    10. Chaque entrée de l'utilisateur déclenche la commande associée (Commandes.shrek() par exemple)

*/