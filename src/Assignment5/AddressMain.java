package Assignment5;

public class AddressMain {
   public static void main(String args[])
   {
	   Address a1=new Address();
	   System.out.println(a1);
	   
	   Address a2=new Address("Nashik",422008);
	   System.out.println(a2);
	   
	   //Object creation for Student class
	   System.out.println("Details of the student are: \n");
//	   Student s1=new Student();
//	   System.out.println(s1);
	   
	  Student s1=new Student(1,"pooja",75,1,5,2001,new Address("mumbai",411002));
	  System.out.println(s1);
	   
	   //Object for Employee class
	   Employee e1=new Employee();
	   System.out.println(e1);
			   
   }
}
