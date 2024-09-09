package jdbc_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Qest_six_assig {


	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		  System.out.println("driver loaded");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		  System.out.println("Connected");
		  
String qry="create table Actor(Ano int(2),Anm varchar(20),Asal int(6))";
	      
	      Statement stm=con.createStatement();
	      
	      stm.executeUpdate(qry);
	      System.out.println("table created successfully");
	      
	      PreparedStatement pst=con.prepareStatement("insert into Actor value(?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter actor no");
			int no=sc.nextInt();		
			System.out.println("enter actor name");
			String nm=sc.next();
			System.out.println("enter actor sal");
			int sal=sc.nextInt();	
			
			pst.setInt(1,no);
			pst.setString(2,nm);
			pst.setInt(3,sal);
			
			int num=pst.executeUpdate();
			System.out.println(num+" record inserted ");
			
			//String qur1="select Ano,UPPER(Anm) as Anm, UPPER(Asal) as Asal from Actor where Ano=?";
			//pst=con.prepareStatement(qur1);
			
			PreparedStatement pst1=con.prepareStatement("select Ano,UPPER(Anm) as Anm, UPPER(Asal) as Asal from Actor where Ano=?");
			pst1.setInt(1, no);
			
			ResultSet rs=pst1.executeQuery();
			while(rs.next())
			{
				System.out.println("Actor No:"+rs.getInt("Ano"));
				System.out.println("Actor name:"+rs.getString("Anm"));
				System.out.println("Actor sal"+rs.getInt("Asal"));
			}
			
	      rs.close();
	      pst1.close();
	      stm.close();
		 con.close();
		 pst.close();
		  
	}
}

