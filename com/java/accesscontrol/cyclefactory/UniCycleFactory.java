package com.java.accesscontrol.cyclefactory;

import java.util.logging.Logger;

class UniCycleFactory implements UniCycleInterface {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    UniCycleFactory() {
        LOGGER.info("UniCycle Factory!");
    }
    public void driveSpeed() {
        LOGGER.info("Unicycle average driving speed is 5-10 mph");
    }
    public void balance() {
        LOGGER.info("Unicycle requires extraordinary balance, aerodynamics is required!");
    }
    public void wheels() {
        LOGGER.info("Unicycle - One wheel");
    }
}
