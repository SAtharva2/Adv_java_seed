package jdbc_assignment;

import java.sql.*;
import java.util.Scanner;

public class Qone_menudriven_progr {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		System.out.println("Connected");
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter your choice:\n1.Insert record\n2.Update Existing Record\n3.Display Table");
		int ch=sc3.nextInt();
	    //ch = 0;
		switch(ch)
		{
		 case 1:
			
		PreparedStatement pst=con.prepareStatement("insert into Actor value(?,?,?)");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter actor no.:");
		int no=sc.nextInt();
		System.out.println("Enter actor name:");
		String nm=sc.next();
		System.out.println("Enter actor salary");
		int sal=sc.nextInt();
		
		pst.setInt(1, no);
		pst.setString(2, nm);
		pst.setInt(3, sal);
		
		int num=pst.executeUpdate();
		System.out.println(num+"Record Inserted");
		break;
		
		case 2:
			
			PreparedStatement pst1=con.prepareStatement("Update Actor set Asal=? where Ano=?");
			
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter actor salary");
			int sal1=sc1.nextInt();
			System.out.println("Enter actor number");
			int n=sc1.nextInt();
			
			pst1.setInt(1, sal1);
			pst1.setInt(2, n);
			
			int num1=pst1.executeUpdate();
			System.out.println(num1+"Record Updated");
			break;
			
		case 3:
			
			Statement st= con.createStatement();
			ResultSet rs=st.executeQuery("select * from Actor");
			
			ResultSetMetaData rsm=rs.getMetaData();
			
			System.out.println("No columns are:"+rsm.getColumnCount());
			System.out.println("Column name:"+rsm.getColumnName(1));
		    System.out.println("Column name="+rsm.getColumnName(2));
			System.out.println("Column name="+rsm.getColumnName(3));
			
	}
		con.close();
		
	}
}












