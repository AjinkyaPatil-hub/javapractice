package com.b;

public class Wrappers {


	
	 private int test(Float i) {
		  System.out.println("method 1");
		return 0;
		 }
		 public Double test(Double i) {
		  System.out.println("method 2");
		return i;
		 } 
		 
		 
		 public static void main(String[] args) {

			 //Integer i=new Integer(9);
			 Wrappers wp=new Wrappers();
			 wp.test(5.5);
			 
			 
			 
			 
//			 
//			 Boolean b=true;
//			 Boolean d=true;
//			
//			 System.out.println((b==d));
//
//			 System.out.println((b.equals(d)));
//			 Wrappers obj=new Wrappers();
//			 	obj.test(5,6);	
//			 	
//		 Integer i=new Integer(6);
//		 Integer ii=new Integer(0);
//		 ii=i;
//		// i=1;
//		 System.out.println(i);
		 }

}
