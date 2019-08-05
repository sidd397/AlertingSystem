package com.philips.bootcamp.output.services;

public class Spo2 implements IPatientVitals {
	public boolean checkRange(float value) {
		boolean isCritical = false;
		if (value > 95) {
			isCritical = false;
		} else if (value >= 91 && value <= 95) {
			isCritical = false;
		} else if (value >= 70 && value <= 90) {
			isCritical = true;
		} else if (value < 70) {
			isCritical = true;
		}
		return isCritical;
	}

	@Override
	public String alertMessage(float value) {
		String alertMessage = "";
		if (value >= 70 && value <= 90) {
			alertMessage = "Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.";
		} else if (value < 70) {
			alertMessage = "Critical Spo2 reading: Extreme lack of oxygen, ischemic diseases may occur.";
		}
		return alertMessage;
	}
}