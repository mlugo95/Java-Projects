package classes;

public class Fiction extends Book {
	
	public Fiction(String title) {
		
		super(title);
		
	}
	
	public double setPrice() {
		
		return 24.99;
		
	}
	
	public String toString() {
		
		String output = super.toString();
		output += "\nGenre: Fiction";
		
		return output;
		
	}
	
}
