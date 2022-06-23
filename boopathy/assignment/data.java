package boopathy.assignment;

import java.util.logging.Logger;

// Java Assignment - 5 - 1
public class data {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    int defaultNum;
    char defaultChar;
    public void printClassVariables() {
        // Default initialization applies for instance variables
         LOGGER.info("Default int :" + defaultNum);  // 0
         LOGGER.info("Default char :" + defaultChar);  //  \u0000 -  null character
    }
    public void printLocalVariables() {
        int localNum;
        char localChar;
        /*
            Default initialization only apply for instance variables, not for method variables.
            For variables in method, we have to initialize them explicitly.

         LOGGER.info("Local int : " + localNum);
         LOGGER.info("Local int : " + localChar);

         */
    }
}
