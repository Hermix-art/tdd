package com.training.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CurrencyCalculatorTest {
//    +calculation $5*2=$10
//    +Make amount private
//    +Dollar side-effects
//    +5 CHF * 2 = 10 CHF
//    +equals()
//    +Common equals
//    +Compare Francs and Dollars
//    +fDollar/Franc duplication
//    +currency
//    +Common times
//    +Delete testFrancMultiplication?
//    $5 + 10 CHF = $10 (ratio is 2:1)
//    Money rounding
//    hashcode()
//    Equal null
//    Equal object

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(10).equals(Money.franc(10)));
    }
}