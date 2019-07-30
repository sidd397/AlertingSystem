package com.philips.bootcamp.input.controller;

import java.util.Scanner;
import java.util.Timer;

import com.philips.bootcamp.input.model.Patient;
import com.philips.bootcamp.input.services.ReminderTask;

public class AlertingSystemApp {
	public static void main(String[] args) {
		Patient patient = new Patient();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Patient ID");
		String patientId = scanner.nextLine();
		patient.setPatientId(patientId);
		// System.out.println("Enter lower and upper range for Temperature");
		// float lowerRange_temperature = scanner.nextFloat();
		// float upperRange_temperature = scanner.nextFloat();
		// System.out.println("Enter lower and upper range for Spo2");
		// float lowerRange_spo2 = scanner.nextFloat();
		// float upperRange_spo2 = scanner.nextFloat();
		// System.out.println("Enter lower and upper range for PulseRate");
		// float lowerRange_pulseRate = scanner.nextFloat();
		// float upperRange_pulseRate = scanner.nextFloat();
		scanner.close();
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new ReminderTask(patient), 0, 10 * 1000);
	}
}
