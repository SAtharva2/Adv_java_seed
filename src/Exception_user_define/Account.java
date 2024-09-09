package Exception_user_define;

public class Account {
      String name;
      int acc_no;
      int balance;
      
      public Account()
      {
    	  name="abc";
    	  acc_no=1010;
    	  balance=10000;
      }
      public Account(String nm,int ano,int bal)
      {
    	  name=nm;
    	  acc_no=ano;
    	  balance=bal;
      }
      
      public void withdraw(int amt) throws LowBalanceException
      {
    	  if(balance-amt<1000)
    	  {
    		  throw new LowBalanceException("balance should be minimum 1000");
    	  }
    	  
    	  balance=balance-amt;
    	  System.out.println("Withdrawal done.\n balance left is"+ balance);
    	  
      }
      public String toString()
      {
    	  return name+" "+acc_no+" "+balance;
      }
}
