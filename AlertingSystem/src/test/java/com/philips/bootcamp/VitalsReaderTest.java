package com.philips.bootcamp;

import com.philips.bootcamp.output.model.Patient;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import com.philips.bootcamp.output.services.VitalsReader;

import org.junit.Test;

public class VitalsReaderTest {
    @Test
    public void getValuesNullTest() {
        Patient actual = new VitalsReader().getVitals(null);
        assertEquals(null, actual);
    }

    @Test
    public void getValuesAllParametersTest() {
        Patient patient = new VitalsReader().getVitals("{\"patientId\":\"a\",\"temperature\":95.94,\"spo2\":174.48,\"pulseRate\":75.61}");
        assertEquals(patient.getPatientId(), "a");
        assertEquals(patient.getTemperature(), 95.94, 0.0001);
        assertEquals(patient.getSpo2(), 174.48, 0.0001);
        assertEquals(patient.getPulseRate(), 75.61, 0.0001);
    }

    @Test
    public void getValuesPatientIdTest() {
        Patient patient = new VitalsReader().getVitals("{\"patientId\":123,\"temperature\":95.94,\"spo2\":174.48,\"pulseRate\":75.61}");
        assertNotEquals(patient.getPatientId(), 123);
    }

    @Test
    public void getValuesTemperatureTest() {
        Patient patient = new VitalsReader().getVitals("{\"patientId\":\"a\",\"temperature\":null,\"spo2\":174.48,\"pulseRate\":75.61}");
        assertEquals(patient.getTemperature(), 0.0, 0.0001);
    }

    @Test
    public void getValuesSpo2Test() {
        Patient patient = new VitalsReader().getVitals("{\"patientId\":\"a\",\"temperature\":95.94,\"spo2\":null,\"pulseRate\":75.61}");
        assertEquals(patient.getSpo2(), 0.0, 0.0001);
    }

    @Test
    public void getValuesPulseRateTest() {
        Patient patient = new VitalsReader().getVitals("{\"patientId\":\"a\",\"temperature\":95.94,\"spo2\":174.48,\"pulseRate\":null}");
        assertEquals(patient.getPulseRate(), 0.0, 0.0001);
    }
}