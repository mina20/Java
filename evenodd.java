//wap to identify even odd numbers

public class evenodd
	{
		public static void main(String[] str)
		{
		 int i;
		 for(i=0;i<=20;i++)
		   System.out.println(check(i));
                 }
	         public static String check(int i){
		
			if(i%2==0)		
                   	          return("Even");
                        else
                                  return("Odd"); 
                  }
          }
