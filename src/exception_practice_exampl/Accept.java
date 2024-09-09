

package exception_practice_exampl;

public class Accept {
     String string;
     
     public Accept()
     {
    	string="Enter Number"; 
     }
     public Accept(String str)
     {
    	 string=str;
     }
     
     public void oddnum(int num) throws OddNumberException
     {
    	 if(num%2!=0)
    	 {
    		 throw new OddNumberException("num should be even");
    	 }
    	 
    	 System.out.println("Enter number is even");
     }
     
     public String toString()
     {
    	 return string;
     }
}
