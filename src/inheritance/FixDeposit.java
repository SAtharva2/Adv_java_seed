package inheritance;

public class FixDeposit extends Account {
       private int matyear;
       private int day,month,year;
       
       public FixDeposit()
       {
    	   matyear=2010;
    	   day=2;
    	   month=5;
    	   year=2010;
       }
       public FixDeposit(int acno,String nm,int myr,int day,int month,int year)
       {
    	   super(acno,nm);
    	   matyear=myr;
    	   this.day=day;
    	   this.month=month;
    	   this.year=year;
       }
       
       public String toString()
       {
    	   return super.toString()+" "+matyear+" "+day+" "+month+" "+year;
       }
}
