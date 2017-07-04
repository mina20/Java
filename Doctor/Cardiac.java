public class Cardiac extends Specialist{

         Cardiac(int id,String n,String deg,String h)		
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
        System.out.println("Known as Cardiologist");


      } 
      public void treatment()
      {

       System.out.println("I can suggest you ECG or Stress test");

      }
    
     public void speciality()

     {

      System.out.println("Heart Specialist");
     }



  }
