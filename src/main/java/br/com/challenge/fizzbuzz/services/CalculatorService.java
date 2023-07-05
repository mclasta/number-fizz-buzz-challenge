package br.com.challenge.fizzbuzz.services;

import br.com.challenge.fizzbuzz.common.Answers;

import java.math.BigDecimal;
import java.math.MathContext;

public class CalculatorService {

    public static String getText(final Integer number) {
        final boolean multipleOfThree = CalculatorService.isMultipleOfThree(number);
        final boolean multipleOfFive = CalculatorService.isMultipleOfFive(number);
        return Answers.getAnswer(multipleOfThree, multipleOfFive, number);
    }

    public static boolean isMultipleOfThree(final int number) {
        final BigDecimal bigDecimalNumber = BigDecimal.valueOf(number);
        final BigDecimal rest = bigDecimalNumber.remainder(BigDecimal.valueOf(3)).round(new MathContext(2));
        return rest != BigDecimal.ZERO ? false : true;
    }

    public static boolean isMultipleOfFive(final int number) {
        final BigDecimal bigDecimalNumber = BigDecimal.valueOf(number);
        final BigDecimal rest = bigDecimalNumber.remainder(BigDecimal.valueOf(5)).round(new MathContext(2));
        return rest != BigDecimal.ZERO ? false : true;
    }
}
