//

public class FBDisplay{

FBAccount F1=new FBAccount(20987,"ABC","Pune");

public void display(){

	System.out.println("Name:"+F1.displayName+"Place:"+F1.place+"birthdate:"+F1.getValue());
	

  }

public static void main(String [] args){

	FBDisplay d1 = new FBDisplay();
	d1.display();

	}


}
