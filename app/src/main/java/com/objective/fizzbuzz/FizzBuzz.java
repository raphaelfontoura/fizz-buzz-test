package com.objective.fizzbuzz;

public class FizzBuzz {

    private String fizz = "";
    private String buzz = "";

    private final Integer number;

    public FizzBuzz(Integer num) {
        number = num;
        if (num % 3 == 0) this.fizz = "Fizz";
        if (num % 5 == 0) this.buzz = "Buzz";
    }

    public String getFizzBuzzNumber() {
        if (fizz.isBlank() && buzz.isBlank()) return String.valueOf(number);
        return (fizz + " " + buzz).trim();
    }
}
