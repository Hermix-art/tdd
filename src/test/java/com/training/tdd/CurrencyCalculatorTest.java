package com.training.tdd;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CurrencyCalculatorTest {
//    $5 + 10 CHF = $10 (ratio is 2:1)
//    $5 + $5 = $10
//    Return Money from $5 + $5
//    +Bank.reduce(Money)
//    Reduce Money with conversion
//    Reduce(Bank, String)

//    Money rounding
//    hashcode()
//    Equal null
//    Equal object

    @Test
    public void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD"); //we divide by 2 when convert CHF to USD
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five); //returns Sum
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend); //first argument in addition
        assertEquals(five, sum.addend); //second argument in addition
    }

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }


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