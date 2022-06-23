package com.java.assignment;

import java.util.logging.Logger;

public class FirstHundredVampireNumbers {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    // Method to compute unique number using left shift operator
    // To verify whether the factors have all the numbers in the currNumber
    private static long computeDigits(long currNumber) {
        long total = 0;
        while(currNumber > 0) {
            total += 1L << ((currNumber % 10) * 6);
            currNumber /= 10;
        }
        return total;
    }

    private static int countFactors(long currNumber, long hundreds) {
        int countFactors = 0;
        long lowFactor = Math.max(hundreds / 10, (currNumber + hundreds - 2)/ (hundreds - 1));
        long highFactor = Math.min(currNumber/lowFactor, (long) Math.sqrt(currNumber));

        long computedNumber = computeDigits(currNumber);

        for (long firstFactor = lowFactor; firstFactor <= highFactor; firstFactor++) {
            long secondFactor = currNumber/ firstFactor;
            if ((firstFactor * secondFactor != currNumber)
                    || (firstFactor % 10 == 0 && secondFactor % 10 == 0))  // both factors have trailing spaces
                continue;

            if (computedNumber == computeDigits(firstFactor) + computeDigits(secondFactor)) {
                String formattedStringOutput = String.format("%n%d : [%d, %d] ", currNumber, firstFactor, secondFactor);
                LOGGER.info(formattedStringOutput);
                countFactors++;
                return countFactors;
            }
        }
        return countFactors;
    }

    public static void main(String[] args) {
        long countVampireNumbers = 0;
        long initialNumber = 1000;
        long hundreds = 100;
        for (int vampireNumberDigits = 2; vampireNumberDigits <= 6; vampireNumberDigits += 2) {
            long currentVampireDigitEndNumber = initialNumber * 10;
            boolean breakFlag = false;
            for (long currNumber = initialNumber; currNumber < currentVampireDigitEndNumber; currNumber++) {
                if (countFactors(currNumber, hundreds) > 0 && ++countVampireNumbers >= 100) {
                    breakFlag = true;
                    break;
                }
            }
            if (breakFlag)
                break;
            initialNumber *= 100;
            hundreds *= 10;
        }
    }
}
