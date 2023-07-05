package br.com.challenge.fizzbuzz.common;

import br.com.challenge.fizzbuzz.services.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AnswersTest {

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