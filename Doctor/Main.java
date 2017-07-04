public class Main{
	public static void main(String args[])
                 {
                   Doctor[] D1= new Doctor[3];
                   Specialist[] D2=new Specialist[2];
		   D1[0] = new Dentist(213,"Dr.Suhas","BDS","Max Hospital");
                   D1[1] = new Physician(431,"Dr.Aiman","MD","Plank Hospital");
                   D1[2] = new Physician(756,"Dr.Iftekhar","MBBS","Sumaya Hospital");
                   D2[0] = new Orthopaedic(609,"Dr.Aiman","MD","Shifa Hospital");
                   D2[1] = new Cardiac(321,"Dr.Atol","MD","Bajaj Hospital");
		   
                   for(int i=0;i<3;i++)
                   { 
                     D1[i].who();
                     D1[i].treatment();
                     
                   }
                    
                     
                     	
			for(int j=0;j<2;j++)
			{
                          D2[j].who();
                          D2[j].treatment();
                          D2[j].speciality();
			}
                 
                } 
 	  






}
