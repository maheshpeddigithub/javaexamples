package com.ssil.java.java8.functionalinterface;

public class MyFunctionalInterfaceMain {

    public static void main(String[] args) {
        MyFunctionalInterface functionalInterface = ((arg1, arg2) -> {
            return arg1 * arg2;
        });

        System.out.println(functionalInterface.multiply(10, 20));

    }

}
