package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoArrayLis {
     public static void main(String args[])
     {
    	 ArrayList a1=new ArrayList();
    	 a1.add(5);
    	 a1.add("atharva");
    	 a1.add('g');
    	 a1.add(5.2);
    	 a1.add(8.56f);
    	 a1.add(null);
    	 System.out.println(a1);
    	 a1.remove(3);
    	 System.out.println(a1);
    	 a1.removeAll(a1);
//    	 System.out.println(a1);
    	 
    	 
    	 LinkedList l2=new LinkedList();
    	 l2.add(1);
    	 l2.add("Ram");
    	 l2.add("Datta");
    	 l2.add(85.5);
    	 l2.add(null);
    	 l2.addAll(a1);
    	 System.out.println(l2);
     }
}
