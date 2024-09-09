package collection_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayMain {
       public static void main(String[] args) 
       {
		ArrayList a1=new ArrayList();
		a1.add(new Students());
		a1.add(new Students(1,"Atharva",98));
		a1.add(new Students(10,"pooja",88));
		a1.add(new Students(21,"Raj",75));
		a1.add(new Students(2,"Arambh",55));
		
		//System.out.println(a1);
		System.out.println("Enter your choise:\n1.Display\n2.Search\n3.Sort\n ");
		Scanner sc=new Scanner(System.in);
		int choise=sc.nextInt();
		switch(choise)
		{
		case 1:
			System.out.println("The records are: ");
			    DisplayUtil.Display(a1);
				break;
		case 2:
			SearchUtil.Search(a1);
			break;
			
		case 3:
			System.out.println("Enter your choise:\n1.Roll_No\n2.Name\n3.Marks");
			Scanner s=new Scanner(System.in);
			int ch=s.nextInt();
			switch(ch)
			{
			case 1:
				Collections.sort(a1);
			    
			    break;
			
			case 2:
				Collections.sort(a1,new SortByName());
				break;
				
			case 3:
				Collections.sort(a1,new SortByName());
				break;
				
			}
			System.out.println("After sorting:\n");
		    DisplayUtil.Display(a1);
		    break;
			    
		default:
			System.out.println("Invalid choise");
			break;
			
		}
				
	
		
		
		
		
	}
}
