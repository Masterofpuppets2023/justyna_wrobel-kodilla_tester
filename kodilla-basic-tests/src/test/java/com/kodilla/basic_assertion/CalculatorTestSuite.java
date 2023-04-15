package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double delta = 0;
        int subtractResult = calculator.subtract(b, a);
        assertEquals(3, subtractResult, delta);
    }
    @Test
    public void testSquarePower() {
        Calculator calculator = new Calculator();
        int a = 5;
        double delta = 0;
        int squarePowerResult = calculator.squarePower(a);
        assertEquals(25, squarePowerResult, delta);
    }
    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        double delta = 0;
        int a = 5;
        int b = 2;
        double powerResult = calculator.power(a, b);
        assertEquals(25, powerResult, delta);

        a = 5;
        b = 0;
        powerResult = calculator.power(a, b);
        assertEquals(1, powerResult, delta);

        a = 5;
        b = -2;
        powerResult = calculator.power(a, b);
        assertEquals(0.04, powerResult, delta);
    }
}