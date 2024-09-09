package p2;

public class ArrayDemo {
	public static void main(String args[])
	{
	//Types of array declaration
   int ar1[]=new int[3];
   int []ar2=new int[3];
   int []ar3=new int[] {10,20,30};
   int ar4[]= {10,20,30,50};
   
   for(int i=0;i<=ar4.length;i++)
   {
	   System.out.println(ar4[i]);
   }
   
   //for each loop(enhance for loop)
   
   for(int a: ar4)
   {
	   System.out.println(a);
   }
 }
}
