package abstractiondemo_abstract_HW1;

public abstract class Person {
     private String lazyperson;
     private String athlete;
     
     public Person()
     {
    	 lazyperson='parth';
    	 athlete='atharva';
     }
     public Person(String lz,String ath)
     {
    	 lazyperson=lz;
    	 athlete=ath;
     }
     public String toString()
     {
    	 return "lazy person is: "+lazyperson+"\nAthlete is: "+athlete;
     }
     public abstract void eat();
     
     public abstract void exercise();
}
