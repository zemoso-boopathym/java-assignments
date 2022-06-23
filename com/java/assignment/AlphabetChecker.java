package com.java.assignment;



import java.util.Scanner;
import java.util.logging.Logger;

public class AlphabetChecker {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");

    /*
        function that checks if the input string contains all the letters of the alphabet a-z
    */
    public static void checkInputStringForAllAlphabets(String inputString) {
        if (inputString.length() < 26) {
            LOGGER.info("String does not contain all alphabets!");
        }

        int optimisedStringLength = inputString.toLowerCase()
                .replaceAll("[^a-z]", "")           // Removing non-alphabets
                .replaceAll("(.)(?=.*\\1)", "")     // Removing duplicate characters
                .length();
        LOGGER.info("Optimised String length " + optimisedStringLength);

        if (optimisedStringLength == 26) {
            LOGGER.info("String has all alphabets!");
        } else {
            LOGGER.info("String does not contain all alphabets!");
        }

        // Big O notation
        // Time Complexity - O(n)
        // Space Complexity - O(1)
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        LOGGER.info("Enter string to be checked: ");
        String enteredString = myObj.nextLine();
        checkInputStringForAllAlphabets(enteredString);

    } //end main
}
