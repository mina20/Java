public class Orthopaedic extends Specialist
{
        Orthopaedic(int id,String n,String deg,String h)		
	{
             Id=sp;
             name=n;
            degree=deg;
            hospital=h;


	}	 



  public void who() 
      {
        System.out.println("ID:"+sp);
        System.out.println("Name:"+name);
        System.out.println("Qualification:"+degree);
        System.out.println("Hospital:"+hospital);  
        System.out.println("Known as Orthopaedic");

      } 
      public void treatment()
      {

       System.out.println("I can suggest you X-ray and inspect it");

      }
    
     public void speciality()

     {

      System.out.println("Bone Specialist");
     }


 }

