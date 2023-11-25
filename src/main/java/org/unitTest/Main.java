package org.unitTest;

import org.unitTest.calculator.logic.*;

public class Main {

    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        System.out.println("sumCalculator.sum = " + sumCalculator.sum(4));
    }
}