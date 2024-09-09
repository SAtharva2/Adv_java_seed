package inheritance;

public class SavingAccount extends Account {
      private double balance;
      
      public SavingAccount()
      {
    	  balance=1200000;
      }
      public SavingAccount(double bal,int acno,String nm)
      {
    	  super(acno,nm);
    	  balance=bal;
      }
      public String toString()
      {
    	  return super.toString()+" "+balance;
      }
      
}
