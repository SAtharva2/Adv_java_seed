package inher_super_key;

public class Employee {
      private int empid;
      private String name;
      protected double salary;
      private double hra,ma,pf,pt;
      
      public Employee()
      {
    	  empid=101;
    	  name="pooja";
    	  salary=25000;
    	  hra=salary*0.20;
    	  ma=salary*0.12;
    	  pf=salary*0.3;
    	  pt=200;	  
      }
      public Employee(int id,String nm,double sal)
      {
    	  empid=id;
    	  name=nm;
    	  salary=sal;
    	  hra=salary*0.20;
    	  ma=salary*0.12;
    	  pf=salary*0.3;
    	  pt=200;	  
      }
      
      public String toString()
      {
    	  return "Employee ID is: "+empid+"\nEmployee name is: "+name+"\nSalary is: "+salary;
      }
      public double calculateSalary()
      {
    	  return salary+hra+ma+pf-pt;
      }
}
