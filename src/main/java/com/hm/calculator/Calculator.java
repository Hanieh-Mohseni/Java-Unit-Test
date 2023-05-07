package com.hm.calculator;

public class Calculator {
    public static void main(String[] args) {

        }

    public int[]incrementArray(int[] values) {
        int[]newValues = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i]+1;

        }

        return newValues;

    }

    public int divide(int x, int y){
        if (y==0){
            throw new IllegalArgumentException("Ints can not be divided by zero");
        }
        return x/y;
    }

    }

