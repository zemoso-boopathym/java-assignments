package com.java.errorhandling;

public class ThirdCustomException extends NullPointerException {
    public ThirdCustomException(String testString) {
        super(testString);
    }
}
