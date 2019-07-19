class SuperB {

	int n = 10;

	public SuperB() {
		System.out.println("in B const");

	}

	public void show1() {
		System.out.println("hellow");
	}
}

public class SuperUses extends SuperB {
	
	SuperUses() {
		super(); // super is used to call the super const of super class
	}

	public void show1() {
		super.show1(); // 1super is used to call the super method of current
						// class
		System.out.println("hii");
		System.out.println(super.n);// super is used to refer the super class
									// instance var
	}

	public static void main(String[] args) {
		SuperUses td = new SuperUses();
		td.show1();

	}

}
