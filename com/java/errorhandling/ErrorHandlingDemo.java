package com.java.errorhandling;

import java.util.logging.Logger;

public class ErrorHandlingDemo {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {
        ErrorHandling errorHandling = new ErrorHandling();

        try {
            errorHandling.checkErrorHandling();
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            LOGGER.info("Finally executed!");
        }
    }
}
