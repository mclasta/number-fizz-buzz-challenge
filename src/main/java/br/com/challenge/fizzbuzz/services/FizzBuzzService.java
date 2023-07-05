package br.com.challenge.fizzbuzz.services;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzService {

    public static List<String> numberFizzOrBuzz(final int initialNumber, final int finalNumber) {
        final List<Integer> listOfNumbers = generateListOfNumbers(initialNumber, finalNumber);
        return generateNumberFizzBuzzList(listOfNumbers);
    }

    private static List<String> generateNumberFizzBuzzList(List<Integer> listOfNumbers) {
        List<String> numberFizzBuzzList = new ArrayList<>();
        for (Integer number : listOfNumbers) {
            numberFizzBuzzList.add(CalculatorService.getText(number));
        }
        return numberFizzBuzzList;
    }

    private static List<Integer> generateListOfNumbers(final int initialNumber, final int finalNumber) {
        List<Integer> allNumbers = new ArrayList<>();
        for (int i = initialNumber; i <= finalNumber; i++) {
            allNumbers.add(Integer.valueOf(i));
        }
        return allNumbers;
    }

}
