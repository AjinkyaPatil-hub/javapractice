package com.book;

public class Book {

	private String bookName;
	private String bookAuthor;
	private double bookRate;
	private String copyRightDate;
	public Book(String bookName, String bookAuthor, double bookRate,
			String copyRightDate) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookRate = bookRate;
		this.copyRightDate = copyRightDate;
	}
	
	public void setBookName(String bookName){
		this.bookName=bookName;
		
	}
	public String getBookName(){
		return bookName;
		
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookRate() {
		return bookRate;
	}

	public void setBookRate(double bookRate) {
		this.bookRate = bookRate;
	}

	public String getCopyRightDate() {
		return copyRightDate;
	}

	public void setCopyRightDate(String copyRightDate) {
		this.copyRightDate = copyRightDate;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName +" \n"+ " bookAuthor=" + bookAuthor
				+ "\n" + " bookRate=" + bookRate +"\n"+ " copyRightDate=" + copyRightDate
				+ "]";
	
	}
	
	
}
