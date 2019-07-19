package a.b;

import a.c.B;

	interface Animated{
		public void animate();
	}
	
		
	class GameShape{
		void displayGameshape(){
			
		}
	}

public class C extends GameShape implements Animated {
	
	void c(){
		
	}
	
	void displayGameshape(){
		System.out.println("in C");
	}
	@Override
	public void animate() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		C c=new C();
		
		Animated a= c ;
		a.animate();
		
		GameShape g=  c;
		
		g.displayGameshape();
		
		Object o=c;
		
		
		
	}

}

