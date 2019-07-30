package com.philips.bootcamp.input.services;

public class Temperature {
	private float lowerRange = 95;
	private float upperRange = 97;
	private float updatedTemperatureVal;

	public float getUpdatedTemperatureVal() {
		updatedTemperatureVal = new VitalsGenerator().randomNumberFunction(lowerRange, upperRange);
		return updatedTemperatureVal;
	}

	// public void setLowerRange(float lowerRange) {
	// this.lowerRange = lowerRange;
	// }

	// public void setUpperRange(float upperRange) {
	// this.upperRange = upperRange;
	// }
}