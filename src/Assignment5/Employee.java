package Assignment5;

import Containment.Date;

public class Employee {
      private int empid;
      private String name;
      private int salary;
      private Date dob;
      
      public Employee()
      {
    	  empid=101;
    	  name="pooja";
    	  salary=20000;
    	  dob=new Date();
      }
      
      public Employee(int empid,String name,int salary,Date d)
      {
    	  this.empid=empid;
    	  this.name=name;
    	  this.salary=salary;
    	  dob=d;
      }
      
      public String toString()
      {
    	  return "\nEmploye_id is: "+empid+"\nName of employee is: "+name+"\nSalary of the employee is: "+salary+"\nDate of birth is: "+dob;
      }
}
