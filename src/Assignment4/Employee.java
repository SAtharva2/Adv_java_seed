//Program to generate Employee id of a employee randomly just by creating instance
//or object of class.

package Assignment4;

public class Employee {
   private int empid;
   private String name;
   private double salary;
   public static int id; //created this static method to intialize empid randomly
   
   public Employee()
   {
	   id++;
	   empid=id;
	   name="pooja";
	   salary=20000;
   }
   
   public Employee(String nm,double sal)
   {
	   id++;
	   empid=id;
	   name=nm;
	   salary=sal;
   }
   
   public String toString()
   {
	   return empid+" "+name+" "+" "+salary;
   }
}
