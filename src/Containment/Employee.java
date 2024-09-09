package Containment;

public class Employee {
  private int empid;
  private String name;
  private double salary;
  
  public Employee()
  {
	  empid=101;
	  name="pooja";
	  salary=20000;
	  
  }
  public Employee(int id,String nm,double sal)
  {
	  empid=id;
	  name=nm;
	  salary=sal;
  }
  
  public String toString()
  {
	  return empid+" "+name+" "+salary;
  }
}
