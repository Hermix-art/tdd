package com.training.tdd;

import java.util.Objects;

public class Money implements Expression {
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

    Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }


    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Money reduce(Bank bank, String to) {
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
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

    protected String currency() {
        return currency;
    }
}
