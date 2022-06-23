package com.java.assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.logging.Logger;

public class PingMedianTimeFinderApp {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter URL : ");
        String hostName = scanner.nextLine();

        final int PING_TIMES = 5;

        try {
            LOGGER.info("Please wait " + PING_TIMES + " seconds");
            String command = "ping -c " + PING_TIMES + " " + hostName;
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String str = "";
            int pingTime = 0;
            while ((str = inputStream.readLine()) != null) {
                String patternRegex = "time=(\\d+).+ms";
                Pattern pattern = Pattern.compile(patternRegex);
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    pingTime += Integer.parseInt(matcher.group(1));
                }
            }
            LOGGER.info("Median ping time for the entered URL " + hostName + " : " + pingTime / PING_TIMES + " ms");
        } catch (Exception e) {
            LOGGER.info("Exception : " + e.getMessage());
        }

    }
}
