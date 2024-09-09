package abstractiondemo;

public class Circle extends Shape{
    float radius;
    
    publi Circle()
    {
    	radius=2.3f;
    }
    public Circle(float rad,String sc)
    {
    	super(sc);
    	radius=rad;
    }
    public void calculatearea()
    {
    	final float PI=3.142f;
    	float area=PI*radius*radius;
    	System.out.println("The area of circle is:"+area);
    }
    
    public void draw()
    {
    	System.out.println("We will draw a white circle: ");
    }
}
