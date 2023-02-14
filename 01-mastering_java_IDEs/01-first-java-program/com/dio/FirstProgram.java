package com.dio;

import com.dio.model.Cat;

public class FirstProgram {

	public static void main(String[] args) {
		
		Cat cat = new Cat("Felix", "orange", 3);
		Books book = new Books("Travels", "Carol");

		System.out.println(cat);
		System.out.println(book);
	}
	

}

class Books {
	private String nameBook;
	private String author;
	
	public Books(String nameBook, String author) {
		this.nameBook = nameBook;
		this.author = author;
	}
}