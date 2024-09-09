package filedemo;

import java.io.File;

public class Demo {
     public static void main(String[] args) {
		
    	 File f=new File("C:\\Users\\Shree\\Desktop\\java\\a.java");
    	 
    	 String filename[]=f.list();
    	 for(String fnm:filename)
    	 {
    		 System.out.println(fnm);
    	 }
	}
}
