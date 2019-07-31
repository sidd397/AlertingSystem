package com.philips.bootcamp.input.services;

public class Temperature {
	private float lowerRange = 97;
	private float upperRange = 106;
	private float updatedTemperatureVal;

	public float getUpdatedTemperatureVal() {
		updatedTemperatureVal = new VitalsGenerator().randomNumberFunction(lowerRange, upperRange);
		return updatedTemperatureVal;
	}
}