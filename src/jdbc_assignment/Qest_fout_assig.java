//4. Write a JAVA program to accept the empno from the user and update the salary 
//of employee and display the updated Record on the screen. Employee having fields
//empno , ename and salary.    


package jdbc_assignment;
import java.sql.*;
import java.util.Scanner;
import com.mysql.cj.protocol.Resultset;
public class Qest_fout_assig {







	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
		System.out.println("Connected");
		
//		String qry="create table Employee(Eno int(2),EName varchar(20),Esalary int(6))";
//	      
//	      Statement stm=con.createStatement();
//	      
//	      stm.executeUpdate(qry);
//	      System.out.println("table created successfully");
//	      
	      PreparedStatement pst=con.prepareStatement("insert into Employee value(?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter eno");
			int eno=sc.nextInt();		
			System.out.println("enter ename");
			String enm=sc.next();
			System.out.println("enter emp salary");
			int sal=sc.nextInt();	
			
			pst.setInt(1,eno);
			pst.setString(2,enm);
			pst.setInt(3,sal);
			
			int num=pst.executeUpdate();
			System.out.println(num+" record inserted successfully");
			
			System.out.println("To Update record");
			
			PreparedStatement pst1=con.prepareStatement("update Employee set Eno=? where Esalary=?");
			
			System.out.println("enter emplyee no");
			int no=sc.nextInt();	
			System.out.println("enter employee sal");
			int esal=sc.nextInt();
		
			pst1.setInt(1,no);
			pst1.setInt(2,esal);
			
			
			int num1=pst1.executeUpdate();
			System.out.println(num1+" record updated successfully");
			
			
			//Display result 
			 ResultSet rs=pst1.executeQuery();
			 
			 while(rs.next())
			 {
				 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			 }
	      
			 rs.close();
	      //stm.close();
		 con.close();
		 pst.close();
		 pst1.close();
		
	}
}
