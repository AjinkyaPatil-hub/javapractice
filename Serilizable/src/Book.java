import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Book implements Serializable{
	
	private int bID;
	private String name;
	private double bPrice;
	private  String bSupplier;
	
	//code for encript and decripted
	private void writeObject(ObjectOutputStream oos) throws IOException{
		String temp=this.bSupplier;//PQRS
		this.bSupplier=temp+"ABC"; //encripted 
		System.out.println(this.bSupplier);
		oos.defaultWriteObject();//writen in file
		this.bSupplier=temp; //PQRS store in original bSupplier
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException{
		ois.defaultReadObject();
		this.bSupplier=this.bSupplier.substring(0, 4);
		System.out.println(this.bSupplier);
	}
	
	
	public Book(int bID, String name, double bPrice, String bSupplier) {
		super();
		this.bID = bID;
		this.name = name;
		this.bPrice = bPrice;
		this.bSupplier = bSupplier;
	}
	public int getbID() {
		return bID;
	}
	public void setbID(int bID) {
		this.bID = bID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getbPrice() {
		return bPrice;
	}
	public void setbPrice(double bPrice) {
		this.bPrice = bPrice;
	}
	public String getbSupplier() {
		return bSupplier;
	}
	public void setbSupplier(String bSupplier) {
		this.bSupplier = "PQ";
	}
	@Override
	public String toString() {
		return "\n [bID=" + bID + ", name=" + name + ", bPrice=" + bPrice
				+ ", bSupplier=" + bSupplier + "]";
	}
	
	
	
	
	
}

