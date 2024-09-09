package jdbc_demo;

import java.sql.*;

public class Batchupdatedemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench",
				"root","W7301@jqir#");
		System.out.println("connected");
		
		Statement st=con.createStatement();
		
		st.addBatch("insert into Actor value(2,'Ram',5860000)");
		st.addBatch("insert into Actor value(3,'NTR',5850000)");
		st.addBatch("insert into Actor value(4,'Amir',6800000)");
		st.addBatch("insert into Actor value(5,'Akshay',6000000)");
		st.addBatch("update Actor set Asal=580000 where Ano=3");
		st.addBatch("delete from Actor where Ano=5");
		
		int []count=st.executeBatch();
		System.out.println(count.length+"row affected");
		con.close();
	}
}
