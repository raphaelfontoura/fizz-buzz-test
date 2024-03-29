package com.objective.fizzbuzz;

public class FizzBuzz extends FizzBuzzChainAbstract{

    public FizzBuzz(FizzBuzzChainAbstract fizzBuzzChainAbstract) {
        super(fizzBuzzChainAbstract);
    }

    @Override
    public String checkFizzBuzz(Integer number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz Buzz";
        }
        return next.checkFizzBuzz(number);
    }
}
