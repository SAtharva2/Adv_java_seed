package filedemo;

import java.io.File;
import java.io.IOException;

public class Deme1 {
       public static void main(String[] args) {
		
    	   File f=new File("C:\\Users\\Shree\\Desktop\\java\\a.java");
    	   
    	   if(!f.exists())
    	   {
    		   try
    		   {
    			   f.createNewFile();
    		   }
    		   catch(IOException e)
    		   {
    			   e.printStackTrace();
    		   }
    		   System.out.println("File created  newly.");
    		   
    	   }
    	   else
    	   {
    		   System.out.println("File already present..");
    		   System.out.println("Lenght is: "+f.length());
    	   }
	}
}
