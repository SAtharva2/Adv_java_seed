package exception_practice_exampl;

public class OddNumberException extends Exception {
   String msg;
   
   public OddNumberException()
   {
	   msg="Enter even number";
   }
   
   public OddNumberException(String m)
   {
	   super(m);
	   msg=m;
   }
   
   public String getMsg()
   {
	   return msg;
   }
}

