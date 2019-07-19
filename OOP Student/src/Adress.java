
public class Adress {
	
	private int aId;
	private int pincode;
	private String city;
	
	
	public Adress() {
		super();
	}


	public Adress(int studId, int pincode, String city) {
		super();
		this.aId = studId;
		this.pincode = pincode;
		this.city = city;
	}


	public int getStudId() {
		return aId;
	}


	public void setStudId(int studId) {
		this.aId = studId;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Adress [studId=" + aId + ", pincode=" + pincode + ", city="
				+ city + "]";
	}
	
	
	
}
