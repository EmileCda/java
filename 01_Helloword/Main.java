import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        // exempleHeritageClass();
         exercice12();
        // int result = resursive(10);
        // System.out.printf("result : %d\n",result ) ;

    }

    // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    // ---------------------------------------------------------------------------------
    public static void template() {
    }
    // ---------------------------------------------------------------------------------
    public static void exercice12() {
         Scanner myScan = new Scanner(System.in);
        // 1. Demander à l'utilisateur de fournir un nombre entier que l'on nommera n

        int n ;
        System.out.print(" n svp :" ) ;
        n= myScan.nextInt();
        int[] myIntArray = new int [n];

        // 2. Créer un Array contenant les résultats des multiplications de 3 par (0 jusqu'à n)
        //                 -> Exemple : { 0, 3, 6, 9, ... }

        for (int index = 0 ; index < myIntArray.length ; index++){
            myIntArray[index] = index *3 ; 
        }

        // 3. Afficher toutes les valeurs contenues dans ce tableau à l'aide d'un for
        System.out.printf("3. Afficher toutes les valeurs contenues dans ce tableau à l'aide d'un for\n" ) ;
        for (int index = 0 ; index < myIntArray.length ; index++){
            System.out.printf("tableau[%d] = %d\n", index,  myIntArray[index] ) ;
        }
        // 4. Modifier le (3) pour n'afficher que les valeurs paires
        int result = 0 ; 
        System.out.printf("4. Modifier le (3) pour n'afficher que les valeurs paires\n" ) ;
        for (int index = 0 ; index < myIntArray.length ; index++){
            if ((myIntArray[index]%2) ==0 ){
                System.out.printf("tableau[%d] = %d\n", index,  myIntArray[index] ) ;
                result+=myIntArray[index] ; 
            }
        }
        System.out.printf("resultat des nombre paire [%d]\n", result  ) ;
        System.out.printf("5. En faire un total des résultats au sein du même for et l'afficher\n" ) ;
        // 5. En faire un total des résultats au sein du même for et l'afficher
        result = 0 ; 
        for (int index = 0 ; index < myIntArray.length ; index++){
            result+=myIntArray[index] ; 
        }   
        System.out.printf("resultat [%d]", result  ) ;

        int valeurMin =  myIntArray[0] ;
        int valeurMax = myIntArray[0] ;
        
        for ( int myInt : myIntArray ){
            System.out.printf("for each  [%d]\n", myInt  ) ;
            if (valeurMin > myInt)
                valeurMin = myInt ;
            if (valeurMax < myInt)
                valeurMax = myInt ;
        }
        System.out.printf("valeur Min [%d]", valeurMin  ) ;
        System.out.printf("valeur Max [%d]", valeurMax  ) ;
    }
    // ---------------------------------------------------------------------------------
    public static int resursive(int iteration) {
        
        if (iteration > 0 ){
            System.out.printf("itération : %d\n",iteration ) ;
            return iteration +resursive (iteration-1);
        }else { return 0 ; }

    }
    // ---------------------------------------------------------------------------------
    public static void javaMethode() {

        MyClass myObject = new MyClass();
        myObject.myMethod();
        System.out.printf("myMethodParam : %d\n",myObject.myMethodReturn() ) ;
        myObject.myMethodParam(10);
        myObject.myMethodParam("lundi");
        String result = myObject.myMethodReturnAndParam(12,"douze");
        System.out.printf("result myMethodReturnAndParam : %s\n",result ) ;
    }
    // ---------------------------------------------------------------------------------
    public static void exercice11() {
    // 1. Créer une variable initialisée à une valeur choisie par l'utilisateur
        Scanner myScan = new Scanner(System.in);
        int UserVar ;
        System.out.print(" valeur svp :" ) ;
        UserVar= myScan.nextInt();
    // 2. Afficher un décompte de cette valeur à 0
        for (int index = UserVar; index >= 0 ; index--){
            System.out.printf(" décompte : %d\n", index ) ;
        }
    }
    // ---------------------------------------------------------------------------------
    public static void exercice10() {

        Scanner myScan = new Scanner(System.in);
        String motDePass = "";

        do {

            // 1. Demander à l'utilisateur de rentrer un mot de passe
            System.out.print("mot de pass svp :" ) ;
            motDePass = myScan.nextLine();



        }while (motDePass.compareTo("toto195")!=0 );
    // 2. Tant que le mot de passe n'est pas égal à "toto195", redemander son mot de passe à l'utilisateur

    //  3. Lorsque le mot de passe est bon, afficher "Connecté !"
        System.out.print("Connecté !" ) ;


    }
    // ---------------------------------------------------------------------------------
    public static void exercice9() {

        
        // Faire la somme d'un ensemble de nombre

        // 1. Demander à l'utilisateur combien de nombre il souhaite entrer
         Scanner myScan = new Scanner(System.in);
        System.out.print("combien de nombre souhaitez vous entrer ? :" ) ;
        int tailleTableau = myScan.nextInt();
        // 2. Créer un Array comportant assez de cases pour que l'utilisateur puisse rentrer tout ses nombres

        int[] myCalcArray = new int [ tailleTableau ] ;
        // 3. Demander à l'utilisateur de rentrer ces différents nombres un a un et les stocker dans l'Array
        int nombreIteration = 0 ; 
        while (nombreIteration <tailleTableau ){

            System.out.printf(" votre nombre nb %d ? :", nombreIteration ) ;
            myCalcArray[nombreIteration] =  myScan.nextInt();
            // myScan.nextLine();
            nombreIteration++;
        }
        // affichage de control 
        System.out.printf(" vous avez saisie\n") ;
        nombreIteration =0 ; 
        while (nombreIteration <tailleTableau ){

            System.out.printf(" nombre %d = %d \n", nombreIteration,myCalcArray[nombreIteration] ) ;
            nombreIteration++;
        }

        // somme  
        System.out.printf("Somme des valeurs") ;
        nombreIteration =0 ; 
        int resultat = 0 ; 
        while (nombreIteration <tailleTableau ){

            resultat += myCalcArray[nombreIteration];
            nombreIteration++;
        }

        System.out.printf(" resultat  %d \n", resultat ) ;

    }
    // ---------------------------------------------------------------------------------
    public static void exercice8() {


            // Attention, les n° de case sont les indexs (0 à n) //
            // 1. Créer un Array d'entiers contenant les valeurs 5, 87, -20, 17, -9 et 25
        int[] myIntArray ={5, 87, -20, 17, -9 , 25};

            // 2. Afficher les cases 3 et 5
        System.out.printf("Q2 Afficher les cases 3 : %d  et 5 %d\n",myIntArray[3],myIntArray[5]);
            // 3. Ajouter à la case 3, la valeur de la case 0
            myIntArray[3] += myIntArray[0];  //22
            
        System.out.printf("Q3 Afficher les cases 3: %d \n",myIntArray[3]);
            // 4. Soutraire à la case 5 la valeur de la case 3
            myIntArray[5] -= myIntArray[3]; // 3
        System.out.printf("Q4 Afficher les cases 5 : %d \n",myIntArray[5]);
            // 5. Afficher les cases 3 et 5
        System.out.printf("Q5 Afficher les cases 3 : %d  et 5 %d\n",myIntArray[3],myIntArray[5]);
            // 6. Multiplier la case 2 par la valeur de la case 4
            myIntArray[2] *= myIntArray[4]; // 180 
        System.out.printf("Q6 Multiplier la case 2 par la valeur de la case 2 : %d \n",myIntArray[2]);
            // 7. Afficher la case 2
        System.out.printf("Q7 Afficher les cases 2 %d\n",myIntArray[2]);


    }
    // ---------------------------------------------------------------------------------
    public static void exercice7() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("entrez votre age  :" ) ;
        int age = myScan.nextInt();
        System.out.printf("vous êtes %s \n",((age <18) ? "mineur" : "majeur"));
        myScan.close();
    }
    // ---------------------------------------------------------------------------------
    public static  void exempleHeritageClass() {
        ShoeBrand myBrand = new ShoeBrand();
        System.out.printf("marque - nom init  [%s] \n",  myBrand.getName ());
        myBrand.setName ("Ma nouvelle Marque");
        System.out.printf("marque - Nom (modifé) [%s] \n",  myBrand.getName ());
        System.out.printf("marque -  CEO [%s] \n",  myBrand.getCeoName ());
        System.out.printf("marque - nb table [%d] \n",  myBrand.getTableQuatity ());
        myBrand.setTableQuatity (125);
        System.out.printf("marque - nb table [%d] \n",  myBrand.getTableQuatity ());
        System.out.printf("marque - nb chaise [%d] \n",  myBrand.getChairQuatity ());
        myBrand.setChairQuatity (myBrand.getChairQuatity()+1);
        System.out.printf("marque - nb chaise modifé dans le père [%d] \n",  myBrand.getChairQuatity ());
        System.out.printf("marque - buldingSize [%d] \n",  myBrand.buldingSize );
        myBrand.buldingSize ++;
        System.out.printf("marque - buldingSize++ [%d] \n",  myBrand.buldingSize );

        ShoeModel myShoe = new ShoeModel();
        System.out.printf("model - Nom [%s] \n",  myShoe.getName ());
        System.out.printf("model - CEO [%s] \n",  myShoe.getCeoName ());
        System.out.printf("model - nb table [%d] \n",  myShoe.getTableQuatity ());
        System.out.printf("model - nb table hérité [%d] \n",  myShoe.getTotalTableQuatity());
        System.out.printf("model - nb chaise [%d] \n",  myShoe.getChairQuatity ());
        myShoe.setChairQuatity (992);
        System.out.printf("model - nb chaise modifé par l'enfant [%d] \n",  myShoe.getChairQuatity ());
        System.out.printf("marque - nb chaise modifé par l'enfant [%d] \n",  myBrand.getChairQuatity ());
        System.out.printf("marque - buldingSize [%d] \n",  myBrand.buldingSize );
        myBrand.buldingSize *=1000;
        System.out.printf("marque - buldingSize * 1000 [%d] \n",  myBrand.buldingSize );


    }
    // ---------------------------------------------------------------------------------
    public static  void exempleClass() {
        // constructeur sans parametres
        OtherClass monObjet = new OtherClass();
        System.out.printf("mon objet public : %d\n", monObjet.valueInClass);
        // Modification d'un attribut public
        monObjet.valueInClass ++ ;
        System.out.printf("mon objet public++: %d\n", monObjet.valueInClass);
        // System.out.printf(" mon objet prive : %d\n", monObjet.privateVar); // ne compile pas 

        System.out.printf("mon objet privé: %d\n", monObjet.getPrivateVar());
        // Modification d'un attribut private par le biais des methodes membres
        monObjet.setPrivateVar(monObjet.getPrivateVar()+10);
        System.out.printf("mon objet privé +10: %d\n", monObjet.getPrivateVar());

        // constructeur avec parametre
        OtherClass monObjet1 = new OtherClass(3,1000);
        System.out.printf("mon objet 1 public: %d\n", monObjet1.valueInClass);
        System.out.printf("mon objet 2 privé: %d\n", monObjet1.getPrivateVar());
    }
    // ---------------------------------------------------------------------------------
    public static void exercice6() {
        Scanner myScan = new Scanner(System.in);
        System.out.print("entrez votre note de Java  :" ) ;
        int javaNote = myScan.nextInt();

        switch (javaNote/5) {
            case 0:System.out.println("Très mauvais" ) ; break;
            case 1:System.out.println(" mauvais" ) ; break;
            case 2:System.out.println("Bien" ) ; break;
            default : switch(javaNote/ 18){
                case 0 :System.out.println("Trés Bien" ) ; break;
                default : System.out.println("Excellent" ) ;  break;
            }

        }
        myScan.close();
    }

    // ---------------------------------------------------------------------------------
    public static void exercice5() {
        Scanner myScan = new Scanner(System.in);
        // 1. Demander à l'utilisateur de rentrer sa note de Java en valeur numérique
        System.out.print("entrez votre note de Java  :" ) ;
        double javaNote = myScan.nextDouble();
        // 2. Afficher une phrase de réaction en fonction du niveau de cette note

        // 2.1 Si la note est strictement inférieur à 5, afficher "Trés mauvais"
        // if (Double.compare(javaNote,5)<0 ){
        if (javaNote < 5 ){
            System.out.println("Très mauvais" ) ;
        }
        // 2.2 Si la note est strictement inférieur à 10, afficher "Mauvais"
        else if (javaNote < 10 ){
        // else if (javaNote < 10.0 ){
            System.out.println("mauvais" ) ;
        }
        // 2.3 Si la note est strictement inférieur à 15, afficher "Bien"
        else if (javaNote < 15 ){
            System.out.println("Bien" ) ;
        }
        // 2.4 Si la note est strictement inférieur à 18, afficher "Trés bien"
        else if (javaNote < 18){
            System.out.println("Trés Bien" ) ;
        }else if (javaNote <=20 ){
            System.out.println("Excellent" ) ;
        }else {
            System.out.println("note hors norme" ) ;
        }
                myScan.close();

    }
    // ---------------------------------------------------------------------------------
    public static void exempleString() {

        
        String myString = "sAy SoMeThInG weird or not";          // creation 
        System.out.printf("voici la String : %s\n", myString);  // affiche la longueur
        int myStringSize = myString.length() ;
        System.out.printf("longueur : %d\n",myStringSize );  // affiche la longueur

        String myUpperString = myString.toUpperCase();
        System.out.printf("tout en majuscule  : %s\n",myUpperString );  // affiche la longueur

        String myLowerString = myString.toLowerCase();
        System.out.printf("tout en minuscule : %s\n", myLowerString);  // affiche la longueur

        String wordLoopAt = "or";
        int position = myString.indexOf(wordLoopAt);
        System.out.printf("le mot \"%s\" commence à la position : %d\n",wordLoopAt,position );  // affiche la longueur

        String prenom = "indiana";
        String nom = "jones";
        
        System.out.println("mon nom est "+ prenom + " " + nom) ;

    }
    // ---------------------------------------------------------------------------------
    public static void exercice4() {
                Scanner myScan = new Scanner(System.in);

            // 1. Demander à l'utilisateur d'entrer une première valeur entière que l'on stockera dans une variable x
        System.out.print("entrez un premier nombre entier  :" ) ;
       int variableX = myScan.nextInt();


            // 2. Lui en demande une seconde que l'on stockera dans la variable y
        System.out.print("entrez un deuxieme nombre entier  :" ) ;
       int variableY = myScan.nextInt();
        System.out.printf(" original x : %d  y : % d\n", variableX,variableY ) ;

            // 3. Inversser les deux valeurs : x doit valoir y et y doit valoir x (avec par exemple une troisième variable)
       int variableZ = variableX;
       variableX = variableY;
       variableY = variableZ;

            // 4. Afficher x et y
        System.out.printf("inversé x : %d  y : % d\n", variableX,variableY ) ;

            // 5. Réinversser les deux valeurs sans utiliser une troisième variable

       variableX = variableY + variableX;
       variableY = variableX - variableY; 
       variableX = variableX - variableY; 

            // 6. Afficher x et y

        System.out.printf("re-inversé x : %d  y : % d\n", variableX,variableY ) ;

        myScan.close();

    }
    // ---------------------------------------------------------------------------------
    public static void arrayTypeExample() {
    
        int[] bookCost = new int[7];
        String[] bookTitle = {"bootcamp at torcy","le seigneur des anneau"," star war","matrix I","matrix II" };
        String[] bookTitleVide = new String[2];
        
        bookCost[1] =10;
        bookCost[2] =87;
        bookCost[3] =99;
        bookCost[4] =499;
        bookCost[6] =699;

        int index = 0;
        System.out.printf("bookCost at index %d value : %d\n", index,bookCost[index] );
        System.out.printf("book title at index %d value : %s\n", index,bookTitle[index] );
        System.out.printf("book title at index %d value : %s\n", index,bookTitleVide[index] );

        index = 3;
        System.out.printf("bookCost at index %d value : %d\n", index,bookCost[index] );
        System.out.printf("book title at index %d value : %s\n", index,bookTitle[index] );

        bookCost[index] = 200;
        bookTitle[index] = "Matrix tout court";

        System.out.printf("bookCost at index %d value : %d\n", index,bookCost[index] );
        System.out.printf("book title at index %d value : %s\n", index,bookTitle[index] );

    }
    // ---------------------------------------------------------------------------------
    public static void exercice3() {

        // 1. Importer Scanner
        // ré"ponse : à faire en début de fichier 
        // 2. Créer un Scanner
        Scanner myScan = new Scanner(System.in);

        // 3. Demander à l'utilisateur d'entrer un premier nombre entier
        System.out.print("entrez un premier nombre entier  :" ) ;
        int premierNombre = myScan.nextInt();
        // 4. Lui en demander un second
        System.out.print("entrez un deuxieme nombre entier  :" ) ;
        int deuximeNombre = myScan.nextInt();
        // 5. Afficher le calcul et le résultat de l'addition de ces deux nombres
        System.out.printf ("resultat a+b: %d\n", premierNombre+deuximeNombre ) ;
        // 6. Demander à l'utilisateur d'entrer un caractère
        System.out.print ("entrer un caractère + return ");
        char myChar = myScan.next().charAt(0);
        // 7. Afficher le n°ASCII correspondant à ce caractère
        System.out.printf ("char %c : % d ", myChar, (int)myChar) ;
        myScan.close();

    }
    // ---------------------------------------------------------------------------------
    public static void exempleSwitch() {

        Scanner keyb = new Scanner(System.in);

        System.out.print("choix ? [1,2 ou 3] :");
        int choix = keyb.nextInt();
        switch (choix) {
            case 1:
                System.out.printf("votre choix %d \n", choix);

                break;
            case 2:
                System.out.printf("votre choix %d \n", choix);

                break;
            case 3:
                System.out.printf("votre choix %d \n", choix);

                break;

            default:
                System.out.printf("choix %d n'est pas possible\n", choix);
                break;
        }

        keyb.close();

    }


    // ---------------------------------------------------------------------------------
    public static void functionTestTernaire() {

        int myNumber = -1 ;
        System.out.printf("le nombre %d est %s\n",myNumber, exempleTernaire(myNumber));
        myNumber++;
        System.out.printf("le nombre %d est %s\n", myNumber,exempleTernaire(myNumber));
        myNumber++;
        System.out.printf("le nombre %d est %s\n", myNumber,exempleTernaire(myNumber));
    }
    // ---------------------------------------------------------------------------------
    public static String exempleTernaire(int nombre) {

        boolean testTernaire ; 
        testTernaire = (nombre >0);
        String valeurPourTrue = "supérieur à zéro";
        String valeurPourFalse = "inférieur ou égale zéro";
        return (  testTernaire ? valeurPourTrue : valeurPourFalse);
    }
    // ---------------------------------------------------------------------------------
    public static String exempleTernaire1(int nombre) {

        return ( (nombre >0) ? "supérieur à zéro" : "inférieur ou égale zéro");

    }
    // ---------------------------------------------------------------------------------

    public static void exempleIf() {
        Scanner keyb = new Scanner(System.in);

        System.out.print("age ?: ");
        int age = keyb.nextInt();

        System.out.print("nom ?: ");
        keyb.nextLine();

        String nom = keyb.nextLine();

        if (isMajeur(age)) {
            System.out.printf("l'individue %s est majeur\n ", nom);
        } else {
            System.out.printf("l'individue %s n'est pas majeur\n ", nom);

        }
        keyb.close();

    }

    public static boolean isMajeur(int age) {
        if (age > 18) {
            return true;

        } else {
            return false;

        }

    }
}


