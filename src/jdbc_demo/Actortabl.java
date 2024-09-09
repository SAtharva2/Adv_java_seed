package jdbc_demo;

import java.sql.*;

public class Actortabl {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		System.out.println("connected");
		
		String qur="create table actor(Ano int, Aname varchar(20),Asalary int";
		String qur1=""
	}
}
