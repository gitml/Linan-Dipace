package edu.asu.bmi.cda.example;

import edu.asu.bmi.cda.datamodel.*;

public class mainClass {

	public static void main(String[] args) throws Exception {
		
		 String id="mrn001", date="0000-00-00";
			
		 if (args.length==1 ) {
			 date = args[0];
			 // Add checks on date format.
		 }
		 else if (args.length>=2 ) {
			 date = args[0];
			 id = args[1];
		 }
		 System.out.println("patientId: " + id + "\ndate: " + date + "\n");
		 
		Patient myPatient = new Patient(id,date);
		System.out.println("Patient ID:\t" + myPatient.getId());
		System.out.println("Patient Name:\t" + myPatient.getName());
		System.out.println("patientAge\t" + myPatient.getAge());
		
		myPatient.readPatientVitals(id,date);
	}

}

