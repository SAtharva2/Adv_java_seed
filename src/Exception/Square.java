package Exception;

import java.util.Scanner;

public class Square {
      
	public static void squarecal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
//		5
		if(num<0)
		{
			throw new ArithmeticException("!!!Number should be positive!!!");
		}
		int no_square=num*num;
		System.out.println("The square root of number is: "+no_square);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			squarecal();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		int x=10;
		int y=2;
		int sum=x+y;
		System.out.println("Addition is: "+sum);
	}

}
