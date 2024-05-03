package mypack.mess_service;

import mypack.mess_model.Monthlyusermodel;
import mypack.mess_model.ratemodel;
import mypack.mess_repository.raterepo;

public class rateservice 
{
  raterepo rr=new raterepo();
  public int addrate(ratemodel rm)
  {
	  boolean b=rr.isAddRate(rm);
	  if(b)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
  
  }
  
  public int addCharge(ratemodel model)
  {
	   boolean b1=rr.isAddCharge(model);
	   if(b1)
	   {
		   return 1;
	   }
	   else
	   {
		   return 0;
	   }
  }
  
  public int getrate()
  {
	  return rr.getrate();
  }
  
  public int getrateofdailyuser()
  {
	 return rr.getrateofdailyuser();
  }
}
