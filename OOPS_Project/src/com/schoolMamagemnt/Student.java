package com.schoolMamagemnt;

public class Student {
	
	//this class is used to keep the track 
	//of the students fees,name,grade and fees paid

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * fees for every student would be 50000 per year
	 * fees paid intial is 0
	 * @param id unique id
	 * @param name of student
	 * @param grade grade of the student
	 */
	//construct role is create a stud object by initlizing the object

	public Student(int id,String name,int grade){
		this.feesPaid=0;
		this.feesTotal=50000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	

	//not required to  alter student name,id so set method is not required
	/**
	 * used to upgrade student grade
	 * @param grade is used to return new grade of student
	 */
	public void setGrade(int grade){
		this.grade=grade;
	}
	
	
	/**
	 * feesPaid must keep adding the fees to feespaid feild
	 * add the fees to the paid
	 * the school is receive the the funds
	 * @param fees that the students pay
	 * 
	 */
	public void payFees(int fees){
		feesPaid+=fees;
		School.uppdateTotalMoneyEarned(feesPaid);
	}
/**
 * 
 * @return the student id
 */

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getGrade() {
		return grade;
	}


	public int getFeesPaid() {
		return feesPaid;
	}


	public int getFeesTotal() {
		return feesTotal;
	}
	/**
	 * 
	 * @return remaning fees
	 */
	public int getRemaningFees(){
		return feesTotal-feesPaid;
	}
}
