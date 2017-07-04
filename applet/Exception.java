//Exception handling in java

public class Exception {
	
	public static void main(String args[])
	{

		int num1,num2;
		int num3[]=new int[5];
		    //num3[7]=9;
		try {

			num1=0;
			num2=45/num1;
			num3[7]=9;
			//System.out.println("Element is"+num3[7]);
		try {


                         num3[7]=9;
                        //System.out.println("Element is"+num3[7]);


                        }
                        catch (ArrayIndexOutOfBoundsException obj1){

                        System.out.println("Please define correct array length");
                        }

		}catch (ArithmeticException e){


		System.out.println("Error:Dont devide a number with zero");

                }




}
}
