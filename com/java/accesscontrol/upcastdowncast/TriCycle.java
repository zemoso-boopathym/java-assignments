package com.java.accesscontrol.upcastdowncast;

import java.util.logging.Logger;

public class TriCycle extends Cycle {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    TriCycle () {
        LOGGER.info("This is a Tricycle!");
    }
}
