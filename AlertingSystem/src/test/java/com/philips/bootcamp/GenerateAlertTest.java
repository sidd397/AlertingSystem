package com.philips.bootcamp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import com.philips.bootcamp.output.controller.AlertingSystemOutputApp;
import com.philips.bootcamp.output.model.Patient;
import com.philips.bootcamp.output.services.PulseRate;
import com.philips.bootcamp.output.services.Spo2;
import com.philips.bootcamp.output.services.Temperature;

import org.junit.Test;
import org.mockito.Mockito;

public class GenerateAlertTest {
    @Test
    public void generateTemperatureAlertTest() {
        Patient patient = new Patient("a", 99.6f, 96.0f, 41.0f);
        Temperature temperature = Mockito.mock(Temperature.class);
        when(temperature.checkRange(99.6f)).thenReturn(true);
        when(temperature.alertMessage(99.6f)).thenReturn("Critical Temperature value: Fever");
        assertEquals("	Critical Temperature value: Fever ", AlertingSystemOutputApp.generateAlert(patient));
    }

    @Test
    public void generateSpo2AlertTest() {
        Patient patient = new Patient("a", 98.6f, 70.0f, 41.0f);
        Spo2 spo2 = Mockito.mock(Spo2.class);
        when(spo2.checkRange(70.f)).thenReturn(true);
        when(spo2.alertMessage(70.0f)).thenReturn("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.");
        assertEquals("	Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level. ", AlertingSystemOutputApp.generateAlert(patient));
    }

    @Test
    public void generatePulseRateAlertTest() {
        Patient patient = new Patient("a", 98.6f, 96.0f, 39.0f);
        PulseRate pulseRate = Mockito.mock(PulseRate.class);
        when(pulseRate.checkRange(39.0f)).thenReturn(true);
        when(pulseRate.alertMessage(39.0f)).thenReturn("Critical PulseRate value: Below healthy resting heart rate.");
        assertEquals("	Critical PulseRate value: Below healthy resting heart rate.", AlertingSystemOutputApp.generateAlert(patient));
    }
}