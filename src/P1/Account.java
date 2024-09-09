package P1;

public class Account {
    private int accno;
    private String name;
    private double balance;
    private static float interestrate;
    static  //static intialization block
    {
    	interestrate=7.2f;
    }
    
    public Account()
    {
    	accno=101;
    	name="abc";
    	balance=10000;
    }
    
    public Account(int acno,String nm,double bal)
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
