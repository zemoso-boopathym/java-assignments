package com.java.assignment;

import java.util.logging.Logger;

public class ClassWithStringArgument {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    ClassWithStringArgument(String testString) {
        LOGGER.info("Passed string argument : " + testString);
    }
}
