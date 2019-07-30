package com.philips.bootcamp.input.model;

public class Patient {
	private String patientId;
	private float temperature;
	private float spo2;
	private float pulseRate;

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public float getTemperatureVal() {
		return temperature;
	}

	public float getSpo2Val() {
		return spo2;
	}

	public float getPulseRateVal() {
		return pulseRate;
	}

	public void setTemperature(float temperatureVal) {
		this.temperature = temperatureVal;
	}

	public void setSpo2(float spo2Val) {
		this.spo2 = spo2Val;
	}

	public void setPulseRate(float pulseRateVal) {
		this.pulseRate = pulseRateVal;
	}
}