package com.objective.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void shouldReturnFizzBuzz_whenNumberDividedBy3And5() {
        String fizzBuzz = new FizzBuzz(15).getResult();
        assertEquals("Fizz Buzz", fizzBuzz);
    }

    @Test
    void shouldReturnFizz_whenNumberDividedBy3() {
        String fizzBuzz = new FizzBuzz(3).getResult();
        assertEquals("Fizz", fizzBuzz);
    }

    @Test
    void shouldReturnBuzz_whenNumberDividedBy5() {
        String fizzBuzz = new FizzBuzz(5).getResult();
        assertEquals("Buzz", fizzBuzz);
    }

}
