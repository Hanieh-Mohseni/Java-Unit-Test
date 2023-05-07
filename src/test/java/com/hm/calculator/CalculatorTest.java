package com.hm.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void incrementArray() {
        int[]expected = new int[]{2,3,4};
        int[] actual = calculator.incrementArray(new int[]{1,2,3});
        assertArrayEquals(expected,actual);
    }

    @Test
    void divide() {
        int expected = 2;
        int actual = calculator.divide(5,2);
        assertEquals(expected,actual);

    }

    @Test
    void divideByZero() {
       Exception exception = assertThrows(IllegalArgumentException.class,()->calculator.divide(1,0));
        String expected = "Ints can not be divided by zero";
        String actual = exception.getMessage();
        assertEquals(expected,actual);
    }
}