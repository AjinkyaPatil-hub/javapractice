package immutable;

public class Address {
	final private int pincode;
	final private String city;
	
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	
	public int getPincode() {
		return pincode;
	}
	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}
	
	
	

}
