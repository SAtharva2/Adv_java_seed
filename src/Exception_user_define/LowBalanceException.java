package Exception_user_define;

public class LowBalanceException extends Exception{
     String msg;
     
     public LowBalanceException()
     {
    	 msg="minimum balane should be maintanied";
     }
     public LowBalanceException(String m)
     {
    	 super(m);
    	 msg=m;
     }
     
     public String getmsg()
     {
    	 return msg;
     }
}
