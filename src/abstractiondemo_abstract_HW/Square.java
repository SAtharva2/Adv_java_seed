package abstractiondemo_abstract_HW;

public class Square extends GeometricShape {
       private int side;
       
       public Square()
       {
    	   side=4;
       }
       public Square(String gs,int s)
       {
    	   super(gs);
    	   side=s;
       }
       
       public void area()
       {
    	   float area=side*side;
    	   System.out.println("Area of square is: "+area);   
       }
       
       public void perimeter()
       {
//    	   int a=4;
    	   float perimeter=4*side;
    	   System.out.println("Perimeter of square is: "+perimeter);
       }
       
}
