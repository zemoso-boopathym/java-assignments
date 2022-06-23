package com.java.accesscontrol.cyclefactory;

import java.util.logging.Logger;

public class TriCycleFactory implements TriCycleInterface {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    TriCycleFactory() {
        LOGGER.info("TriCycle Factory!");
    }
    public void driveSpeed() {
        LOGGER.info("Bicycle average driving speed is 10-30 mph");
    }
    public void wheels() {
        LOGGER.info("Tricycle - Three wheels");
    }
}