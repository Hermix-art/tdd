package com.training.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CurrencyCalculatorTest {

    //calculation $5*2=$10
    //Make amount private
    //Dollar side-effects
    //Money rounding
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}