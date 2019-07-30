package com.philips.bootcamp.input.services;

import java.io.IOException;
import java.io.PipedOutputStream;
import com.google.gson.*;
import com.philips.bootcamp.output.*;

public class SendOutput {
	public void outputJson(Object patient) {
		Gson gson = new Gson();
		String jsonString = gson.toJson(patient);
		byte[] buffer = jsonString.getBytes();
		PipedOutputStream pipedOutputStream = new PipedOutputStream();
		Controller controller = new Controller(pipedOutputStream);
		try {
			pipedOutputStream.write(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		controller.getInput();
	}
}