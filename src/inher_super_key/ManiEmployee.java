package inher_super_key;

public class ManiEmployee {
    public static void main(String args[])
    {
    	System.out.println("Details for Developer: \n");
    	Developer d1=new Developer();
    	System.out.println(d1);
    	d1.showSalary();  //calling method showSalary()    
    	Developer d2=new Developer(102,"Atharva",800000,5,850000);
    	System.out.println(d2);
    	
    	System.out.println("==============================================================");
    	System.out.println("Details for SalesPerson: \n");
    	SalesPerson s1=new SalesPerson();
    	System.out.println(s1);
    	System.out.println("Employee No,:2\n");
    	SalesPerson s2=new SalesPerson(103,"Raghav",750000,0.2,350000);
    	System.out.println(s2);
    	System.out.println(s2.calculatecommission());
    	System.out.println("\nTotal Salary: "+s2.calculateSalary());
    	
    	System.out.println("=================================================================");
    	System.out.println("\nManager details: ");
    	Manager m1=new Manager();
    	
    			
    }
}
