package jdbc_demo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class jdbcGUI extends JFrame {

	JButton b1,b2,b3,b4;
	JLabel l1,l2,l3;
	ResultSet rs;
	JTextField t1,t2,t3;
	Statement st;
	Connection con;
	JPanel p1,p2,p3;

	public jdbcGUI() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
	      		
			   System.out.println("Connected");
			   	st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery("select * from Actor");

		setLayout(new FlowLayout());

		p1=new JPanel(new GridLayout(3, 2));
		p2=new JPanel(new GridLayout(1, 4));
		p3=new JPanel(new GridLayout(2, 1));

		l1=new JLabel("EMPID");
		l2=new JLabel("EMPNAME");
		l3=new JLabel("SALARY");


		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		b1=new JButton("FIRST < ");
		b2=new JButton("PREVIOUS << ");
		b3=new JButton("NEXT >> ");
		b4=new JButton("LAST > ");

		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);

		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);

		p3.add(p1);
		p3.add(p2);

		add(p3);

		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try 
				{
					if(rs.first())
					{
						t1.setText( Integer.toString(rs.getInt(1)) );
						t2.setText( rs.getString(2) );
						t3.setText( Integer.toString(rs.getInt(3)) );
					}
					else
					{
						JOptionPane.showMessageDialog(jdbcGUI.this, "not found  ");
					}
				} catch (SQLException e1) {

					e1.printStackTrace();
				}
				
			}
		});
		
	

		b2.addActionListener(new  ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try 
				{
					if(rs.previous())
					{
						t1.setText( Integer.toString(rs.getInt(1)) );
						t2.setText( rs.getString(2) );
						t3.setText( Integer.toString(rs.getInt(3)) );
					}
					else
					{
						JOptionPane.showMessageDialog(jdbcGUI.this, "not found  ");
					}
				} catch (SQLException e1) {

					e1.printStackTrace();
				}

			}
		});



		b3.addActionListener(new  ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try 
				{
					if(rs.next())
					{
						t1.setText( Integer.toString(rs.getInt(1)) );
						t2.setText( rs.getString(2) );
						t3.setText( Integer.toString(rs.getInt(3)) );
					}

					else
					{
						JOptionPane.showMessageDialog(jdbcGUI.this, "next record not present !!! ");
					}

				} catch (SQLException e1) {

					e1.printStackTrace();
				}

			}
		});


		b4.addActionListener(new  ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				try 
				{
					if(rs.last())
					{
						t1.setText( Integer.toString(rs.getInt(1)) );
						t2.setText( rs.getString(2) );
						t3.setText( Integer.toString(rs.getInt(3)) );
					}
					else
					{
						JOptionPane.showMessageDialog(jdbcGUI.this, "already on last record  !!! ");
					}

				} catch (SQLException e1) {

					e1.printStackTrace();
				}

			}
		});


	   setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {

		jdbcGUI d;
		try {
			d = new jdbcGUI();
			d.setVisible(true);
			d.setSize(500,300);

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}


	}
}