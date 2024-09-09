package inher_home_work;

public class MainBank {

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		System.out.println(b1);
		b1.deposit();
     	b1.withdraw(600);
     	
		SavingAccount s1=new SavingAccount(2002,500,500);
		s1.withdraw(600);
		   

	}

}
