package abstractiondemo_abstract_HW1;

public class Athlete extends Person {
   private int weight;
   
   public Athlete()
   {
	   weight=75;
   }
   public Athlete(String lz,String ath,int wt)
   {
	   super(lz,ath);
	   weight=wt;
   }
   public void eat()
   {
	   
   }
}
