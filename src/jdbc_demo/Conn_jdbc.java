package jdbc_demo;
//step 1: import java pava.sql.* package
import java.sql.*;

public class Conn_jdbc {
	
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	  //step 2: load & register driver using  class.forName() 
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  System.out.println("Driver loaded");
	  
	  //step 3: Establish connection
	  
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
	  System.out.println("Connected");
	  
	  //step 4: create statement 
	  
	  Statement st=con.createStatement();
	  
	  
	  //step 5: process result
	  
	  ResultSet rs=st.executeQuery("select * from students");
	  
	  while(rs.next())
	  {
		  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
	  }
	  
	  rs.close();
	  con.close();
	  
	  
}
}
