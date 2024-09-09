package jdbc_demo;

import java.io.ObjectInputStream.GetField;
import java.sql.*;


public class DemoResultSetMetaData {
 
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		  System.out.println("driver loaded");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		  System.out.println("Connected");
		  
		  Statement st=con.createStatement();
		  
		  ResultSet rs=st.executeQuery("select * from info");
		  
		  ResultSetMetaData rsm=rs.getMetaData();  //Retrieves the 
		        //number, types and properties of this ResultSet object's columns.
		  
		  System.out.println("No. of columns are:"+rsm.getColumnCount());
		  System.out.println("Column name="+rsm.getColumnName(1));
		  System.out.println("Column name="+rsm.getColumnName(2));
		  System.out.println("Column name="+rsm.getColumnName(3));
		  
		  System.out.println("=========================================================");
		  
		  int no=rsm.getColumnCount();
		  
		  for(int i=1;i<=no;i++)
		  {
			  System.out.println("Column name: "+rsm.getColumnName(i)); //1,2,3
			  System.out.println("Column name: "+rsm.getColumnDisplaySize(i));
			  System.out.println(rsm.getTableName(1));
		  }
		  
		  con.close();
		  
	}
}
