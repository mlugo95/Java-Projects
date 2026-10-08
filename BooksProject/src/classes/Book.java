package classes;

import java.text.DecimalFormat;

public abstract class Book {

	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String title;
	private double price;
	private static int numOfBooks = 0;
	
	public Book(String title) {
		
		setTitle(title);
		numOfBooks++;
		
	}
	
	public void setTitle(String title) {
		
		this.title = title;
		
	}
	
	
	public abstract double setPrice();
	
	
	public String getTitle(){
		
		return title;
		
	}
	
	public double getPrice() {
		
		return setPrice();
		
	}
	
	
	public String toString() {
		
		String output = "Book: " + getTitle();
		output += "\nPrice: $" + df.format(getPrice());
		
		return output;
		
	}
	
	public static void countNumOfBooks() {
		
		System.out.println("Number of books in shelf: " + numOfBooks);
	}
	
	
}
