package classes;

public abstract class Person {
	
	private String segSocial, name;
	private Address address;
	private static int numOfPersons = 0;
	
	public Person() {
		
		this.segSocial = "000-00-0000";
		this.name = "";
		this.address = address;
		numOfPersons++;
		
	}
	
	public void setSegSocial(String segSocial) {
		
		while (segSocial.length() != 11)
			System.out.println("Enter correct SSN");
		this.segSocial = segSocial;
		
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public void setAddress(Address address) {
		
		this.address = address;
	}
	
	
	public String getSegSocial() {
		
		return segSocial;
	}
	
	public Address getAddress() {
		
		return address;
	}
	
	public String getName() {
		
		return name;
	}
	
	
	public String toString(){
		
		String output;
		
		output = "";
		output += "The person's SSN is " + getSegSocial();
		output += "\nThe person's name is " + getName();
		output += "\n"+ getAddress();
		
		return output;
		
	}
	
	
	public abstract void pay();
	
	public static void countNumOfPersons() {
		  
		 System.out.println("Number of person(s) is/are " + numOfPersons);
			
		}
	
}
