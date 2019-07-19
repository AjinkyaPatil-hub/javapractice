package com.car;

import java.util.Scanner;

public class Car {
	private String _model;
	private String _make;
	private int _year;
	Scanner scan=new Scanner(System.in);
	
	public Car(String _model, String _make, int _year) {
		super();
		this._model = _model;
		this._make = _make;
		set_year(_year);
	}


	public String get_model() {
		return _model;
	}


	public void set_model(String _model) {
		this._model = _model;
		
	}


	public String get_make() {
		return _make;
	}


	public void set_make(String _make) {
		this._make = _make;
	}


	public int get_year() {
		return _year;
	}


	//we have to validate the user data that is entered about car 
	//that if the user enter wrong year right data should be betw 1990 to 2015

	public void set_year(int year) {
		while(year < 1990 || year > 2019){
			System.out.println("plz enter valid car  between 1990 to 2019");
			year=scan.nextInt();
		}
		_year=year;	
	
	}


	@Override
	public String toString() {
		return "\n  Car [_model=" + _model + ", _make=" + _make + ", _year="
				+ Integer.toString(_year) + "]";
		
		
	}
	public void quitScanner(){
		scan.close();
	}
}
