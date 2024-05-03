package mypack.mess_service;

import mypack.mess_repository.Mmpresentyrepo;

public class Mmpresentyservice 
{
  Mmpresentyrepo mpr=new Mmpresentyrepo();
  public int takepresenty(String name)
  {
	  boolean b=mpr.istakepresenty(name);
	  if(b)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
  }
  public int present(String name)
  {
	  boolean b1=mpr.ispresent(name);
	  if(b1)
	  {
		  return 1;
	  }
	  else
	  {
		  return 0;
	  }
  }
}
