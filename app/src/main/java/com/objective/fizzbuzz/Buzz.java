package com.objective.fizzbuzz;

public class Buzz extends FizzBuzzChainAbstract{

    public Buzz(FizzBuzzChainAbstract fizzBuzzChainAbstract) {
        super(fizzBuzzChainAbstract);
    }

    @Override
    public String checkFizzBuzz(Integer number) {
        if (number % 5 == 0) {
            return "Buzz";
        }
        return next.checkFizzBuzz(number);
    }
}
