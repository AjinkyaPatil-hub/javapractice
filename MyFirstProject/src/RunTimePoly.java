//runtime polymorphism  
class Anamil{
	public void eat(){
		System.out.println("anamil eating");
	}
}
class Dog extends Anamil
{
	public void eat(){
		System.out.println("Dog eating");
	}
}
class Cat extends Anamil{
	public void eat(){
		System.out.println("Cat eating");
	}
}



public class RunTimePoly  {

	public static void main(String[] args) {
		//here jv deccides which method is to be called at run time
		Anamil a;
		a=new Anamil();
		a.eat();
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
		

	}

}
