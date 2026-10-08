package classes;

public class InsurancePolicy {
	
	private int yearsDuration;
	private char planType;
	
	public InsurancePolicy(int yearsDuration, char planType) {
		
		setYearsDuration(yearsDuration);
		setPlanType(planType);
		
	}
	
	public void setYearsDuration(int yearsDuration) {
		
		while(yearsDuration > 3)
			
			System.out.println("The insurance's lifespan cannot be longer than 3 years.");
		
		this.yearsDuration = yearsDuration;
		
	}
	
	public void setPlanType(char planType){
		
		if(planType == 'A' || planType == 'B' || planType == 'C')
			
			this.planType = planType;
			
	}
	
	public int getYearsDuration(){
		
		return yearsDuration;
	}
	
	public char getPlanType() {
		
		return planType;
	}
	
	public String toString() {
		
		String output = "\tDuration: " + getYearsDuration() + " year(s)" + "\t Plan: " + getPlanType();
		
		return output;
		
		
	}
	
	
}


