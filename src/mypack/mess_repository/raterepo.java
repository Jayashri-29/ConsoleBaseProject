package mypack.mess_repository;

import mypack.mess_model.Monthlyusermodel;
import mypack.mess_model.ratemodel;

public class raterepo extends DBConfigure
{
	
   public boolean isAddCharge(ratemodel m)
	   {
		   try
		   {
			   ps=con.prepareStatement("update rate set charges=? where urateid=1");
			   ps.setInt(1,m.getRate());
			   int value2=ps.executeUpdate();
			   if(value2>0)
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

	
  public boolean isAddRate(ratemodel rm)
  {
	  try
	  {
		  ps=con.prepareStatement("update rate set charges=? where urateid=2");
		  ps.setInt(1,rm.getRate());
		  int v=ps.executeUpdate();
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
  public int getrate()
  {
	  try
	  {
		  ps=con.prepareStatement("Select charges from rate where urateid=?");
		  ps.setInt(1,1);
		  rs=ps.executeQuery();
		  int charges=0;
		  while(rs.next())
		  {
			 charges=rs.getInt(1); 
		  }
		  return charges;
	  }
	  catch(Exception ex)
	  {
		  System.out.println("Error is "+ex);
		  return 0;
	  }
  }
  
  public int getrateofdailyuser()
  {
	  try
	  {
		  ps=con.prepareStatement("Select charges from rate where urateid=?");
		  ps.setInt(1,2);
		  rs=ps.executeQuery();
		  int charges=0;
		  while(rs.next())
		  {
			 charges=rs.getInt(1); 
		  }
		  return charges;
	  }
	  catch(Exception ex)
	  {
		  System.out.println("Error is "+ex);
		  return 0;
	  }

  }
}
