package inheritance;

public class Account {
     private int accno;
     protected String name;
     
     public Account()
     {
    	 accno=1010;
    	 name="Atharva";
     }
     public Account(int acno,String nm)
     {
    	 accno=acno;
    	 name=nm;
     }
     
     public String toString()
     {
    	 return accno+" "+name;
     }
}
