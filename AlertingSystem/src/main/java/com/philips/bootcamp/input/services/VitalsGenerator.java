package com.philips.bootcamp.input.services;

import java.util.Random;

public class VitalsGenerator {
	public float randomNumberFunction(float lowerRange, float upperRange) {
		Random rand = new Random();
		return lowerRange + rand.nextFloat() * (upperRange - lowerRange);
	}
}