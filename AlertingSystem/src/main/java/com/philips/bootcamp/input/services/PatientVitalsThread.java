package com.philips.bootcamp.input.services;

import com.philips.bootcamp.input.model.*;

import java.util.TimerTask;


public class PatientVitalsThread extends TimerTask {
	Patient patient;

	public PatientVitalsThread(Patient patient) {
		this.patient = patient;
	}

	public void run() {
		new PatientVitalsUpdater().updatePatientVitals(patient);
		new SendOutput().outputJson(patient);
	}
}