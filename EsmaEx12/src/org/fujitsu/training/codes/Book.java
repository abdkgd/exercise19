package org.fujitsu.training.codes;

import org.fujitsu.training.codes.exception.BookException;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	private static int counter = 0;
	
	private Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public static Book getInstance(String name, Author author, double price, int qtyInStock) throws BookException, Exception{

		if (counter <= 5) {
			counter++;
			return new Book(name, author, price, qtyInStock);
		}

		throw new BookException();
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	@Override
	public String toString() {
		return String.join(" ","Books: " ,name, author.getName(), price + "", qtyInStock + "");
	}

}
