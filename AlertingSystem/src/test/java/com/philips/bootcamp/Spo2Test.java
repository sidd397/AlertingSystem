package com.philips.bootcamp;

import static org.junit.Assert.assertEquals;

import com.philips.bootcamp.output.services.Spo2;

import org.junit.Test;

public class Spo2Test {
    @Test
    public void spo2Value96() {
        boolean actual = new Spo2().checkRange(96);
        assertEquals(false, actual);
    }

    @Test
    public void spo2Value95() {
        boolean actual = new Spo2().checkRange(95);
        assertEquals(false, actual);
    }

    @Test
    public void spo2Value94() {
        boolean actual = new Spo2().checkRange(94);
        assertEquals(false, actual);
    }

    @Test
    public void spo2Value91() {
        boolean actual = new Spo2().checkRange(91);
        assertEquals(false, actual);
    }

    @Test
    public void spo2Value90() {
        boolean actual = new Spo2().checkRange(90);
        assertEquals(true, actual);
    }

    @Test
    public void spo2Value89() {
        boolean actual = new Spo2().checkRange(89);
        assertEquals(true, actual);
    }

    @Test
    public void spo2Value71() {
        boolean actual = new Spo2().checkRange(71);
        assertEquals(true, actual);
    }

    @Test
    public void spo2Value70() {
        boolean actual = new Spo2().checkRange(70);
        assertEquals(true, actual);
    }

    @Test
    public void spo2Value69() {
        boolean actual = new Spo2().checkRange(69);
        assertEquals(true, actual);
    }
}
