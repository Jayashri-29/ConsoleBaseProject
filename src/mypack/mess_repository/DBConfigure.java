package mypack.mess_repository;

import java.sql.*;

public class DBConfigure {
   protected Connection con;
   protected PreparedStatement ps;
   protected ResultSet rs;
   protected Statement stmt;
   public DBConfigure()
   {
	   try
	   {
		   com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		   DriverManager.registerDriver(d);
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject","root","root");
	   }
	   catch(Exception ex)
	   {
		   System.out.println("Error is "+ex);
	   }
   }
   
}
