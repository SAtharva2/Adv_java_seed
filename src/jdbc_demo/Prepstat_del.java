package jdbc_demo;
import java.sql.*;
import java.util.Scanner;

public class Prepstat_del {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("dirover loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atharvadb1","root","W7301@jqir#");
		System.out.println("Connected");
		
		PreparedStatement pt=con.prepareStatement("delete from employee where Emp_name=?");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name:");
		String nm=sc.next();
		
		pt.setString(1,nm);
		
		int no=pt.executeUpdate();
		System.out.println(no+"Record deleted");
		
		con.close();
		
		
	}
}
