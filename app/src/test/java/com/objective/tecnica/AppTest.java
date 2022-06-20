/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.objective.tecnica;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private App app = new App();

    @Test
    void should_return_Fizz() {

        assertEquals("Fizz",app.fizzBuzz(3));
    }

    @Test
    void should_return_Buzz() {
        assertEquals("Buzz",app.fizzBuzz(5));
    }

    @Test
    void should_return_FizzBuzz() {
        assertEquals("Fizz Buzz", app.fizzBuzz(15));
    }

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
