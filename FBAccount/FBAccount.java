//Encapsulation in java


public class FBAccount{
	
	public String displayName;
	public String place;
	private int birthDate;

	
  FBAccount(int d,String n,String p){

        birthDate = d;
        displayName = n;
        place = p;

}
public int  getValue(){

        return(birthDate);

}
/*public  void display(String n,String p,int d){

        System.out.println("Name:"+name+"Place:"+p+"birthdate:"+d);


  }

}*/





}
