package inher_object_class_equals_method;

public class MainDate {
    public static void main(String args[])
    {
    	Date d1=new Date(11,11,2010);
    	Date d2=new Date(11,11,2010);
    	System.out.println(d1);
    	System.out.println(d2);
    	if(d1==d2)
    	{
    		System.out.println("same");
    		
    	}
    	else
    	{
    		System.out.println("not same");
    	}
    }
}
