package com.training.tdd;

import java.util.Objects;

public abstract class Money {
    protected int amount;

    protected static Money dollar(int amount) {
        return new Dollar(amount);
    }

    protected static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int amount);


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    protected abstract String currency();
}
