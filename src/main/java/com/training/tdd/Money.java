package com.training.tdd;

import java.util.Objects;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    protected static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    protected String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Money money = (Money) o;
        return amount == money.amount && currency == money.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
