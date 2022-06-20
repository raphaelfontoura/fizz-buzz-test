package com.objective.fizzbuzz;

public class FizzBuzzSimple {

    private String fizzbuzz = "";
    private final Integer number;

    public FizzBuzzSimple(Integer num) {
        number = num;
        checkFizzBuzz();
    }

    private void checkFizzBuzz() {
        if (number % 3 == 0 && number % 5 == 0) {
            this.fizzbuzz = "Fizz Buzz";
        } else if (number % 3 == 0) {
            this.fizzbuzz = "Fizz";
        } else if (number % 5 == 0) {
            this.fizzbuzz = "Buzz";
        }
    }

    public String getFizzBuzzNumber() {
        if (fizzbuzz.isBlank()) return String.valueOf(number);
        return fizzbuzz;
    }
}
