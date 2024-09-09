package abstractiondemo_abstract_HW;

public class Triangle extends GeometricShape {
     private int base;
     private int height;
     
     public Triangle()
     {
    	 base=10;
    	 height=3;
     }
     
     public Triangle(String gs,int b,int he)
     {
    	 super(gs);
         base=b;
         height=he;
     }
     
     public void area()
     {
    	 final float half=0.5f;
    	 float area=half*base*height;
    	 System.out.println("Area of triangle is :"+area);
     }
     public void perimeter()
     {
    	 int a,b,c;
    	 a=5;
    	 b=7;
    	 c=7;
    	 float perimeter=a+b+c;
    	 System.out.println("Perimeter of triangle is: "+perimeter);
     }
     
}
