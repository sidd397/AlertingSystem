package com.philips.bootcamp;

import static org.junit.Assert.assertEquals;

import com.philips.bootcamp.output.AlertSystem;

import org.junit.Test;

public class AlertSystemTest {
    @Test
    public void temperatureAlertValue985() {
        String actual = new AlertSystem().temperatureAlert(98.5f);
        assertEquals(null, actual);
    }

    @Test
    public void temperatureAlertValue995() {
        String actual = new AlertSystem().temperatureAlert(99.5f);
        assertEquals(null, actual);
    }

    @Test
    public void temperatureAlertValue1005() {
        String actual = new AlertSystem().temperatureAlert(100.5f);
        assertEquals("Critical Temperature value: Fever", actual);
    }

    @Test
    public void temperatureAlertValue103() {
        String actual = new AlertSystem().temperatureAlert(103);
        assertEquals("Critical Temperature value: Fever", actual);
    }

    @Test
    public void temperatureAlertValue104() {
        String actual = new AlertSystem().temperatureAlert(104);
        assertEquals("Critical Temperature value: Hyperpyrexia", actual);
    }

    @Test
    public void temperatureAlertValue105() {
        String actual = new AlertSystem().temperatureAlert(105);
        assertEquals("Critical Temperature value: Hyperpyrexia", actual);
    }

    @Test
    public void temperatureAlertValue106() {
        String actual = new AlertSystem().temperatureAlert(106);
        assertEquals(null, actual);
    }

    @Test
    public void temperatureAlertValue107() {
        String actual = new AlertSystem().temperatureAlert(107);
        assertEquals(null, actual);
    }

    @Test
    public void spo2AlertValue69() {
        String actual = new AlertSystem().spo2Alert(69);
        assertEquals("Critical Spo2 reading: Extreme lack of oxygen, ischemic diseases may occur.", actual);
    }

    @Test
    public void spo2AlertValue70() {
        String actual = new AlertSystem().spo2Alert(70);
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", actual);
    }

    @Test
    public void spo2AlertValue71() {
        String actual = new AlertSystem().spo2Alert(71);
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", actual);
    }
    
    @Test
    public void spo2AlertValue89() {
        String actual = new AlertSystem().spo2Alert(89);
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", actual);
    }

    @Test
    public void spo2AlertValue90() {
        String actual = new AlertSystem().spo2Alert(90);
        assertEquals("Critical Spo2 reading: Hypoxemia. Unhealthy and unsafe level.", actual);
    }

    @Test
    public void spo2AlertValue91() {
        String actual = new AlertSystem().spo2Alert(91);
        assertEquals(null, actual);
    }

    @Test
    public void pulseRateAlertValue39() {
        String actual = new AlertSystem().pulseRateAlert(39);
        assertEquals("Critical PulseRate value: Below healthy resting heart rate.", actual);
    }

    @Test
    public void pulseRateAlertValue40() {
        String actual = new AlertSystem().pulseRateAlert(40);
        assertEquals(null, actual);
    }

    @Test
    public void pulseRateAlertValue41() {
        String actual = new AlertSystem().pulseRateAlert(41);
        assertEquals(null, actual);
    }

    @Test
    public void pulseRateAlertValue99() {
        String actual = new AlertSystem().pulseRateAlert(99);
        assertEquals(null, actual);
    }

    @Test
    public void pulseRateAlertValue100() {
        String actual = new AlertSystem().pulseRateAlert(100);
        assertEquals(null, actual);
    }

    @Test
    public void pulseRateAlertValue101() {
        String actual = new AlertSystem().pulseRateAlert(101);
        assertEquals("Critical PulseRate value: Acceptable if measured during exercise. Not acceptable if resting heartrate.", actual);
    }

    @Test
    public void pulseRateAlertValue219() {
        String actual = new AlertSystem().pulseRateAlert(219);
        assertEquals("Critical PulseRate value: Acceptable if measured during exercise. Not acceptable if resting heartrate.", actual);
    }

    @Test
    public void pulseRateAlertValue220() {
        String actual = new AlertSystem().pulseRateAlert(220);
        assertEquals("Critical PulseRate value: Acceptable if measured during exercise. Not acceptable if resting heartrate.", actual);
    }

    @Test
    public void pulseRateAlertValue221() {
        String actual = new AlertSystem().pulseRateAlert(221);
        assertEquals("Critical PulseRate level: Abnormally high heart rate.", actual);
    }
}