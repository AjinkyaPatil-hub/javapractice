package com.book;

public class BookTest {

	public static void main(String[] args) {
		
		Book b=new Book("aa", "sasa", 20.0, "8/8/2018");
		b.toString();
		b.setBookAuthor("ss");
		System.out.println(b);

	}

}
