package classes;

public class Student extends Person {

	public String id;
	
	public Student() {
		
		super();
		this.id = "000-00-0000";
		
	}
	
	public void setID(String id){
		
		while(id.length() != 11)
			
			System.out.println("Enter a correct ID number");
		
		this.id = id;
	}
	
	public String getID(){
		
		return id;
		
	}
	
	public void pay(){
		
		System.out.println("Amount to pay is $2200.00");
		
	}
	
	public String toString(){
		
		String output = super.toString();
		
		output += "\nThe student's ID is " + getID();
		
		return output;
		
	}
	
	
	
}
