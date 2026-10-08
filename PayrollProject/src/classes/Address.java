package classes;

public class Address {

	private String desc, city, zipCode;
	
	public Address() {
		
		this.desc = "";
		this.city = "";
		this.zipCode = "";
		
	}
	
	public void setDesc(String desc) {
		
		this.desc = desc;
		
	}
	
	public void setCity(String city) {
		
		this.city = city;
		
	}
	
	public void setZipCode(String zipCode){
		
		this.zipCode = zipCode;
		
	}
	
	public String getDesc() {
		
		return desc;
	}
	
	public String getCity(){
		
		return city;
	}
	
	public String getZipCode() {
		
		return zipCode;
	}
	
	public String toString(){
		
		String output = "";
		output += "The area is " + getDesc();
		output += "\nThe city is " + getCity();
		output += "\nThe zip code is " + getZipCode();
		
		return output;
		
	}
	
	
}
