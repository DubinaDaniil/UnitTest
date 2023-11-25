package org.unitTest.calculator.logic;

public class SumCalculator {

    private int result = 0;

    public int sum(final int number) {
        if (number == 0) {
            throw new IllegalArgumentException(number + " was passed");
        } else {
            for (int i = 1; i <= number; i++) {
                result += i;
            }
        }
        return result;
    }
}