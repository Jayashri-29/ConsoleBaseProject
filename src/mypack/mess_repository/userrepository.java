package mypack.mess_repository;

public class userrepository extends DBConfigure 
{
     public boolean isAddMember()
     {
    	 try
    	 {
    		 stmt=con.createStatement();
    		 int v=stmt.executeUpdate("create table monthlyuser(uid int(5) primary key auto_increment, uname varchar(200) unique not null, ucontact varchar(200) not null, uadvance int(5) default 0, urateid int(5) default 1)");
    	     if(v>0)
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
			System.out.println("error is "+ex);
			return false;
    	 }
		
     }
     public boolean isAddDailyMamber()
     {
    	 try
    	 {
    		 stmt=con.createStatement();
    		 int v1=stmt.executeUpdate("create table dailyuser(usid int(5) primary key auto_increment, usname varchar(200) unique not null, uscontact varchar(200) not null,  usrateid int(5) default 2)");
    		 if(v1>0)
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
    		 System.out.println("error is "+ex);
    		 return false;
    	 }
     }
     
}
