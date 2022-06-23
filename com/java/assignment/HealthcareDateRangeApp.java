package com.java.assignment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HealthcareDateRangeApp {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    static final String DATE_FORMAT = "dd-MM-yyyy";

    public static boolean checkValidDateRangeFormat(String dateRange) {
        boolean isValidDateFormat = false;
        try {
            final String dateRangeFormatRegex = "\\d\\d-\\d\\d-\\d\\d\\d\\d \\d\\d-\\d\\d-\\d\\d\\d\\d";
            Pattern pattern = Pattern.compile(dateRangeFormatRegex);
            Matcher matcher = pattern.matcher(dateRange);
            isValidDateFormat = matcher.matches();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValidDateFormat;
    }

    public static long inputDateToDateNumber(String inputDate) {
        long millis = 0;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
            Date dateNumber = simpleDateFormat.parse(inputDate);
            millis = dateNumber.getTime();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return millis;
    }

    public static boolean isValidDateFormat(String dateRange) {
        String[] inputDateArr = dateRange.split("\\s");
        Date date;
        for (String inputDate : inputDateArr) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
                date = simpleDateFormat.parse(inputDate);
                if (!inputDate.equals(simpleDateFormat.format(date))) {
                    LOGGER.info("Not a valid Date Format : ");
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    public static String readDateRange() {
        LOGGER.info("Enter dateRange with signup date and current date in the below format : ");
        LOGGER.info("dd-mm-yyyy dd-mm-yyyy");

        Scanner dateScanner = new Scanner(System.in);
        String dateRange = dateScanner.nextLine();
        while (!checkValidDateRangeFormat(dateRange) && !isValidDateFormat(dateRange)) {
            readDateRange();
        }
        return dateRange;
    }

    public static void showKYCDateRange(long signUpNextYearBufferTime, long currDateTime) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        Date startDateRes = new Date(signUpNextYearBufferTime);
        Date endDateRes = new Date(currDateTime);
        LOGGER.info(dateFormat.format(startDateRes) + " " + dateFormat.format(endDateRes));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Enter number of inputs to be checked : ");
        int numberOfInputsToCheck = scanner.nextInt();
        LOGGER.info("numberOfInputsToCheck " + numberOfInputsToCheck);
        String[] dateRangeArr = new String[numberOfInputsToCheck];

        for (int inputCheckCount = 0; inputCheckCount < numberOfInputsToCheck; inputCheckCount++) {
            dateRangeArr[inputCheckCount] = readDateRange();
        }

        for (String dateRangeItem : dateRangeArr) {
            String[] inputDateArr = dateRangeItem.split("\\s");
            String signUpDateTimeStr = inputDateArr[0];
            String currDateTimeStr = inputDateArr[1];

            long days30InMillis = Duration.ofDays(30).toMillis();
            long days60InMillis = Duration.ofDays(60).toMillis();

            String[] signUpDateMonthYearArr = signUpDateTimeStr.split("-");
            String[] currDateMonthYearArr = currDateTimeStr.split("-");

            String signUpDate = signUpDateMonthYearArr[0];
            String signUpMonth = signUpDateMonthYearArr[1];
            String currDateYear = currDateMonthYearArr[2];
            long signUpDateTime = inputDateToDateNumber(inputDateArr[0]);
            long currDateTime = inputDateToDateNumber(inputDateArr[1]);

            if (currDateTime < signUpDateTime) {
                LOGGER.info("No Range");
            } else {
                long signUpNextYearBufferTime = inputDateToDateNumber(signUpDate + "-" + signUpMonth + "-" + currDateYear)
                        - days30InMillis;
                long currYearFormWindowTimeRange = signUpNextYearBufferTime + days60InMillis;
                showKYCDateRange(signUpNextYearBufferTime, Math.min(currYearFormWindowTimeRange, currDateTime));
            }
        }
    }
}

