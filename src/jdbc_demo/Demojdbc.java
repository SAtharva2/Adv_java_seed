    package jdbc_demo;
//step 1: import package

import java.sql.*;
import java.util.Scanner;

public class Demojdbc {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		//step 2: load and register driver using class.for Name() method
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		//step 3: Establish Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		System.out.println("Connection Successful");
		
		//step 4: Create Statement
		
		//Statement st=con.createStatement();
		
		//Use PreparedStatement instead of Statement
		//Accept values from User using prepare statement.
		//Here ? is to accept values
		
//		PreparedStatement st=con.prepareStatement("select * from students where stu_age=? and stu_name=? and gender=?");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter age");
//		int age=sc.nextInt();
//		System.out.println("Enter name");
//		String nm=sc.next();
//		System.out.println("Enter the gender");
//		String g=sc.next();
//		st.setInt(1,age); //1 is to match the question mark i.e 1st question mark
//		st.setString(2, nm);
//		st.setString(3,g);
		
		PreparedStatement st=con.prepareStatement("select * from students where city=?");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  city name");
		String ci=sc.next();
		st.setString(1, ci);
		
		//step 5: Process Result
		
		ResultSet rs=st.executeQuery();
		
		//step 6: Display Result
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
		rs.close();
		con.close();
	}

}
