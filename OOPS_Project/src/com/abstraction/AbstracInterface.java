 package com.abstraction;
 
/**
 *  if we make as a class an abstract then the methods in that class may or may not be abstract 
 *  but if we make a method as a abstract then a class must be abstract
 *  abstract class are always public bcoz we want could to extend that class in another pack or same pack
 *  abstract method cannot be make static,bcoz we do not have its implementation the why is it neccessary to make that method as static
 *  cannot be final bcoz we will inherit that method in another class 
 *  methods of an abstract class may be public or protected
 *  we can have constructor in abstract methods.
 *  we can have instance ,local , and static var in abstract class
 * @author ajinkya
 *
 */


abstract class Aaa{
	final int age;//this are blank final field
	
	Aaa(){
		age=10;
}
	
	Aaa(int a){
		age =1;
	}
//	{
//		age=5;
//	}
}



interface Demo{
	int i=0;
	public  void demo(); 
	

}

interface Demo1{
	int i=0;
	public  void demo2();
}


abstract class Demol implements Demo,Demo1
{

	@Override
	public void demo() {
		
	}
	
}

public abstract class AbstracInterface {

	  int i=1;
	AbstracInterface(){
		 i=2;
		 System.out.println(i);
	}
		public void d(){
		
	}
	
	public abstract void s();

}

  class  AAA  {

	public static void main(String[] args) {
		System.out.println(Demo.i);
		
		AAA aa=new AAA();
		
//		aa.d();
	}

	
}