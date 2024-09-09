package collection1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeMap;

public class Demo {
       public static void main(String[] args) throws IOException
       {
    	   //Steps for implementing properties:-
//    	      1) Go to project i.e "Basic" right click -> mew->File->
//    	         File_name.properties ("properties" is extention)
    	   
//    	   Properties p=new Properties();
//    	   FileInputStream f=new FileInputStream("Login.properties");
//    	   p.load(f);
//    	   String s=p.getProperty("user");
//    	   System.out.println(s);
//    	   String s1=p.getProperty("password");
//    	   System.out.println(s1);
    	   
		
    	   //HashMap:-
    	 //duplicate key - not allowed
   		//duplicate value - allowed
   		//null key - yes
   		//null value - yes
   		//unordered
   		//unsorted
    	   
//    	   HashMap h=new HashMap();
//    	   h.put(25, 58);
//    	   h.put(null,25);
//    	   h.put(26, "bbb");
//    	   h.put(2, 2);
//    	   System.out.println(h);
//    	   //To remove 
//    	   h.remove(26);
    	   
    	  //HAshTable:- 
    	 //duplicate key - not allowed
   		//duplicate value - allowed
   		//null key - no
   		//null value - no
   		//unordered
   		//unsorted
   		// thread safe 
   		//legacy class 1.0
    	   
//    	   Hashtable ht=new Hashtable();
//    	   ht.put(25, 22);
//    	   ht.put(22, "abc");
//    	   ht.put(55, "bbb");
//    	   ht.put(7, "rrr");
//   		   ht.put(12, "aaa");
//   		   ht.put(34, "sss");
//    	   ht.put(63, 2.5);
//    	   System.out.println(ht);
//    	   System.out.println(ht.get(55));
//    	   //It will return only values
//    	   System.out.println(ht.values());
    	   
    	   
    	   //TreeMap:-
    	   
    	 //duplicate key - not allowed
   		//duplicate value - allowed
   		//null key - not allowed
   		//null value -yes
   		//sorted by key
    	   
    	   TreeMap tm1=new TreeMap();
    	   tm1.put(55, "ddd");
   		tm1.put(3, "bbb");
   		tm1.put(14, "aaa");
   		tm1.put(16, "uuu");
   		tm1.put(51, "www");
   		tm1.put(7, "rrr");
   		tm1.put(6, null);
   		tm1.put(8,  "kkk");
   		System.out.println(tm1);
   		tm1.remove(51);
   		System.out.println(tm1);
   		   
	}
}
