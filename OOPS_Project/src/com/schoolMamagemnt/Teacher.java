package com.schoolMamagemnt;

public class Teacher {

	
	/**
	 * this class is responsible of keeping the class of track 
	 * id,name and salary
	 * teacher class
	 */
	private int id;
	private String name;
	private int salary;

	/**
	 * this is const is used to create the obj of teacher
	 * @param id of the teacher
	 * @param name of the teacher
	 * @param salary of the teacher
	 */
	public Teacher(int id, String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
	
	/**
	 * @return the id for current teacher
	 */
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSaString(){
		return salary;
	}

	public void setSalary(int salary){
		this.salary=salary;
		
	}
}

