/* Martin E. Lugo Menendez
 * 841-12-3726 Seccion: KJ1
 * Asignacion #2 - Project: Planet
 */

package javaProjects;

import javaProjects.Planet;

public class PlanetTest {

	public static void main(String[] args) {
		Planet p0 = new Planet();
		Planet p1 = new Planet("Venus", 12345.6, 23456.7, "venus.png");
		Planet p2 = new Planet(p1);
	
		p1.setName("Mars");
		p1.setDiameter(8670.4);
		p1.setMass(14365.23);
		p1.setImageName("mars.png");
		
		System.out.println(p0.getMass());	//displays this planet's mass on console 
		System.out.println();
		System.out.println(p1.toString());	//displays this planet's statements on console
		System.out.println();
		System.out.println(p1 == p2);	//compares one planet to the other and verifies if they are the same object or not
		
	}

}
