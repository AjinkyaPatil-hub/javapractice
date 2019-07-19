/*
 * 	can be done in same class and also in different class also
 * 	same name (diff para)
 * 	return type and access modifier are not problem
 * 	we have to see only method name and parameter
 * 	parameter rules
 * 	1>if we pass primitive then it will look for primitive ie same type
 * 	2>if not then look for wider than primitive to do auto widening
 * 	3>if not then look for same wrapper class
 *  4>if not then look for the super class of wrapper class i.e Number / Object
 *  5>if not error will get displayed 
 */

package com.b;


class Demod{
	public Object overload(Object a){
		System.out.println("Demod.overload()");
		return 2;
	}
		public float  changeSize(float a,Integer b){
			System.out.println("Demod.changeSize()");
			return 0;
			
			//return b;
	}
}

public class Overloading extends Demod {

		public Float changeSize(Integer a,Float b){
			System.out.println("Overloading.changeSize()");
			return null;
		
	}
	
	public static void main(String[] args) {
	
		
		Overloading o=new Overloading();
//		o.overload(5);
		Integer i=new Integer(5);
		o.changeSize(5	,null);
	}

}
