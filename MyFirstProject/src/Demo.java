
// all blocks demo examples

class ABC {

	public ABC() {

		System.out.println("AB def const..3");
	}
	static{
		System.out.println("static block of AB..1 ");
	}
	 {
	 System.out.println("instance block..2");
	 }
}

public class Demo extends ABC {

	static{
		System.out.println("static block of1.1");
	}
	{
		System.out.println("instance block of Demo..4");
	}
	public Demo() {
		System.out.println("demo def const..5");
	}

	public static void main(String[] args) {

		Demo d=new Demo();
		
	}

}
