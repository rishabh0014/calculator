import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void additionTruePositive() {
        assertEquals("Adding two numbers for True Positive", 8, calculator.add(5, 3), DELTA);
        assertEquals("Adding two numbers for True Positive", 10, calculator.add(7, 3), DELTA);
        assertEquals("Adding two numbers for True Positive", -2, calculator.add(3, -5), DELTA);
    }

    @Test
    public void additionFalsePositive() {
        assertNotEquals("Adding two numbers for False Positive", 12, calculator.add(5, 3), DELTA);
        assertNotEquals("Adding two numbers for False Positive", 4, calculator.add(7, 3), DELTA);
        assertNotEquals("Adding two numbers for False Positive", 0, calculator.add(3, -5), DELTA);
    }

    @Test
    public void subtractionTruePositive() {
        assertEquals("Subtracting two numbers for True Positive", 2, calculator.subtract(5, 3), DELTA);
        assertEquals("Subtracting two numbers for True Positive", 4, calculator.subtract(7, 3), DELTA);
        assertEquals("Subtracting two numbers for True Positive", 8, calculator.subtract(3, -5), DELTA);
    }

    @Test
    public void subtractionFalsePositive() {
        assertNotEquals("Subtracting two numbers for False Positive", 6, calculator.subtract(5, 3), DELTA);
        assertNotEquals("Subtracting two numbers for False Positive", 2, calculator.subtract(7, 3), DELTA);
        assertNotEquals("Subtracting two numbers for False Positive", -2, calculator.subtract(3, -5), DELTA);
    }

    @Test
    public void multiplicationTruePositive() {
        assertEquals("Multiplying two numbers for True Positive", 15, calculator.multiply(3, 5), DELTA);
        assertEquals("Multiplying two numbers for True Positive", -21, calculator.multiply(7, -3), DELTA);
        assertEquals("Multiplying two numbers for True Positive", 0, calculator.multiply(3, 0), DELTA);
    }

    @Test
    public void multiplicationFalsePositive() {
        assertNotEquals("Multiplying two numbers for False Positive", 12, calculator.multiply(3, 5), DELTA);
        assertNotEquals("Multiplying two numbers for False Positive", 21, calculator.multiply(7, -3), DELTA);
        assertNotEquals("Multiplying two numbers for False Positive", 1, calculator.multiply(3, 0), DELTA);
    }

    @Test
    public void divisionTruePositive() {
        assertEquals("Dividing two numbers for True Positive", 2, calculator.divide(10, 5), DELTA);
        assertEquals("Dividing two numbers for True Positive", -3, calculator.divide(9, -3), DELTA);
        assertEquals("Dividing two numbers for True Positive", 0.5, calculator.divide(1, 2), DELTA);
    }

    @Test
    public void divisionFalsePositive() {
        assertNotEquals("Dividing two numbers for False Positive", 3, calculator.divide(10, 5), DELTA);
        assertNotEquals("Dividing two numbers for False Positive", 2, calculator.divide(9, -3), DELTA);
        assertNotEquals("Dividing two numbers for False Positive", 1, calculator.divide(1, 2), DELTA);
    }


}