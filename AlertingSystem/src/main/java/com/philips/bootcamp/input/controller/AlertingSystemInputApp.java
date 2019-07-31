package com.philips.bootcamp.input.controller;

import java.util.Scanner;
import java.util.Timer;

import com.philips.bootcamp.input.model.Patient;
import com.philips.bootcamp.input.services.PatientVitalsThread;

public class AlertingSystemInputApp {
	public static void main(String[] args) {
		Patient patient = new Patient();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Patient ID");
		String patientId = scanner.nextLine();
		patient.setPatientId(patientId);
		scanner.close();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new PatientVitalsThread(patient), 0, 10 * 1000);
	}
}
