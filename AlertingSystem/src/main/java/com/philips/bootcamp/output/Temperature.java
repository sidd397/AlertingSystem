package com.philips.bootcamp.output;

public class Temperature implements CheckRange {
	public boolean checkRange(float value) {
		boolean isCritical = false;
		if (value > 95 && value < 97.7) {
			isCritical = true;
		} else if (value >= 97.7 && value < 99.5) {
			isCritical = false;
		} else if (value >= 99.5 && value < 104) {
			isCritical = true;
		} else if (value > 104) {
			isCritical = true;
		}
		return isCritical;
	}
}