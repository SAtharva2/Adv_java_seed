//5.Write a JAVA program to accept the details of Patient (pno , pname) from the 
//user and insert it into the database , display it and delete the record of 
//entered pno from the table.    



package jdbc_assignment;

import java.sql.*;
import java.util.Scanner;

public class Qest_five_assig {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		System.out.println("Connected");
		
		String qry="create table Patient(pno int(2) , pname varchar(20)) ";
		
		Statement st=con.createStatement();
		st.executeUpdate(qry);
		System.out.println("Table created");
		
		 
	   
		PreparedStatement pst=con.prepareStatement("insert into Patient value(?,?)");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter patient number");
		int pno=sc.nextInt();
		System.out.println("Enter patient name");
		String pnm=sc.next();
		
		pst.setInt(1, pno);
		pst.setString(2, pnm);
		
		int num=pst.executeUpdate();
		System.out.println(num+"Record insertd");
		
		PreparedStatement pst1=con.prepareStatement("delete from Patient where pno=?");
		
		System.out.println("Enter patient no.");
		int no=sc.nextInt();
		
		pst1.setInt(1, no);
		
		int num1=pst1.executeUpdate();
		System.out.println(num1+"Record deleted");
		
		pst.close();
		con.close();
		st.close();
		
	      
		
		
		
	}
}

















