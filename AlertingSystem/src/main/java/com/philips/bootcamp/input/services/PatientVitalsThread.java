package com.philips.bootcamp.input.services;

import com.philips.bootcamp.input.model.*;

import java.util.TimerTask;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PatientVitalsThread extends TimerTask {
	Patient patient;

	public PatientVitalsThread(Patient patient) {
		this.patient = patient;
	}

	public void run() {
		Lock lock = new ReentrantLock();
		lock.lock();
		try {
			new PatientVitalsUpdater().updatePatientVitals(patient);
			new SendOutput().outputJson(patient);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}