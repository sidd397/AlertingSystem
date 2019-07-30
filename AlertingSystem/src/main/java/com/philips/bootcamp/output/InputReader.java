package com.philips.bootcamp.output;

import java.io.StringReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class InputReader {
	public Patient getValues(String input) {
		Gson gson = new Gson();
		JsonReader reader = new JsonReader(new StringReader(input));
		reader.setLenient(true);
		Patient patient = gson.fromJson(reader, Patient.class);
		return patient;
	}
}