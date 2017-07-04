public class Main{



public static void main(String args[])


		{
		  Flat[] flat1=new Flat[4];
                  flat1[0]=new Flat("Mr.Suhas",101);
		  flat1[1]=new Flat("Dr.Aiman",102); 
                  flat1[2]=new Flat("Ms.Nilam",103);
                  flat1[3]=new Flat("Mr.Amol",104);  

                  Flat[] flat2=new Flat[4];

		  flat2[0]=new Flat("Dr.Peer",201);
		  flat2[1]=new Flat("Mr.Alok",202); 
                  flat2[2]=new Flat("Mr.Potter",203);
                  flat2[3]=new Flat("Mrs.Marry",204);    
                  Floor[] flor=new Floor[2];

                  flor[0]=new Floor(flat1);
                  flor[1]=new Floor(flat2);

                  Building bld=new Building(flor);

                //Building bld=new Building(flo2);
		 // for(int i=0;i<2;i++)
                  //  for(int j=0;j<4;j++)
                      	 
                     bld.flo[1].fal[2].display();   
		}
     
	    
 }

