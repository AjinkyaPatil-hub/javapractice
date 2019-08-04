package immutable;

import java.util.Date;

final class Emp {
	final private int eId;
	final private String empName;
	final private Address adress;
	final private Date date;
	
	public Emp(int eId, String empName, Address adress, Date dt) {
		super();
		this.eId = eId;
		this.empName = empName;
		this.adress = adress;
		this.date = dt;
	}

	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", empName=" + empName + ", adress="
				+ adress + ", date="+ date + "]";
	}

	public int geteId() {
		return eId;
	}

	public String getEmpName() {
		return empName;
	}

	public Address getAdress() {
		return adress;
	}

	public Date getDate() {
		@SuppressWarnings("deprecation")
		Date dt=new Date(date.getYear(),date.getMonth(),date.getDay());
		return dt;
	}
	
	
	
	
}
