package inher_super_key;

public class SalesPerson extends Employee{
	private double comm,sales_amt;
	
	public SalesPerson()
	{
		comm=0.2;
		sales_amt=300000;
	}
	public SalesPerson(int id,String nm,double sal,double cm,double slamt)
	{
		super(id,nm,sal);
		comm=cm;
		sales_amt=slamt;
	}
	public String toString()
	{
		return super.toString()+"\nSalesperson commission is:  "+comm+"\nSales amounrt is: "+sales_amt;
	}
	public double calculatecommission()
	{
		System.out.println("\nCommission of the employee is:");
		return  comm*sales_amt;
	}

}
