package com.philips.bootcamp;

import static org.junit.Assert.assertEquals;

import com.philips.bootcamp.output.services.PulseRate;
import com.philips.bootcamp.output.services.Spo2;
import com.philips.bootcamp.output.services.Temperature;

import org.junit.Test;

public class AlertSystemTest {
	Temperature temperature = new Temperature();
	Spo2 spo2 = new Spo2();
	PulseRate pulseRate = new PulseRate();
    @Test
    public void alertMessageValue985() {
        String actual = temperature.alertMessage(98.5f);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue995() {
        String actual = temperature.alertMessage(99.5f);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue1005() {
        String actual = temperature.alertMessage(100.5f);
        assertEquals("Critical Temperature value: Fever", actual);
    }

    @Test
    public void alertMessageValue103() {
        String actual = temperature.alertMessage(103);
        assertEquals("Critical Temperature value: Fever", actual);
    }

    @Test
    public void alertMessageValue104() {
        String actual = temperature.alertMessage(104);
        assertEquals("Critical Temperature value: Hyperpyrexia", actual);
    }

    @Test
    public void alertMessageValue105() {
        String actual = temperature.alertMessage(105);
        assertEquals("Critical Temperature value: Hyperpyrexia", actual);
    }

    @Test
    public void alertMessageValue106() {
        String actual = temperature.alertMessage(106);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue107() {
        String actual = temperature.alertMessage(107);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue69() {
        String actual = spo2.alertMessage(69);
        assertEquals("Critical Spo2 reading: Extreme lack of oxygen, ischemic diseases may occur.", actual);
    }

    @Test
    public void alertMessageValue70() {
        String actual = spo2.alertMessage(70);
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", actual);
    }

    @Test
    public void alertMessageValue71() {
        String actual = spo2.alertMessage(71);
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", actual);
    }
    
    @Test
    public void alertMessageValue89() {
        String actual = spo2.alertMessage(89);
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", actual);
    }

    @Test
    public void alertMessageValue90() {
        String actual = spo2.alertMessage(90);
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", actual);
    }

    @Test
    public void alertMessageValue91() {
        String actual = spo2.alertMessage(91);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue39() {
        String actual = pulseRate.alertMessage(39);
        assertEquals("Critical PulseRate value: Below healthy resting heart rate.", actual);
    }

    @Test
    public void alertMessageValue40() {
        String actual = pulseRate.alertMessage(40);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue41() {
        String actual = pulseRate.alertMessage(41);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue99() {
        String actual = pulseRate.alertMessage(99);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue100() {
        String actual = pulseRate.alertMessage(100);
        assertEquals("", actual);
    }

    @Test
    public void alertMessageValue101() {
        String actual = pulseRate.alertMessage(101);
        assertEquals("Critical PulseRate value: Acceptable if measured during exercise. Not acceptable if resting heartrate.", actual);
    }

    @Test
    public void alertMessageValue219() {
        String actual = pulseRate.alertMessage(219);
        assertEquals("Critical PulseRate value: Acceptable if measured during exercise. Not acceptable if resting heartrate.", actual);
    }

    @Test
    public void alertMessageValue220() {
        String actual = pulseRate.alertMessage(220);
        assertEquals("Critical PulseRate value: Acceptable if measured during exercise. Not acceptable if resting heartrate.", actual);
    }

    @Test
    public void alertMessageValue221() {
        String actual = pulseRate.alertMessage(221);
        assertEquals("Critical PulseRate level: Abnormally high heart rate.", actual);
    }
}