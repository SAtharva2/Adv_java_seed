package jdbc_assignment;

import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class Qest_three_assig {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		  System.out.println("driver loaded");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		  System.out.println("Connected");
		  
		  Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		  
		    ResultSet rs=st.executeQuery("Select * from Actor");
		    while(rs.next())
		    {
		    	System.out.println(rs.getInt(3)+" "+rs.getString(2)+" "+rs.getInt(1));
		    }
		    
		    System.out.println("===============================================");
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter your choice:\n1.First\n2.Next Record\n3.Previous Record\n4.Last Record");
		    int ch=sc.nextInt();
		    switch(ch)
		    {
		    case 1:
		    rs.absolute(1);
		    System.out.println("this is first record");
		    System.out.println(rs.getInt(3)+" "+rs.getString(2)+" "+rs.getInt(1));
		    break;
		    
		    case 2:
		    	System.out.println("Enter the position number:");
		    	int next_no=sc.nextInt();
			    rs.absolute(next_no);
			    System.out.println("this is first record");
			    System.out.println(rs.getInt(3)+" "+rs.getString(2)+" "+rs.getInt(1));
			    break;
			    
		    case 3:
		    	System.out.println("Enter no. in -ve to search previous record:");
		    	int prev_no=sc.nextInt();
		    	rs.relative(prev_no);
		    	System.out.println(rs.getInt(3)+" "+rs.getString(2)+" "+rs.getInt(1));
			    break;
			    
		    case 4:
		    	rs.absolute(13);
		    	System.out.println(rs.getInt(3)+" "+rs.getString(2)+" "+rs.getInt(1));
		    	System.out.println("this is the lat record:");
		    	break;
		    
		    } 
		    
		    con.close();
		    rs.close();
		    
		    
	}
}












