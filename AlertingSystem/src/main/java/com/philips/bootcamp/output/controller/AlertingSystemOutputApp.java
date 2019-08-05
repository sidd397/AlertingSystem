package com.philips.bootcamp.output.controller;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import com.philips.bootcamp.output.model.*;
import com.philips.bootcamp.output.services.*;

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

	public void performOperations() {
		String input = getInput();
		Patient patient = new VitalsReader().getVitals(input);
		System.out.println(generateAlert(patient));
	}

	public String getInput() {
		byte[] buffer = new byte[100];
		try {
			pipedInputStream.read(buffer, 0, 100);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String input = new String(buffer);
		input = input.substring(0, input.indexOf("|"));
		if (input.startsWith("{") && input.endsWith("}")) {
			System.out.println(input);
			return input;
		} else {
			return null;
		}
	}

	public static String generateAlert(Patient patient) {
		String alert = "\t";
		float temperatureValue = patient.getTemperature();
		float spo2Value = patient.getSpo2();
		float pulseRateValue = patient.getPulseRate();
		Temperature temperature = new Temperature();
		if (temperature.checkRange(temperatureValue)) {
			alert = alert + temperature.alertMessage(temperatureValue) + " ";
		}
		Spo2 spo2 = new Spo2();
		if (spo2.checkRange(spo2Value)) {
			alert = alert + spo2.alertMessage(spo2Value) + " ";
		} 
		PulseRate pulseRate = new PulseRate();
		if (pulseRate.checkRange(pulseRateValue)) {
			alert = alert + pulseRate.alertMessage(pulseRateValue);
		}
		return alert;
	}
}