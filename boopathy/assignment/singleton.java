package boopathy.assignment;

import java.util.logging.Logger;

// Java Assignment - 5 - 1
public class singleton {
    private static final Logger LOGGER = Logger.getLogger("InfoLogging");
    String defaultString;
    // static method is not able to access instance variables,
    // since they only instantiated in an object
    /*
        public static Object retObject(String defaultString) {
            this.defaultString = defaultString; // "this cannot be referenced from a static context"
            return this;
        }
    */
    public void printRetObject() {
        LOGGER.info(this.defaultString);
    }
}
