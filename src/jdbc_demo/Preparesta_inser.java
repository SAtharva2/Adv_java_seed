package jdbc_demo;

import java.sql.*;
import java.util.Scanner;

public class Preparesta_inser {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atharvadb1","root","W7301@jqir#");
		System.out.println("connection successful");
		
		PreparedStatement pt=con.prepareStatement("insert into employee value(?,?,?)");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String nm=sc.next();
		System.out.println("Enter the age");
		int ag=sc.nextInt();
		
		pt.setInt(1, id);
		pt.setString(2, nm);
		pt.setInt(3,ag);
		  
		int no=pt.executeUpdate();
		System.out.println(no+"Record inserted");
		
		con.close();
		
	}
}
