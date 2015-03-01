import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.sql.*;
import java.sql.Connection.*;
import java.sql.DriverManager.*;
class Gmail
{
	JFrame jfrm;
	JPanel panel;
	JTable jtab;
	JButton jbn,jbn1;
	JLabel jlab1,jlab2,jlab3,jlab4,jlab5,jlab6,jlab7,jlab8,jlab9,jlab10,jlab11,jlab12,jlab13;
	JTextField jtx1,jtx2,jtx3,jtx4,jtx5,jtx6,jtx7,jtx8,jtx9,jtx10,jtx11;
	DefaultTableModel model;
	Image img;

	
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(
						new Runnable()
						{
							public void run()
							{
							Gmail p=new Gmail();
								p.create();
							}	
				        }	
						);
	}
	public void create()
	{
			jfrm  = new JFrame(" ............database ...........");
			jfrm.setSize(1600,1600);
			jfrm.setDefaultCloseOperation(jfrm.EXIT_ON_CLOSE);
			jfrm.setVisible(true);	
			jfrm.setLayout(null);
			
			
		  	  panel = new JPanel();
			panel.setLayout(null);
			//jfrm.add(new JScrollPane(panel),BorderLayout.CENTER);
			panel.setBounds(0,0,1500,1500);
			
			
			jlab12=new JLabel(new ImageIcon("download.png"));
			jlab12.setBounds(170,20,15,60);
			panel.add(jlab12);
			//panel.setBackground(Color.black);
			
			
			panel.setPreferredSize(new Dimension(1600,1600));
				
			jlab1=new JLabel("Name");
			jlab1.setBounds(650,150,150,20);
			panel.add(jlab1);
			
			jtx1= new JTextField("First ");
			jtx1.setBounds(650,180,150,30);
			panel.add(jtx1);
	
			jtx2= new JTextField("Last ");
			jtx2.setBounds(820,180,150,30);
			panel.add(jtx2);
			
			jlab2=new JLabel("Choose Your username");
			jlab2.setBounds(650,230,150,20);
			panel.add(jlab2);
			
			jtx3= new JTextField("                                  \t @gmail.com ");
			jtx3.setBounds(650,260,820-650+150,30);
			panel.add(jtx3);
			
			jlab3=new JLabel("Choose Your password");
			jlab3.setBounds(650,310,150,20);
			panel.add(jlab3);
			  
			jtx4= new JTextField("                  ");
			jtx4.setBounds(650,340,820-650+150,30);
			panel.add(jtx4);
			
			jlab4=new JLabel("confirm Your password");
			jlab4.setBounds(650,390,150,20);
			panel.add(jlab4);
			
			jtx5= new JTextField("                  ");
			jtx5.setBounds(650,420,820-650+150,30);
			panel.add(jtx5);
			//jtx5.setBackground(Color.RED);
			
			jlab5=new JLabel("BirthDay");
			jlab5.setBounds(650,470,150,20);
			panel.add(jlab5);
			
			final String subject[] = {"JANUARY", "FABUARY", "MARCH", "APRIL","MAY","JUNE","JULY","SEPTEMBER","OCTOMBER","NOVMBER","DECEMBER"};
			 final JComboBox list = new JComboBox(subject);
			list.setBounds(650,500,100,30);
			panel.add(list);
			
			jtx6= new JTextField("DAY      ");
			jtx6.setBounds(770,500,50,30);
			panel.add(jtx6);
			
			jtx7= new JTextField("YEAR      ");
			jtx7.setBounds(840,500,130,30);
			panel.add(jtx7);
			
			jlab6=new JLabel("Gender");
			jlab6.setBounds(650,550,150,20);
			panel.add(jlab6);
			
			final String subject1[] = {"MALE","FEMALE","OTHER"};
			final JComboBox list1 = new JComboBox(subject1);
			list1.setBounds(650,580,820-650+150,30);
			panel.add(list1);
			
			jlab7=new JLabel("Mobile Phone");
			jlab7.setBounds(650,630,150,20);
			panel.add(jlab7);
			
			final String subject11[] = {"INDIA","AUSTRALIYA","AMERICA"};
			final JComboBox list11 = new JComboBox(subject11);
			list11.setBounds(650,660,150,30);
			panel.add(list11);
			
			jtx8= new JTextField("      ");
			jtx8.setBounds(801,660,820-650+150-151,30);
			panel.add(jtx8);
			
			
			jlab7=new JLabel("Your Current Email Address");
			jlab7.setBounds(650,710,150,20);
			panel.add(jlab7);
	
			
			jtx9= new JTextField("      ");
			jtx9.setBounds(650,740,820-650+150,30);
			panel.add(jtx9);
			
			
			
			jbn=new JButton("SUBMIT");
			jbn.setBounds(700,790,150,30);	
			panel.add(jbn);
			
			JScrollPane jsp=new JScrollPane(panel);
			jsp.setBounds(0,0,1000,1000);
			jfrm.add(jsp);
			
			
			jbn.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e5)
					{
						try
						{
							Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


						}
						catch(Exception e1)
						{
	
							System.out.println("failed to load driver");
						}	
	
						try
						{
							String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13;
							s1=jtx1.getText();//fname
							s2=jtx2.getText();//lname
							s3=jtx3.getText();//Choose Your username
							s4=jtx4.getText();//Choose Your password
							s5=jtx5.getText();//confirm Your password
							int idx=list.getSelectedIndex();//month
							s6=subject[idx]; 
							 s7=jtx6.getText();//day
							 //int u=Integer.parseInt(s7);
							 s8=jtx7.getText();//year
							//int y=Integer.parseInt(s8);
							int i=list1.getSelectedIndex();
							s9=subject1[i];//gender
							
							int j=list11.getSelectedIndex();//country
							s10=subject11[j];
							
							s11=jtx8.getText();//mobilephone
							s12=jtx9.getText();				//current email
							
							/*
			String s="create table gmail (FName varchar(20),LName varchar(20),username varchar(20),pass1 varchar(20),pass2 varchar(20),month varchar(20),
			day number,year number,gender varchar(20),country varchar(20),mobilephone varchar(20),currentemail varchar(20));";
			*/
							String s="insert into gmail values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"',"+s7+","+s8+",'"+s9+"','"+s10+"','"+s11+"','"+s12+"');";
							System.out.println(s);
							Connection con = DriverManager.getConnection("jdbc:odbc:gmail","","");
							System.out.println("3");
							Statement S = con.createStatement();
							S.executeUpdate(s);
							System.out.println("4");
							//S.close();
							con.close();
							
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
			}
			}
			);
			
	 
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


}
