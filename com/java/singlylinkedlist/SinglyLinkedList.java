package com.java.singlylinkedlist;

import java.util.logging.Logger;

public class SinglyLinkedList {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {

        SList<String> sList1 = new SList<>();
        sList1.iterator("add", "Dog");
        sList1.iterator("add", "Cat");
        LOGGER.info("List after adding Dog and Cat : ");
        LOGGER.info(sList1.toString());

        SList<Integer> sList2 = new SList<>();
        sList2.iterator("add", 3);
        sList2.iterator("add", 5);
        sList2.iterator("add", 7);
        LOGGER.info("List after adding 3, 5 and 7 : ");
        LOGGER.info(sList2.toString());

        sList2.iterator("remove", 7);
        LOGGER.info("List after removing 7 : ");
        LOGGER.info(sList2.toString());
        // Trying to delete item which does not exist
        LOGGER.info("Trying to remove 9 from linked list : ");
        sList2.iterator("remove", 9);
    }
}
