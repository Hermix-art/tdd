package com.training.tdd;

public interface Expression {
    Money reduce(Bank bank, String to);
}
