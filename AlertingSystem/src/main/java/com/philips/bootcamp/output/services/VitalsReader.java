package com.philips.bootcamp.output.services;

import java.io.StringReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.philips.bootcamp.output.model.*;

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