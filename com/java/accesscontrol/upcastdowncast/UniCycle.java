package com.java.accesscontrol.upcastdowncast;

import java.util.logging.Logger;

public class UniCycle extends Cycle {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    UniCycle () {
        LOGGER.info("This is a UniCycle!");
    }
    void balance() {
        LOGGER.info("Riding UniCycle requires balance!");
    }
}
