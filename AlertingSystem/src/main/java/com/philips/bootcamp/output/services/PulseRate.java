package com.philips.bootcamp.output.services;

public class PulseRate implements IPatientVitals {
	public boolean checkRange(float value) {
		boolean isCritical = false;
		if (value < 40) {
			isCritical = true;
		} else if (value >= 40 && value <= 60) {
			isCritical = false;
		} else if (value > 60 && value <= 100) {
			isCritical = false;
		} else if (value > 100 && value <= 220) {
			isCritical = true;
		} else if (value > 220) {
			isCritical = true;
		}
		return isCritical;
	}

	@Override
	public String alertMessage(float value) {
		String alertMessage = "";
		if (value < 40) {
			alertMessage  = "Critical PulseRate value: Below healthy resting heart rate.";
		} else if (value > 100 && value <= 220) {
			alertMessage = "Critical PulseRate value: Acceptable if measured during exercise. Not acceptable if resting heartrate.";
		} else if (value > 220) {
			alertMessage = "Critical PulseRate level: Abnormally high heart rate.";
		}
		return alertMessage;
	}
}