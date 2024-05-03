package mypack.mess_repository;

import java.util.Scanner;

public class Mmpresentyrepo extends DBConfigure
{
   private int getuserid(String name)
   {
	 try
	 {
		 ps=con.prepareStatement("Select uid from monthlyuser where uname=?");
		 ps.setString(1, name);
		 rs=ps.executeQuery();
		 if(rs.next())
		 {
			 return rs.getInt(1);
		 }
		 else
		 {
			 return -1;
		 }
     }
	 catch(Exception ex)
	 {
		 System.out.println("hello error is "+ex);
		 return 0;
	 }
   }
   public boolean istakepresenty(String name)
    {
	  try
	  {
		  Scanner sc=new Scanner(System.in);
		  int uid=this.getuserid(name);
		  System.out.println("Enter todays date");
		  String d=sc.next();
		  ps=con.prepareStatement("insert into mmpresnty values(?,?,?)");
		  ps.setInt(1, uid);
		  ps.setInt(2, 1);
		  ps.setString(3,d);
		  int value=ps.executeUpdate();
		  if(value>0)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
	  catch(Exception ex)
	  {
		  System.out.println("Error is "+ex);
		  return false;
	  }
    }
   public boolean ispresent(String name)
   {
	   try
	   {
		   ps=con.prepareStatement("select * from monthlyuser where uname=?");
		   ps.setString(1, name);
		   rs=ps.executeQuery();
		   return rs.next();
		   
	   }
	   catch(Exception ex)
	   {
			  System.out.println("Error is "+ex);
			  return false;
	   }
   }
}
