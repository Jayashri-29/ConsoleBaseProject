package mypack.mess_model;

public class Monthlyusermodel 
{
	private int uid;
	private String name;
	private String contact;
	private int advamt;
	
	public  Monthlyusermodel()
    {
    	
    }
	public  Monthlyusermodel(String name,String contact)
    {
    	this.name=name;
    	this.contact=contact;
    }
	public  Monthlyusermodel(String name,String contact,int advamt)
    {
    	this.name=name;
    	this.contact=contact;
    	this.advamt=advamt;
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

	public int getAdvamt() {
		return advamt;
	}

	public void setAdvamt(int advamt) {
		this.advamt = advamt;
	}

	

}
