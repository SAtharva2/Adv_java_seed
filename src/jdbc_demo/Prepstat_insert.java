package jdbc_demo;

//step 1: import package

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Prepstat_insert {
	
    public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException 
    {
    	
    	//step 2: load and register driver using class.for Name() method
    			Class.forName("com.mysql.cj.jdbc.Driver");
    			System.out.println("driver loaded");
    			
     //step 3: Establish Connection
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
    	System.out.println("Connection Successful");
    	
    	PreparedStatement st=con.prepareStatement("insert into students value(?,?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String nm=sc.next();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter gender");
		String gen=sc.next();
	    
	    System.out.println("Enter city");
	    String city=sc.next();
	    
	    System.out.println("Enter date in dd/MM/yyyy");
	    String d = sc.next();

	    // Correct date format to match your input format
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    java.util.Date parsedDate = sdf.parse(d); // Parses the string date into a java.util.Date object

	    // Convert java.util.Date to java.sql.Date
	    java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());

	    // Set the date in the PreparedStatement
	    
	    
	    st.setInt(1, id);
	    st.setString(2, nm);
	    st.setInt(3, age);
	    st.setString(4, gen);
	   // st.setDate(5, date);
	    st.setDate(5, sqlDate);
	    st.setString(6, city);
	    
	    int no=st.executeUpdate();
	    System.out.println(no+"Record inserted");
	    
		con.close();
		
	  }
    			
	}