class ShoeBrand{

    public int  buldingSize =25;
    protected int  chairQuantity =25;
    private int  chairQuantityPrivate =25;
    private String  name ="brand name exemple: Adidas" ; 
    private String  ceoName = "Arthur";
    private int tableQuatity= 100;


    public String getCeoName(){
        return this.ceoName;
    }
    public void setCeoName(String value){
         this.ceoName= value;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String value){
         this.name= value;
    }

    public int getTableQuatity(){
        return this.tableQuatity;
    }
    public void setTableQuatity(int value){
         this.tableQuatity= value;
    }
    public int getChairQuatity(){
        return this.chairQuantity;
    }
    public void setChairQuatity(int value){
         this.chairQuantity= value;
    }


}

class ShoeModel extends ShoeBrand{

    private String model = "model name stan smith";
    private int tableQuatity= 3;

    public String getModel(){
        return this.model;
    }

    public void setModel(String value){
         this.model= value;
    }
    public int getTableQuatity(){
        return this.tableQuatity;
    }
    public void setTableQuatity(int value){
         this.tableQuatity= value;
    }
    public void setChairQuatity(int value){
        //  this.chairQuantity= value/2;
        //  this.chairQuantityPrivate= value;
    }


    public int getTotalTableQuatity(){
        return this.calculeTotal();
    }

    private int calculeTotal(){
        return this.tableQuatity + super.getTableQuatity();
    }
}



class  MyClass{

  static void myMethod() {
     System.out.print("mY Method dans MyClass\n" ) ;
  }
  static int myMethodReturn() {
     return 3;
  }
  static void myMethodParam(int param1) {
     System.out.printf("myMethodParam int: %d\n",param1 ) ;
  }
  static void myMethodParam(String param1) {
     System.out.printf("myMethodParam String : %s\n",param1 ) ;
  }

  static String myMethodReturnAndParam(int param1, String text) {
     System.out.printf("myMethodReturnAndParam : %d\n",param1 ) ;
     System.out.printf("myMethodReturnAndParam : %s\n",text ) ;
    
     return String.format("texte : [%s] param1 :[%d]" , text, param1);
  }


}
