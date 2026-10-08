package classes;

import java.text.DecimalFormat;

public class Faculty extends Person implements Payable {
	
	private double salary;
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	public Faculty() {
		
		super();
		this.salary = 0.0;
		
	}
	
	
	public void setSalary(double salary) {
		
		if (salary < 0.0)
			System.out.println("The amount must be greater than zero.");
		this.salary = salary;
		
	}
	
	public double getSalary() {
		
		return salary;
	}
	
	public double calcPayment() {
		
		return salary * 8;
		
	}
	
	public void pay(){
		
		System.out.println("The person's regular pay is $" + df.format(calcPayment()));
		
	}
	
	public String toString(){
		
		String output = super.toString();
		output += "\nThe persons's salary is $" + df.format(getSalary()) + "/hr";
		
		return output;
		
	}


}
