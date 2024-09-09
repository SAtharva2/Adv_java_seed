package Assignment5;

public class Address {
       private String city;
       private int pincode;
    
       public Address()
       {
    	   city="pune";
    	   pincode=411005;
       }
       
       public Address(String city,int pincode)
       {
    	   this.city=city;
    	   this.pincode=pincode;
       }
       
       public String toString()
       {
    	   return city+" "+" "+pincode;
       }
}
