package classes;

public class Motorbike extends Vehicle {
	
	public final int WHEELS = 2;
	public final int SEATS = 1;
	
	
	public Motorbike() {
		
		super();
		
		
	}
	
	public int getWheels(){
		
		return WHEELS;
	}
	
	public int getSeats(){
		
		return SEATS;
	}
	
	
	public String toString(){
		
		String output = "-------Moto---------";
		output += "\nPower Source: " + getPowerSource();
		output += "\nNumber of seats: " + getSeats();
		output += "\nNumber of wheels: " + getWheels();
		output += "\nPrice: $" + df.format(getPrice());
		output += "\nInsurance policy -->" + getInsurancePolicy();
		
		return output;
	
	}	
	
	
}
