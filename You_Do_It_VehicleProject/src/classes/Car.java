package classes;

public class Car extends Vehicle implements Seats{
	
	public final int WHEELS = 4;
	public int seats;
	
	
	public Car() {
		
		super();
		
		
	}
	
	public void setNumOfSeats(int seats) {
		
		if(seats != 2 && seats != 4) {
		
			System.out.println("Cars can only have 2 or 4 seats");
			System.out.println();
		}
		
		else
			this.seats = seats;
	}
		
	public int getWheels() {
		
		return WHEELS;
	}
	
	public int getNumOfSeats() {
		
		return seats;
	}
	
	public String toString(){
		
		String output = "-------Car---------";
		output += "\nPower Source: " + getPowerSource();
		output += "\nNumber of seats: " + getNumOfSeats();
		output += "\nNumber of wheels: " + getWheels();
		output += "\nPrice: $" + df.format(getPrice());
		output += "\nInsurance policy -->" + getInsurancePolicy();
		
		return output;
	
	}	

}
