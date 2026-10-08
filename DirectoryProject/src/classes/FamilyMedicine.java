package classes;

import interfaces.Hospitalist;

public class FamilyMedicine extends PCP implements Hospitalist {
	
	private MedicalDirectory info;
	private String hospitalDays;
	
	public FamilyMedicine() {
		
		
	}

	public FamilyMedicine(MedicalDirectory info, String officeDays, String officeHours, String hospitalDays) {
		super(officeDays, officeHours);
		setInfo(info);
		setHospDays(hospitalDays);
		
	}
	
	public FamilyMedicine(FamilyMedicine fm) {
		
		this(fm.getInfo(), fm.getOfficeDays(), fm.getOfficeHours(), fm.getHospDays());
		
	}
	
	public void setInfo(MedicalDirectory info) {
		
		this.info = info;
		
	}
	
	public void setHospDays(String hospitalDays) {
		
		this.hospitalDays = hospitalDays;
		
	}
	
	public MedicalDirectory getInfo() {
		
		return info;
		
	} 
	
	public String getHospDays() {
		
		return hospitalDays;
		
	}
	
	public String toString() {
		
		String output = getInfo().toString();
		output += "\n" + super.toString();
		output += "\nHospital: " + getHospDays();
		
		return output;
		
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof FamilyMedicine){
			FamilyMedicine other = (FamilyMedicine) obj;
			if(this.getInfo() == other.getInfo() && this.getOfficeDays() == other.getOfficeDays() && this.getOfficeHours() == other.getOfficeHours() && this.getHospDays() ==other.getHospDays());
			return true;
		}
		
		else
			return false;
		
	}
	
	
	
}
