package app;

import classes.*;

public class PayRollApp {

	public static void main(String[] args) {
		
		
		Address adr1 = new Address();
		adr1.setCity("Memphis");
		adr1.setDesc("St. 33");
		adr1.setZipCode("8765");
		
		Person fac1 = new Faculty();
		
		fac1.setName("Pedro");
		fac1.setSegSocial("111-11-1111");
		fac1.setAddress(adr1);
		//fac1.setSalary(25.5);
		
		System.out.println(fac1.toString());
		fac1.pay();
		
		System.out.println();
		
		Address adr2 = new Address();
		adr2.setCity("Memphis");
		adr2.setDesc("Olson Blv.");
		adr2.setZipCode("8765");
		
		Person nonFac1 = new NonFaculty();
		
		nonFac1.setName("Ernie");
		nonFac1.setSegSocial("222-22-2222");
		nonFac1.setAddress(adr2);
		//nonFac1.setPayRate(25);
		//nonFac1.setHrsWrk(4);
		
		System.out.println(nonFac1.toString());
		nonFac1.pay();
		
		System.out.println();
		
		Address adr3 = new Address();
		adr3.setCity("Memphis");
		adr3.setDesc("Grand Ave Towers Apt #76");
		adr3.setZipCode("8765");
		
		Person stu1 = new Student();
		
		stu1.setName("Tiffany");
		stu1.setSegSocial("333-33-3333");
		stu1.setAddress(adr3);
		//stu1.setID("444-44-4444");
		
		System.out.println(stu1.toString());
		stu1.pay();
		
		System.out.println();
		
		Person.countNumOfPersons();
		
		System.out.println();
		
		Person[] arr = new Person[3];
		
		arr[0] = fac1;
		arr[1] = nonFac1;
		arr[2] = stu1;
		
		for(int i = 0; i <= arr.length - 1; i++)
			
			System.out.println("\n" + arr[i]);
		
	}

}
