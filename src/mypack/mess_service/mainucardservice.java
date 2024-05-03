package mypack.mess_service;

import java.util.List;

import mypack.mess_model.mainucardmodel;
import mypack.mess_repository.mainucardrepo;

public class mainucardservice 
{
	mainucardrepo mcr=new mainucardrepo();
	public int addmainu(mainucardmodel mcm)
	{
		boolean b=mcr.isAddMinu(mcm);
		if(b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public List<mainucardmodel> viewMainu()
	{
		return mcr.ViewMainu();
	}
}
