package P1;

public class AccountMain {
	public static void main(String args[])
	{
		Account a1=new Account();
		
		Account a2=new Account(102,"bcd",20000);
		
		a1.printDetails();
		a2.printDetails();
		a1.showInterst();
	}

}
