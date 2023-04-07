import java.util.Scanner;
import java.lang.Math;
import java.util.HashMap; 
import java.util.ArrayList; 
import konsole.Konsole; 

import facade.Fruit; 
import facade.OfferType; 


// ----------------------------------------------------------------------------

public class Main {


// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        System.out.printf("*********************");
        return 0;
    }
// ----------------------------------------------------------------------------
    public static int TestMainProtectedFile(String reponse) {
     
        return 0;
    }
// ----------------------------------------------------------------------------
    public static Offer createOffert (){

        int mode = Konsole.randInt(0,1);
        Offer offerReturn = new Offer((mode==0) ? OfferType.SELLER:OfferType.BUYER);

        for (Fruit fruit : Fruit.values())
        {
            offerReturn.addQuantity(fruit,Konsole.randInt(1,100));
            offerReturn.addUnitPrice(fruit,Konsole.randDouble(1,10));

        }
        return offerReturn;
    }
// ----------------------------------------------------------------------------
    public static void main(String[] args) {    
        Konsole.clearScreen();
     
        MarketPlace myMarket  = new MarketPlace();

        
        myMarket.add(createOffert());
        myMarket.add(createOffert());
        myMarket.add(createOffert());
        myMarket.add(createOffert());
        System.out.println( myMarket);

        SuperMarketPlace mySuperMarket = new SuperMarketPlace(myMarket);

    }
}





class Offer{
//   3. Celle-ci dispose des attributs fruits (hashmap <Enum, int>), 
// prix_unitaires (hashmap<Enum, double>), 
    // type (Enum achat ou vente)
    private HashMap <Fruit,Integer> fruitQuantity = new HashMap <Fruit,Integer> ();
    private HashMap <Fruit,Double> unitPrice = new HashMap <Fruit,Double> ();
    private OfferType offerType ;


    public Offer (HashMap <Fruit,Integer> fruitQuantity ,HashMap <Fruit,Double> unitPrice,OfferType offerType ){
        this.fruitQuantity = fruitQuantity ;
        this.unitPrice = unitPrice ;
        this.setOfferType(offerType) ;

    }
    public Offer (){
        this(new HashMap <Fruit,Integer>(),new HashMap <Fruit,Double>(),OfferType.SELLER);
    }
    public Offer (OfferType offerType){
        this(new HashMap <Fruit,Integer>(),new HashMap <Fruit,Double>(),offerType);
    }

    public void setOfferType(OfferType offerType){
        this.offerType = offerType ;
    }
    public OfferType getOfferType(){
        return this.offerType   ;
    }

    public void setFruitQuantity(HashMap <Fruit,Integer> fruitQuantity){
        this.fruitQuantity = fruitQuantity ;
    }
    public OfferType getFruitQuantity(){
        return this.fruitQuantity   ;
    }

    public void setUnitPrice(HashMap <Fruit,Double> unitPrice){
        this.unitPrice = unitPrice ;
    }
    public OfferType getUnitPrice(){
        return this.unitPrice   ;
    }


    public void addQuantity(Fruit value, int quantity){

       this.fruitQuantity.put(value,quantity);
    }
    public void addUnitPrice(Fruit value, Double price){

       this.unitPrice.put(value,price);
    }

    // 4. Créer une méthode prix_total retournant le prix total de l'offre
    public double totalPrice(){

        double valueReturn = 0  ;

        for ( Fruit fruit :fruitQuantity.keySet() ){
            int quantity = fruitQuantity.get(fruit);
            double price = unitPrice.get(fruit);
            valueReturn+= quantity*price;
        }
        return valueReturn ;
    }

    public  String toString() {
        String stringReturn = "";

        for ( Fruit fruit :fruitQuantity.keySet() ){
            int quantity = fruitQuantity.get(fruit);
            double price = unitPrice.get(fruit);
            stringReturn+= String.format ("%s [%s] %d kg 2.2f €\n",
            offerType,fruit,fruitQuantity.get(fruit),unitPrice.get(fruit));

        }

        return stringReturn;

    }
}


// 5. Créer une classe marché

class MarketPlace{
    // 6. Elle dispose d'une liste d'offre  
    
    private  ArrayList<Offer> offerList ;

    public MarketPlace() {
        this.offerList  = new ArrayList<Offer>();  ;
    }

    // 7. Ajouter les méthode ajouter_offre et lister_offre
    public void add(Offer value){

       this.offerList.add(value);
    }

    public ArrayList<Offer> getOffertList(){
        return offerList;
    }
    public void setOffertList(ArrayList<Offer> offer){
        this.offerList = offer;
    }

     public  String toString() {
        
        String stringReturn = "";

        for ( Offer offer :this.offerList ){
            stringReturn+= String.format ("<<%s>> \n",offer);

        }
        return stringReturn;



    }

}
 
// 9. Créer une classe SuperMarket (notre façade)
 
class SuperMarketPlace{

//    10. Elle dispose d'un attribut linked_market (le marché auquel il est lié)
    private MarketPlace linkedMarket ;


    public SuperMarketPlace(MarketPlace linkedMarket){
        this.setLinkedMarket(linkedMarket);

    }
    public SuperMarketPlace(){
        this(null);
    }


    public void  setLinkedMarket(MarketPlace linkedMarket){
        this.linkedMarket = linkedMarket;
    }

    public MarketPlace   getLinkedMarket(){
        return this.linkedMarket;
    }


    // 11. Ajouter la méthode find_fruit_offer( Fruit, int quantity ) et retournant une Offer la moins couteuse
    public Offer findFruitOffer(Fruit fruit, int quantity){

        Offer offerReturn = null  ;
 // 1 loop over offerList 

        for (Offer oneOffer :linkedMarket.getOffertList())
        {
// if offert is SELLER
            if (oneOffer.getOfferType== OfferType.SELLER){

//  loop over this offer to find fruit and quantiti
                int quantityToSell = oneOffer.getFruitQuantity().get(fruit){
                if (quantityToSell>=quantity){
                    if (offerReturn== null){
                        offerReturn =oneOffer ;
                    }
                    else if (
                        offerReturn.getUnitPrice().get(fruit)> 
                        oneOffer.getUnitPrice().get(fruit) ) 
                        offerReturn = oneOffer ;

                    )

                }

            }

        }

        return offerReturn;

    }
    // 12. Ajouter une méthode find_cheaper_fruit() retournant un fruit
    public Offer findCheaperFruit(){

        Fruit fruitReturn = Fruit.APPLE; 

        return fruitReturn;

    }




}

/*

    -- Préparation --
    -----------------

    1. Créer les Enum fruits et type_offre (achat ou vente) 
    2. Créer une classe Offre
    3. Celle-ci dispose des attributs fruits (hashmap <Enum, int>), prix_unitaires (hashmap<Enum, double>), type (Enum achat ou vente)
    4. Créer une méthode prix_total retournant le prix total de l'offre

    5. Créer une classe marché
    6. Elle dispose d'une liste d'offre
    7. Ajouter les méthode ajouter_offre et lister_offre

*/