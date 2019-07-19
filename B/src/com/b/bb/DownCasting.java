package com.b.bb;


class Parent{
	public void show(){
		System.out.println("Parent.show()");
	}
}


public class DownCasting extends Parent {

	public void show(){
		super.show();
		System.out.println("DownCasting.show()");
	}
	
	public void down(){
		System.out.println("DownCasting.down()");
	}
	
	
	public static void main(String[] args) {
		
		DownCasting dc=new DownCasting();//creating a simple obj
		dc.show();
		//upcasting
//		Parent p=new DownCasting();
//		p.show();//downcast method show will be called due to overriden 
//		//downcasting i want to acces the method down and show of the downcast class so we will do 
		//downcasting
		
//		Parent p= new DownCasting();
//		
//		DownCasting dc=(DownCasting)p;
//		dc.show();dc.down();
		
		
	}

}
