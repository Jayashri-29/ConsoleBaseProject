package mypack.mess_repository;

import java.util.ArrayList;
import java.util.List;

import mypack.mess_model.Monthlyusermodel;
import mypack.mess_model.mainucardmodel;

public class Monthlyuserrepo extends DBConfigure 
 {
   public boolean isRegMember(Monthlyusermodel model)
   {
	   try
	   {
		   ps=con.prepareStatement("insert into Monthlyuser (uid,uname,ucontact) values ('0',?,?)");
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
   
   public int ischeckpresent(String name,String month)
   {
	   try
	   {
		   ps=con.prepareStatement("select sum(a.upresent) from monthlyuser m inner join mmpresnty a on m.uid=a.uid where m.uname=? and a.udate like ?");
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
   
   public int getAdvance(String name)
   {
	   try
	   {
		   ps=con.prepareStatement("select uadvance from monthlyuser where uname=?");
		   ps.setString(1, name);
		   rs=ps.executeQuery();
		   int adv=0;
		   while(rs.next())
		   {
			   adv=rs.getInt(1);
		   }
		   return adv;
	   }
	   catch(Exception ex)
	   {
		   System.out.println("Error is "+ex);
		   return 0;
	   }
   }
   
   public int checkTotalUser(String month)
   {
	   try
	   {
		   ps=con.prepareStatement("select count(m.uid) from monthlyuser m inner join mmpresnty a on m.uid=a.uid where a.udate like ? group by m.uid");
		   ps.setString(1, "%"+month+"%");
		   rs=ps.executeQuery();
		   int count=0;
		   while(rs.next())
		   {
			   count++;
		   }
		   return count;
	   }
	   catch(Exception ex)
	   {
		   System.out.println("Error is "+ex);
		   return 0;
	   }
   }
   
   
   List<Monthlyusermodel> mm=new ArrayList<Monthlyusermodel>();
     public List<Monthlyusermodel> getnames(String month)
     {
	   try
	   {
		   ps=con.prepareStatement("select m.uname from monthlyuser m inner join mmpresnty a on m.uid=a.uid where a.udate like ? group by m.uid");
		   ps.setString(1, "%"+month+"%");
		   rs=ps.executeQuery();
		   while(rs.next())
		   {
			   Monthlyusermodel m=new Monthlyusermodel();
			   m.setName(rs.getString(1));
			   mm.add(m);
		   }
		   return mm.size()>0?mm:null;
	   }
	   catch(Exception ex)
	   {
		   System.out.println("Error is "+ex);
		   return null;
	   }
     }
  }
