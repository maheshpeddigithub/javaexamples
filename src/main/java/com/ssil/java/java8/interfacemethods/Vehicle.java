package com.ssil.java.java8.interfacemethods;

public interface Vehicle {

    void printName();

    default void blowHorn() {
        System.out.println("peep");
    }

    static void status() {
        System.out.println("alright");
    }

}
