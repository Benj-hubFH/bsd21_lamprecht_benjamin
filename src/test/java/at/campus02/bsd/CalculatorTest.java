package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator tester = new Calculator();

    @BeforeEach
    void setUp() {
    }

    @Test
    void add() {
        assertEquals(10.0, tester.add(5.0, 5.0));
    }

    @Test
    void minus() {
        assertEquals(0.0, tester.minus(5.0, 5.0));
    }

    @Test
    void minusFailSimulation() {
        assertEquals(10.0, tester.minus(5.0, 5.0));
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }

    @Test
    void fakulty() {
        assertEquals(24, tester.fakulty(4, 1));
    }
}