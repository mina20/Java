

public class Main
{
	public static void main(String args[])
	{
		Account[] acc_details = new Account[3];
		
		acc_details[0] = new Account("Mr. Rama",5000,7092);
		acc_details[1] = new Account("Ms. Aliya",2000,6874);
		acc_details[2] = new Account("Mr. Potter", 3000,4865);

		Bank b = new Bank(acc_details);

		
		b.acc[0].transfer(b.acc[1],2000);
		
		b.acc[2].transfer(b.acc[0],1000);
		
		
		for(int i=0;i<3;i++)
		{
			b.acc[i].display();	
		}
	}
}
