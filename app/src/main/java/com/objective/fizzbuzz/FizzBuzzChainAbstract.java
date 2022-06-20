package com.objective.fizzbuzz;

public abstract class FizzBuzzChainAbstract {

    protected FizzBuzzChainAbstract next;

    public FizzBuzzChainAbstract(FizzBuzzChainAbstract fizzBuzzChainAbstract) {
        this.next = fizzBuzzChainAbstract;
    }

    public abstract String checkFizzBuzz(Integer number);
}
