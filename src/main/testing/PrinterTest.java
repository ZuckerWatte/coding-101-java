package testing;

import learnjava.Printer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Printer myPrinter =  new Printer();
    private final PrintStream originalOut = System.out;

    @Before
    public void setup(){
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldPrintGivenTextToConsole() {
        String expectedOutput = "Hello World!";
        myPrinter.print(expectedOutput);
        String failureMessage = "\f failed to print the given text to the console.\n";
        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }

    @Test
    public void shouldPrintDefaultTextWhenNoTextGiven() {
        String expectedOutput = "Hello Default!";
        myPrinter.print("");
        String failureMessage = "\f failed to print the default text when no text was given.\n";
        assertEquals(failureMessage, expectedOutput, outContent.toString());
    }
}