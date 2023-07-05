package br.com.challenge.fizzbuzz.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class FizzBuzzServiceTest {

    @Test
    public void givenAnInitialNumberAndTheLatestNumber_returnsTheRightTextForEach_shoudReturnsEachTextInADifferentLine() {
        List<String> expectedList = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        Assertions.assertEquals(expectedList, FizzBuzzService.numberFizzOrBuzz(1, 15));
    }

}