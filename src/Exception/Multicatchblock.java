package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Multicatchblock {

	public static void main(String[] args) {
		
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Shree\\Desktop\\Demo.txt");
			System.out.println("reading file....");
			
			int ar[]=new int[] {10,55,21,587,25};
			for(int i)
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
