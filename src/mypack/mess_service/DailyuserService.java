package mypack.mess_service;

import java.util.List;

import mypack.mess_model.DailyuserModel;
import mypack.mess_model.Monthlyusermodel;
import mypack.mess_repository.Dailyuserrepo;

public class DailyuserService 
{
	Dailyuserrepo dr=new Dailyuserrepo();
	public int regDailyMember(DailyuserModel model)
	{
		boolean b=dr.isRegMember(model);
		if(b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	public int chackTotalUser(String name)
	{
		return dr.chackTotalUser(name);
	}
	
	public int calculateBill()
	{
		return dr.calculateBill();
	}
	
	public int present(String name)
	{
	 boolean b1=dr.ispresent(name);
	 if(b1)
	 {
		 return 1;
	 }
	 else
	 {
		 return 0;
	 }
	}
	
	public int takePresenty(String name)
	{
		boolean b2=dr.istakePresenty(name);
		if(b2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
			
	}
	
	public int checkPresent(String name,String month)
	{
		 return dr.ischeckpresent(name,month);
	}
	
	public List<DailyuserModel> getnames(String month)
	{
		return dr.getnames(month);
	}
}
