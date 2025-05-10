package com.example.spring_boot.claculator;

public class Calculator {
    public int addTowNumbers(int i, int i1) {
        return i + i1;
    }

    public Integer getNonZeroRemainder(int i, int i1) {
        int remainder = i % i1;
        if (remainder > 0) {
            return remainder;
        }
        return null;
    }
}
