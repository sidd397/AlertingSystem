package com.philips.bootcamp.output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class AlertingSystemOutputApp {
	PipedOutputStream pipedOutputStream;
	PipedInputStream pipedInputStream = new PipedInputStream();

	public AlertingSystemOutputApp(PipedOutputStream pipedOutputStream) {
		this.pipedOutputStream = pipedOutputStream;
		try {
			pipedInputStream.connect(pipedOutputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getInput() {
		byte[] buffer = new byte[100];
		try {
			pipedInputStream.read(buffer, 0, 100);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String input = new String(buffer);
		System.out.println(input);
		return input;
	}
	
	public static String generateTemperatureAlert(Patient patient) {
		boolean generateAlert = false;
		String alert = "";
		generateAlert = new Temperature().checkRange(patient.getTemperature());
		if (generateAlert) {
			alert = new AlertSystem().temperatureAlert(patient.getTemperature());
		}
		return alert;
	}

	public static String generateSpo2Alert(Patient patient) {
		boolean generateAlert = false;
		String alert = "";
		generateAlert = new Spo2().checkRange(patient.getSpo2());
		if (generateAlert) {
			alert = new AlertSystem().spo2Alert(patient.getSpo2());
		}
		return alert;
	}
	
	public static String generatePulseRateAlert(Patient patient) {
		boolean generateAlert = false;
		String alert = "";
		generateAlert = new PulseRate().checkRange(patient.getPulseRate());
		if (generateAlert) {
			alert = new AlertSystem().pulseRateAlert(patient.getPulseRate());
		}
		return alert;
	}
	
	public void generateAlert(Patient patient) {
		String temperatureAlert = "";
		String spo2Alert = "";
		String pulseRateAlert = "";
		temperatureAlert = generateTemperatureAlert(patient);
		pulseRateAlert = generatePulseRateAlert(patient);
		spo2Alert = generateSpo2Alert(patient);
		System.out.println("\t" + temperatureAlert + " " + pulseRateAlert + " " + spo2Alert);
	}
	
	public void performOperations() {
		String input = getInput();
		Patient patient = new VitalsReader().getVitals(input);
		generateAlert(patient);
	}

}