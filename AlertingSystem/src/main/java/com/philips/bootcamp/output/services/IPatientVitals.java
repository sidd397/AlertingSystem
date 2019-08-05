package com.philips.bootcamp.output.services;

public interface IPatientVitals {
	public boolean checkRange(float value);
	public String alertMessage(float value);
}