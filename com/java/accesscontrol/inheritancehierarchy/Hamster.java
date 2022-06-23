package com.java.accesscontrol.inheritancehierarchy;

import java.util.logging.Logger;

class Hamster extends Rodent {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    String name;
    public Hamster () {
        this.name = "mouse";
        LOGGER.info("This is a Hamster.");
    }
    @Override
    void mammals() {
        LOGGER.info("Hamster are mammals");
    }
    @Override
    void incisors() {
        LOGGER.info("Hamster are incisors");
    }
    @Override
    void pet() {
        LOGGER.info("Hamster can be a pet");
    }
    @Override
    String feeding() {
        return "omnivorous";
    }
}
