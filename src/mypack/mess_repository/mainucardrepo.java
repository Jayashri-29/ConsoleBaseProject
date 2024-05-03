package mypack.mess_repository;

import java.util.ArrayList;
import java.util.List;

import mypack.mess_model.mainucardmodel;

public class mainucardrepo extends DBConfigure
{
  
  List<mainucardmodel> mainu=new ArrayList<mainucardmodel>();
	
  public boolean isAddMinu(mainucardmodel mcm)
  {
	  try
	  {
		  ps=con.prepareStatement("insert into mainucard values(?,?,?,?,?,?)");
		  ps.setString(1,mcm.getDay());
		  ps.setString(2,mcm.getDal());
		  ps.setString(3,mcm.getBhaji());
		  ps.setString(4,mcm.getBhat());
		  ps.setString(5,mcm.getPoli());
		  ps.setString(6,mcm.getSweet());
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
  
  public List<mainucardmodel> ViewMainu()
  {
	  try
	  {
		  ps=con.prepareStatement("Select *from mainucard");
		  rs=ps.executeQuery();
		  while(rs.next())
		  {
			  mainucardmodel mcm=new mainucardmodel();
			  mcm.setDay(rs.getString(1));
			  mcm.setDal(rs.getString(2));
			  mcm.setBhaji(rs.getString(3));
			  mcm.setBhat(rs.getString(4));
			  mcm.setPoli(rs.getString(5));
			  mcm.setSweet(rs.getString(6));
			  mainu.add(mcm);
		  }
		  return mainu.size()>0?mainu:null;
	  }
	  catch(Exception ex)
	  {
		  System.out.println("Error is "+ex);
		  return null;
	  }
  }
}
