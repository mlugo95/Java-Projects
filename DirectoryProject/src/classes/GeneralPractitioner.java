package classes;

public class GeneralPractitioner extends PCP {

	private MedicalDirectory info;
	
	
	public GeneralPractitioner() {
		
		
	}
	
	public GeneralPractitioner(MedicalDirectory info, String officeDays, String officeHours){
		
		super(officeDays, officeHours);
		setInfo(info);
	}
	
	public GeneralPractitioner(GeneralPractitioner gp) {
		
		this(gp.getInfo(), gp.getOfficeDays(), gp.getOfficeHours());
		
	}
	
	
	public void setInfo(MedicalDirectory info) {
		
		this.info = info;
		
	}
	
	public MedicalDirectory getInfo() {
		
		return info;
		
	}
	
	public String toString() {
		String output = getInfo().toString();
		output += "\n" + super.toString();
		return output;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof GeneralPractitioner) {
			GeneralPractitioner other = (GeneralPractitioner) obj;
		if (this.getInfo() == other.getInfo() && this.getOfficeDays() == other.getOfficeDays() && this.getOfficeHours() == other.getOfficeHours());
			return true;
		}
		else
			return false;
	}
	
}
