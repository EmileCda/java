import java.util.* ;


public class Main {

    public static HashSet< String > getUniques( Iterator< String > it ) {
        HashSet< String > set = new HashSet< String >();
        while( it.hasNext() ) {
            set.add( it.next() );
        }
        return set ;
    }

    public static String getFirstMatch( Iterator< String > it, char c ) {
        while( it.hasNext() ) {
            String s = it.next();
            if( s.charAt( 0 ) == c ) {
                return s ;
            }
        }
        return "" ;
    }

    public static void main( String[] args ) {

        /*
            1. Dans le main, créer un ArrayList contenant 20 prénoms dont certains peuvent être duppliqués
            2. Créer une méthode prenant en paramètre un itérateur de String et retournant un HashSet de ces chaines
            3. Dans le main, utiliser la méthode sur notre ArrayList
            4. Créer une méthode prenant en paramètre un Itérateur de String et un caractère
                4.1 Cette méthode devra retourner la première chaine commençant par ce caractère
            5. Utiliser la méthode du (4) sur notre ArrayList avec la lettre 'R' et 'S'
        */

       // Du 1 au 3
       ArrayList< String > noms = new ArrayList< String >();
       noms.add("Robert");
       noms.add("Elise");
       noms.add("Sylvie");
       noms.add("Jean");
       noms.add("Alice");
       noms.add("Robert");
       noms.add("Jean");
       noms.add("Fabrice");
       noms.add("Robert");
       noms.add("Elise");
       noms.add("Marie");

        System.out.println( 
            getUniques( noms.iterator() ) 
        );


        // 4 et 5
        Iterator< String > it = noms.iterator();
        System.out.println( getFirstMatch( it, 'R' ) );
        System.out.println( getFirstMatch( it, 'S' ) );
        System.out.println( getFirstMatch( it, 'R' ) );
        System.out.println( getFirstMatch( it, 'S' ) );

    }
}