/*
 * 	same name with same parameter
 * 	always done in different class that should be comp. inherited
 * 	1>Access Rules Parent class must be weaker than Child must be Stronger
 * 	2>Return type same or it type(child)
 * 	3>name same
 * 	4>parameter same
 * 	
 */


package com.b;

class DemoOverriding{
	public void d(Number a){
		System.out.println("Number para");
	}
	public void d(Object a){
		System.out.println("Obj para");
	}
//	public void d(int a){
//		System.out.println("int para");
//	}
	public void d(String a){
		System.out.println("String para");
	}
	public void d(Short a){
		System.out.println("short para");
	}
//	public void d(float a){
//		System.out.println("float para");
//	}
//	public void d(double a){
//		System.out.println("double para");
//	}
	public void d(Character a){
		System.out.println("Character para");
	}
//	public void d(Double a){
//		System.out.println("Double para");
//	}
	public void d(Float a){
		System.out.println("Float para");
	}
//	public void d(Integer a){
//		System.out.println("Integer para");
//	}
	
	
}

public class Overriding  extends DemoOverriding{
	public void d(Number a){
		System.out.println("Number para");
	}
	public void d(Object a){
		System.out.println("Obj para");
	}
//	public void d(int a){
//		System.out.println("int para");
//	}
	public void d(String a){
		System.out.println("String para");
	}
	public void d(Short a){
		System.out.println("short para");
	}
//	public void d(float a){
//		System.out.println("float der para");
//	}
//	public void d(double a){
//		System.out.println("double para");
//	}
	public void d(Character a){
		System.out.println("Character para");
	}
//	public void d(Double a){
//		System.out.println("Double para");
//	}
	public void d(Float a){
		System.out.println("Float para");
	}
//	public void d(Integer a){
//		System.out.println("Integer para");
//	}
	
	
	
	public static void main(String[] args) {
		
		Overriding o=new Overriding();
		Integer i=new Integer(5);
		o.d(5.5f);
		
	}

}
