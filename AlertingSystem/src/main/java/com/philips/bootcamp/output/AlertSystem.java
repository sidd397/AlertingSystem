package com.philips.bootcamp.output;

public class AlertSystem {
	String alertMessage;

	public String temperatureAlert(float value) {
		if (value > 95 && value < 97.7) {
			alertMessage = "Critical Temperature value: Hypothermia";
		} else if (value >= 99.5 && value < 104) {
			alertMessage = "Critical Temperature value: Fever/Hyperthermia";
		} else if (value > 104) {
			alertMessage = "Critical Temperature value: Hyperpyrexia";
		}
		return alertMessage;
	}

	public String spo2Alert(float value) {
		if (value >= 70 && value <= 90) {
			alertMessage = "Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.";
		} else if (value < 70) {
			alertMessage = "Critical Spo2 reading: Extreme lack of oxygen, ischemic diseases may occur.";
		}
		return alertMessage;
	}

	public String pulseRateAlert(float value) {
		if (value < 40) {
			alertMessage = "Critical PulseRate value: Below healthy resting heart rate.";
		} else if (value < 100 && value <= 220) {
			alertMessage = "Critical PulseRate value: Acceptable if measured during exercise. Not acceptable if resting heartrate.";
		} else if (value > 220) {
			alertMessage = "Critical PulseRate level: Abnormally high heart rate.";
		}
		return alertMessage;
	}
}