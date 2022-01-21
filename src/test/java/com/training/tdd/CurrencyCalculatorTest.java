package com.training.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CurrencyCalculatorTest {

    //+calculation $5*2=$10
    //+Make amount private
    //+Dollar side-effects
    //Money rounding
    //+equals()
    //hashcode()
    //Equal null
    //Equal object

    @Test
    public void testMultiplication() { // change 'testMultiplication()' method, to compare Dollar to Dollar, and encapsulate 'amount' field
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }

    @Test
    public void testTimesMethodEquality(){
        assertTrue(new Dollar(5).times(2).equals(new Dollar(5).times(2)));
        assertFalse(new Dollar(5).times(2).equals(new Dollar(5).times(3)));
    }

}