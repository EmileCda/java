package decoration ;
public abstract class  Stdio {
 
    protected String content ;

    public abstract String getContent();
    public abstract void setContent(String value);
    public abstract void add(String value);
    public abstract void  flush();
    

}
