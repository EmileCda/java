import java.util.HashMap;


public class Main {
// ----------------------------------------------------------------------------
    public static int template(String reponse) {
        return 0;
    }
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
    public static void main(String[] args) {
        HashMap<String, Integer> stringIntHashmap = new HashMap<String, Integer>();

        stringIntHashmap.put("un",1);
        stringIntHashmap.put("deux",2);
        stringIntHashmap.put("trois",3);
        stringIntHashmap.put("quatre",4);
        stringIntHashmap.put("cinq",5);
        System.out.print("initila list => ");
        System.out.println(stringIntHashmap);

        stringIntHashmap.put("cinq",15);  // remplace existing key  ("cinq",5)
        System.out.print("cinq replaced => ");
        System.out.println(stringIntHashmap);

        System.out.print("value at key un => ");
        System.out.println(stringIntHashmap.get("un"));


        System.out.print("value returned when delete value at key trois => ");
        System.out.println(stringIntHashmap.remove("trois"));
        System.out.print("delete record at  key trois => ");
        System.out.println(stringIntHashmap);
        System.out.print("containt value 4 : warning it is not the key => ");
        System.out.println(stringIntHashmap.containsValue(4));
        System.out.print("containt value 1000 : warning it is not the key  => ");
        System.out.println(stringIntHashmap.containsValue(1000));

        stringIntHashmap.put("cent",100);
        System.out.print("Add cent,100 => ");
        System.out.println(stringIntHashmap);
        stringIntHashmap.clear();
        System.out.print("clear Hasmap => ");
        System.out.println(stringIntHashmap);

        stringIntHashmap.put("deux cent",200);
        stringIntHashmap.put("deux cent un ",201);
        stringIntHashmap.put("deux cent deux",202);
        stringIntHashmap.put("deux cent trois ",203);
        System.out.print("Add some Key, value toHasmap  => ");
        System.out.println(stringIntHashmap);


    }
// %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
}


