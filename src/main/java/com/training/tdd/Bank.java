package com.training.tdd;

public class Bank {
    Money reduce(Expression source, String to) {
        Sum sum = (Sum) source;
        int amount = sum.augend.amount + sum.addend.amount;
        return Money.dollar(amount);
    }
}
