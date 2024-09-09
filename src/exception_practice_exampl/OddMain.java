package exception_practice_exampl;

public class OddMain {
      public static void main(String args[])
      {
    	  Accept a1=new Accept();
    	  try
    	  {
			a1.oddnum(2);
		  }
    	  
    	  catch (OddNumberException e) 
    	  {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
    	  
      }
}
