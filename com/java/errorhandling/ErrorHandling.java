package com.java.errorhandling;

public class ErrorHandling {
    void checkErrorHandling() throws FirstCustomException, SecondCustomException, ThirdCustomException {
        FirstCustomException firstCustomException = new FirstCustomException("ArithmeticException");

        SecondCustomException secondCustomException = new SecondCustomException("IllegalArgumentException");
        secondCustomException.addSuppressed(firstCustomException);

        ThirdCustomException thirdCustomException = new ThirdCustomException("NullPointer");
        thirdCustomException.addSuppressed(secondCustomException);
        throw thirdCustomException;
    }
}
