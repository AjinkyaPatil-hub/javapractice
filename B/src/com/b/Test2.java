package com.b;

class Testt{

	   public Number  d(){
		System.out.println("ss");
		return 0;
	}
}

public class Test2 extends Test {
	
	 	public Number d(){
	 		
		System.out.println("dd");
		return 0;
	}
	
		
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.d();
	
	}
}
 
