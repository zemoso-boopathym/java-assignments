package com.java.accesscontrol.inheritancehierarchy;

import java.util.logging.Logger;

class Mouse extends Rodent {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    String name;
    public Mouse () {
        this.name = "mouse";
        LOGGER.info("This is a Mouse.");
    }
    @Override
    void mammals() {
        LOGGER.info("Mouse are mammals");
    }
    @Override
    void incisors() {
        LOGGER.info("Mouse are incisors");
    }
    @Override
    void pet() {
        LOGGER.info("Mouse is not a pet");
    }
    @Override
    String feeding() {
        return "herbivorous";
    }
}
