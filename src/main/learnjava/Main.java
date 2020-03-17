package learnjava;

import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.JUnitCore;

import java.util.stream.Stream;

class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String LINE = "\n_______________________________________________________________________";

    private static final Class[] classes = {testing.PrinterTest.class, testing.CalculatorTest.class};

    private static void printInColor(String color, String text) {
        System.out.println(color + text + ANSI_RESET);
    }


    public static void main(String[] args) {

        int totalTests = 0;
        int failedTests = 0;
        int succeededTests = 0;
        boolean isTotalTestResultSuccessful = true;

        for (Class testClass : classes) {

            printInColor(ANSI_PURPLE, LINE + "\nRunning tests for: " + testClass.getSimpleName());

            Result testResult = JUnitCore.runClasses(testClass);

            for (Failure failure : testResult.getFailures()) {
                System.out.println();
                printInColor(ANSI_RED, failure.getTestHeader());
                System.out.println(failure.getMessage());
                System.out.println();
            }

            totalTests += testResult.getRunCount();
            failedTests += testResult.getFailureCount();
            succeededTests += totalTests - failedTests;
            isTotalTestResultSuccessful = !isTotalTestResultSuccessful ? isTotalTestResultSuccessful : testResult.wasSuccessful();

        }

        System.out.println();
        printInColor(ANSI_PURPLE, LINE);
        System.out.println();

        if (!isTotalTestResultSuccessful) {
            printInColor(ANSI_RED, failedTests + " tests failed, you should fix that!");
        }
        printInColor(ANSI_GREEN, (succeededTests + " out of " + totalTests + " tests succeeded."));
    }
}

