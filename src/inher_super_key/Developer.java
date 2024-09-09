package inher_super_key;

public class Developer extends Employee {
        private int no_project;
        private double project_amt;
        
        public Developer()
        {
        	no_project=2;
        	project_amt=4000000;
        }
        public Developer(int id,String nm,double sal,int no_proj,double proj_amt)
        {
        	super(id,nm,sal);
        	no_project=no_proj;
        	project_amt=proj_amt;
        }
        public void showSalary()
        {
        	System.out.println(salary);
        }
        
        public String toString()
        {
        	return super.toString()+" \nNumber of project are: "+no_project+" \nProject amount is: "+project_amt;
        }
}
