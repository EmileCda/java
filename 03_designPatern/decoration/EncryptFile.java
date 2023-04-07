package decoration ;
import decoration.Stdio; 
import java.util.Scanner;

public class EncryptFile extends Stdio {

    private int offset ;
    private int originOffset ;
    private boolean isDecode ;
    private Scanner myScan ;
    
    
    public EncryptFile(int offset,Stdio file){
        this.myScan = new  Scanner(System.in);
        this.setOffset(offset);
        this.setContent(file.getContent());
        this.setIsDecode(false);

    }

    public EncryptFile(){
        this(10,new EncryptFile());
    }
    public EncryptFile(int offset){
        this(offset,new EncryptFile());
    }
    public EncryptFile(Stdio file){
        this(0,file);
    }

    public boolean isDecode(){
        return this.isDecode ;
    }

    public void  unLock(int code){
        this.setIsDecode (this.getOriginOffset()==code) ;
    }

    public boolean getIsDecode(){
        return this.isDecode ;
    }
    public void setIsDecode(boolean value){
        this.isDecode = value;
    }
    public int getOffset(){
        return this.offset ;
    }
    public void setOffset(int value){
        this.setOriginOffset(value);
        int plage = value%92  ;
        this.offset = plage ;

    }
    public int getOriginOffset(){
        return this.originOffset ;
    }
    public void setOriginOffset(int value){
        this.originOffset = value;
    }
    public  String  getContent(){
        return this.content ;
    }
    public  String  getDecodeContent(){
        return decode(this.content) ;
    }

    public  void  setContent(String value){

        this.content = this.encode(value) ;
    }

    public  void  add(String value){

       this.content += this.encode( value) ;

    }

    public  void  flush(){

        this.setContent("");
    }


  public String encode(String value){

        String valueReturn = "";
        for (int index = 0 ; index < value.length(); index ++)
        {
            int asciiValue= (int) value.charAt(index) ;
            if (asciiValue>=32 && asciiValue<=127){
                 asciiValue= asciiValue+ getOffset() -32 ;
                asciiValue= (asciiValue + 92)%92;
                asciiValue+=32;
                valueReturn += (char) asciiValue ; 
            }else
                valueReturn +=  value.charAt(index); 

        }
        return valueReturn;
    }


    public String decode(String value){

        String valueReturn = "";
        for (int index = 0 ; index < value.length(); index ++)
        {
            int asciiValue= (int) value.charAt(index) ;
            if (asciiValue>=32 && asciiValue<=127){
                asciiValue= asciiValue+- getOffset() -32 ;
                asciiValue= (asciiValue + 92)%92;
                asciiValue+=32;
                valueReturn += (char) asciiValue ; 

            }else
                valueReturn += value.charAt(index) ; 
        }
        return valueReturn;
    }


   
    public String toString(){

        String returnValue ; 
        if (this.isDecode()){
            this.setIsDecode(false);
            returnValue =   String.format("{%s}[%s]", 
                                this.getClass(),
                                this.getDecodeContent());
        }
        else
            returnValue =   String.format("{%s}[%s]", 
                                this.getClass(),
                                this.getContent());

        return returnValue ; 
    }


}
   