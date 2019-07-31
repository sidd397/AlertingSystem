package com.philips.bootcamp;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.philips.bootcamp.output.AlertSystem;
import com.philips.bootcamp.output.AlertingSystemOutputApp;
import com.philips.bootcamp.output.Patient;
import com.philips.bootcamp.output.PulseRate;
import com.philips.bootcamp.output.Spo2;
import com.philips.bootcamp.output.Temperature;

import org.junit.Test;
import org.mockito.Mockito;

public class GenerateAlertTest {
    @Test
    public void generateTemperatureAlertTest() {
        Patient patient = new Patient("a", 99.6f, 70.0f, 39.0f);
        Temperature temperature = Mockito.mock(Temperature.class);
        AlertSystem alertSystem = Mockito.mock(AlertSystem.class);
        when(temperature.checkRange(99.6f)).thenReturn(true);
        when(alertSystem.temperatureAlert(99.6f)).thenReturn("Critical Temperature value: Fever");
        assertEquals("Critical Temperature value: Fever", AlertingSystemOutputApp.generateTemperatureAlert(patient));
    }

    @Test
    public void generateSpo2AlertTest() {
        Patient patient = new Patient("a", 99.6f, 70.0f, 39.0f);
        Spo2 spo2 = Mockito.mock(Spo2.class);
        AlertSystem alertSystem = Mockito.mock(AlertSystem.class);
        when(spo2.checkRange(70.f)).thenReturn(true);
        when(alertSystem.spo2Alert(70.0f)).thenReturn("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.");
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", AlertingSystemOutputApp.generateSpo2Alert(patient));
    }

    @Test
    public void generatePulseRateAlertTest() {
        Patient patient = new Patient("a", 99.6f, 70.0f, 39.0f);
        PulseRate pulseRate = Mockito.mock(PulseRate.class);
        AlertSystem alertSystem = Mockito.mock(AlertSystem.class);
        when(pulseRate.checkRange(39.0f)).thenReturn(true);
        when(alertSystem.pulseRateAlert(39.0f)).thenReturn("Critical PulseRate value: Below healthy resting heart rate.");
        assertEquals("Critical PulseRate value: Below healthy resting heart rate.", AlertingSystemOutputApp.generatePulseRateAlert(patient));
    }
}