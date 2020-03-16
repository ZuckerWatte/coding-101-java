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
    public void testPrinting() {
        String expectedOutput = "Hello World!";
        myPrinter.print(expectedOutput);
        assertEquals("prints the given text to standard output", expectedOutput, outContent.toString());
    }

    @Test
    public void testDefaultPrinting() {
        String expectedOutput = "Hello Default!";
        myPrinter.print("");
        assertEquals("prints a default text if no text is given", expectedOutput, outContent.toString());
    }
}