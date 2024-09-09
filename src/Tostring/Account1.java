package Tostring;

public class Account1 {
	private int accno;
    private String name;
    private double balance;
    private static float interestrate;
   
    
    public Account1()
    {
    	accno=101;
    	name="abc";
    	balance=10000;
    }
    
    public Account1(int acno,String nm,double bal)
    {
    	accno=acno;
    	name=nm;
    	balance=bal;
    }
    public static void showInterst()
    {
    	System.out.println("Interst is "+interestrate);
    }
    public void printDetails()
    {
    	System.out.println(accno+" "+name+" "+balance);
    }
    
    
}

