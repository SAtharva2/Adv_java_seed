package inher_home_work;

public class SavingAccount extends BankAccount {
	private double acc_balance;
	
	public SavingAccount(int accno,double bal,double acc_balance)
	{
		super(accno,bal);
		this.acc_balance=acc_balance;
	}
	
	public void withdraw(int amount)
	{
		
		if(balance-amount>=100)
		{
//			balance=balance-amount;
			super.withdraw(amount);
		}
		else
		{
			System.out.println("\nMinimum balance should be maintained :");
		}
	}

}
