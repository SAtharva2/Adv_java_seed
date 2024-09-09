package Assignment2;

public class Product {
    private String productName;
    private double price;
    private int quantity;
    
    public Product()
    {
    	productName="Laptop";
    	price=20000;
    	quantity=50;
    }
    public Product(String prdnm,double prz,int quant)
    {
    	productName=prdnm;
    	price=prz;
    	quantity=quant;
    } 
    public void printdetails()
    {
    	System.out.println("Product details are:"+productName+" "+price+" "+quantity);
    	System.out.println("Product details parameterize:"+productName+" "+price+" "+quantity);
    }
    
    public double getprice()
    {
    	return price;
    }
    public void setproduct(String newprd)
    {
    	this.productName=newprd;
    }
}
