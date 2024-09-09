package Assignment;

public class Person {
    private String name;
    private int age;
    private String address;
    
    public Person() {
    	name="Raghav";
    	age=25;
    	address="Nashik";
    }
    
    public void printin() {
		System.out.println("Default counstructor: "+ name+age+address);
		System.out.println("Parameterize constructor: "+name+ age+ address);
		}
    //Getter method
    public int getage()
    {
    	return age;
    }
   //Parameterize Constructor 
    public Person(String nm,int ag,String addr)
    {
    	name=nm;
    	age=ag;
    	address=addr;
    }
    //Setter method
    public void setName(String newName)
    {
    	this.name=newName;
    }
    
}
