package com.java.accesscontrol.inheritancehierarchy;

import java.util.logging.Logger;

class Rodent {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    String name;
    public Rodent() {
        this.name = "rodent";
        LOGGER.info("This is a Rodent.");
    }
    void mammals() {
        LOGGER.info("Rodent are mammals");
    }
    void incisors() {
        LOGGER.info("Rodent are incisors");
    }
    void pet() {
        LOGGER.info("Most of the rodent are not pets");
    }
    String feeding() {
        return "herbivorous";
    }
}
