
public class Student {

	private int studId;
	private String studName;
	private int studAge;
	//as college name will not change so made static
	static private String collegeName="PICT";
	private double studFees;
	//Student HAS A address
	private Adress adress;
	
	
	public Student() {
		super();
	}
	
	
	public Student(int studId, String studName, int studAge, double studFees,
			Adress adress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAge = studAge;
		this.studFees = studFees;
		this.adress = adress;
	}
	
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getStudAge() {
		return studAge;
	}
	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	public static String getCollegeName() {
		return collegeName;
	}
	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}
	public double getStudFees() {
		return studFees;
	}
	public void setStudFees(double studFees) {
		this.studFees = studFees;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName
				+ ", studAge=" + studAge + ", studFees=" + studFees
				+ ", adress=" + adress + "]";
	}
	
	




}
