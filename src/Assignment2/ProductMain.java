package Assignment2;

public class ProductMain {
   public static void main(String args[])
   {
	   Product p1=new Product("CPU",10000,20);
	   p1.printdetails();
	   System.out.println("print get: "+ p1.getprice());
	   p1.setproduct("keyboard");
	   p1.printdetails();
   }
}
