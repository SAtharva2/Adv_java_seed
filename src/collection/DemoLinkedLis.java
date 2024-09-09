package collection;

import java.util.LinkedList;

public class DemoLinkedLis {
     public static void main(String args[])
     {
    	 LinkedList l=new LinkedList();
    	 l.add(1);
    	 l.add("Ram");
    	 l.add("Datta");
    	 l.add(85.5);
    	 l.add(null);
    	 System.out.println(l);
    	 l.remove(3);
    	 System.out.println(l);
    	 System.out.println(l.contains("Datta"));
    	 System.out.println(l);
     }
}
