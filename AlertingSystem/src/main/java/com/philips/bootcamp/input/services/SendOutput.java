package com.philips.bootcamp.input.services;

import java.io.IOException;
import java.io.PipedOutputStream;
import com.google.gson.*;
import com.philips.bootcamp.output.controller.*;

public class SendOutput {
	public void outputJson(Object patient) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(patient) + "|";
		byte[] buffer = jsonString.getBytes();
		PipedOutputStream pipedOutputStream = new PipedOutputStream();
		AlertingSystemOutputApp controller = new AlertingSystemOutputApp(pipedOutputStream);
		try {
			pipedOutputStream.write(buffer);
			pipedOutputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		controller.performOperations();
	}
}