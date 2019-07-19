package a.c;

class Mobile {
	public void call() {
		System.out.println("Mobile.call()");
	}
}

class Samsung extends Mobile {

	public void call() {
		System.out.println("Samsung.call()");
	}

	public void camera() {
		System.out.println("Samsung.camera()");
	}
	
}

public class UpCasting {

	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.call();
		s.camera();
		/*
		 * this is called upcasting 
		 * where sub class samsung is casted into super class in mobile
		 */
		Mobile m =(Mobile)s;
		m.call();
		System.out.println("no new object is created"+s);
		System.out.println(m);
		
		//another way to do upcast
		Mobile m1=new Samsung();
		System.out.println(m1);
		m1.call();
		
		
	}
}
