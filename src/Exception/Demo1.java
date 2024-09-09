package Exception;

public class Demo1 {
      public static void main(String args[])
      {
    	  int ar[]=new int[] {10,20,50,87};
    	  try
    	  {
    		  for(int i=0;i<5;i++)
    		  {
    			  System.out.println(ar[i]);
    		  }
    	  }
    	  catch(ArrayIndexOutOfBoundsException e)
    	  {
    		  e.printStackTrace();
    	  }
    	  int a=10;
    	  int b=20;
    	  int c=a+b;
    	  System.out.println("Sum is: "+c);
      }
}
