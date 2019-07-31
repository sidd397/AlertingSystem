package com.philips.bootcamp.output;

import java.io.StringReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class VitalsReader {
	public Patient getVitals(String input) {
		if(input == null) {
			return null;
		}
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(input));
		reader.setLenient(true);
		Patient patient = gson.fromJson(reader, Patient.class);
		return patient;
	}
}