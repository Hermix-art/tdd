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
//    $5 + 10 CHF = $10 (ratio is 2:1)
//    Money rounding
//    hashcode()
//    Equal null
//    Equal object
//    Common times

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
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

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));

        assertFalse(Money.dollar(10).equals(Money.franc(10))); // 10 USD should not be equal to 10 francs
    }

}