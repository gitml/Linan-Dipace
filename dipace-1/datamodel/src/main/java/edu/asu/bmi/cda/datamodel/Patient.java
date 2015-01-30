package edu.asu.bmi.cda.datamodel;

import java.io.*;

public class Patient {

	int age;
	String name, date, id;	
	int numRecords = 0;

	
	public Patient (String patientId, String observationDate) {
		age = 20;
		id = patientId;
		name = "Antonella";
		date = observationDate;
	}

	public String getId() {
		return (id);
	}
	public String getName() {
		return (name);
	}	
	public int getAge() {
		return (age);
	}

	public void readPatientVitals (String patientId, String observationDate) throws Exception {
		InputStream sr = Thread.currentThread().getContextClassLoader().getResourceAsStream("data/obs.csv");
		BufferedReader br = new BufferedReader(new InputStreamReader(sr));
		String line;
		String[] word;

		date = observationDate;
		id = patientId;
		
		line = br.readLine();
		while((line = br.readLine()) != null) {
			word = line.split(", ");
			if ((word[0].compareTo(id)==0) && (word[2].compareTo(date)>=0)) {
			numRecords++;
			System.out.println(line);
			}
		}
		sr.close();
	}
	
}

