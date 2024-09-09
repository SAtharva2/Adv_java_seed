package jdbc_demo;
import java.sql.*;
import java.util.Scanner;

public class Collastafun {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException 
 {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver loaded");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
	System.out.println("connected");
	
	CallableStatement cst=con.prepareCall("{? = call addition(?,?)}");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st no:");
	int n1=sc.nextInt();
	
	System.out.println("Enter 2nd no:");
	int n2=sc.nextInt();
	
	cst.setInt(2, n1);
	cst.setInt(3, n2);
	
	cst.registerOutParameter(1, Types.INTEGER);
	cst.execute();
	
	System.out.println("Sum is"+cst.getInt(1));
	
	con.close();
	
 }
}
