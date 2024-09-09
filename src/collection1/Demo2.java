package collection1;

import java.util.LinkedList;
import java.util.Queue;

public class Demo2 {
      public static void main(String[] args) {
		/*
		 * First in First out
		 */
    	  Queue q1=new LinkedList();
    	  q1.add(10);
    	  q1.add(25);
    	  q1.add(77);
    	  q1.add(5);
    	  q1.add(null);
    	  
    	  System.out.println(q1);
    	  
    	  System.out.println("peek ele: "+q1.peek());//return 10
    	  System.out.println(q1);
    	  System.out.println("poll ele: "+q1.poll());//return 10
    	  System.out.println(q1);  
	}
}
