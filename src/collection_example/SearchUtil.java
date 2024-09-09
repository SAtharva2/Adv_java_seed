package collection_example;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchUtil {
     public static void Search(ArrayList a1)
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the roll no to be searched:");
    	 int rno=sc.nextInt();
    	 boolean flag=false;
    	 for(Object ob:a1)
    	 {
    		 Students s=(Students)ob;
    		 if(rno==s.rollno)
    		 {
    			 flag=true;
    			 System.out.println(s);
    			 break;
    		 }
    	 }
    	 if(flag==false)
    	 {
    		 System.out.println("Record not found!!");
    	 }
     }
}
