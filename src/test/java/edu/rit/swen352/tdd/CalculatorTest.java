package edu.rit.swen352.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void add(){
        Calculator calc = new Calculator();
        assertEquals(20, calc.add(10, 7, 3));
    }

    @Test
    void subtract(){
        Calculator calc = new Calculator();
        assertEquals(20, calc.subtract(50, 20, 7, 3));
    }
}
