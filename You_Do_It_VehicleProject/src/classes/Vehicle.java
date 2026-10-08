package classes;

import java.text.*;

public abstract class Vehicle {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String powerSource = "";
	private int wheels = 0;
	private double price = 0.00;
	private InsurancePolicy insurance;
	private static int numOfVehicles = 0;
	
	public Vehicle(){
		
		numOfVehicles++;
		
	}
	
	public Vehicle(String powerSource, int wheels, double price, InsurancePolicy insurance) {
		
		setPowerSource(powerSource);
		setWheels(wheels);
		setPrice(price);
		setInsurancePolicy(insurance);
		numOfVehicles++;
		
	}
	
	public Vehicle(Vehicle v) {
		
		this(v.getPowerSource(), v.getWheels(), v.getPrice(), v.getInsurancePolicy());
		numOfVehicles++;
		
	}
	
	public void setPowerSource(String powerSource){
		
		this.powerSource = powerSource;
		
	}
	
	public void setWheels(int wheels){
		
		while(wheels < 0)
			
			System.out.println("Number of wheels cannot be less than zero");
		
		this.wheels = wheels;
		
	}
	
	public void setPrice(double price) {
		
		while(price < 0)
			
			System.out.println("Price cannot be less than zero");
		
		this.price = price;
		
	}
	
	public String getPowerSource() {
		
		return powerSource;
	}
	
	public int getWheels(){
		
		return wheels;
	}
	
	public double getPrice() {
		
		return price;
	}
	
	public void setInsurancePolicy(InsurancePolicy insurance) {
		
		this.insurance = insurance;
	}
	
	
	public InsurancePolicy getInsurancePolicy(){
		
		return insurance;
	}
	
	
	
	public String toString(){
		
		String output = "-------Vehicle-------";
		output += "\nPower Source: " + getPowerSource();
		output += "\nNumber of wheels: " + getWheels();
		output += "\nPrice: $" + df.format(getPrice());
		output += "Insurance policy --> " + getInsurancePolicy();
		
		return output;
		
	}
		
	public static void countNumOfVehicles() {
		
		System.out.println("Number of vehicles: " + numOfVehicles);
	}

}
