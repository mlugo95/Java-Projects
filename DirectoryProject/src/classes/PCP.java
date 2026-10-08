package classes;

public abstract class PCP {

	private String officeDays, officeHours;
	private static int numOfPhysicians = 0;
	
	public PCP() {
		this.officeDays = "none";
		this.officeHours = "none";
		numOfPhysicians++;
	}
	
	public PCP(String officeDays, String officeHours) {
		setOfficeDays(officeDays);
		setOfficeHours(officeHours);
		numOfPhysicians++;
	}
	
	public PCP(PCP p) {
		this(p.getOfficeDays(), p.getOfficeHours());
		numOfPhysicians++;
	}
	
	
	public void setOfficeDays(String officeDays) {
		
		this.officeDays = officeDays;
		
	}
	
	public void setOfficeHours(String officeHours) {
		
		this.officeHours = officeHours;
		
	}
	
	public String getOfficeDays() {
		
		return officeDays;
		
	}
	
	public String getOfficeHours() {
		
		return officeHours;
		
	}
	
	
	public String toString() {
		
		String output = getOfficeDays();
		output +="\n" + getOfficeHours();
		
		return output;
		
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof PCP) {
			PCP other = (PCP) obj; 
			
			if(this.getOfficeDays() == other.getOfficeDays() && this.getOfficeHours() == other.getOfficeHours())
				return true;
			else
				return false;
	}
		else
			return false;
	}
	
	public static void countNumOfPhysicians() {
		
		System.out.println("The number of physicians in the directory are: " + numOfPhysicians);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
