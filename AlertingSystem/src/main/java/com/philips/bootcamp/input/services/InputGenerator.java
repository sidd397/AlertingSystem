package com.philips.bootcamp.input.services;

import java.text.DecimalFormat;
import com.philips.bootcamp.input.model.*;

public class InputGenerator {

	public void updatePatientVitals(Patient patient) {
		float temperatureVal = new Temperature().getUpdatedTemperatureVal();
		float spo2Val = new Spo2().getUpdatedSpo2Val();
		float pulseRateVal = new PulseRate().getUpdatedPulseRateVal();
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		patient.setTemperature(Float.valueOf(decimalFormat.format(temperatureVal)));
		patient.setSpo2(Float.valueOf(decimalFormat.format(spo2Val)));
		patient.setPulseRate(Float.valueOf(decimalFormat.format(pulseRateVal)));
	}
}