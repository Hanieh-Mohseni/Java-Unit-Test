package com.hm.calculatot;

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

    }

