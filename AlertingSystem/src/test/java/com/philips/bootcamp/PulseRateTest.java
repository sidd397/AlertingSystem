package com.philips.bootcamp;

import static org.junit.Assert.assertEquals;

import com.philips.bootcamp.output.services.PulseRate;

import org.junit.Test;

public class PulseRateTest {
    @Test
    public void pulseRateValue39() {
        boolean actual = new PulseRate().checkRange(39);
        assertEquals(true, actual);
    }

    @Test
    public void pulseRateValue40() {
        boolean actual = new PulseRate().checkRange(40);
        assertEquals(false, actual);
    }

    @Test
    public void pulseRateValue41() {
        boolean actual = new PulseRate().checkRange(41);
        assertEquals(false, actual);
    }

    @Test
    public void pulseRateValue59() {
        boolean actual = new PulseRate().checkRange(59);
        assertEquals(false, actual);
    }

    @Test
    public void pulseRateValue60() {
        boolean actual = new PulseRate().checkRange(60);
        assertEquals(false, actual);
    }

    @Test
    public void pulseRateValue61() {
        boolean actual = new PulseRate().checkRange(61);
        assertEquals(false, actual);
    }

    @Test
    public void pulseRateValue99() {
        boolean actual = new PulseRate().checkRange(99);
        assertEquals(false, actual);
    }

    @Test
    public void pulseRateValue100() {
        boolean actual = new PulseRate().checkRange(100);
        assertEquals(false, actual);
    }

    @Test
    public void pulseRateValue101() {
        boolean actual = new PulseRate().checkRange(101);
        assertEquals(true, actual);
    }

    @Test
    public void pulseRateValue219() {
        boolean actual = new PulseRate().checkRange(219);
        assertEquals(true, actual);
    }

    @Test
    public void pulseRateValue220() {
        boolean actual = new PulseRate().checkRange(220);
        assertEquals(true, actual);
    }

    @Test
    public void pulseRateValue221() {
        boolean actual = new PulseRate().checkRange(221);
        assertEquals(true, actual);
    }
}