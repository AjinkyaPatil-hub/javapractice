package com.b.bb;

class Animal {
}

class Horse extends Animal {
}

public class UseAnimals extends Horse {
	public void doStuff(Animal a) {

		System.out.println("In the Animal version");
	}

	public void doStuff(Horse h) {
		System.out.println("In the Horse version");
	}

	public static void main(String[] args) {

		UseAnimals ua = new UseAnimals();
		Animal animalObj = new Animal();
		Horse horseObj = new Horse();
		//ua.doStuff(animalObj);
		//ua.doStuff(horseObj);
		
		Animal animalRefToHorse = new Horse();
		Horse horseObj2=new UseAnimals();
		ua.doStuff(null);
		//ua.doStuff(animalRefToHorse);
		
	
	}

}
