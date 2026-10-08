package app;

import classes.*;

public class VehicleTester {

	public static void main(String[] args) {
		
		InsurancePolicy iP1 = new InsurancePolicy(2, 'B');
		InsurancePolicy iP2 = new InsurancePolicy(1, 'A');
		
		Car car = new Car();
		
		car.setPowerSource("V8");
		car.setNumOfSeats(2);
		car.setPrice(46678.97);
		car.setInsurancePolicy(iP2);
		System.out.println(car.toString());
		
		System.out.println();
		
		Motorbike moto = new Motorbike();
		
		moto.setPowerSource("MAC-5");
		moto.setWheels(0);
		moto.setPrice(8524.34);
		moto.setInsurancePolicy(iP1);
		System.out.println(moto.toString());
		
		System.out.println();
		
		Vehicle.countNumOfVehicles();

	}

}
