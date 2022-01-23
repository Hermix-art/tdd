package com.training.tdd;


public class Dollar extends Money {//making a factory method for dollar, avoiding the Dollar references,  using money only
    // pulling times mehtod to parent, making it abstract, and leaving implementation in particular classes
    //widening 'times()' method to parent return type,

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
