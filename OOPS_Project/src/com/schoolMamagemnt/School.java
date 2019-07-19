package com.schoolMamagemnt;
import java.awt.List;


public class School {
	
	/**
	 * implements teacher and student using array list 
	 * school can have many students. we cannot use array because teacher may change tomm 
	 * so we are using arraylist
	 * many teachers
	 */

	private java.util.List<Teacher> teachers;
	private java.util.List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpend;

	
	//constructor
	public School(java.util.List<Teacher> teachers,
			java.util.List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned=0;
		totalMoneySpend=0;
	}
	//we have to alter all so we need all getter and setter method
	/**
	 * 
	 * @return 
	 */

	public java.util.List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * adds a teacher to the school
	 * @param teachers to be added
	 */
	public void addTeachers(Teacher teachers) {
		this.teachers.add(teachers);	
	}

	/**
	 * 
	 * @return list of students
	 */
	public java.util.List<Student> getStudents() {
		return students;
	}

	/**
	 * add a student to the scholl
	 * @param students to be added
	 */
	public void addStudents(Student students) {
		this.students.add(students);
	}

	/**
	 * 
	 * @return the total money earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * adds the total money
	 * @param MoneyEarned
	 */
	public static  void uppdateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}

	/**
	 * 
	 * @return
	 */
	public int getTotalMoneySpend() {
		return totalMoneySpend;
	}
	/**
	 * update the money spend by the school
	 * @param totalMoneySpend  is teacher salary
	 */

	public static void updateTotalMoneySpend(int totalMoneySpend) {
		totalMoneyEarned -= totalMoneySpend;
	}
	

}
