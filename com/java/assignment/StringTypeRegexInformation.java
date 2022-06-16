package com.java.assignment;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTypeRegexInformation {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        LOGGER.info("Enter string to be checked: ");
        String enteredString = myObj.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
        Matcher matcher = pattern.matcher(enteredString);
        boolean isSentenceMatched = matcher.matches();
        if (isSentenceMatched) {
            LOGGER.info("Entered sentence matches the expected pattern!");
        } else {
            LOGGER.info("Sentence NOT MATCHED with the pattern!");
        }
    }
}
