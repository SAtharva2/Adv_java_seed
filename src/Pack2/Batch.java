package Pack2;
import Pack1.Student;

public class Batch {
     private int batchno;
     
     public Batch()
     {
    	 batchno=1;
     }
     public Batch(int btno)
     {
    	 batchno=btno;
     }
     public String toString()
     {
    	 return "The batch number is :"+batchno;
     }
     public static void main(String args[])
     {
    	 Student s=new Student();
    	 System.out.println(s);
    	 
    	 Batch b=new Batch();
    	 System.out.println(b);
     }
}
