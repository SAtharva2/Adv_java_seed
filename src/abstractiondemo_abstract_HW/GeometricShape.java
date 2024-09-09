//Write a Java program to create an abstract class GeometricShape with abstract methods area() and
//perimeter(). Create subclasses Triangle and Square that extend the GeometricShape class and implement the
//respective methods to calculate the area and perimeter of each shape.

package abstractiondemo_abstract_HW;

public abstract class GeometricShape {
       private String gshape;
       
       public GeometricShape()
       {
    	   gshape="geometric";
       }
       public GeometricShape(String gs)
       {
    	   gshape=gs;
       }
       public String toString()
       {
    	   return gshape;
       }
       public abstract void area();
       
       public abstract void perimeter();
       
       public void show()
       {
    	   System.out.println("The "+gshape+" shape are: ");
       }
}
