package abstractiondemo;

public abstract class Shape {
     String scolor;
     
     public Shape()
     {
    	 scolor="white";
     }
     
     public Shape(String sc)
     {
    	 scolor=sc;
     }
     public String getscolor()
     {
    	 return scolor;
     }
     
     public abstract void draw();
     
     public void fillcolor()
     {
    	 System.out.println("fill with "+scolor+ "color");
     }
}
