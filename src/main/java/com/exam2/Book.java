package com.exam2;

public class Book implements Comparable<Book> {

	private String name;

	public int year;

	public Book(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public int compareTo(Book b) {
		return name.compareTo(b.name);
	}

	@Override
	public String toString() {
		return name + "(" + year + ")";
	}

}
