package packClass; 
    // 3. Créer une classe Carre

class Carre extends Rectangle { 
        // 3.1 Lui ajouter un constructeur ne prenant qu'un unique paramètre coté, faisant appel au constructeur du rectangle
    Carre (int cote){
        super( cote, cote);
    } 

    Carre (Carre carreCopi){
        this ( carreCopi.getLargeur()  );
    }
    public  String toString() {
        return String.format ("Carre        coté : %2d              périmètre %2.2f aire %2.2f",
        this.getLargeur(),this.perimetre(),this.aire());

    }

}