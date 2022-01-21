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

        Dollar result = five.times(2);
        assertEquals(10, result.amount);
        result = five.times(3);
        assertEquals(15, result.amount);
    }

}