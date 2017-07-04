//Assignment1: create a bank account and transfer money from one account to other

class Account
{
	public static int var;
	private int acc_bal;
	public String name;
	public int acc_num;
	
	Account(String n,int b, int num)
	{
		name = n;
		acc_bal = b;
		acc_num = num;
	}
	
	
	
	public void transfer(Account aac_name,int amount)
	{
		
		
			this.acc_bal = this.acc_bal - amount;
			aac_name.acc_bal = aac_name.acc_bal + amount;
			System.out.println("Your Amount transfer Succesfully");	
		
	}
	
	
	void display()
	{
		System.out.println("Name:\t"+ name);
		System.out.println("Account Number:\t"+ acc_num);
		System.out.println("Account Balance:\t"+acc_bal);
	}
	
	
}
