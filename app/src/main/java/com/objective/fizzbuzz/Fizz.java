package com.objective.fizzbuzz;

public class Fizz extends FizzBuzzChainAbstract {


    public Fizz(FizzBuzzChainAbstract fizzBuzzChainAbstract) {
        super(fizzBuzzChainAbstract);
    }

    @Override
    public String checkFizzBuzz(Integer number) {
        if (number % 3 == 0) return "Fizz";
        return next.checkFizzBuzz(number);
    }
}
