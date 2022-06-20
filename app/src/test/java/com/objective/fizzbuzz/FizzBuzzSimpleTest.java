package com.objective.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSimpleTest {

    @Test
    void shouldReturnFizzBuzz_whenNumberDividedBy3And5() {
        String fizzBuzz = new FizzBuzzSimple(15).getFizzBuzzNumber();
        assertEquals("Fizz Buzz", fizzBuzz);
    }

    @Test
    void shouldReturnFizz_whenNumberDividedBy3() {
        String fizzBuzz = new FizzBuzzSimple(3).getFizzBuzzNumber();
        assertEquals("Fizz", fizzBuzz);
    }

    @Test
    void shouldReturnBuzz_whenNumberDividedBy5() {
        String fizzBuzz = new FizzBuzzSimple(5).getFizzBuzzNumber();
        assertEquals("Buzz", fizzBuzz);
    }

}
