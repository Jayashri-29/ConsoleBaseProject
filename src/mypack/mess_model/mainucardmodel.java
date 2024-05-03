package mypack.mess_model;

public class mainucardmodel {
	private String dal;
	private String bhaji;
	private String bhat;
	private String poli;
	private String sweet;
	private String day;
	
	public mainucardmodel()
	{
		
	}

	public mainucardmodel(String day,String dal,String bhaji,String bhat,String poli,String sweet)
	{
		this.setDay(day);
		this.dal=dal;
		this.bhaji=bhaji;
		this.bhat=bhat;
		this.poli=poli;
		this.sweet=sweet;
	}
	
	public String getDal() {
		return dal;
	}

	public void setDal(String dal) {
		this.dal = dal;
	}

	public String getBhaji() {
		return bhaji;
	}

	public void setBhaji(String bhaji) {
		this.bhaji = bhaji;
	}

	public String getBhat() {
		return bhat;
	}

	public void setBhat(String bhat) {
		this.bhat = bhat;
	}

	public String getPoli() {
		return poli;
	}

	public void setPoli(String poli) {
		this.poli = poli;
	}

	public String getSweet() {
		return sweet;
	}

	public void setSweet(String sweet) {
		this.sweet = sweet;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
}
