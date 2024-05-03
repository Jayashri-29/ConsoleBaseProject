package mypack.mess_service;

import java.util.List;

import mypack.mess_model.Monthlyusermodel;
import mypack.mess_model.mainucardmodel;
import mypack.mess_repository.Monthlyuserrepo;

public class MonthlyuserService 
{
	Monthlyuserrepo mur=new Monthlyuserrepo();
	public int regMember(Monthlyusermodel model)
	{
		boolean b=mur.isRegMember(model);
		if(b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
   public int checkpresent(String name, String month)
   {
	  return mur.ischeckpresent(name,month);
   }
  public int getAdvance(String name)
  {
	  return mur.getAdvance(name);
  }
  
  public int checkTotalUser(String month)
  {
	  return mur.checkTotalUser(month);
  }
  
  public List<Monthlyusermodel> getnames(String month)
  {
	  return mur.getnames(month);
  }
}
