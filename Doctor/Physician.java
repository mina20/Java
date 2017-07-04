public class Physician extends Doctor
{           
        Physician(int id,String n,String deg,String h)		
	{
             Id=id;
             name=n;
            degree=deg;
            hospital=h;

	}	 

    
      public void who() 
      {

        System.out.println("ID:"+Id);
        System.out.println("Name:"+name);
        System.out.println("Qualification:"+degree);
        System.out.println("Hospital:"+hospital);  
        System.out.println("Known as Physician");

      } 
      public void treatment()
      {

       System.out.println("I treat general disease");

      }


}
