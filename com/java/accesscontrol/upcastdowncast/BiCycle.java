package com.java.accesscontrol.upcastdowncast;

import java.util.logging.Logger;

public class BiCycle extends Cycle {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    BiCycle () {
        LOGGER.info("This is a Bi-cycle!");
    }
    void balance() {
        LOGGER.info("Riding Bi-cycle requires balance!");
    }
}
