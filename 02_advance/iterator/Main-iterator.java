import java.util.Scanner;
// import java.lang.Math;
// import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;



public class Main {

// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public static void main(String[] args) {

        char searchChar = args[0].charAt(0); 
        Scanner myScan = new Scanner(System.in);
        System.out.printf("hello de lu %c \n", searchChar);
        String[]  forenameArray= {
        "Mazarine", "Meagan", "Naïa","Tiffany","Tiger",
        "Tomo","Toni","Warren","Washington","Wasim",
        // "Firmin","Flame","Flamen","Flavia","Flavian",
        // "Fulvie","Fulvien","Fulvio","Fulvius","Furtuno",
        // "Gab","Gabin","Gabriel", "Gontrand", "Germaine",
        "Flavienne", "Gordie","Gordon","Gorka","Gottlieb"
        };


// 1. Dans le main, créer un ArrayList contenant 20 prénoms dont certains peuvent être duppliqués
        ArrayList<String> forenameList = new ArrayList<String>();

        for (String forename : forenameArray ){
            forenameList.add(forename);
        }
        //  dont certains peuvent être duppliqués (5 premiers)

        for (int index = 0 ; index < 5 ; index ++ ){
            forenameList.add(forenameArray[index]);
        }

        Iterator <String> myIterator =forenameList.iterator();

//     3. Dans le main, utiliser la méthode sur notre ArrayList
        HashSet returnHashSet = myIteratore( myIterator);

        myIterator =forenameList.iterator();
        String forenameRetourn = charFinder(myIterator, searchChar);
        System.out.printf("forename found [%s]\n",forenameRetourn);

        forenameRetourn = charFinder(myIterator, searchChar);
        System.out.printf("forename found [%s]\n",forenameRetourn);


    }
// ---------------------------------------------------------------------------------
//   2. Créer une méthode prenant en paramètre un itérateur de String et retournant un HashSet de ces chaines
    public static HashSet< String >  myIteratore(Iterator< String > myIterator){
        HashSet<String> forenameSet = new HashSet<String>();

        while (myIterator.hasNext())
        {

            // System.out.printf("myIteratore %s\n",myIterator.next());
            // forenameSet.add((String)myIterator.next());
            forenameSet.add(myIterator.next());
        }
        return forenameSet;

    }

// ---------------------------------------------------------------------------------
//     4. Créer une méthode prenant en paramètre un Itérateur de String et un caractère
//         4.1 Cette méthode devra retourner la première chaine commençant par ce caractère
    public static String  charFinder(Iterator< String >  myIterator, char searchingChar){
        boolean found = false ; 
        String  returnValue = "not Found";
        while (myIterator.hasNext() && !found)
        {
            String forename = myIterator.next();
            if (forename.charAt(0)==searchingChar)
            {
                returnValue = forename;
                found = true;
            }
        }
        return returnValue;
    }
// ---------------------------------------------------------------------------------
    public static void  template(){

    }
// ---------------------------------------------------------------------------------


}


        //     1. Dans le main, créer un ArrayList contenant 20 prénoms dont certains peuvent être duppliqués
        //     2. Créer une méthode prenant en paramètre un itérateur de String et retournant un HashSet de ces chaines
        //     3. Dans le main, utiliser la méthode sur notre ArrayList
        //     4. Créer une méthode prenant en paramètre un Itérateur de String et un caractère
        //         4.1 Cette méthode devra retourner la première chaine commençant par ce caractère
        //     5. Utiliser la méthode du (4) sur notre ArrayList avec la lettre 'R' et 'S'
        // */

