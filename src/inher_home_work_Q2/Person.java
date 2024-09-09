package inher_home_work_Q2;

public class Person {
    private String FirstName;
    private String LastName;
    
    public Person()
    {
    	FirstName="Atharva";
    	LastName="Shinde";
    }
    public Person(String Firstnm,String Lastnm)
    {
    	FirstName=Firstnm;
    	LastName=Lastnm;
    }
    
    public String getFirstName()
    {
    	return FirstName;
    }
    
    public String getLastName()
    {
    	return LastName;
    }
}
