package Containment;

public class Date {
  private int day,month,year;
  
  public Date() {
	  day=1;
	  month=10;
	  year=2010;
	  
  }
  
  public Date(int day,int month,int year)
  {
	  this.day=day;
	  this.month=month;
	  this.year=year;
  }
  
  public String toString()
  {
	  return day+"/"+month+"/"+year;
  }
}
