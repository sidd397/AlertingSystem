package com.philips.bootcamp.output;

public class Patient {
	private String patientId;
	private float temperature;
	private float spo2;
	private float pulseRate;

	public Patient(String patientId, float temperature, float spo2, float pulseRate) {
		this.patientId = patientId;
		this.temperature = temperature;
		this.spo2 = spo2;
		this.pulseRate = pulseRate;
	}

	public String getPatientId() {
		return patientId;
	}

	public float getTemperature() {
		return temperature;
	}

	public float getSpo2() {
		return spo2;
	}

	public float getPulseRate() {
		return pulseRate;
	}

}
