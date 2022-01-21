package com.training.tdd;

import java.util.*;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
