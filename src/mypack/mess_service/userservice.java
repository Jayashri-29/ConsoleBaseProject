package mypack.mess_service;

import mypack.mess_repository.userrepository;

public class userservice
{
       userrepository urepo=new userrepository();
       public int addMember()
       {
    	   boolean b=urepo.isAddMember();
    	   if(b)
    	   {
    		   return 1;
    	   }
    	   else
    	   {
    		   return 0;
    		   
    	   }
       }
       public int addDailyMember()
       {
    	  boolean b=urepo.isAddDailyMamber();
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
