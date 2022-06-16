package com.java.errorhandling;

public class SecondCustomException extends IllegalArgumentException {
    public SecondCustomException(String testString) {
        super(testString);
    }
}

