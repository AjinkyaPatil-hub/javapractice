
public class Person {
	
	private String name;
	private int rollno;
	
	public Person(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "PersonStack [name=" + name + ", rollno=" + rollno + "]";
	}
	

}
