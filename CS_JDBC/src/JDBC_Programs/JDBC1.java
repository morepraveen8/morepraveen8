package JDBC_Programs;
import java.sql.*;

class JDBC1
	{
		public static void main(String args[])
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				//here test is the database name, root is the username and root is the password
				//	int id=1;
				//String pass="1245";
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from test1 where id and pass");
					while(rs.next())
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
					con.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}

//Praveen jdbc program