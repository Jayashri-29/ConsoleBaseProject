package mypack.mess_client;

import java.util.List;
import java.util.Scanner;

import mypack.mess_model.DailyuserModel;
import mypack.mess_model.Monthlyusermodel;
import mypack.mess_model.mainucardmodel;
import mypack.mess_model.ratemodel;
import mypack.mess_service.DailyuserService;
import mypack.mess_service.Mmpresentyservice;
import mypack.mess_service.Monthlyadvservice;
import mypack.mess_service.MonthlyuserService;
import mypack.mess_service.mainucardservice;
import mypack.mess_service.rateservice;
import mypack.mess_service.userservice;

public class messclienapp {

	public static void main(String[] args)
	{
		userservice us=new userservice();
		MonthlyuserService mus=new MonthlyuserService();
		DailyuserService dus=new DailyuserService();
		Monthlyadvservice mas=new Monthlyadvservice();
		Mmpresentyservice mp=new Mmpresentyservice();
		mainucardservice mcs=new mainucardservice();
		rateservice rs=new rateservice();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Who are you?");
		String login=sc.next();
		System.out.println("Ok fine!!! Please enter your password");
		String pass=sc.next();
		if(login.equals("Admin")&& pass.equals("Admin123"))
		{
			do
			{
			 System.out.println();
			 System.out.println("1: Add member category");
			 System.out.println("2. Register candidate");
			 System.out.println("3: Register Monthly member with advance");
			 System.out.println("4: Take attendance");
			 System.out.println("5: Add mainu to mainu card");
			 System.out.println("6: Set charges");
			 System.out.println("7: Calculate bill");
			 System.out.println("8: Count total number of month wise member");
			 System.out.println("9: Monthly Total bill of all members");
			 System.out.println("Enter your choice");
			 int choice=sc.nextInt();
			 System.out.println();
			 switch(choice)
			   {
			     case 1:
			    	     System.out.println("1: Add monthly user");
			    	     System.out.println("2: Add Daily walking user");
				         System.out.println("Enter your choice");
				         int ch=sc.nextInt();
				         switch(ch)
				          {
				            case 1:
				            	   sc.nextLine();
							       int result=us.addMember();
							       if(result==1)
							        {
							    	  System.out.println("Member added successfully");
							        }
							       else
							        {
							    	  System.out.println("Some problem is there");
							       }
				            	   break;
				            case 2:
				            	   sc.nextLine();
				            	   int result1=us.addDailyMember();
				            	   if(result1==1)
							        {
							    	  System.out.println("member added successfully");
							        }
							       else
							        {
							    	  System.out.println("Some problem is there");
							       }
				            	   break;
				            default:
				            	    System.out.println("You have only two option");
				          }
				          break;
			     case 2:
			    	    sc.nextLine();
			    	    System.out.println("1: Register Monthly user");
			    	    System.out.println("2: Register Daily Walking user");
			    	    System.out.println("Enter your choice");
			    	    int ch1=sc.nextInt();
			    	    switch(ch1)
			    	    {
			    	       case 1:
			    	    	      sc.nextLine();
			    	    	      System.out.println("Enter name");
			    	    	      String name=sc.next();
			    	    	      System.out.println("Enter contact number");
			    	    	      String contact =sc.next();			    	    	   
			    	    	      Monthlyusermodel mum=new Monthlyusermodel(name,contact);
			    	    	      int result2=mus.regMember(mum);
			    	    	      if(result2==1)
			    	    	      {
			    	    	    	 System.out.println("Member registered successfully...");  
			    	    	      }
			    	    	      else
			    	    	      {
			    	    	    	 System.out.println("Some problem is there..");  
			    	    	      }
			    	    	      break;
			    	       case 2:
			    	    	      sc.nextLine();
			    	    	      System.out.println("Enter name");
			    	    	      String name1=sc.next();
			    	    	      System.out.println("Enter contact number");
			    	    	      String contact1=sc.next();			    	    	  
			    	    	      DailyuserModel dum=new DailyuserModel(name1,contact1);
			    	    	      int result3=dus.regDailyMember(dum);
			    	    	      if(result3==1)
			    	    	      {
			    	    	    	 System.out.println("Member registered successfully...");  
			    	    	      }
			    	    	      else
			    	    	      {
			    	    	    	 System.out.println("Some problem is there..");  
			    	    	      }
			    	    	      break;
			    	       default:
			            	        System.out.println("You have only two option");	
			    	    }
			    	    break;
			     case 3:
			    	     sc.nextLine();
			    	     System.out.println("Enter name");
   	    	             String name2=sc.next();
   	    	             System.out.println("Enter contact number");
   	    	             String contact2 =sc.next();		
   	    	             System.out.println("Enter advance amount");
   	    	             int advamt2=sc.nextInt();   	    	               	    	             
   	    	             Monthlyusermodel mum=new Monthlyusermodel(name2,contact2,advamt2);
   	    	             int result4=mas.regMemberwithAdv(mum);
   	    	             if(result4==1)
   	    	             {
   	    	            	System.out.println("Member registered successfully...");  
   	    	             }
   	    	             else
   	    	             {
	    	    	    	 System.out.println("Some problem is there..");  

   	    	             }
			    	     break;
			     case 4:
			    	    sc.nextLine();
		    	        System.out.println("1: Attendence of monthly user");
		    	        System.out.println("2: Attendence Daily walking user");
		    	        System.out.println();
		    	        System.out.println("Enter your choice");
		    	        int choice1=sc.nextInt();
		    	        switch(choice1)
		    	         {
		    	           case 1:
		    	    	          sc.nextLine();
			    	              System.out.println("Enter member name");
			    	              String name3=sc.next();
			    	              int result6=mp.present(name3);
			    	              if(result6==0)
			    	               {
			    	    	         System.out.println(name3+" Member not present");
			    	    	         System.out.println("Firstly add this member");
			    	               }
			    	             else
			    	               {
			    	    	        int result5=mp.takepresenty(name3);
				    	            if(result5==1)
				    	              {
				    	    	        System.out.println("Presenty of member is done");
				    	              }
				    	            else
				    	             { 
				    	    	      System.out.println("some problem is there");
				    	             }
			    	              }
			    	              break;
		    	           case 2:
		    	        	      sc.nextLine();
		    	        	      System.out.println("Enter mamber name");
		    	        	      String name4=sc.next();
		    	        	      int r=dus.present(name4);
		    	        	      if(r==0)
		    	        	      {
		    	        	    	  System.out.println("Member not present");
		    	        	    	  System.out.println("Firstly register member");		    	        	    	  
		    	        	      }
		    	        	      else
		    	        	      {
		    	        	    	  int r1=dus.takePresenty(name4);
		    	        	    	  if(r1==1)
		    	        	    	  {
		    	        	    		  System.out.println("Presenty done");
		    	        	    	  }
		    	        	    	  else
		    	        	    	  {
		    	        	    		  System.out.println("Some problem is there");
		    	        	    	  }
		    	        	      }
		    	        	      break;
		    	         }
			    	     break;
			    	     
			     case 5:
			    	     sc.nextLine();		
			    	     System.out.println("Enter name of day");
			    	     String day=sc.nextLine();
			    	     System.out.println("Enter name of dal");
			    	     String dal=sc.nextLine();
			    	     System.out.println("Enter name of bhaji");
			    	     String bhaji=sc.nextLine();
			    	     System.out.println("Enter name of bhat");
			    	     String bhat=sc.nextLine();
			    	     System.out.println("Enter name of poli");
			    	     String poli=sc.nextLine();
			    	     System.out.println("Enter name of sweet");
			    	     String sweet=sc.nextLine();
			    	     mainucardmodel mcm=new mainucardmodel(day,dal,bhaji,bhat,poli,sweet);
			    	     int result7=mcs.addmainu(mcm);
			    	     if(result7==1)
			    	     {
			    	    	 System.out.println("Mainu added successfully in Mainu card");
			    	     }
			    	     else
			    	     {
			    	    	 System.out.println("Some probelm occured");
			    	     }
			    	     break;
			     case 6:
			    	     sc.nextLine();
			    	     System.out.println("1: Set charges of monthly member");
			    	     System.out.println("2: set per plate charges for Daily walking user");
			    	     System.out.println();
			    	     System.out.println("Enter your choice");
			    	     int choice31=sc.nextInt();
			    	     switch(choice31)
			    	     {
			    	     case 1:
			    	    	     sc.nextLine();
			    	    	     System.out.println("Enter charges of mess for monthly user");
				    	         int charge=sc.nextInt();
				    	         ratemodel rmm=new ratemodel(charge);
				    	         int result8=rs.addCharge(rmm);
				    	         if(result8==1)
				    	          {
				    	    	   System.out.println("Monthly fees for monthlyuser set successfullyy");
				    	          }
				    	         else
				    	          {
				    	    	   System.out.println("some problem occured");
				    	          }
				    	         break;
			    	     case 2:
			    	    	     sc.nextLine();
				    	         System.out.println("Enter per plate charge for daily walking user");
				    	         int rate=sc.nextInt();
				    	         ratemodel rm=new ratemodel(rate);
				    	         int result9=rs.addrate(rm);
				    	         if(result9==1)
				    	          {
				    	    	    System.out.println("Charges added successfullyy....");
				    	          }
				    	         else
				    	          {
				    	    	    System.out.println("Some probelm occured");
				    	          }
				    	         break;
			    	     default:
		            	        System.out.println("You have only two option");
			    	     }
			    	     break;
			     case 7:
			    	     sc.nextLine();
			    	     System.out.println("1: Calculate bill of Monthly user");
			    	     System.out.println("2: Calculate bill of Daily Walking user");
			    	     System.out.println("Enter your choice");
			    	     int choice2=sc.nextInt();
			    	     System.out.println();
			    	     switch(choice2)
			    	     {
			    	      case 1:
			    	    	     sc.nextLine();
			    	    	     System.out.println("Enter member name to calculate bill");
							     String n=sc.next();
							     System.out.println("Also Enter month name");
							     String m=sc.next();
							     System.out.println("Enter number of days in month");
							     int num=sc.nextInt();
							     int pday=mus.checkpresent(n,m);						     
					    	     int rate1=rs.getrate();					    	    
					    	     int adv=mus.getAdvance(n);						    	     
					    	     int charges=(rate1/num);
					    	     int bill=charges*pday;
					    	     if(bill>adv)
					    	     {
					    	    	 bill=bill-adv;
					    	    	 System.out.println(n+" your bill is "+bill);
					    	     }
					    	     else
					    	     {
					    	    	 int rem=adv-bill;
					    	    	 System.out.println(n+" your bill is "+bill);
					    	    	 System.out.println("And You have "+rem+" money remaining");
					    	     }
					    	     break;			    	    
			    	      case 2:
			    	    	     sc.nextLine();
			    	             int r=dus.calculateBill();
			    	             System.out.println("your bill is "+r);
			    	    	     break;
			    	      default:
		            	         System.out.println("You have only two option");
			    	     }
			    	     break;
			     case 8:
			    	     sc.nextLine();
			    	     System.out.println("1: Count monthly member");
			    	     System.out.println("2: Count daily walking member");
			    	     System.out.println("Enter your choice");
			    	     int choice3=sc.nextInt();
			    	     System.out.println();
			    	     switch(choice3)
			    	     {
			    	       case 1:
			    	    	       sc.nextLine();
			    	    	       System.out.println("Enter month name to calculate total monthly user");
					    	       String month=sc.next();
					    	       int result=mus.checkTotalUser(month);
					    	       System.out.println("Total number of user of "+month+" is "+result);
					    	       break;		    	    	      
			    	       case 2:
			    	    	      
					    	       System.out.println("Enter month name to calculate total daily user");
					    	       String month1=sc.next();
					    	       int result10=dus.chackTotalUser(month1);
					    	       System.out.println("Total number of user of "+month1+" is "+result10);
					    	       break;			    	    	   
			    	       default:
		            	            System.out.println("You have only two option");
			    	     }
			    	     break;
			     case 9:
			    	    sc.nextLine();
		    	        System.out.println("1: Monthly member");
		    	        System.out.println("2: Daily walking member");
		    	        System.out.println("Enter your choice");
		    	        int choice4=sc.nextInt();
		    	        System.out.println();
		    	        switch(choice4)
		    	         {
		    	           case 1:
		    	        	      sc.nextLine();
		    	        	      System.out.println("Enter month name to calculate total monthly bill");
					    	      String month=sc.next();
					    	      System.out.println("Enter number of days in month");
					    	      int days=sc.nextInt();
					    	      int r=rs.getrate();
					    	      int charge=r/days;
					    	      List<Monthlyusermodel> list=mus.getnames(month);
					    	      for(Monthlyusermodel m:list)
					    	      {
					    	    	  String name=m.getName();
					    	    	  int pday=mus.checkpresent(name,month);
					    	    	  int bill=charge*pday;
					    	    	  System.out.println(name+"= "+bill);
					    	      }
					    	      break;
		    	           case 2:
		    	        	      sc.nextLine();
		    	        	      System.out.println("Enter month name to get total bill");
		    	        	      String m=sc.next();
		    	        	      int rate2=rs.getrateofdailyuser();
		    	        	      List<DailyuserModel> li=dus.getnames(m);
		    	        	      for(DailyuserModel m1:li)
		    	        	      {
		    	        	    	String name=m1.getName();
		    	        	    	int pday=dus.checkPresent(name,m);
		    	        	    	int bill=rate2*pday;
		    	        	    	System.out.println(name+"= "+bill);
		    	        	      }
		    	        	      break;
		    	           default:
	            	               System.out.println("You have only two option");
		    	         }
			    	    break;
	             default:	            					        
	            	     System.out.println("Wrong choice");
				         break;
			   }
			}while(true);

		}
		if(login.equals("user"))
		{
			do
			{
				System.out.println();
				System.out.println("Welcome candidate");
				System.out.println("=======================================================================================");
				System.out.println("1: View present days");
				System.out.println("2: View mainu");
				System.out.println("3: View daily bill of daily walking user");
				System.out.println("4: View your monthly bill");
				System.out.println("Enter your choice");
				int choice=sc.nextInt();
				System.out.println();
				switch(choice)
				{
				   case 1:
					       sc.nextLine();
					       System.out.println("1: Monthlyuser");
					       System.out.println("2: Daily walking user");
					       System.out.println("Enter your choice");
					       int ch1=sc.nextInt();
					       switch(ch1)
					       {
					       case 1:					    	   					      
					              sc.nextLine();
					              System.out.println("Enter your name to check your present days");
					              String name=sc.next();
					              System.out.println("Also Enter month name to check");
					              String month=sc.next();
					              int day=mus.checkpresent(name,month);
					              System.out.println("Your present day is "+day);
					              break;
					       case 2:
					    	      sc.nextLine();
					    	      System.out.println("Enter your name to check your present days");
					              String name1=sc.next();
					              System.out.println("Also Enter month name to check");
					              String month1=sc.next();
					              int days=dus.checkPresent(name1,month1);
					              System.out.println("Your present day is "+days);
					    	      break;
					       }
					       break;
				   case 2:
					       sc.nextLine();					       
					       List<mainucardmodel> list=mcs.viewMainu();
					       System.out.println("Hello members!! This is Mainu card of this week");
					       System.out.println("Enjoy your meal with us");
					       System.out.println("===================================================================================================");					
                           for(mainucardmodel m:list)
                           { 
                        	   System.out.println();
                        	   System.out.println(";Day: "+m.getDay()+"\tDal:"+m.getDal()+"\tBhaji: "+m.getBhaji()+"\tBhat: "+m.getBhat()+"\tPoli: "+m.getPoli()+"\tSweet: "+m.getSweet());
                               System.out.println();
                               System.out.println("---------------------------------------------------------------------------------------------------");
                           }
					       break;
				   case 3:
					      sc.nextLine();
	    	    	      int r=dus.calculateBill();
	    	    	      System.out.println("Your bill is "+r);
					      break;
				   case 4:
					     sc.nextLine();
			    	     System.out.println("1: View bill of Monthly user");
			    	     System.out.println("2: View bill of Daily Walking user");			    	    
			    	     System.out.println("Enter your choice");
			    	     int choice2=sc.nextInt();
			    	     System.out.println();
			    	     switch(choice2)
			    	     {
			    	      case 1:
			    	    	     sc.nextLine();
			    	    	     System.out.println("Enter your name to view bill");
							     String n=sc.next();
							     System.out.println("Also Enter month name");
							     String m=sc.next();
							     System.out.println("Enter number of days in month");
							     int num=sc.nextInt();
							     int pday=mus.checkpresent(n,m);
					    	     int rate1=rs.getrate();
					    	     int adv=mus.getAdvance(n);	
					    	     int charges=(rate1/num);
					    	     int bill=charges*pday;
					    	     if(bill>adv)
					    	     {
					    	    	 bill=bill-adv;
					    	    	 System.out.println(n+" your bill is "+bill);
					    	     }
					    	     else
					    	     {
					    	    	 int rem=adv-bill;
					    	    	 bill=adv-bill;
					    	    	 System.out.println(n+" your bill is "+bill);
					    	    	 System.out.println("You have "+rem+" money remaining");
					    	     }
					    	     break;			    	    
			    	      case 2:
			    	    	     sc.nextLine();
			    	    	     System.out.println("Enter your name to view bill");
							     String n1=sc.next();
							     System.out.println("Also Enter month name");
							     String m1=sc.next();	    	    	   
			    	    	     int pday1=dus.checkPresent(n1,m1);
			    	    	     int rate2=rs.getrateofdailyuser();
			    	    	     int totalbill=pday1*rate2;
			    	    	     System.out.println("Your bill is "+totalbill);
			    	    	     break;
			    	      default:
		            	         System.out.println("You have only two option");
			    	     }
			    	      break; 					       
				   default:
					        System.out.println("Wrong choice");
					        break;
				}
			}while(true);
		}
		
	}

}
