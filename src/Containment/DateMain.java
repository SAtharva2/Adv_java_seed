package Containment;

public class DateMain {
	public static void main(String args[])
	{
		Student s1=new Student();
		System.out.println(s1);
		
		
		Account a1=new Account(102,"Atharva",new Date(2,12,2012));
		
		   //OR
//		Date d=new Date()
//		Account a1=new Account(102,"Atharva",d);
		
		System.out.println(a1);
		
	}
}
