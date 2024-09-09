package jdbc_demo;


		import java.awt.FlowLayout;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		import java.sql.Blob;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;

		import javax.swing.ImageIcon;
		import javax.swing.JButton;
		import javax.swing.JFrame;
		import javax.swing.JLabel;
		import javax.swing.JOptionPane;

		//blob demo
		 
		//create table product_img1(pname varchar2(30),photo BLOB);


		public class BLobImage extends JFrame{

			JButton b1,b2;
			JLabel l1;
			Connection con;
			String url;
			public BLobImage() throws ClassNotFoundException, SQLException
			{
				b1=new JButton("Insert");
				b2=new JButton("Display");
				l1=new JLabel();
				add(b1);
				add(b2);
				add(l1);
				setLayout(new FlowLayout());
				setVisible(true);
				setSize(1000, 1000);
				

				//2. Load or register driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
					
				//oracle.jdbc.OracleDriver
				System.out.println("Driver loaded...");
				
				//3. Establish connection
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_workbench","root","W7301@jqir#");
				System.out.println("Connected...");
				
//				String qry="create table product(Img_no int(2),Img_nm varchar(20))";
//			      
//			      Statement stm=con.createStatement();
//			      
//			      stm.executeUpdate(qry);
//			      System.out.println("table created successfully");
				
				b1.addActionListener(new ActionListener() {   
					
					public void actionPerformed(ActionEvent e) {
						PreparedStatement ps;
						try {
							
							System.out.println("in insert ");
							ps = con.prepareStatement("insert into product values(?,?)");
							ps.setString(1,"camera"); //like ps.setInt();
							System.out.println("inserted ");
							FileInputStream fin=new FileInputStream("C:\\foog.jpg");  
							ps.setBinaryStream(2,fin,fin.available());  
							int i=ps.executeUpdate();  
							JOptionPane.showMessageDialog( BLobImage.this, i+" record inserted");
							
						} catch (Exception e1) {
							
							e1.printStackTrace();
						
						}
						
						
					}
				});
				
				b2.addActionListener(new ActionListener() {
					
					
					public void actionPerformed(ActionEvent e) {
					try
					{
						Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE); 	
						ResultSet rs=stmt.executeQuery("select Img_no,Img_nm from product");
							
						rs.last();
						Blob b1=rs.getBlob(2); 
						byte barr[]=b1.getBytes(1, (int)b1.length());
									
						l1.setIcon(new ImageIcon(barr));
						
						
					} catch (Exception e1) {
						
						e1.printStackTrace();
					
					}
						
					}
				});
				
			}
			
			
			
			
			public static void main(String[] args) throws ClassNotFoundException, SQLException 
			{
				BLobImage d=new BLobImage();
				d.setVisible(true);
				d.setSize(400, 400);
			}
			
		}
	


