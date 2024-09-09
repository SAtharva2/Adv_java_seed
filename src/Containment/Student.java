package Containment;

public class Student {
	private int rollno;
	private String name;
    private Date dob;
    
    public Student()
    {
    	rollno=1;
    	name="Sagar";
    	dob=new Date();
    }
    
    public Student(int rollno,String name,Date db)
    {
    	this.rollno=rollno;
    	this.name=name;
    	dob=db;
    }
    
    public String toString()
    {
    	return rollno+" "+name+" "+dob+" ";
    }
}
