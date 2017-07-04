//bank account and accont transfer detail
public class BankAccount {
		
		public int account_no,account_bal,tr_amount,amount,sum;
		public String name;
                BankAccount(String n,int acc ,int accbal,int transfer,String name2,int account_no2,int amount2)
                {
		  name=n;
		  account_no = acc;
                  account_bal=accbal;	 
                  
                }
               public void setValue(String na,int a,int bal)
	       {

                 name = na;
		 account_no = a; 
                 account_bal=bal;
                 

	       }
       	
//public class Account{
                      


}
                BankAccount(int acc_2,int m)
                {
                  account_no2 = acc_2;
		  amount=m;

                } 
		public int transfer(int t,int b)
		{ 
                  
                  tr_amount = t;
                  sum =b-t; 
                  return 0;
                }
               
                public void display()
		{
                 System.out.println("Your name is :"+name);
                  System.out.println("account number is :"+account_no);
                
                  System.out.println("Your balance is : "+account_bal);
                 System.out.println("Transfer amount successfully:");
		 System.out.println("You transfer amount :"+tr_amount);
		 System.out.println("To Account:"+account_no); 
                 System.out.println("Now amount in your account is :"+sum);
                 System.out.println("Your account credited by amount:"+tr_amount);
                 System.out.println("from account:"+account_no+"Now total balance is "+account_bal+tr_amount);
                
                 }
                
                   
                   public static void main(String args[]){
                   
                   BankAccount B1 = new BankAccount("Mr.Ronak",1243,5000);
                   BankAccount B2 = new BankAccount("Mr.Sham",2354,3000);
                   B2.Bank()
                   B1.transfer(2000,5000);
                   B1.display();
                   
                    
           } 
      }          
