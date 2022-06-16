package com.java.assignment;

import java.util.logging.Logger;

public class ClassWithTwoOverloadedConstructors {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    ClassWithTwoOverloadedConstructors() {
        LOGGER.info("First overloaded constructor");
    }
    ClassWithTwoOverloadedConstructors(String stringArgument) {
        this();
        LOGGER.info("Second overloaded constructor with reference string : " + stringArgument);
    }
}
