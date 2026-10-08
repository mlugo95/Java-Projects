package app;

import classes.*;

public class BookShelf {

	public static void main(String[] args) {
		
		Fiction book1 = new Fiction("Song of Ice And Fire");
		NonFiction book2 = new NonFiction("The Last Dance");
		
		System.out.println(book1.toString());
		
		System.out.println();
		
		System.out.println(book2.toString());
		
		System.out.println();
		
		Book.countNumOfBooks();
		
		System.out.println();
		
		Book[] arr = new Book[5];
		
		arr[0] = new Fiction("Don Quixote");
		arr[1] = new Fiction("Cordeluna");
		arr[2] = new NonFiction("Diary of Anne Frank");
		arr[3] = new NonFiction("The Proletariat");

		
		for(int i = 0; i < 4; i++)
			System.out.println("\n" + arr[i]);
		
		System.out.println();
		
		Book.countNumOfBooks();
		
	}

}
