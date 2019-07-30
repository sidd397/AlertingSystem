package com.philips.bootcamp.input.services;

import com.philips.bootcamp.input.model.*;

import java.util.TimerTask;


public class ReminderTask extends TimerTask {
	Patient patient;
	String patientId;

	public ReminderTask(Patient patient) {
		this.patient = patient;
	}

	public void run() {
		new InputGenerator().updatePatientVitals(patient);
		new SendOutput().outputJson(patient);
	}
}