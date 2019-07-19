package com.car;

import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		 boolean quit=false;
		 String model,make;
		 int year=0;
		 String toQuit;
		 Scanner scan=new Scanner(System.in);
		 
		 //create empty object //enetring data from user and setting to the object
		 
		 	 while(!quit){
			 System.out.println("enter the data of car make,model and year bet 1990 to 2015");
			 make=scan.next();
			 model=scan.next();
			 year=scan.nextInt();
		//assigning data through constructor 
			 Car car=new Car(model, make, year);
				
			 //assign data to object
//			 car.set_make(make);
//			 car.set_model(model);
//			 car.set_year(year);
//			 scan.nextLine();
			 
			 System.out.println("here  data u provied"+ car);
			 System.out.println("press q to quit or any key to contiue");
			 toQuit=scan.next();
			 
			 if(toQuit.equalsIgnoreCase("Q"))
				 quit=true;
			 
		 }System.out.println("bye");
		 //car.quitScanner();
 
	}

}
