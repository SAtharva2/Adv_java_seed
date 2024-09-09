package reflection;

public class Emp {
      private int empid_private;
      String ename_default;
      public int ek_public;
      protected int ey_protected;
      
      public Emp()
      {
    	  
      }
      public Emp(int empid,String name)
      {
    	  
      }
      public String toString()
      {
    	  return "Emp "+empid_private;
      }
      public void showemp_public()
      {
    	  System.out.println(toString());
      }
      public void displayemp_protected()
      {
    	  
      }
}
