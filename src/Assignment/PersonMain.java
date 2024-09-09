package Assignment;

public class PersonMain {
	public static void main(String args[]) {
		
		Person p1=new Person("Ram",26,"Nashik");
	    p1.printin();   
	   System.out.println("The age is"+ p1.getage());
	    p1.setName("Atharva");
	    p1.printin();
	}
     
}
