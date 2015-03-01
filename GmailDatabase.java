import java.sql.*;
import java.sql.Connection.*;
import java.sql.DriverManager.*;
class GmailDatabase
{
	GmailDatabase()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			
		
		}
		catch(Exception e1 )
		{
			System.out.println(e1);
		}
	
		try
		{	Connection con=DriverManager.getConnection("jdbc:odbc:gmail","","");
			
			Statement S=con.createStatement();
			System.out.println("fsdfs");
			String s="create table gmail (FName varchar(20),LName varchar(20),username varchar(20),pass1 varchar(20),pass2 varchar(20),month varchar(20),day number,year number,gender varchar(20),country varchar(20),mobilephone varchar(20),currentemail varchar(20));";
			S.executeQuery(s);
			con.close();
			
		
		}
		catch(Exception r)
		{System.out.println("fsdfs");
			System.out.println(r);
		}
	}
	public static void main(String str[])
	{
		GmailDatabase g= new  GmailDatabase();
	
	}

}
