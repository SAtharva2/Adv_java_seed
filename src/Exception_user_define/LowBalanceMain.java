package Exception_user_define;

public class LowBalanceMain {
        public static void main(String args[])
        {
        	Account a1=new Account();
        	try {
				  a1.withdraw(9500);
			} 
        	catch (LowBalanceException e) 
        	{
				// TODO Auto-generated catch block
				//e.printStackTrace();
        		System.out.println(e.getmsg());
			}
        	
        }
        
}
