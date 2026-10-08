/* Martin E. Lugo Menendez
 * 841-12-3726 Seccion: KJ1
 * Asignacion #2 - Project: Planet
 */

package javaProjects;

public class Planet {
	
private double diameter, mass;
private String name;				//data set to private
private String imageName;

public Planet() {
	name = "default";				//blank constructor
	imageName = "default image";
	diameter = 1.0;
	mass = 1.0;
}

public Planet(String name, double diameter, double mass, String imageName) {
	setName(name);
	setDiameter(diameter);						//main constructor
	setMass(mass);
	setImageName(imageName);
}

public Planet(Planet p) {
	this(p.getName(), p.getDiameter(), p.getMass(), p.getImageName());		//copy constructor
}
//"setters"
public void setName(String name){					
	this.name = name;
}

public void setDiameter(double diameter) {
	if (diameter <= 0)
		this.diameter = 1000;
	else
		this.diameter = diameter;
}

public void setMass(double mass) {
	if (mass <= 0)
		this.mass = 1000;
	else
		this.mass = mass;
}

public void setImageName(String imageName){
	this.imageName = imageName;
}
//"getters"
public double getDiameter(){
	return diameter;
}

public double getMass() {
	return mass;
}

public String getName() {
	return name;
}

public String getImageName() {
	return imageName;
}
//overriding Object's "toString()" inheritance method
public String toString() {
	String output = "Planet: " + getName();
	output += "\tdiameter = " + getDiameter();
	output += "\tmass = " + getMass();
	output += "\tImage file of the planet: " + getImageName();
	return output;
}
//verifying whether the objects have the same content
public boolean equals(Object obj) {
	if (obj instanceof Planet) {
		Planet other = (Planet) obj; 
		
		if(this.getDiameter() == other.getDiameter() && this.getMass() == other.getMass())
			return true;
		else
			return false;
}
	else
		return false;
}
}
