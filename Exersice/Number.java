//

public class Number{

	static int num=20;
	public int j,k,i;
//public static void main(String [] args){        
public int even(){
System.out.println("Even:\t");
for(int i=1;i<=num;i++)
        {
	
		if(i%2==0){		
	        //j=i;
	System.out.println(i);
	}
}
return(i);         
}
public int odd(){
System.out.println("Odd:\t");
for(int i=1;i<=num;i++){
  	if(i%2==1)
 System.out.println(i);
	}
return(i);
}



public static void main(String [] args){

	Number N = new Number();
 	N.even();
	N.odd();
}
}

