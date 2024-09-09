package jdbc_demo;

import java.sql.*;

public class Demo_Scrollable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		System.out.println("connected");
		
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
		ResultSet rs=st.executeQuery("select * from Actor");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		System.out.println("===========================================================");
	    
		//absolute :mover cursor in forward direction only and read any position
		
		rs.absolute(3); //3 is row no. 
		
		 System.out.println("record using absolute method");
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		 
		 System.out.println("============================================================");
		 //relative: moves cursor in forward and backward direction and read any 
		 //position
		 
		 
		  //-1 to read data in backward direction. reads backward from the position of
		 // the absolute method.
		 rs.relative(-1); 
		 System.out.println("recodr for relative method");
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		 
		 
		 //move cursor in forward direction in using relative method.
		 //starts from absolute method position
		 rs.relative(5);  //move cursor in any direction
		 System.out.println("forward record using relative  method");
		 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		 
		 rs.close();
		 con.close();
		
	}
}
