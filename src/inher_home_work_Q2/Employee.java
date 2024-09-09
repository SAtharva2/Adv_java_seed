package inher_home_work_Q2;

public class Employee extends Person {
    private int empid;
    private String jobtitle;
    
    public Employee()
    {
    	empid=101;
    	jobtitle="Developer";
    }
    public Employee(String Firstnm,String Lastnm,int emid,String jt)
    {
    	super(Firstnm,Lastnm);
    	empid=emid;
    	jobtitle=jt;
    }
    public int getEmployeeid()
    {
    	return empid;
    }
    public String getLastName()
    {
    	return super.getLastName()+" "+jobtitle;
    }
}
