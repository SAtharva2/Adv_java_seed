package abstractiondemo_abstract_HW;

public class Maingeometry {
    public static void main(String args[])
    {
    	//Calling default constructor
//    	Triangle t1=new Triangle();
//    	t1.show();
//        t1.area();
//        t1.perimeter();
    	
        //calling parameterize constructor
        Triangle t2=new Triangle("Triangle",8,9);
        t2.show();
        t2.area();
        t2.perimeter();
        System.out.println("==========================================");
        
        //Calling default constructor
//        GeometricShape g=new Square();
//        g.area();
//        g.perimeter();
        
        //Calliing paremeterize constructor
        GeometricShape g1=new Square("Square",3);
        g1.show();
        g1.area();
        g1.perimeter();
    }
}
