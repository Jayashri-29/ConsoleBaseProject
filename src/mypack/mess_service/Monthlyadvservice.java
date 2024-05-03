package mypack.mess_service;

import mypack.mess_model.Monthlyusermodel;
import mypack.mess_repository.Monthlyadvrepo;
import mypack.mess_repository.Monthlyuserrepo;

public class Monthlyadvservice
{
	Monthlyadvrepo mur=new Monthlyadvrepo();
	public int regMemberwithAdv(Monthlyusermodel model)
	{
		boolean b=mur.isRegMemberwithAdv(model);
		if(b)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
