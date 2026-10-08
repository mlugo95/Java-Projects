package classes;

import java.text.DecimalFormat;

public class NonFaculty extends Person implements Payable {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private double payRate, hrsWrk;
	
	public NonFaculty() {
		super();
		this.payRate = 0.0;
		this.hrsWrk = 0.0; 
		
	}
	
	public void setPayRate(double payRate){
		
		if(payRate < 0.0)
			
			System.out.println("The amount must be greater than zero.");
		
		this.payRate = payRate;
		
	}
	
	public void setHrsWrk(double hrsWrk){
		
		if(hrsWrk < 0.0)
			
			System.out.println("The amount must be greater than zero.");
		
		this.hrsWrk = hrsWrk;
		
	}
	
	public double getPayRate() {
		
		return payRate;
	}
	
	public double getHrsWrk() {
		
		return hrsWrk;
	}
	
	
	public double calcPayment() {
		
		return payRate * hrsWrk;
		
	}
	
	public void pay(){
		
		System.out.println("Their pay is $" + calcPayment());
		
	}
	
	public String toString(){
		
		String output = super.toString();
		output += "\nThe persons's pay rate is $" + df.format(getPayRate()) + "/hr";
		output += "\nThe persons's worked hours were " + getHrsWrk();
		return output;
		
	}

}
