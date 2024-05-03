package mypack.mess_repository;

import mypack.mess_model.Monthlyusermodel;

public class Monthlyadvrepo extends DBConfigure
{
	public boolean isRegMemberwithAdv(Monthlyusermodel model)
	   {
		   try
		   {
			   ps=con.prepareStatement("insert into Monthlyuser (uid,uname,ucontact,uadvance) values ('0',?,?,?)");
			   ps.setString(1,model.getName());
			   ps.setString(2,model.getContact());
			   ps.setInt(3,model.getAdvamt());
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
}
