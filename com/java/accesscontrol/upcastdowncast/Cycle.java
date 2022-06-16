package com.java.accesscontrol.upcastdowncast;

import java.util.logging.Logger;

public class Cycle {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    Cycle () {
        LOGGER.info("This is a cycle!");
    }
}
