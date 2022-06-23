package com.java.accesscontrol.interfaces;

import java.util.logging.Logger;

abstract class AbstractClass {
    abstract void play();
}

class ConcreteClass extends AbstractClass {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    void play()
    {
        LOGGER.info("This class runs!");
    }
}

class MultipleInterfaces extends ConcreteClass implements InterfaceFour  {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    @Override
    public void displayMessage() {
        LOGGER.info("Displays message!");
    }

    @Override
    public void getContents() {
        LOGGER.info("Getting contents!");
    }

    @Override
    public void playNotification() {
        LOGGER.info("Plays notification!");
    }

    @Override
    public void showOutput() {
        LOGGER.info("Shows output!");
    }
}
