package classes;

public class NonFiction extends Book {
	
	public NonFiction(String title) {
		
		super(title);
		
	}
	
	public double setPrice() {
		
		return 37.99;
		
	}
	
	public String toString() {
		
		String output = super.toString();
		output += "\nGenre: Non Fiction";
		
		return output;
		
	}

}
