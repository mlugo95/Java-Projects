package app;

import classes.*;

import javax.swing.JOptionPane;

public class MedicalDirectoryApp {

	public static void main(String[] args) {
		
		MedicalDirectory d0 = new MedicalDirectory("Dr. Rubén Torres Villa", "Medicina Interna", "A2", "(939)-234-9870");
		MedicalDirectory d1 = new MedicalDirectory("Dra. Lydia G. Ramos Vélez", "Medicina Interna", "A3", "(787)-354-7099");
		MedicalDirectory d2 = new MedicalDirectory("Dr. Salvador I. Muñoz Ortíz", "Medicina Interna", "A4", "(787)-126-6544");
		MedicalDirectory d3 = new MedicalDirectory("Dra. Carla Fernández Silva", "Medicina de Familia", "B1", "(787)-570-9900");
		MedicalDirectory d4 = new MedicalDirectory("Dr. Ignacio Pérez Rodíguez", "Medicina de Familia", "B2", "(939)-321-7088");
		MedicalDirectory d5 = new MedicalDirectory("Dr. Reynaldo Martínez", "Medicina General", "C1", "(939)-218-3032");
		MedicalDirectory d6 = new MedicalDirectory("Dr. Martín E. Lugo Menéndez", "Medicina General", "C2", "(787)-348-5212");
		
		InternalMedicine md_0 = new InternalMedicine();
		md_0.setInfo(d0);
		md_0.setOfficeDays("Lunes y Miercoles");
		md_0.setOfficeHours("7:00am - 4:00pm");
		md_0.setHospDays("Jueves, Viernes y Sábado");
		
		InternalMedicine md_1 = new InternalMedicine();
		md_1.setInfo(d1);
		md_1.setOfficeDays("Lunes - Viernes");
		md_1.setOfficeHours("8:00am - 5:00pm");
		md_1.setHospDays("No disponible");
		
		InternalMedicine md_2 = new InternalMedicine();
		md_2.setInfo(d2);
		md_2.setOfficeDays("Martes y Jueves");
		md_2.setOfficeHours("7:00am - 4:00pm");
		md_2.setHospDays("Lunes, Miercoles y Viernes");
		
		FamilyMedicine md_3 = new FamilyMedicine();
		md_3.setInfo(d3);
		md_3.setOfficeDays("Lunes - Viernes");
		md_3.setOfficeHours("7:00am - 4:00pm");
		md_3.setHospDays("No disponible");
		
		FamilyMedicine md_4 = new FamilyMedicine();
		md_4.setInfo(d4);
		md_4.setOfficeDays("Lunes y Miercoles");
		md_4.setOfficeHours("7:00am - 4:00pm");
		md_4.setHospDays("Martes, Jueves y Viernes");
		
		GeneralPractitioner md_5 = new GeneralPractitioner();
		md_5.setInfo(d5);
		md_5.setOfficeDays("Lunes - Viernes");
		md_5.setOfficeHours("7:00am - 4:00pm");
		
		GeneralPractitioner md_6 = new GeneralPractitioner();
		md_6.setInfo(d6);
		md_6.setOfficeDays("Lunes - Viernes");
		md_6.setOfficeHours("8:00am - 5:00pm");
		
		String showOp;
		char opChar;
		String loop;
		
		do {
				
			showOp = JOptionPane.showInputDialog("\tDIRECTORIO MEDICO" + "\n\tPRPCP MEDICAL GROUP" + "\n1-Oficinas Medicina Interna" + "\n2-Oficinas Medicina de Familia" + "\n3-Oficinas Medicina General" + "\n0-Salir");
			
			if(showOp.isEmpty())
				opChar = '0';
		
			if (showOp.charAt(0) == '0')
				opChar = '0';
		
			opChar = showOp.charAt(0);
		
			switch(opChar) {
		
			case '1': JOptionPane.showMessageDialog(null, md_0.toString() + "\n\n" + md_1.toString() + "\n\n" + md_2.toString());
				loop = JOptionPane.showInputDialog("r-Regresar Menu Principal" + "\ns-Salir");
				opChar = loop.charAt(0);
			break;
		
			case '2': JOptionPane.showMessageDialog(null, md_3.toString() + "\n\n" + md_4.toString());
				loop = JOptionPane.showInputDialog("r-Regresar Menu Principal" + "\ns-Salir");
				opChar = loop.charAt(0);		
			break;
		
			case '3': JOptionPane.showMessageDialog(null, md_5.toString() + "\n\n" + md_6.toString());
				loop = JOptionPane.showInputDialog("r-Regresar Menu Principal" + "\ns-Salir");
				opChar = loop.charAt(0);
			}
				
		} while (opChar != '0' && opChar != 's');
		
		JOptionPane.showMessageDialog(null, "Usted ha salido del programa.");
		
		System.exit(0);
		
		//PCP.countNumOfPhysicians();
	}

}
