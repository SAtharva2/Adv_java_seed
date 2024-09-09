package Assignment5;

public class Student {
     private int rollno;
     private String name;
     private double percentage;
     private Address adrs;
     private int day,month,year;
     public Student()
     {
    	 rollno=1;
    	 name="Anuj";
    	 percentage=75;
    	 day=5;
    	 month=3;
    	 year=2002;
    	 adrs=new Address();
     }
     public Student(int rollno,String name,double per,int day,int month,int year,Address adr)
     {
    	 this.rollno=rollno;
    	 this.name=name;
    	 percentage=per;
    	 this.day=day;
    	 this.month=month;
    	 this.year=year;
    	 adrs=adr; 
     }
     
     public String toString()
     {
    	 return "rollno is"+rollno+"\n Name is: "+name+"\n Obtained percentage is: "+percentage+" \nThe date pf birth is: "+day+"/"+month+"/"+year+"\nCurren address is:  "+adrs;
     }
}
