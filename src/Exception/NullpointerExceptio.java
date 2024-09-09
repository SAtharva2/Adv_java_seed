package Exception;

class Emp
{
	int id;
	String nm;
	public Emp()
	{
		id=101;
		nm="pooja";
	}
	public void print()
	{
		System.out.println(id+" "+nm);
	}
	
}
public class NullpointerExceptio 
{
	public static void main(String args[])
	{
		
	Emp e=null;
	//Emp e=new Emp();   This wont give exception
	try
	{
		e.print();
	}
	catch(NullPointerException e1)
	{
		e1.printStackTrace();
	}
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Sum is: "+c);
   }
}
