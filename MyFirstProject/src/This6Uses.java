
class DemoThis {
	int rollno;
	String name;

	public DemoThis() {
		System.out.println(" 3 use to call default const also");
	}

	DemoThis(int a) {
		this(); // 3 used to invoke the defalut const
	}

	DemoThis(This6Uses t) {

		System.out.println("5 this keyword can be used as arugment in const");
	}

	public void a(DemoThis dt) {
		System.out.println("i am in a method");
	}

	public void b() {
		a(this);// 4 used to pass the argument in a method
	}

	public void show()

	{
		System.out.println("2 used to call the current class method");
	}

	public void show1() {// used to invoke current class method
		this.show();
	}

	public void set(int rollno, String name) {
		this.rollno = rollno; // 1 to differenciate the local var and instance
								// var
		this.name = name;

	}

	public void get() {
		System.out.println("rollno:" + rollno + "name:" + name);

	}
}

public class This6Uses {

	public This6Uses() {
		System.out.println("called by this()");
		
	}


	public void ss() {
		
		DemoThis obj2 = new DemoThis(this);

	}

	public static void main(String[] args) {

		DemoThis obj = new DemoThis();
		
		obj.set(11, "vicky");
		obj.get();
		obj.show1();
		obj.b();

	}

}
