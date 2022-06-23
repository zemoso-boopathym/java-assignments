package com.java.accesscontrol.innerclass;

public class SecondClassWithInnerClass extends FirstClassWithInnerClass {
    static class InnerClassTwo extends FirstClassWithInnerClass.InnerClassOne {
        InnerClassTwo(String stringArgs) {
            super(stringArgs);
        }
    }
}