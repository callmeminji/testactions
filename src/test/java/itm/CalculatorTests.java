package itm;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import itm.oss.Calculator;
DisplayName("Calculator tests of OSS class")

public class CalculatorTests {
    private final Calculator calc = new Calculator ();

    @Test
    @DisplayName("Test for add function")
    void add(){
        assertEquals(expected:10, calc.add(a:5,b:5),message:"Expected value is equal to 10");
    }

    @Test
    @DisplayName("Testing function isPrime (5)")
    void isFivePrime(){
        assertTrue(calc.isPrime(number:5),message:"5 is prime");
    }

}
