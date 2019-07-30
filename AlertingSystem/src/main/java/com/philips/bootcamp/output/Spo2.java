package com.philips.bootcamp.output;

public class Spo2 implements CheckRange {
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
}