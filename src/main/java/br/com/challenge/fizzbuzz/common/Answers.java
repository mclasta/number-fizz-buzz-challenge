package br.com.challenge.fizzbuzz.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Answers {

    FIZZ("Fizz"),
    BUZZ("Buzz"),
    FIZZBUZZ("FizzBuzz");

    @Getter
    private String description;

    public static String getAnswer(final boolean isMultipleOfThree, final boolean isMultipleOfFive, final Integer number) {
        if (!isMultipleOfThree && !isMultipleOfFive) {
            return number.toString();
        }
        if (isMultipleOfThree && isMultipleOfFive) {
            return Answers.FIZZBUZZ.getDescription();
        }
        if (isMultipleOfThree) {
            return Answers.FIZZ.getDescription();
        }
        if (isMultipleOfFive) {
            return Answers.BUZZ.getDescription();
        }
        throw new RuntimeException("Sorry! It should match with some of the options!");
    }

}
