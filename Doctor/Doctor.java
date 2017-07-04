

abstract public class Doctor
 {
   
    protected String name;

    protected int Id;

    protected String degree;

    protected String hospital;

    public abstract void who();

    public abstract void treatment();        

    public void setValue(int id,String n,String deg,String h)
 
    {

       Id=id;
       name=n;
       degree=deg;
       hospital=h;
   
    } 


     


 }






