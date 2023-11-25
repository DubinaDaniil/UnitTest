package org.unitTest.calculator.logic;

import org.junit.jupiter.api.*;


class SumCalculatorTest {

    private final SumCalculator sumCalculator = new SumCalculator();

    @Test
    void shouldThrowIllegalArgumentExceptionIfZeroNumberWasGiven() {
        int number = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(number));
    }

    @Test
    void shouldReturn_6_WhenNumber_3_WasGiven() {
        int number = 3;

        int actualResult = sumCalculator.sum(number);

        Assertions.assertEquals(6, actualResult);
    }

    @Test
    void shouldReturn_1_WhenNumber_1_WasGiven() {
        int number = 1;

        int actualResult = sumCalculator.sum(number);

        Assertions.assertEquals(1, actualResult);
    }
}