package mypack.mess_repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mypack.mess_model.DailyuserModel;


public class Dailyuserrepo extends DBConfigure 
{
	public boolean isRegMember(DailyuserModel model)
	   {
		   try
		   {
			   ps=con.prepareStatement("insert into Dailyuser (usid,usname,uscontact) values ('0',?,?)");
			   ps.setString(1,model.getName());
			   ps.setString(2,model.getContact());
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
		   catch(Exception ex){
			    System.out.println("Error is "+ex);
			    return false;
		   }
	   }
	
	public boolean ispresent(String name)
	{
		try
		{
			ps=con.prepareStatement("select *from dailyuser where usname=?");
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
	
	public int chackTotalUser(String name)
	{
		try
		{
			ps=con.prepareStatement("select count(d.usid) from dailyuser d inner join dmpresnty a on d.usid=a.usid where a.usdate like ? group by d.usid");
			ps.setString(1,"%"+name+"%");
			rs=ps.executeQuery();
			int day=0;
			while(rs.next())
					{
				      day=rs.getInt(1);
					}
			return day;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return 0;
		}
	}
	
	public int getId(String name)
	{
		try
		 {
			 ps=con.prepareStatement("select usid from dailyuser where usname=?");
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
	public boolean istakePresenty(String name)
	{
	 try
	 {
		 int id=this.getId(name);
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Todays date");
		 String date=sc.next();
		 ps=con.prepareStatement("insert into dmpresnty values(?,?,?)");	
		 ps.setInt(1, id);
		 ps.setInt(2, 1);
		 ps.setString(3, date);
	     int val=ps.executeUpdate();
	     if(val>0)
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
	
	public int ischeckpresent(String name,String month)
	{
		try
		   {
			   ps=con.prepareStatement("select sum(m.upresent) from dailyuser d inner join dmpresnty m on d.usid=m.usid where d.usname=? and m.usdate like ?");
		       ps.setString(1, name); 
		       ps.setString(2,"%"+month+"%");
		       rs=ps.executeQuery();
		       int day=0;
		       while(rs.next())
		       {
		    	   day=rs.getInt(1);
		       }
		       return day;
		   }
		   catch(Exception ex)
		   {
			   System.out.println("error is "+ex);
			   return 0;
		   }	   
	}
	
	public int calculateBill()
	{
		try
		{
			ps=con.prepareStatement("select charges from rate where urateid=?");
			ps.setInt(1,2);
			rs=ps.executeQuery();
			int charge=0;
			while(rs.next())
			{
				charge=rs.getInt(1);
			}
			return charge;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return 0;
		}
	}
	
	List<DailyuserModel> li=new ArrayList<DailyuserModel>();
	public List<DailyuserModel> getnames(String name) 
	{
		try
		{ 
			ps=con.prepareStatement("select d.usname from dailyuser d inner join dmpresnty a on d.usid=a.usid where a.usdate like ? group by d.usid");
			ps.setString(1,"%"+name+"%");
			rs=ps.executeQuery();
			while(rs.next())
			{
				DailyuserModel m=new DailyuserModel();
				m.setName(rs.getString(1));
				li.add(m);
			}
			return li.size()>0?li:null;			
		}
		catch(Exception ex)
		{
			System.out.println("Srror is "+ex);
			return null;
		}
	}
}
