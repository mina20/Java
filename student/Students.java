//details of students that display students information

public class Students{

	private int rollNo,entScore;
        private String name;
	Students(String n,int r,int e)
	{
	  name = n;
	  rollNo=r;
	  entcScore = e;	
	  System.out.println("Name:"+n+"rollNo:"+r+"Score:"+e);
	} 
public String getValues(){

 return(name);

}
public int getValues(){

return(rollNo);

}
public int getvalue(){

return(entScore);

}
}
