//2.Write a JAVA program to accept the details of student (Rno , SName , Per)  from the user and insert it into the table. (use PreparedStatement Class).


package jdbc_assignment;

import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

public class Quest_two_assign {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		System.out.println("Connected");
		
	      String qry="create table Student(Rno int(2),SName varchar(20),Per int(6))";
	      
	      Statement stm=con.createStatement();
	      
	      stm.executeUpdate(qry);
	      System.out.println("table created successfully");
	      
	      PreparedStatement pst=con.prepareStatement("insert into Student value(?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter roll_no");
			int rno=sc.nextInt();		
			System.out.println("enter surname");
			String nm=sc.next();
			System.out.println("enter percentage");
			int per=sc.nextInt();	
			
			pst.setInt(1,rno);
			pst.setString(2,nm);
			pst.setInt(3,per);
			
			int no=pst.executeUpdate();
			System.out.println(no+" record inserted successfully");
	      
	      stm.close();
		 con.close();
		
		
		
		 
	}
}
