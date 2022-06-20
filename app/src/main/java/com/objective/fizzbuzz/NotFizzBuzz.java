package com.objective.fizzbuzz;

public class NotFizzBuzz extends FizzBuzzChainAbstract{

    public NotFizzBuzz() {
        super(null);
    }

    @Override
    public String checkFizzBuzz(Integer number) {
        return String.valueOf(number);
    }
}
