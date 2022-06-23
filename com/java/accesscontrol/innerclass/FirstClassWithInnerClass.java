package com.java.accesscontrol.innerclass;

import java.util.logging.Logger;

public class FirstClassWithInnerClass {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    FirstClassWithInnerClass() {
        LOGGER.info("First Class with inner class - outer class!");
    }
    static class InnerClassOne {
        InnerClassOne(String stringArgs) {
            LOGGER.info("First Class Inner Class : " + stringArgs);
        }
    }
}
