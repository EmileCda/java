import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Iterator;
import konsole.Konsole;
import packClass.Forme2D;

// ----------------------------------------------------------------------------

public class Main {

// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void main(String[] args) {
            Scanner myScan = new Scanner(System.in);
            System.out.println("hello de lu");
            Konsole.clearScreen();
            Konsole.setColor (Konsole.Color.YELLOW);
// 7. Dans le main, créer une liste de forme 3D dans laquelle on en ajoutera 5 de différent types
        ArrayList<Forme3D> forme3dList = new ArrayList<Forme3D>();

        for (int index = 0 ; index < 5 ; index ++){
            Rectangle3D  myForm = new 
            Rectangle3D(Konsole.randDouble(1,10),
                        Konsole.randDouble(1,10),
                        Konsole.randDouble(1,10),
                        ColorEnum.values()[Konsole.randInt(0,4)]
                        );
 // 6. Colorer quelques unes des formes créées dans le main

            forme3dList.add( myForm);
        }

        for (int index = 0 ; index < 5 ; index ++){
            Cylindre  myForm = new 
            Cylindre(   Konsole.randDouble(1,10),
                        Konsole.randDouble(1,10),
                        ColorEnum.values()[Konsole.randInt(0,4)]);

            forme3dList.add( myForm);
        }


// 8. Calculer et afficher le total des volumes de ces formes
        double volume = 0;
        for ( Forme3D myForm : forme3dList)
        {
            System.out.println(myForm);
            volume+= myForm.volume();
        }

        System.out.printf("total volume : %.2f\n", volume);

    }

// ---------------------------------------------------------------------------------
// 2. Créer une méthode dans Main permettant de calculer la somme des périmétres d'un ensemble de formes
// 4. Modifier les méthodes sum_perimeters, sum_surfaces et le main pour que le polymorphisme à base de Rectangle se fasse maintenant à base de Forme2D
 // 1. Créer un ensemble de 6 Rectangles ou Carrés aux cotés aléatoires (entree 2 et 10)

public static void testMainAbstract(){
        ArrayList<Forme2D> forme2dList = new ArrayList<Forme2D>();

        for (int index = 0 ; index < 15 ; index ++){
            Forme2D myForm ;

            int randForm = Konsole.randInt(0,2) ;

            switch (randForm){
                case 0 : myForm = new Rectangle(Konsole.randInt(1,10),Konsole.randInt(1,10)); break;
                case 1 : myForm = new Carre(Konsole.randInt(1,10)); break;
    // 6. Dans le main, dans la liste de formes, ajouter quelques cercles                
                default : myForm = new Cercle(Konsole.randInt(1,10)); break;
            }
            forme2dList.add( myForm);
        }

    // 4. Utiliser les méthode (2) et (3) sur notre ensemble de Rectangles et Carré (et afficher les résultats)

        int resultPerimeter = computeTotalPerimeter(forme2dList);
        int resultArea = computeTotalAera(forme2dList);
        display(forme2dList);
        System.out.printf("Total Perimeter : %d Total Area %s \n",resultPerimeter,resultArea);


}

// ---------------------------------------------------------------------------------

    public static int  computeTotalAera(ArrayList<Forme2D> formList) {
        // using iterator 
        Iterator <Forme2D> myIterator =formList.iterator();
        int returnValue = 0 ; 
        while (myIterator.hasNext())
        {
           returnValue+= myIterator.next().aire();
        }
        return returnValue; 
    }
// ---------------------------------------------------------------------------------
        // 4. Modifier les méthodes sum_perimeters, sum_surfaces et le main pour que le polymorphisme à base de Rectangle se fasse maintenant à base de Forme2D

    // 2. Créer une méthode dans Main permettant de calculer la somme des périmétres d'un ensemble de formes
    public static int  computeTotalPerimeter(ArrayList<Forme2D> formList) {
        // not using iterator : regular method
        int returnValue = 0 ; 
        for ( Forme2D myForm : formList)
        {
            returnValue+= myForm.perimetre();
        }
        return returnValue; 
    }
    // ---------------------------------------------------------------------------------
    public static void display (ArrayList<Forme2D> formList) {
        for ( Forme2D myForm : formList)
        {
            System.out.printf("%s\n",myForm);
        }
    }

// ---------------------------------------------------------------------------------

   public static void testMain() {
     // 2. Dans le main, créer un rectangle r1 de 9 de longeur et de 6 de largeur
    //     2.1 Afficher son périmétre et son aire
        Rectangle r1 = new Rectangle(9,6);

        System.out.println(r1);

        Rectangle r2 = new Rectangle(r1);
        System.out.println(r2);

        // 3.2 Créer un carré c1, de coté 12, dont on affichera le périmétre et l'aire

        Carre c1 = new Carre(12);
        System.out.println(c1);

        Carre c2 = new Carre(c1);
        System.out.println(c2);

   }
 

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}





  



// -------------------- consigne abstract -------------------
/*
    1. Créer une nouvelle classe abstraite Forme2D
    2. Lui ajouter les méthodes abstraites périmetre et aire
    3. Faire hériter Rectangle de Forme2D
    4. Modifier les méthodes sum_perimeters, sum_surfaces et le main pour que le polymorphisme à base de Rectangle se fasse maintenant à base de Forme2D
    5. Créer une nouvelle classe Cercle, non abstraite, héritant de Forme2D et disposant de l'attribut rayon
    6. Dans le main, dans la liste de formes, ajouter quelques cercles
*/



// -------------------- consigne  implement -------------------
/*
    1. Transformer la classe Forme en interface
    2. Créer une classe Forme3D implémentant l'interface Forme
    3. Ajouter l'attribut hauteur à la Forme3D
    4. Ajouter la méthodes abstraites volume
    5. Créer une classe Rectangle3D
    6. Créer une classe Cylindre

    7. Dans le main, créer une liste de forme 3D dans laquelle on en ajoutera 5 de différent types
    8. Calculer et afficher le total des volumes de ces formes
*/


//---------------------- consigne enum 
/*
     1. Créer une énumération Colors
    2. Lui ajouter 5 couleurs différentes
    3. Ajouter un attribut color à la Forme3D et lui définir une valeur par défaut
    4. Ajouter un constructeur à Forma3D permettant de spécifier une couleur (idem pour Rectangle3D et cylindre)
    5. Ajouter un setter à Forme3D permettant de changer la couleur

    6. Colorer quelques unes des formes créées dans le main
*/