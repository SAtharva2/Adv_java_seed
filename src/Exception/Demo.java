package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
     
	 public static void readfile() throws FileNotFoundException
	 {
		 FileInputStream f1=new FileInputStream("C:\\Users\\Shree\\Desktop\\demo.txt");
		 System.out.println("Reading file");
	 }
	 
	 public static void main(String args[])
	 {
		 try
		 {
			 readfile();
		 }
		 catch(FileNotFoundException e)
		 {
			 e.printStackTrace();
		 }
		 
		 int a=10;
		 int b=20;
		 int sum=a+b;
		 System.out.println("Addition is: "+sum);
	 }
}
