package filedemo_serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MainEmp {
   public static void main(String[] args) throws IOException {
	
	   FileOutputStream fo=new FileOutputStream("C:\\Users\\Shree\\Desktop\\java\\a.java\\students.txt");
	   ObjectOutputStream o=new ObjectOutputStream(fo);
	   
	   Manager m=new Manager(1,"atharva",90000,25000);
	   o.writeObject(m);
	   o.close(); 
	   
}
}
