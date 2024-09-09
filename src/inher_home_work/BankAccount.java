package inher_home_work;

public class BankAccount {
    private int accno;
    public double balance;
    
    public BankAccount()
    {
    	accno=20021;
    	balance=500;
    	
    }
    public BankAccount(int accno,double bal)
    {
    	this.accno=accno;
    	balance=bal;
    }
    
    public void deposit()
    {
    	double amount=200;
    	if(amount>0)
    	{
    		balance=balance+amount;
    		System.out.println("\nBalance is: "+balance);
    	}
    	else
    	{
    		System.out.println("\nEnter amoount in positive: ");
    	}
    }
    
    public void withdraw(int amount)
    {
//    	double amount=600;
    	if(amount<0 && amount>=balance)
    	{
    		System.out.println("Insufficant balance: "+balance);
    	}
    	else
    	{
    		balance=balance-amount;
    		System.out.println("Available balance is: "+balance);
    	}
    }
    public String toString()
    {
    	return accno+" "+balance;
    }
}
