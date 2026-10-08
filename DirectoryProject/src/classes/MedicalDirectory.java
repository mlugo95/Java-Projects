package classes;

public class MedicalDirectory {

	private String name, specialty, office, phone;
	
	public MedicalDirectory(String name, String specialty, String office, String phone) {
		
		setName(name);
		setSpecialty(specialty);
		setOffice(office);
		setPhone(phone);
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public void setSpecialty(String specialty) {
		
		this.specialty = specialty;
		
	}
	
	public void setOffice(String office){
		
		this.office = office;
		
	}
	
	public void setPhone(String phone){
		
		this.phone = phone;
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public String getSpecialty() {
		
		return specialty;
		
	}
	
	public String getOffice() {
		
		return office;
		
	}
	
	public String getPhone() {
		
		return phone;
		
	}
	
	public String toString() {
		
		String output = getName();
		output += "\n" + getSpecialty();
		output += "\n" + getOffice();
		output += "\n" + getPhone();
		return output;
		
	}
	
	
	public boolean equals(Object obj) {
		if (obj instanceof MedicalDirectory) {
			MedicalDirectory other = (MedicalDirectory) obj; 
			
			if(this.getName() == other.getName() && this.getSpecialty() == other.getSpecialty() && this.getOffice() == other.getOffice() && this.getPhone() == other.getPhone())
				return true;
			else
				return false;
	}
		else
			return false;
	}
	
	
}
