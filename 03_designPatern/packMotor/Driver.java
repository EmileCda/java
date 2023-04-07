package packMotor; 
    // 11. Créer une classe Conducteur possédant les attributs nom, permis_a (bool), permis_b (bool), annees_exprience (int)

public class Driver {

    private String name;
    private boolean licenceA ;
    private boolean licenceB ;
    private int yearPractice;


    public Driver(String name,boolean licenceA,boolean licenceB ,int yearPractice){

        this.setName(name);
        this.setLicenceA(licenceA);
        this.setLicenceB(licenceB);
        this.setYearPractice(yearPractice);

    }



    public void setName(String value){
        this.name = value;

    }

    public String getName(){
        return this.name ;

    }

    public void setLicenceA(boolean value){
        this.licenceA = value;

    }

    public boolean getLicenceA(){
        return this.licenceA ;

    }
    public void setLicenceB(boolean value){
        this.licenceB = value;

    }

    public boolean getLicenceB(){
        return this.licenceB ;

    }
    public void setYearPractice(int value){
        this.yearPractice = value;

    }

    public int getYearPractice(){
        return this.yearPractice ;

    }

      public String toString(){

        return String.format(" %s A: %s B:%s %d years", 
                this.getName(),
                this.getLicenceA(),
                this.getLicenceB(),
                this.getYearPractice());

      }

}
