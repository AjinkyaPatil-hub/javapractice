package com.b.bb;

class AnimalP {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}

	public void eat(String s) {
		System.out.println("Animal eating " + s);
	}

}

class HorseC extends AnimalP {
	public void eat() {
		System.out.println("Horse eating hay ");
	}

	public void eat(String s) {
		System.out.println("Horse eating " + s);
	}
}

public class Poly {

	public static void main(String[] args) {
		AnimalP a=new HorseC();
		a.eat("car");
	}

}
