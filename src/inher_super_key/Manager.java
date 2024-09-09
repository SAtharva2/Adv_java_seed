package inher_super_key;

public class Manager extends Employee {
	private double incentives;
	private int no_subordinates;
	
	public Manager()
	{
		incentives=3000;
		no_subordinates=2;
	}
	public Manager(int id,String nm,double sal,double incentives,int no_subordinates)
	{
		super(id,nm,sal);
		this.incentives=incentives;
		this.no_subordinates=no_subordinates;
	}
    public String toString()
    {
    	return super.toString()+" "+incentives+" "+no_subordinates;
    }
    
    public double calculateIncentives()
    {
    	return incentives*no_subordinates;
    }
}
