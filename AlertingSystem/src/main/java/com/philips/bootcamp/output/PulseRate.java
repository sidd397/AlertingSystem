package com.philips.bootcamp.output;

public class PulseRate implements CheckRange {
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
}