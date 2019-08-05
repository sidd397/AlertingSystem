package com.philips.bootcamp.output.services;

public class Temperature implements IPatientVitals {
	public boolean checkRange(float value) {
		boolean isCritical = false;
		if (value > 97 && value < 99.5) {
			isCritical = false;
		} else if (value >= 99.5 && value < 104) {
			isCritical = true;
		} else if (value >= 104 && value < 106) {
			isCritical = true;
		}
		return isCritical;
	}

	@Override
	public String alertMessage(float value) {
		String alertMessage = "";
		if (value > 99.5 && value < 104) {
			alertMessage = "Critical Temperature value: Fever";
		} else if (value >= 104 && value < 106) {
			alertMessage = "Critical Temperature value: Hyperpyrexia";
		}
		return alertMessage;
	}
}