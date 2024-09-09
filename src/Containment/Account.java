package Containment;

public class Account {
	private int accno;
	private String accname;
    private Date accdt;
    
    public Account()
    {
    	accno=121;
    	accname="pooja";
    	accdt=new Date();
    }
    
    public Account(int accno,String accname,Date d)
    {
    	this.accno=accno;
    	this.accname=accname;
    	accdt=d;
    }
    
    public String toString()
    {
    	return accno+" "+accname+" "+accdt+" ";
    }
}
