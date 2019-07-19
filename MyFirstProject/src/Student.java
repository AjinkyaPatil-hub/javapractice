

public class Student {
	int id; //instance variables
	String name; //instance variables
	private	static String collegeName; //static var

	//instance block
	{
		System.out.println("inside instance block");
	}
	//static bloc
	static {
		System.out.println("inside static blocks");
	}
	
	public void m1() {
		System.out.println("m1 instance method");
		m2();
	}
	
	public static void m2() {
		System.out.println("inside m2 static method");
	}

	//constructor
	public Student() {
		System.out.println("no arg constructor");
		int num=10;
	}
	
	
public static void main(String[] a) {
	System.out.println("inside static main method...");

	//every variable is  ref var  --- false
	//every ref var is variable -- True -- object -- except primitives
	
	int num=10;
	Integer num2  = new Integer(10);
	Student st1 = new Student();
	Student st2 = new Student();
	String name="ABC";
	Student.collegeName="";
}	
	
	
}


