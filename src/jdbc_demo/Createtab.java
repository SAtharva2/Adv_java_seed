package jdbc_demo;

import java.sql.*;
import java.util.Scanner;

public class Createtab {

	  public static void main(String[] args) throws ClassNotFoundException, SQLException 
	  {
		
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  System.out.println("driver loaded");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		  System.out.println("Connected");
		  
String qry="create table info(eid int(2),enm varchar(20),sal int(6))";
	      
	      Statement stm=con.createStatement();
	      
	      stm.executeUpdate(qry);
	      System.out.println("table created successfully");
	      
	      PreparedStatement pst=con.prepareStatement("insert into info value(?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter eid");
			int eid=sc.nextInt();		
			System.out.println("enter ename");
			String enm=sc.next();
			System.out.println("enter sal");
			int sal=sc.nextInt();	
			
			pst.setInt(1,eid);
			pst.setString(2,enm);
			pst.setInt(3,sal);
			
			int no=pst.executeUpdate();
			System.out.println(no+" record inserted successfully");
	      
	      stm.close();
		 con.close();
	}
}
		  
//		  String qry="create table info(eid int,enm varchar(20),sal int";
//		  
//		  Statement stm=con.createStatement();
//		  stm.executeUpdate(qry);
//		  System.out.println("Table created");
//		  
//		  PreparedStatement pst=con.prepareStatement("insert into info value(?,?,?)");
//		  
//		  Scanner sc=new Scanner(System.in);
//		  System.out.println("Enter emp id");
//		  int id=sc.nextInt();
//		  System.out.println("Enter emp name");
//		  String nm=sc.next();
//		  System.out.println("Enter emp salary");
//		  int sal=sc.nextInt();
//		  
//		  pst.setInt(1, id);
//		  pst.setString(2, nm);
//		  pst.setInt(3, sal);
//		  
//		  int no=pst.executeUpdate();
//		  System.out.println(no+"Record inserted");
//		  
//		  stm.close();
//		  con.close();

		  

