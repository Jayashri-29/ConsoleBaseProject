package mypack.mess_model;

public class DailyuserModel 
{
	private int uid;
	private String name;
	private String contact;
	private int rate;
	private String date1;
	public  DailyuserModel()
    {
    	
    }
	public  DailyuserModel(String name,String contact)
    {
    	this.name=name;
    	this.contact=contact;
    }
	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getDate1() {
		return date1;
	}
	public void setDate(String date1) {
		this.date1 = date1;
	}

}
