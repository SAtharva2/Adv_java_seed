package inheritance;

public class Developer extends Employee {
    private int no_project;
    private double project_amt;
    
    public Developer()
    {
    	no_project=2;
    	project_amt=40000;
    }
    
    public Developer(int id,String nm,double sal,int no_pro,double pro_amt)
    {
    	super(id,nm,sal);
    	no_project=no_pro;
    	project_amt=pro_amt;
    }
    
    public String toString()
    {
    	return super.toString()+" "+no_project+" "+project_amt;
    }
}
