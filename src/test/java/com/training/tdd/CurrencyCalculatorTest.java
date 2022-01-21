package com.training.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CurrencyCalculatorTest {
//    +calculation $5*2=$10
//    +Make amount private
//    +Dollar side-effects
//    +5 CHF * 2 = 10 CHF
//    +equals()
//    $5 + 10 CHF = $10 (ratio is 2:1)
//    Money rounding
//    hashcode()
//    Equal null
//    Equal object
//    Dollar/Franc duplication
//    +Common equals
//    Common times

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testMultiplication() { // change 'testMultiplication()' method, to compare Dollar to Dollar, and encapsulate 'amount' field
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
        assertFalse(new Franc(5).equals(new Franc(6)));
    }

}