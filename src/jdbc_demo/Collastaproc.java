package jdbc_demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Collastaproc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		System.out.println("connected");
		
		CallableStatement cst=con.prepareCall("{call updatePrice(?,?)}");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int ag=sc.nextInt();
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		cst.setInt(1,ag);
		cst.setInt(2,id);
		
		cst.execute();
		System.out.println("Data updated");
		
		con.close();
		
		
	}
}
