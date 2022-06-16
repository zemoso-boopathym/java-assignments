package com.java.accesscontrol.cyclefactory;

import java.util.logging.Logger;

class BiCycleFactory implements BiCycleInterface {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    BiCycleFactory() {
        LOGGER.info("BiCycle Factory!");
    }
    public void driveSpeed() {
        LOGGER.info("Bicycle average driving speed is 10-25 mph");
    }
    public void balance() {
        LOGGER.info("Bicycle requires balance, aerodynamics is required!");
    }
    public void wheels() {
        LOGGER.info("Bicycle - Two wheels");
    }
}
