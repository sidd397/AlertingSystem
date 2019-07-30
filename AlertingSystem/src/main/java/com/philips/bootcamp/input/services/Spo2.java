package com.philips.bootcamp.input.services;

public class Spo2 {
	private float lowerRange = 40;
	private float upperRange = 220;
	private float updatedSpo2Val;

	public float getUpdatedSpo2Val() {
		updatedSpo2Val = new VitalsGenerator().randomNumberFunction(lowerRange, upperRange);
		return updatedSpo2Val;
	}

	// public void setLowerRange(float lowerRange) {
	// this.lowerRange = lowerRange;
	// }

	// public void setUpperRange(float upperRange) {
	// this.upperRange = upperRange;
	// }
}