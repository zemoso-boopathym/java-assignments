package com.java.errorhandling;

public class FirstCustomException extends ArithmeticException {
    public FirstCustomException(String testString) {
        super(testString);
    }
}
