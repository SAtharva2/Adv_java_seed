package jdbc_demo;

import java.sql.*;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class DemoDatabaseMetaData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		  System.out.println("driver loaded");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		  System.out.println("Connected");
		  
		  DatabaseMetaData dm=con.getMetaData();
		  
		  System.out.println("name of driver="+dm.getDriverName());
	        System.out.println("name of version="+dm.getDatabaseProductVersion());
	        System.out.println("support multiple resultsets="+dm.supportsMultipleResultSets());
	System.out.println("support multiple transactions="+dm.supportsMultipleTransactions());

	}
}
