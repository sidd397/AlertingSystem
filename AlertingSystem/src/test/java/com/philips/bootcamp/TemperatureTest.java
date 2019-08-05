package com.philips.bootcamp;

import static org.junit.Assert.assertEquals;

import com.philips.bootcamp.output.services.Temperature;

import org.junit.Test;

public class TemperatureTest {
    @Test
    public void temperatureValue96() {
        boolean actual = new Temperature().checkRange(96);
        assertEquals(false, actual);
    }

    @Test
    public void temperatureValue97() {
        boolean actual = new Temperature().checkRange(97);
        assertEquals(false, actual);
    }

    @Test
    public void temperatureValue98() {
        boolean actual = new Temperature().checkRange(98);
        assertEquals(false, actual);
    }

    @Test
    public void temperatureValue985() {
        boolean actual = new Temperature().checkRange(98.5f);
        assertEquals(false, actual);
    }

    @Test
    public void temperatureValue995() {
        boolean actual = new Temperature().checkRange(99.5f);
        assertEquals(true, actual);
    }

    @Test
    public void temperatureValue1005() {
        boolean actual = new Temperature().checkRange(100.5f);
        assertEquals(true, actual);
    }

    @Test
    public void temperatureValue103() {
        boolean actual = new Temperature().checkRange(103);
        assertEquals(true, actual);
    }

    @Test
    public void temperatureValue104() {
        boolean actual = new Temperature().checkRange(104);
        assertEquals(true, actual);
    }

    @Test
    public void temperatureValue105() {
        boolean actual = new Temperature().checkRange(105);
        assertEquals(true, actual);
    }

    @Test
    public void temperatureValue106() {
        boolean actual = new Temperature().checkRange(106);
        assertEquals(false, actual);
    }

    @Test
    public void temperatureValue107() {
        boolean actual = new Temperature().checkRange(107);
        assertEquals(false, actual);
    }
}