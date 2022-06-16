package com.java.accesscontrol.inheritancehierarchy;

import java.util.logging.Logger;

public class Gerbil extends Rodent {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    String name;
    public Gerbil () {
        this.name = "mouse";
        LOGGER.info("This is a Gerbil.");
    }
    @Override
    void mammals() {
        LOGGER.info("Gerbil are mammals");
    }
    @Override
    void incisors() {
        LOGGER.info("Gerbil are incisors");
    }
    @Override
    void pet() {
        LOGGER.info("Gerbil can be a pet");
    }
    @Override
    String feeding() {
        return "herbivorous";
    }
}
