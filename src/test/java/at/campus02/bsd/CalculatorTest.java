package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    static Calculator tester = new Calculator();
    static Logger logger = LogManager.getLogger();

    @BeforeEach
    void setUp() {

    }

    @Test
    void add() {
        logger.debug("adding 5 + 5");
        assertEquals(10.0, tester.add(5.0, 5.0));
    }

    @Test
    void minus() {
        logger.debug("substract 5 and 5");
        assertEquals(0.0, tester.minus(5.0, 5.0));
    }

    @Test
    void multiply() {
        logger.debug("multiply 5 times 2");
        assertEquals(10.0, tester.multiply(5.0, 2.0));
    }

    @Test
    void divide() {
        logger.debug("division");
        logger.error("zero division");
        Assertions.assertThrows(ArithmeticException.class, () -> {
            tester.divide(5, 0);
        });
    }

    @Test
    void faculty() {
        assertEquals(24, tester.faculty(4));
        assertEquals(6, tester.faculty(3));
        assertEquals(2, tester.faculty(2));
    }
}