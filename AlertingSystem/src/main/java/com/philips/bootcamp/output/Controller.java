package com.philips.bootcamp.output;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Controller {
	PipedOutputStream pipedOutputStream;
	PipedInputStream pipedInputStream = new PipedInputStream();

	public Controller(PipedOutputStream pipedOutputStream) {
		this.pipedOutputStream = pipedOutputStream;
		try {
			pipedInputStream.connect(pipedOutputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getInput() {
		byte[] buffer = new byte[100];
		try {
			pipedInputStream.read(buffer, 0, 100);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String input = new String(buffer);
		System.out.println(input);
		Patient patient = new InputReader().getValues(input);
		Controller.generateAlert(patient);
	}

	public static void generateAlert(Patient patient) {
		boolean generateAlert = false;
		String alert = null;
		generateAlert = new Temperature().checkRange(patient.getTemperature());
		if (generateAlert) {
			alert = new AlertSystem().temperatureAlert(patient.getTemperature());
			System.out.println(alert);
		}
		generateAlert = new Spo2().checkRange(patient.getSpo2());
		if (generateAlert) {
			alert = new AlertSystem().spo2Alert(patient.getSpo2());
			System.out.println(alert);
		}
		generateAlert = new PulseRate().checkRange(patient.getPulseRate());
		if (generateAlert) {
			alert = new AlertSystem().pulseRateAlert(patient.getPulseRate());
			System.out.println(alert);
		}
	}

}