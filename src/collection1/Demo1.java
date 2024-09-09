package collection1;

import java.util.PriorityQueue;
import java.util.Queue;

//Queue Priority Queue
public class Demo1 {
    public static void main(String[] args) {
		
    	/* peek element display on priority which element is smaller
    	 * null not allowed
    	 */
    	Queue q=new PriorityQueue(); 
    	q.add(20);
    	q.add(9);
    	q.add(25);
    	q.add(4);
    	q.add(56);
    	
    	System.out.println("peekele: "+q.peek()); //return 4
    	System.out.println(q);
    	
    	System.out.println("poll elements:"+ q.poll()); //return 4 and remove 4
    	System.out.println(q);
    	
    	System.out.println("poll element is: "+q.poll());
    	System.out.println(q);
    	
    	
	}  
}
