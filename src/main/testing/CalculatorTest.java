package testing;

import learnjava.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator myCalculator =  new Calculator();

    @Test
    public void shouldReturnTheSumOfTwoPositiveNumbers() {
        int x = 2;
        int y = 3;
        int expectedSum = 5;
        int actualSum = myCalculator.sum(x, y);
        String failureMessage = "\f failed to return the correct result for:  " + x + " + " + y + "\n";
        assertEquals(failureMessage, expectedSum, actualSum, 0);
    }

    @Test
    public void shouldReturnTheSumOfTwoNegativeNumbers() {
        int x = -2;
        int y = -3;
        int expectedSum = -5;
        int actualSum = myCalculator.sum(x, y);
        String failureMessage = "\f failed to return the correct result for:  " + x + " + " + y + "\n";
        assertEquals(failureMessage, expectedSum, actualSum, 0);
    }

    @Test
    public void shouldReturnTheProductOfTwoPositiveNumbers() {
        int x = 4;
        int y = 2;
        int expectedSum = 8;
        int actualSum = myCalculator.sum(x, y);
        String failureMessage = "\f failed to return the correct result for:  " + x + " * " + y + "\n";
        assertEquals(failureMessage, expectedSum, actualSum, 0);
    }

    @Test
    public void shouldReturnTheProductOfTwoNegativeNumbers() {
        int x = -4;
        int y = -2;
        int expectedSum = 8;
        int actualSum = myCalculator.sum(x, y);
        String failureMessage = "\f failed to return the correct result for:  " + x + " * " + y + "\n";
        assertEquals(failureMessage, expectedSum, actualSum, 0);
    }
}
