package learnjava;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    private static void printInColor(String color, String text) {
        System.out.println(color + text + ANSI_RESET);
    }


    public static void main(String[] args) {
        Result testResult = JUnitCore.runClasses(testing.PrinterTest.class);

        for (Failure failure : testResult.getFailures()) {
            System.out.println();
            printInColor(ANSI_RED, failure.getTestHeader());
            System.out.println(failure.getMessage());
            System.out.println();
        }

        if(!testResult.wasSuccessful()) {
            printInColor(ANSI_RED, testResult.getFailureCount() + " tests failed, you should fix that!");
        }
        printInColor(ANSI_GREEN,  (testResult.getRunCount() -  testResult.getFailureCount()) + " out of " + testResult.getRunCount()  + " tests succeeded.");
    }
}

