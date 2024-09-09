package lambda;

public interface I1 {
          public void display();
}

class Demo implements I1
{
	public void display()
	{
		System.out.println("I am in demo: ");
	}
}

public class DemoMain
{
	public static void main(String args[])
	{
		Demo d1=new Demo();
		d1.display();
	}
}
