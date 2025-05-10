package com.example.spring_boot.calc;

import com.example.spring_boot.claculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalculatorTest {

    @Test
    public void test_addition() {
        Calculator calc = new Calculator();
        assertThat(calc.addTowNumbers(2,3), is(5));
    }

    @Test
    public void test_get_non_zero_remainder() {
        Calculator clac = new Calculator();
        assertThat(clac.getNonZeroRemainder(7, 2), is(1));
        assertThat(clac.getNonZeroRemainder(22, 2), is(null));
    }
}
