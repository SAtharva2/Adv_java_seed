package inher_object_class_equals_method;

public class Date {
	private int day,month,year;
	 
	public Date()
	{
		day=10;
		month=10;
		year=2010;
	}
	public Date(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}
	public String toString()
	{
		return day+"/"+month+"/"+year;
	}
	 
}
