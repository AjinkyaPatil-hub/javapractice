
class Abcd {
//	static {
//		System.out.println("i am in static bloc--0");
//	}
	{
		System.out.println("i am in instance bloc--0");
	}

	 public Abcd() {
	 System.out.println("i am the constructor of super class--1");
	 }

//	public void show() {
//		System.out.println("i am in method--4");
//	}
}

public class BlocksDemo extends Abcd {

	static int setStudId;
	static String studName;
	 public BlocksDemo() {
		 
	 System.out.println("i am in constructor of base class--3");
	 }
	static {
		System.out.println("i am in static bloc--00");
	}

	{
		System.out.println("i am in instance block--2");
	}

	public static void main(String[] args) {
		BlocksDemo obj = new BlocksDemo();
		// Abc obj2=new Abc();
		//obj.show();
		//System.out.print("hiii java--5");
		 BlocksDemo.setStudId=1;
		 BlocksDemo.studName="ajinkya";
		System.out.print("studentID:" + setStudId + " "+ "studentname:" + studName);
	}

}
