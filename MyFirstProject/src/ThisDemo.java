class A {
	private String name;
	private int age;
	public int rollNo=5;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


}

public class ThisDemo extends A  {
		
	
	static int aa;
	
	public void show(){
		System.out.println("value of rollno:" + super.rollNo);
	}
	public static void main(String[] args) {
		A a=new A();
		a.setAge(20); 
		 aa= a.getAge();
		System.out.println(aa);
		ThisDemo t1=new ThisDemo();
		t1.show();
}
}