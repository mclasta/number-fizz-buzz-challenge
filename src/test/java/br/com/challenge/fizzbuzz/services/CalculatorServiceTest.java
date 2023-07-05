package br.com.challenge.fizzbuzz.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

    /**
     * Testing if a numberisMultipleOfThree
     */
    @Test
    public void givenNumber_whenNumberIsMultipleOfThree_thenReturnsTrue() {
        final boolean expected = true;

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(0));

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(3));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(6));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(9));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(12));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(30));

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(-3));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(-6));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(-12));
    }

    @Test
    public void givenNumber_whenNumberIsNotMultipleOfThree_thenReturnsFalse() {
        final boolean expected = false;

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(1));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(2));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(4));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(5));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(13));

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(-1));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(-2));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfThree(-11));
    }

    /**
     * Testing if a numberisMultipleOfFive
     */
    @Test
    public void givenNumber_whenNumberIsMultipleOfFive_thenReturnsTrue() {
        final boolean expected = true;

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(0));

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(5));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(10));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(15));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(30));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(50));

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(-5));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(-15));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(-30));
    }

    @Test
    public void givenNumber_whenNumberIsNotMultipleOfFive_thenReturnsFalse() {
        final boolean expected = false;

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(1));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(2));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(3));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(4));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(13));

        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(-1));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(-2));
        Assertions.assertEquals(expected, CalculatorService.isMultipleOfFive(-12));
    }

    /**
     * Testing if number, Fizz or Buzz
     */
    @Test
    void givenANumber_whenTheNumberIsONLYMultipleOfThree_thenItShouldReturnsFizz() {
        final String expected = "Fizz";

        Assertions.assertEquals(expected, CalculatorService.getText(3));
        Assertions.assertEquals(expected, CalculatorService.getText(6));
        Assertions.assertEquals(expected, CalculatorService.getText(24));

        Assertions.assertEquals(expected, CalculatorService.getText(-3));
        Assertions.assertEquals(expected, CalculatorService.getText(-12));
    }

    @Test
    void givenANumber_whenTheNumberIsONLYMultipleOfFive_thenItShouldReturnsBuzz() {
        final String expected = "Buzz";

        Assertions.assertEquals(expected, CalculatorService.getText(5));
        Assertions.assertEquals(expected, CalculatorService.getText(10));
        Assertions.assertEquals(expected, CalculatorService.getText(20));

        Assertions.assertEquals(expected, CalculatorService.getText(-5));
        Assertions.assertEquals(expected, CalculatorService.getText(-10));
    }

    @Test
    void givenANumber_whenTheNumberIsMultipleOfThreeAndFive_thenItShouldReturnsFizzBuzz() {
        final String expected = "FizzBuzz";

        Assertions.assertEquals(expected, CalculatorService.getText(0));
        Assertions.assertEquals(expected, CalculatorService.getText(15));
        Assertions.assertEquals(expected, CalculatorService.getText(30));

        Assertions.assertEquals(expected, CalculatorService.getText(-15));
        Assertions.assertEquals(expected, CalculatorService.getText(-30));
    }


}