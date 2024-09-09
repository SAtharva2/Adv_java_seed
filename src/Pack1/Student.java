package Pack1;

public class Student {
      public int rollno;
      private String name;
      protected double marks;
      String address;
      
      public Student()
      {
    	  rollno=20;
    	  name="Atharva";
    	  marks=88;
    	  address="Nashik";
      }
      public Student(int rno,String nm,double m,String addr)
      {
    	  rollno=rno;
    	  name=nm;
    	  marks=m;
    	  address=addr;
    			  
      }
      public String toString()
      {
    	  return rollno+" "+name+" "+marks+" "+address;
      }
      
}
