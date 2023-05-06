package com.hm.calculatot;

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
}